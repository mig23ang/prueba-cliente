package es.base.cliente.controller;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import io.vertx.core.json.JsonObject;
import io.vertx.mutiny.core.Vertx;
import io.vertx.mutiny.core.buffer.Buffer;
import org.junit.jupiter.api.*;

import static com.mibanco.cliente.cdt.digital.es.constants.Constant.ERROR_SERVICIO;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;

import javax.inject.Inject;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

import io.vertx.core.json.JsonObject;
import io.vertx.core.file.OpenOptions;


@QuarkusTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ClienteEsControllerTest {

    private Path fileJson;

    @Inject
    private Vertx vertx;
    @Test
    void crearClienteType01() {
        /*Path file = this.fileJson.resolve("prueba.json");
        String content = Files.readString(file);*/
        //String content= new JsonObject().put("id", "1").toString();
        given()
                //.body(vertx.fileSystem().readFile("src/main/resources/prueba.json").onItem().transform(Buffer::toJson))
                .contentType(ContentType.JSON)
                .body(content)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .when()
                .post("/v1/es/clienteCDT")
                .then()
                .statusCode(200)
        //.body(equalTo("id 1"));
    }

    @Test
    void crearClienteType02() {
                /*Path file = this.fileJson.resolve("prueba.json");
        String content = Files.readString(file);*/
        //String content= new JsonObject().put("id", "1").toString();
        given()
                //.body(vertx.fileSystem().readFile("src/main/resources/prueba.json").onItem().transform(Buffer::toJson))
                .contentType(ContentType.JSON)
                .body(content)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .when()
                .post("/v1/es/clienteCDT")
                .then()
                .statusCode(200)
        //.body(equalTo("id 1"));
    }

    @Test
    void obtenerCliente() {
        given()
                .body(List.of("src/resources/prueba.json"))
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON)
                .when()
                .get("/v1/es/clienteCDT")
                .then()
                .statusCode(200);
    }
}