## Instructivo creación de api mediante openApiPlugin

a continuación describimos de forma resumida la metodología para construir una api en una nueva lógica de programación empezando por el controlador

## 1 Creación de archivo .yaml

el primer paso consiste en crear un archivo con la extension .yaml como el que muestro de ejemplo 

```
openapi: 3.0.0
info:
  version: 1.0.0
  title: Ejemplo API

paths:
  /ejemplo:
    get:
      summary: Obtener ejemplo
      description: Retorna un ejemplo
      responses:
        '200':
          description: Éxito
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Ejemplo'
        '404':
          description: No encontrado
          
components:
  schemas:
    Ejemplo:
      type: object
      properties:
        nombre:
          type: string
        edad:
          type: integer
        direccion:
          type: object
          properties:
            calle:
              type: string
            ciudad:
              type: string
            pais:
              type: string
        telefonos:
          type: array
          items:
            type: object
            properties:
              tipo:
                type: string
              numero:
                type: string
      required:
        - nombre
        - edad
```

## 2 Agregar el plugin de open api

Este plugin nos va a generar unas carpetas las cuales van a ser el epicentro del desarrollo de la api

```
<plugin>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-generator-maven-plugin</artifactId>
    <!-- RELEASE_VERSION -->
    <version>6.3.0</version>
    <!-- /RELEASE_VERSION -->
    <executions>
        <execution>
            <goals>
                <goal>generate</goal>
            </goals>
            <configuration>
                <inputSpec>${project.basedir}/src/main/resources/api.yaml</inputSpec>
                <generatorName>java</generatorName>
                <configOptions>
                   <sourceFolder>src/gen/java/main</sourceFolder>
                </configOptions>
            </configuration>
        </execution>
    </executions>
</plugin>

```

seguido de esto obtendremos las carpetas que necesitamos


<img src="https://github.com/mig23ang/JavaDependencies/blob/main/image.png?raw=true" alt="carpetas">

## 3 Creación de Iservicios

creamos la carpeta servicios y traemos el type de la api, se debe ver algo asi 

```
package com.ejemplo.cliente.cdt.digital.es.service.contract;

import java.util.List;

import com.ejemplo.cliente.cdt.digital.es.dao.entity.EjemploCDTDigitalEntity;
import com.ejemplo.cliente.cdt.digital.es.gen.type.EjemploCDTDigitalType;

public interface IEjemploCdtDigitalService {
    EjemploCDTDigitalType crearEjemploCDTDigital(EjemploCDTDigitalEntity ejemploCDTDigitalEntity);

    List<EjemploCDTDigitalType> obtenerEjemplosCdtDigital();
}

```

## 4 Implementación de servicios

Implementamos la interface servicio, debería verse algo como lo que muestro a continuación.
Recordemos que los métodos se crean solos
```
import com.example.ejemplo.dao.entity.EjemploCdtDigitalEntity;
import com.example.ejemplo.gen.type.EjemploCdtDigitalType;
import com.example.ejemplo.service.contract.IEjemploCdtDigitalService;
import jakarta.inject.Inject;
<<<<<<< HEAD
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
=======
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
>>>>>>> nueva-jakarta
import java.util.List;

@Path("/ejemplo-cdt-digital")
public class EjemploCdtDigitalResource implements Iservicio {

    @Inject
    IEjemploCdtDigitalService ejemploCdtDigitalService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<EjemploCdtDigitalType> obtenerEjemplosCdtDigital() {
        return ejemploCdtDigitalService.obtenerEjemplosCdtDigital();
    }
}

```

## Creamos el controlador 

creamos el controlador donde debemos implementar de la gen/contract "es importante aclarar que los métodos se crearan automáticamente"

```
import jakarta.inject.Inject;
<<<<<<< HEAD
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
=======
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
>>>>>>> nueva-jakarta
import java.util.List;

@Path("/ejemplos")
public class EjemploController implements EjemploApi {

    @Inject
    IEjemploCdtDigitalService ejemploCdtDigitalService;

    @Override
    @Produces(MediaType.APPLICATION_JSON)
    public List<EjemploType> obtenerEjemplos() {
        return ejemploCdtDigitalService.obtenerEjemplos();
    }
}

```