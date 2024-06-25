# 🚀 Proyecto de Backend con Spring Boot y H2

Este es un proyecto de backend desarrollado con Spring Boot y H2 como base de datos en memoria. El proyecto gestiona solicitudes de crédito y usuarios, proporcionando endpoints para crear, leer, actualizar y eliminar estos recursos.

## 🌟 Características

- Crear, leer, actualizar y eliminar solicitudes de crédito
- Gestionar usuarios (crear, leer, actualizar y eliminar)
- Base de datos H2 en memoria para almacenamiento de datos

## 🛠️ Requisitos

Antes de comenzar, asegúrate de tener instalado lo siguiente:

- Java Development Kit (JDK) 8 o superior
- Maven

## ⚙️ Instalación

Sigue estos pasos para configurar y ejecutar el proyecto en tu entorno local:

1. **Clonar el repositorio**:

   ```bash
   git clone https://github.com/tu-usuario/tu-repositorio.git
   cd tu-repositorio

2. **Compilar y empaquetar la aplicación**:

    ```bash
    mvn clean install

3. **Ejecución**:

    ```bash
    mvn spring-boot:run

## 📂 Estructura del Proyecto

El proyecto sigue la estructura estándar de Spring Boot:

src/main/java/pruebaTecnica: Contiene el código fuente del proyecto.
controller: Controladores REST para manejar solicitudes HTTP.
entities: Entidades JPA que representan las tablas de la base de datos.
repository: Repositorios JPA para interactuar con la base de datos.
service: Servicios que contienen la lógica de negocio.
config: Contiene los archivos de configuración.
application.properties: Configuración de la aplicación.

## 📊 Consola de H2
Puedes acceder a la consola de H2 para ver la base de datos en memoria navegando a http://localhost:8080/h2-console. Usa las siguientes credenciales:

- URL JDBC: jdbc:h2:mem:testdb
- Usuario: sa
- Contraseña: 

## 🚀 Algunas pruebas con Postman
![Captura de pantalla](https://github.com/JocelynLlamas/creditos-educativos-back/blob/main/src/main/resources/static/imgs/credits.png)
![Captura de pantalla](https://github.com/JocelynLlamas/creditos-educativos-back/blob/main/src/main/resources/static/imgs/users.png)