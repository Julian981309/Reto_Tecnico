Feature: Selección de fechas en el calendario
  Background: Abrir la página del datepicker
    Given que el usuario abre la página del datepicker
    And cambia al iframe del calendario

  Scenario: Seleccionar el día 15 del mes actual
    When hace clic en el campo de fecha
    And selecciona el día 15 del calendario
    Then la fecha seleccionada debe ser "09/15/2025"

  Scenario: Seleccionar una fecha en el mes siguiente
    When hace clic en el campo de fecha
    And navega al mes siguiente
    And selecciona el día 10 del calendario
    Then la fecha seleccionada debe ser "10/10/2025"

  Scenario: Validacion de campo bloqueado
    When intenta ingresar una fecha manualmente en el campo de texto
    Then el campo de texto no debe permitir la entrada manual



