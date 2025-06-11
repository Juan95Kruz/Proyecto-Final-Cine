# 🎬 Proyecto Final Cine

Un sistema completo de gestión de cines desarrollado con **Spring Boot** y arquitectura **MVC**, que permite administrar todos los aspectos de una cadena de cines de manera eficiente y moderna.

## 📋 Descripción

**Proyecto-Final-Cine** es una aplicación web desarrollada como proyecto final que implementa un sistema integral para la gestión de cines. Permite administrar empleados, cines, salas, funciones, películas y entradas a través de una interfaz web intuitiva con operaciones CRUD completas.

## 🛠️ Tecnologías Utilizadas

- **Java 21** - Lenguaje de programación principal
- **Spring Boot** - Framework principal para el backend
- **Gradle - Groovy** - Sistema de construcción y gestión de dependencias
- **Spring Data JPA** - Para el manejo de la persistencia
- **MySQL** - Base de datos relacional
- **IntelliJ IDEA 2025.1.1.1** - IDE de desarrollo
- **HTML5** - Estructura del frontend
- **CSS3** - Estilos y diseño responsive
- **JavaScript** - Lógica del frontend e interacción con APIs

## 🏗️ Arquitectura

El proyecto sigue el patrón **MVC (Modelo-Vista-Controlador)**:

- **Modelo**: Entidades JPA con relaciones bien definidas
- **Vista**: Interfaz web con HTML, CSS y JavaScript
- **Controlador**: REST Controllers de Spring Boot

### 📊 Modelo de Datos

El sistema está compuesto por las siguientes entidades principales:

#### 🎭 **Entidades Principales**

- **🏢 Cine**: Representa cada sede de cine
  - Nombre, dirección
  - Relación con empleados, salas y películas

- **👥 Empleado**: Personal que trabaja en los cines
  - Nombre, DNI
  - Puede trabajar en múltiples cines

- **🏛️ Sala**: Salas de proyección
  - Número, capacidad
  - Pertenece a un cine específico

- **🎬 Película**: Catálogo de películas
  - Título, género (Enum)
  - Disponible en cines específicos

- **⏰ Función**: Horarios de proyección
  - Horario de proyección
  - Vincula película, sala y entradas

- **🎫 Entrada**: Tickets de las funciones
  - Precio, asiento
  - Asociada a una función específica

#### 🎯 **Géneros Disponibles**
- ACCIÓN
- COMEDIA  
- DRAMA
- SUSPENSO

## 🚀 Instalación y Configuración

### Prerrequisitos

- **Java 21** o superior
- **MySQL 8.0** o superior
- **IntelliJ IDEA** (recomendado)
- **Gradle** (incluido en el proyecto)

### Pasos de Instalación

1. **Clonar el repositorio**
   ```bash
   git clone https://github.com/Juan95Kruz/Proyecto-Final-Cine.git
   cd Proyecto-Final-Cine
   ```

2. **Configurar la base de datos**
   - Crear la base de datos en MySQL:
   ```sql
   CREATE DATABASE db_cines;
   ```

