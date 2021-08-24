# Devco_Booking_Test
Test Automation Devco Challenge - OTA Booking

## Pre-requisitos
- Cucumber
- Gradle v7.0.2 o superior (variables de entorno configuradas)
- Chrome Driver(Pre-Incluido en el proyecto). Se puede descargar desde [Chrome Driver](https://www.nuget.org/packages/Selenium.Chrome.WebDriver/2.39.0)
- Java v1.8 update 202 o superior y JDK (variables de entorno configuradas)
- Software IntelliJ IDEA Photon para 64 bits. Se puede descargar desde
  [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download/#section=windows)

## Instalación
- Para clonar este repositorio localmente, se debe ejecutar el siguiente comando:  
  ```git clone https://github.com/fhautoma/Devco_Booking_Test.git ```
- Importar el proyecto desde Eclipse o IntelliJ IDE bajo la estructura de un proyecto Gradle existente
- Configurar JRE System Library con JavaSE-1.8

## Compilar El Proyecto y Generar Wrapper
- Para compilar el proyecto se debe ejecutar el comando:  
  ```gradle clean build -x test```
- Para generar los archivos wrapper del proyecto se debe ejecutar el comando:  

## Navegadores Web
La automatización actualmente se ejecuta en los siguientes navegadores
- Google Chrome v92.0

## Para Ejecutar Las Pruebas

### Localmente :computer:
- Para correr el proyecto se necesita Java JDK 1.8 y Gradle con la versión 7.0.2 o superior
- Ejecutar el comando ```gradle clean users -DaadAccount=... -DaadPassword=... --tests *runner* aggregate```

    
## Detalles Generales De La Implementación :file_folder:
Cada línea de los escenarios de pruebas creados en los features con el uso del lenguaje Gherkin, se conectan con un método en las clases StepDefinitions con la ayuda de anotaciones @Given, @When y @Then.  
Desde los StepDefinitions se conectan con las clases tipo Task donde se realizan las acciones de alto nivel.

La estructura completa del proyecto es la siguiente:

* src/main/java
``` 
* co.com.devco.certification.booking.exceptions
    Clases que capturan excepciones personalizadas cuando falla la automatización y no encuentra un campo o valor esperado.

* co.com.devco.certification.booking.interactions
    Clases que realizan las acciones de bajo nivel, como lo es escribir texto en campos, hacer clicks, entre otros.

* co.com.devco.certification.booking.model
    Clases con las que se construyen los modelos de datos.

* co.com.devco.certification.booking.questions
    Clases con las que se obtienen valores para luego ser verificadas en los stepdefinitions (asserts).  

* co.com.devco.certification.booking.tasks
    Clases que realizan las acciones de alto nivel, como lo es autenticarse en la aplicación, ingresar datos de un formulario, etc.    

* co.com.devco.certification.booking.userinterfaces
    Clases donde se mapean los elementos de la interfaz de usuario.

* co.com.devco.certification.booking.utils
    Clases que contienen funcionalidades en común.
```

* src/test/java
```
* co.com.devco.certification.booking.runners
    Runners para ejecutar las automatizaciones con los escenarios indicados en el feature. 

* co.com.devco.certification.booking.stepdefinitions
    Punto de entrada del feature para traducir de lenguaje natural a lenguaje máquina y permitir la ejecución de la automatización.
```

* src/test/resources
```
* drivers
    Se almacenan los drivers necesarios para que la automatización puede ejecutarse en los navegadores web.

* features
    Se encuentra los features del proyecto.
```

## Versionado
Se uso GIT para el control de versiones, aplicando Trunk Based Development:

## Construido Con

La automatización fue desarrollada con:
* BDD - Estrategia de desarrollo
* [Gradle 7.0.2](https://gradle.org/install/) - Manejador de dependecias
* [IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/download/#section=windows) - IDE para desarrollo de software.
* Cucumber - Framework para automatizar pruebas BDD
* [Serenity BDD](https://www.thucydides.info/#/) - Biblioteca de código abierto para la generación de reportes
* Screenplay (inicialmente fue construida con POM - Modelo Page Object Model)
* Selenium Web Driver - Herramienta para  automatizar acciones en navegadores web
* Gherkin - Lenguaje Business Readable DSL (Lenguaje especifico de dominio legible por el negocio)

## Autor

* **Andrés Felipe Henao Palacio** - fhautomata@gmail.com
