# Prueba Técnica - Automatización de Datepicker con SerenityBDD + Cucumber + Screenplay

## Descripción

El proyecto automatiza escenarios sobre la página **[jQuery UI Datepicker](https://jqueryui.com/datepicker/)** y está diseñado siguiendo buenas prácticas de programación y nombramiento de elementos.

-----------------------
##  Clonar el repositorio

Para descargar el proyecto en tu máquina local:

```bash
# Ubícate en la carpeta donde quieras guardar el proyecto
cd C:\Users\....

# Clona el repositorio
git clone https://github.com/Julian981309/Reto_Tecnico.git

# Ingresa a la carpeta del proyecto
cd Reto_SQA
```

----------------------

## Ejecución de pruebas
- La automatización se ejecuta desde la terminal con el comando:

```bash
mvn clean verify
```

Este comando: 
- Compila el proyecto
- Ejecuta los escenarios definidos en Cucumber
- Genera los reportes de Serenity BDD y Cucumber

----------------------

##  Reportes

Una vez finalizada la ejecución, los reportes estarán disponibles en:

-   **Reporte Serenity BDD (principal):**
    `target/site/serenity/index.html`

Los reportes incluyen métricas como: 
- Casos pasados / fallidos / ignorados
- Duración de cada escenario
- Evidencia paso a paso de cada ejecución

---------------------------

##  Resultados de la última ejecución

Según los reportes, se ejecutaron **3 escenarios automatizados** donde 2 
finalizaron con **estado exitoso y 1 escenario con **estado fallido:

-   Reserva de una cita seleccionando una fecha en el calendario 
-   Selección de una fecha específica en un mes diferente
-   Validación de campo bloqueado


---------------------

##  Conclusiones

- La automatización desarrollada con **SerenityBDD + Cucumber + Screenplay** permitió validar de manera efectiva los escenarios planteados sobre el componente **Datepicker de JQuery UI**.  
- Los **escenarios 1 y 2** se ejecutaron correctamente, demostrando que el calendario permite seleccionar fechas tanto en el mes actual como en meses futuros.  
- El **escenario 3** no pasó debido a que el campo de texto del Datepicker **sí permite la edición manual**, lo que difiere del requerimiento planteado. Esta diferencia no se debe a un error en la automatización, sino a una característica propia del componente de JQuery UI.  
- El uso de **Screenplay Pattern** garantizó una implementación clara, mantenible y escalable, alineada con buenas prácticas de automatización.  
- El reporte generado por SerenityBDD facilitó la visualización de resultados y la trazabilidad de los escenarios.  



