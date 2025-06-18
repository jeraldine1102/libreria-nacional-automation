# 🧪 Librería Nacional - Automatización

````
📌 Este proyecto es un caso de estudio con fines educativos y de portafolio.
````

Este proyecto automatiza el flujo de sesión, la búsqueda de libros y la adición de productos al carrito de compras en el
sitio web de [Librería Nacional](https://www.librerianacional.com), usando **Serenity BDD**, **Cucumber** y **Java**.

## 💻 Tecnologías utilizadas

- Java 11
- Maven
- Serenity BDD
- Selenium WebDriver
- Cucumber
- JUnit
- Jenkins (CI/CD)
- SonarQube (análisis estático)
- GitHub

---

## 🧪 Funcionalidades automatizadas

- ✅ Login con credenciales válidas  
- ✅ Búsqueda de libros aleatorios  
- ✅ Agregar libros al carrito  
- ✅ Validación del mensaje de confirmación  
- ✅ Verificación del producto en el carrito
---

## ⚙️ ¿Cómo ejecutar las pruebas?

### 🧰 Desde consola

````
mvn clean verify
````

### 🚀 Desde Jenkins (CI/CD)

Este proyecto incluye un `Jenkinsfile` para ejecución automática del pipeline, que realiza:

````
* Compilación del código
* Ejecución de pruebas automatizadas
* Análisis estático con SonarQube
* Validación del Quality Gate ✅
````

---

## 🔐 Configuración de entorno `.env`

Este proyecto utiliza un archivo `.env` (ya ignorado en `.gitignore`) para manejar credenciales sensibles como:

```
env
USER_EMAIL=usuario@ejemplo.com
USER_PASSWORD=miclave
USER_EMAIL_INVALID=correo@falso.com
USER_PASSWORD_INVALID=contraseñaIncorrecta
```

🛠 Duplica el archivo `.env.example` incluido y reemplaza los valores con tus datos reales:

```
cp .env.example .env
```

---

## 📊 Análisis de calidad

El análisis estático se realiza mediante **SonarQube**, incluyendo:

* Cobertura de pruebas
* Duplicación de código
* Code Smells y Bugs
* Validación automática del Quality Gate

---

## ⚙️ Requisitos para correr el proyecto

* Java 11 instalado
* Maven (`mvn -v`)
* (Opcional) SonarQube local corriendo en `http://localhost:9000`
* Variables configuradas en `.env`

---

## 👩‍💻 Autor

**Jeraldine Pamela Hinestroza Palacios**

* [GitHub: jeraldine1102](https://github.com/jeraldine1102)
* Proyecto académico / portafolio profesional

---

## 📝 Licencia

Este proyecto es parte de un portafolio personal.
Puedes usarlo como base de aprendizaje o referencia.
