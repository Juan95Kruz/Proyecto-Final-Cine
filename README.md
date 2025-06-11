# Sistema de Gestión de Cine 🎬

Este proyecto es una aplicación web para la gestión integral de una cadena de cines, desarrollada bajo el patrón **MVC**. Permite administrar cines, salas, empleados, películas, funciones y entradas de manera sencilla y visual.

---

## Características principales

- **Gestión de Cines:** Alta, baja y modificación de cines.
- **Gestión de Salas:** Configuración de salas por cine, con capacidad y número.
- **Gestión de Empleados:** Asignación de empleados a cines.
- **Gestión de Películas:** Catálogo de películas y asociación a cines.
- **Gestión de Funciones:** Programación de horarios de películas en salas.
- **Gestión de Entradas:** Venta de entradas para funciones, con soporte para carga individual o múltiple de asientos.

---

## Modelo de datos (Clases principales)

- **Cine:** Representa un cine físico.
- **Sala:** Sala de proyección, asociada a un cine.
- **Empleado:** Personal asignado a un cine.
- **Pelicula:** Película disponible en la cartelera.
- **Funcion:** Proyección de una película en una sala y horario determinado.
- **Entrada:** Ticket para una función y asiento específico.

---

## Arquitectura

- **Backend:** Java (Spring Boot), siguiendo el patrón MVC.
- **Frontend:** HTML, CSS y JavaScript puro.
- **Base de datos:** MySQL, usando la base de datos llamada `db_cines`.

---

## Requisitos

- Java 21 
- MySQL (con la base de datos `db_cines` creada)
- Navegador web moderno

---

## Instalación y ejecución

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/Juan95Kruz/Proyecto-Final-Cine.git
   cd Proyecto-Final-Cine
   ```

2. **Configura la base de datos:**
   - Crea la base de datos `db_cines` en tu MySQL.
   - Ajusta las credenciales de conexión en tu archivo de configuración (`application.properties`).

3. **Ejecuta el backend:**
   - Desde tu IntelliJ IDEA o con:
     ```bash
     ./mvnw spring-boot:run
     ```

4. **Accede a la aplicación:**
   - Abre tu navegador y entra en:  
     [http://localhost:9000/index.html](http://localhost:9000/index.html)

---

## Notas

- **La base de datos `db_cines` no se incluye** en el repositorio. Debes crearla y poblarla según tus necesidades.
- El proyecto está pensado para uso académico o como base para sistemas de gestión similares.
- Puedes cargar una o varias entradas a la vez, separando los asientos por coma (ejemplo: `A1, B5, C10`).

---

## Licencia

Este proyecto es de uso libre para fines educativos.

---

¡Gracias por usar el Sistema de Gestión de Cine! 🍿
