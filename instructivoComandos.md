## Agregar dependencias quarkus cli

mvn quarkus:add-extension -Dextensions="nombre_de_la_dependencia"

mvn quarkus:add-extension -Dextensions="io.openapitools:openapi-generator-maven-plugin:LATEST"

## principales dependencias

| Dependencia                        | Comando                                                                   |
| ---------------------------------- | ------------------------------------------------------------------------- |
| quarkus-jdbc-mysql                 | mvn quarkus:add-extension -Dextensions="quarkus-jdbc-mysql"               |
| quarkus-resteasy                   | mvn quarkus:add-extension -Dextensions="quarkus-resteasy"                 |
| quarkus-smallrye-openapi           | mvn quarkus:add-extension -Dextensions="quarkus-smallrye-openapi"         |
| quarkus-hibernate-orm              | mvn quarkus:add-extension -Dextensions="quarkus-hibernate-orm"            |
| quarkus-oidc                       | mvn quarkus:add-extension -Dextensions="quarkus-oidc"                     |
| quarkus-security-jwt               | mvn quarkus:add-extension -Dextensions="quarkus-security-jwt"             |
| quarkus-security                   | mvn quarkus:add-extension -Dextensions="quarkus-security"                 |
| quarkus-flyway                     | mvn quarkus:add-extension -Dextensions="quarkus-flyway"                   |
| quarkus-arc                        | mvn quarkus:add-extension -Dextensions="quarkus-arc"                      |
| quarkus-micrometer                 | mvn quarkus:add-extension -Dextensions="quarkus-micrometer"               |
| quarkus-vertx                      | mvn quarkus:add-extension -Dextensions="quarkus-vertx"                    |
| quarkus-junit5                     | mvn quarkus:add-extension -Dextensions="quarkus-junit5"                   |
| quarkus-amazon-lambda              | mvn quarkus:add-extension -Dextensions="quarkus-amazon-lambda"            |
| Quarkus RESTEasy                   | mvn quarkus:add-extension -Dextensions="quarkus-resteasy"                 |
| Quarkus SmallRye Fault Tolerance   | mvn quarkus:add-extension -Dextensions="quarkus-smallrye-fault-tolerance" |
| Quarkus Hibernate ORM with Panache | mvn quarkus:add-extension -Dextensions="quarkus-hibernate-orm-panache"    |
| Quarkus JDBC - MySQL               | mvn quarkus:add-extension -Dextensions="quarkus-jdbc-mysql"               |
| Quarkus JDBC - PostgreSQL          | mvn quarkus:add-extension -Dextensions="quarkus-jdbc-postgresql"          |
| Quarkus Kafka                      | mvn quarkus:add-extension -Dextensions="quarkus-kafka"                    |
| Quarkus OpenTracing                | mvn quarkus:add-extension -Dextensions="quarkus-opentracing"              |
| Quarkus REST Client                | mvn quarkus:add-extension -Dextensions="quarkus-rest-client"              |
| Quarkus Security                   | mvn quarkus:add-extension -Dextensions="quarkus-security"                 |

Puedes encontrar más información sobre las extensiones de Quarkus en la documentación oficial: https://quarkus.io/guides/extension-registry

## Principales plugins

Maven:

| Nombre del Plugin           | Comando para Agregar                                                                 |
| --------------------------- | ------------------------------------------------------------------------------------ |
| Hibernate Validator         | `mvn quarkus:add-extension -Dextensions="quarkus-hibernate-validator"`               |
| Hibernate ORM with Panache  | `mvn quarkus:add-extension -Dextensions="quarkus-hibernate-orm-panache"`             |
| RestEasy                    | `mvn quarkus:add-extension -Dextensions="quarkus-resteasy"`                          |
| SmallRye Fault Tolerance    | `mvn quarkus:add-extension -Dextensions="quarkus-smallrye-fault-tolerance"`          |
| SmallRye OpenAPI            | `mvn quarkus:add-extension -Dextensions="quarkus-smallrye-openapi"`                  |
| SmallRye Reactive Messaging | `mvn quarkus:add-extension -Dextensions="quarkus-smallrye-reactive-messaging"`       |
| Flyway Database Migration   | `mvn quarkus:add-extension -Dextensions="quarkus-flyway"`                            |
| Amazon DynamoDB             | `mvn quarkus:add-extension -Dextensions="quarkus-amazon-dynamodb"`                   |
| Apache Kafka                | `mvn quarkus:add-extension -Dextensions="quarkus-smallrye-reactive-messaging-kafka"` |
| MongoDB                     | `mvn quarkus:add-extension -Dextensions="quarkus-mongodb-panache"`                   |

