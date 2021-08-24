# language: es

Característica: Realizar flujo en modulo de Alojamientos
  Yo como usuario quiero realizar flujos de reservas en el modulo de ALOJAMIENTO

  @manual

  Escenario: Realizar búsqueda de alojamiento
    Dado que el usuario ingresa a la pantalla de alojamiento
    Cuando realiza búsqueda con destino Paris con fecha de Check-In en 10 días y fecha Check-Out en 15 días
    Entonces el sistema debe mostrar resultados de los hoteles con habitaciones disponibles
    
  Escenario: Validación filtros de politicas de cancelación
    Dado realiza búsqueda con destino Paris con fecha de Check-In en 10 días y fecha Check-Out en 15 días
    Cuando selecciona el filtro "Cancelación Gratis" en la sección "Condiciones de la reserva"
    Entonces el sistema debe mostrar resultados de los hoteles que aceptan cancelación sin costo permitiendo reservar correctamente

  Escenario: Validación de precio en flujo completo alojamiento
    Dado que el usuario realiza búsqueda de alojamiento
    Cuando selecciona una habitación
    Y no se agregan items adicionales
    Entonces el sistema debe mantener el precio de la reserva hasta la pagina de pago