# ForoHub

ForoHub es una API de un foro que permite la creación de tópicos y autores. Este proyecto ha sido desarrollado como parte de una certificación con especialidad en back end con Spring Boot en Alura Latam.

## Tecnologías Utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=spring-security&logoColor=white)
![Auth0](https://img.shields.io/badge/Auth0-EB5424?style=for-the-badge&logo=auth0&logoColor=white)
![Lombok](https://img.shields.io/badge/Lombok-6DB33F?style=for-the-badge&logo=lombok&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JPA](https://img.shields.io/badge/JPA-6DB33F?style=for-the-badge&logo=jpa&logoColor=white)
![Flyway](https://img.shields.io/badge/Flyway-CC0000?style=for-the-badge&logo=flyway&logoColor=white)

## Descripción del Proyecto

ForoHub es una API RESTful que cumple con los requisitos de autenticación por medio de tokens, utilizando una seguridad stateless. El proyecto permite realizar operaciones CRUD completas para autores y tópicos. Todas las operaciones requieren un token de autenticación, excepto las siguientes:

- Registro de un nuevo autor (POST /autores)
- Generación de un token de autenticación para un autor (POST /login)

### Funcionalidades Actuales

- **Autenticación y Autorización**: Implementación de seguridad stateless mediante JWT.
- **CRUD de Autores**: Crear, leer, actualizar y eliminar autores.
- **CRUD de Tópicos**: Crear, leer, actualizar y eliminar tópicos.

### Próximas Actualizaciones

- **Implementación de Respuestas en los Tópicos**: Permitir a los usuarios responder a los tópicos.
- **Manejo de Permisos**: Asegurar que solo los usuarios puedan manipular sus propios tópicos y perfiles, evitando que cualquier usuario pueda gestionar los tópicos y perfiles de otros usuarios.

### Endpoints
#### Autores
- POST /autores: Crear un nuevo autor.
- GET /autores: Obtener una lista de autores.
- GET /autores/{id}: Obtener un autor por ID.
- PUT /autores/: Actualizar un autor (El ID va en el body del PUT).
- DELETE /autores/{id}: Eliminar un autor.

#### Tópicos
- POST /topicos: Crear un nuevo tópico.
- GET /topicos: Obtener una lista de tópicos.
- GET /topicos/{id}: Obtener un tópico por ID.
- PUT /topicos/{id}: Actualizar un tópico.
-DELETE /topicos/{id}: Eliminar un tópico.

#### Autenticación
- POST /login: Generar un token de autenticación para un autor.

## Agradecimientos
Quiero expresar mi agradecimiento a Alura Latam y al programa Oracle One Next Education por la formación y el apoyo brindado durante el desarrollo de este proyecto.

Este proyecto cumple con los requisitos del curso y continuará creciendo con nuevas funcionalidades y mejoras.