3. **Configurar application.properties**
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/db_cines?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
   spring.jpa.show-sql=true
   server.port=9000
   ```

4. **Ejecutar la aplicación**
   - Desde IntelliJ IDEA: Ejecutar la clase principal
   - Desde terminal:
   ```bash
   ./gradlew bootRun
   ```

## 🌐 Uso de la Aplicación

Una vez iniciada la aplicación, accede a:

```
http://localhost:9000/index.html
```

### 🔧 Funcionalidades Disponibles

La aplicación ofrece **operaciones CRUD completas** para todas las entidades:

- ✅ **Crear** - Agregar nuevos registros
- 🔍 **Buscar** - Consultar y filtrar información  
- ✏️ **Editar** - Modificar registros existentes
- 🗑️ **Eliminar** - Borrar registros

#### 📱 Módulos de Gestión

1. **Gestión de Cines** - Administrar sedes y ubicaciones
2. **Gestión de Empleados** - Controlar personal y asignaciones
3. **Gestión de Salas** - Configurar capacidades y numeración
4. **Gestión de Películas** - Catálogo y clasificación por género
5. **Gestión de Funciones** - Programación de horarios
6. **Gestión de Entradas** - Venta y control de asientos

## 🗂️ Estructura del Proyecto

```
 Proyecto-Final-Cine
    ├── build
    │   ├── classes
    │   │   └── java
    │   │       └── main
    │   │           └── com
    │   │               └── example
    │   │                   └── Proyecto
    │   │                       └── Final_Cine
    │   │                           ├── config
    │   │                           │   └── CustomRevisionListener.class
    │   │                           ├── controllers
    │   │                           │   ├── BaseController.class
    │   │                           │   ├── BaseControllerImpl.class
    │   │                           │   ├── CineController.class
    │   │                           │   ├── EmpleadoController.class
    │   │                           │   ├── EntradaController.class
    │   │                           │   ├── FuncionController.class
    │   │                           │   ├── GeneroController.class
    │   │                           │   ├── PeliculaController.class
    │   │                           │   └── SalaController.class
    │   │                           ├── entities
    │   │                           │   ├── audit
    │   │                           │   │   └── Revision.class
    │   │                           │   ├── Base.class
    │   │                           │   ├── Cine.class
    │   │                           │   ├── Empleado.class
    │   │                           │   ├── Entrada.class
    │   │                           │   ├── Funcion.class
    │   │                           │   ├── Genero.class
    │   │                           │   ├── Pelicula.class
    │   │                           │   └── Sala.class
    │   │                           ├── ProyectoFinalCineApplication.class
    │   │                           ├── repositories
    │   │                           │   ├── BaseRepository.class
    │   │                           │   ├── CineRepository.class
    │   │                           │   ├── EmpleadoRepository.class
    │   │                           │   ├── EntradaRepository.class
    │   │                           │   ├── FuncionRepository.class
    │   │                           │   ├── PeliculaRepository.class
    │   │                           │   └── SalaRepository.class
    │   │                           └── services
    │   │                               ├── BaseService.class
    │   │                               ├── BaseServiceImpl.class
    │   │                               ├── CineService.class
    │   │                               ├── CineServiceImpl.class
    │   │                               ├── EmpleadoService.class
    │   │                               ├── EmpleadoServiceImpl.class
    │   │                               ├── EntradaService.class
    │   │                               ├── EntradaServiceImpl.class
    │   │                               ├── FuncionService.class
    │   │                               ├── FuncionServiceImpl.class
    │   │                               ├── PeliculaService.class
    │   │                               ├── PeliculaServiceImpl.class
    │   │                               ├── SalaService.class
    │   │                               └── SalaServiceImpl.class
    │   ├── generated
    │   │   └── sources
    │   │       ├── annotationProcessor
    │   │       │   └── java
    │   │       │       └── main
    │   │       └── headers
    │   │           └── java
    │   │               └── main
    │   ├── reports
    │   │   └── problems
    │   │       └── problems-report.html
    │   ├── resources
    │   │   └── main
    │   │       ├── application.properties
    │   │       ├── static
    │   │       │   ├── css
    │   │       │   │   └── style.css
    │   │       │   ├── index.html
    │   │       │   └── js
    │   │       │       └── script.js
    │   │       └── templates
    │   └── tmp
    │       └── compileJava
    │           ├── compileTransaction
    │           │   ├── backup-dir
    │           │   └── stash-dir
    │           │       ├── SalaController.class.uniqueId0
    │           │       └── SalaServiceImpl.class.uniqueId1
    │           └── previous-compilation-data.bin
    ├── build.gradle
    ├── gradle
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    ├── gradlew
    ├── gradlew.bat
    ├── HELP.md
    ├── settings.gradle

```

## 🔗 Relaciones entre Entidades

- **Cine** ↔ **Empleado**: Relación Many-to-Many
- **Cine** → **Sala**: Relación One-to-Many
- **Cine** → **Película**: Relación One-to-Many  
- **Sala** → **Función**: Relación One-to-Many
- **Película** → **Función**: Relación One-to-Many
- **Función** → **Entrada**: Relación One-to-Many

## 🔍 Características Técnicas

- **Auditoría**: Todas las entidades implementan auditoría con Hibernate Envers
- **Validaciones**: Restricciones de integridad referencial
- **JSON**: Serialización optimizada con anotaciones Jackson
- **Cascadas**: Configuración cuidadosa de operaciones en cascada
- **Lazy/Eager Loading**: Estrategias de carga optimizadas

## 👨‍💻 Autor

**Juan Cruz Ortiz**
- Desarrollador Full Stack
- Proyecto Final - Gestión de Cines

## 📄 Licencia

Este proyecto ha sido desarrollado con fines educativos como proyecto final.

---

⭐ **¡Dale una estrella al proyecto si te ha sido útil!** ⭐
