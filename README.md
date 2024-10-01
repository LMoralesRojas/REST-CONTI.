# Rest API

## Descripción

Este proyecto está en desarrollo para convertirse en una API REST. Está estructurado con las carpetas necesarias, incluyendo:

- **Repository**: Contiene las interfaces que gestionan la comunicación con la base de datos.
- **Service**: Implementa la lógica de negocio y las operaciones sobre las entidades.
- **Controller**: Maneja las solicitudes HTTP y las respuestas, actuando como intermediario entre el cliente y los servicios.
- **Entidades**: Define las clases que representan las tablas de la base de datos.

Además, el proyecto está equipado con soporte para auditoría utilizando **Hibernate Envers**, y todo se mapea en una base de datos **MySQL**. Se ha implementado paginación y consultas avanzadas tanto con **SQL** como con **JPQL** para optimizar el acceso a los datos.

## Características

- CRUD completo para entidades como `Cliente`, `Domicilio`, `Artículo`, `Categoría`, `Factura`, etc.
- Auditoría de cambios utilizando Hibernate Envers.
- Conexión a base de datos MySQL.
- Soporte para mostrar consultas SQL.
- Documentación de la API utilizando Swagger/OpenAPI.
- **Mapeo de entidades**.
- **Paginación** para manejo eficiente de grandes volúmenes de datos.
- Consultas avanzadas con **SQL** y **JPQL**.

## Tecnologías

- **Java 17**
- **Spring Boot 3.3.3**
- **Hibernate 6.x**
- **MySQL**
- **Lombok**
- **Swagger/OpenAPI**

## Requisitos

- **JDK 17** o superior.
- **MySQL**.
- **Maven** o **Gradle** para la gestión de dependencias.

## Instalación

1. Clona el repositorio:
    ```bash
    git clone https://github.com/LucasMorales/api-rest-jpa-envers.git
    cd api-rest-jpa-envers
    ```

2. Configura la base de datos en el archivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/LucasMoralesDB
    spring.datasource.username=tu-usuario
    spring.datasource.password=tu-contraseña
    ```

3. Ejecuta la aplicación:
    ```bash
    ./gradlew bootRun
    ```

4. La API estará disponible en `http://localhost:8080`.

## Uso

Puedes interactuar con la API utilizando herramientas como **Postman** o **cURL**. Además, puedes explorar la documentación de la API en `http://localhost:8080/swagger-ui.html` gracias a Swagger/OpenAPI.

### Ejemplos de uso de paginación y consultas avanzadas:

- **Paginación**: Se puede realizar en cualquier entidad para obtener resultados de manera eficiente:
  ```java
  Page<Cliente> clientes = clienteRepository.findAll(PageRequest.of(0, 10));
