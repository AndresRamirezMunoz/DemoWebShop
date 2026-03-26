#language: es

Característica: Yo como usuario quiero iniciar sesion para realizar una compra

  Esquema del escenario: Validar proceso de compra
    Dado que el usuario inicia sesion en la pagina Demo Web Shop
    Cuando selecciona una categoria "<categoria>" y subcategoria "<subcategoria>"
    Y agrega un producto a su carrito
    Y ingresa al carrito y realiza el checkout
    Y ingresa los datos para la entrega
      | compania   | pais   | ciudad   | direccion   | codigoPostal   | telefono   |
      | <compania> | <pais> | <ciudad> | <direccion> | <codigoPostal> | <telefono> |
    Y selecciona la tarjeta de credito como metodo de pago
    Y completa la informacion de pago
      | tipoTarjeta   | nombreTarjeta   | numeroTarjeta  | mes   | anno   | coidgo   |
      | <tipoTarjeta> | <nombreTarjeta> | <numeroTarjeta> | <mes> | <anno> | <coidgo> |
    Entonces visualiza un mensaje de confirmacion de compra exitosa
    Ejemplos:
      | categoria | subcategoria | compania | pais     | ciudad  | direccion  | codigoPostal | telefono   | tipoTarjeta | nombreTarjeta  | numeroTarjeta    | mes | anno | coidgo |
      | computers | desktops     | choucair | Colombia | Pereira | Cale 12-34 | 630004       | 3137653453 | Visa        | Barbara Gordon | 4485564059489345 | 04  | 2039 | 123    |

