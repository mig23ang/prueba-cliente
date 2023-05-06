## Creación de imagen mysql docker y ejecución

```
docker run -d -p 3306:3306 --name mysql-db -e MYSQL_ROOT_PASSWORD=secret mysql:latest

docker exec -it mysql-db mysql -p

create database prueba_servicio_entidad;

use prueba_servicio_entidad;

CREATE TABLE clientes (
  id INT PRIMARY KEY AUTO_INCREMENT
);


show tables;

describe nombre de la tabla;

SELECT \* FROM nombre_de_la_tabla;

```

## config properties para la conexión

```
quarkus.datasource.db-kind=mysql

quarkus.datasource.username=root

quarkus.datasource.password=secret

quarkus.datasource.jdbc.url=jdbc:mysql://localhost:3306/prueba_servicio_entidad

quarkus.hibernate-orm.dialect=org.hibernate.dialect.MySQL8Dialect

quarkus.hibernate-orm.database.generation=update

```