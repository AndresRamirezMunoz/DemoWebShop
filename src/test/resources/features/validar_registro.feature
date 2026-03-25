#language: es

Característica:Yo como usuario quiero registrarme en el portal

  Esquema del escenario: : Validar proceso de registro
    Dado que el usuario ingresa al portal
    Cuando se registra con sus datos personales
      | nombre   | apellido   | genero    | email   | contrasena   |
      | <nombre> | <apellido> | <genero> | <email> | <contrasena> |
    Entonces visualiza un mensaje de confirmación de registro exitoso
    Ejemplos:
      | nombre | apellido | genero    | email              | contrasena |
      | Juan   | Perez    | Masculino | juanperez@test.com | 12345678   |