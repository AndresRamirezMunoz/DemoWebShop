# DemoWebShop - Prueba Automatización

Proyecto de automatización de pruebas para el sitio Demo Web Shop usando:
- Java
- Gradle
- Serenity BDD (Serenity Screenplay)
- JUnit 5 + Cucumber

## 📂 Estructura principal
- `src/test/java`: código de pruebas (interactions, task, questions, stepdefinitions, runners, userinterfaces, utils)
- `src/test/resources/features`: archivos `.feature` de Cucumber
- `build.gradle`: configuración de dependencias y plugins

## ▶️ Requisitos previos
1. JDK 11+ instalado
2. Git (opcional)
3. Si ejecutas desde Windows: `gradlew.bat`, en Linux/macOS: `./gradlew`

## 🛠️ Comandos útiles
Desde la raíz del proyecto:

- Compilar y ejecutar tests:
  - Windows: `gradlew.bat test`
  - Linux/macOS: `./gradlew test`

- Ejecutar pruebas y generar reporte Serenity:
  - Windows: `gradlew.bat clean test aggregate`
  - Linux/macOS: `./gradlew clean test aggregate`

- Limpiar artefactos de compilación:
  - `gradlew clean`

## 📌 Reportes
- Reporte Serenity generado en: `target/site/serenity`
- Archivo principal: `target/site/serenity/index.html`

## 🔍 Cómo agregar/editar casos
1. Agrega casos `.feature` en `src/test/resources/features`
2. Implementa pasos en `src/test/java/co/com/demo/stepdefinitions`
3. Añade/o utiliza `@CucumberOptions` / `@Suite` si necesitas filtrar por tags

## 🧪 Runners existentes
- `co/com/demo/runners/ValidarCompraRunner` (ver carpetas de runners para otros)

## 🛠️ Buenas prácticas para este proyecto
- Mantén el patrón Screenplay  (Tasks, Interactions, Questions)
- Evita el uso directo de WebDriver en tests; usa las abstractions de Serenity
- Organiza datos de prueba en clases modelo y step definitions legibles

## 💡 Nota
Si cambias la configuración de `serenity.conf` o `junit-platform.properties`, asegúrate de re-ejecutar `clean` antes de correr tests para evitar cache de ejecución previa.
