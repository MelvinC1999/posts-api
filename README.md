📌 Posts API

🚀 Descripción del Proyecto
Este es un proyecto basado en **Spring Boot** para el backend y **React** para el frontend. La aplicación permite visualizar un listado de publicaciones en redes sociales, realizar búsquedas y ver detalles de cada publicación.

🛠️ Tecnologías Utilizadas

Backend:
- **Spring Boot** (Java)
- **Spring Data JPA** (PostgreSQL - SupaBase)
- **Swagger** (Documentación de API)
- **Maven** (Gestión de dependencias)

Frontend:
- **React** (JavaScript)
- **Axios** (Consumo de APIs REST)
- **React Router** (Navegación entre páginas)
- **CSS** (Estilos personalizados)

🔥 Funcionalidades Principales

📌 Backend
- 📂 CRUD de publicaciones.
- 📡 Exposición de API REST.
- 🛡️ CORS habilitado para permitir el acceso desde el frontend.
- 📜 Documentación con **Swagger**.

🎨 Frontend
- 🖥️ Listado de publicaciones.
- 🔍 Barra de búsqueda en tiempo real.
- 📑 Pantalla de detalles de cada publicación.
- 🗑️ Eliminación de publicaciones.

📂 Estructura del Proyecto

```
posts-api/
│── backend/
│   ├── src/main/java/com/miempresa/posts_api/
│   │   ├── controller/   # Controladores REST
│   │   ├── model/        # Modelos de datos
│   │   ├── repository/   # Interfaces JPA
│   │   ├── service/      # Lógica de negocio
│   │   ├── PostsApiApplication.java # Main de Spring Boot
│   ├── src/main/resources/
│   │   ├── application.properties   # Configuración de la BD
│   ├── pom.xml # Dependencias de Maven
│
│── frontend/
│   ├── src/
│   │   ├── components/   # Componentes React
│   │   ├── services/     # Llamadas a la API
│   │   ├── App.js        # Punto de entrada
│   ├── package.json      # Dependencias del frontend
```

🚀 Instalación y Ejecución

🛠️ Requisitos Previos
- **Java 17** o superior
- **Node.js** y **npm**
- **PostgreSQL** (SupaBase configurado)
- **IntelliJ IDEA** (opcional)

🔧 Configurar y ejecutar el Backend
```bash
# Clonar el repositorio
git clone https://github.com/tu-usuario/posts-api.git
cd posts-api/backend

# Configurar la base de datos en application.properties

# Compilar y ejecutar el backend
mvn clean install
mvn spring-boot:run
```

🎨 Configurar y ejecutar el Frontend
```bash
cd posts-api/frontend

# Instalar dependencias
npm install

# Ejecutar React
npm start
```

📄 Documentación de la API (Swagger)
Una vez que el backend esté en ejecución, puedes acceder a la documentación en:
[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

🎯 Autores
👤 **Melvin Cevallos**  
🔗 [GitHub](https://github.com/MelvinC1999)

