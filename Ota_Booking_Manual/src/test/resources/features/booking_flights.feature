# language: es

Característica: Realizar flujos de vuelos
  Yo como usuario quiero realizar flujos de reservas en el modulo de VUELOS

  @manual

  Escenario: Realizar búsqueda de vuelo ida y vuelta
    Dado que el usuario ingresa a la pantalla de vuelos
    Cuando realiza búsqueda de vuelo ida y vuelta partiendo de Bogotá hasta Miami con fecha de salida en 2 días y fecha de regreso en 15 días
    Entonces el sistema debe mostrar resultados de vuelos disponibles ida y vuelta

  Escenario: Realizar búsqueda de vuelo solo ida
    Dado que el usuario ingresa a la pantalla de vuelos
    Cuando realiza búsqueda de vuelo solo ida y vuelta partiendo de Bogotá hasta Miami con fecha de salida en 8 días
    Entonces el sistema debe mostrar resultados de vuelos disponibles solo ida

  Escenario: Validación filtros por aerolínea
    Dado que el usuario realiza búsqueda de vuelo ida y vuelta
    Cuando Se selecciona solo Avianca en la sección "Aerolíneas" en la pagina de resultados
    Entonces el sistema debe mostrar resultados de vuelos disponibles solo para la aerolínea Avianca

  Escenario: Validación filtros por precio
    Dado que el usuario realiza búsqueda de vuelo solo ida
    Cuando Se mueve hacia la izquierda el slider de precios en la sección "Precio" en la pagina de resultados
    Entonces el sistema debe mostrar resultados de vuelos con valores que estén dentro del rango de precio seleccionado

  Escenario: Validación de precio en flujo completo
    Dado que el usuario realiza búsqueda de vuelo ida y vuelta
    Cuando selecciona un vuelo en la pagina de resultados
    Y no se agregan items adicionales
    Entonces el sistema debe mantener el precio de la reserva hasta la pagina de pago