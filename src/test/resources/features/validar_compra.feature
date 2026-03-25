#language: es

Característica: Yo como usuario quiero iniciar sesion para realizar una compra

  Esquema del escenario: Validar proceso de compra
    Dado que el usuario inicia sesión en la página Demo Web Shop
    Cuando selecciona una categoria <categoria> y subcategoria <subcategoria>
    Y agrega un producto a su carrito
    Y procede a realizar el pago
    Ejemplos:
      | categoria  | subcategoria |
      | Electronica | Celulares    |