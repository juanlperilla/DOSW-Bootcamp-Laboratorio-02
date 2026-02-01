# DOSW-Bootcamp-Laboratorio-02

## Integrantes
- Cristian Aristizabal
- Juan Camilo Lizarazo
- Santiago Andres Pinzón

---

## Retos completados


### Reto 1: El problema de la tienda de Don Pepe

**Evidencia:**

**Descripción:**
Este sistema simula el proceso de ventas de la tienda de Don Pepe, permitiendo a un cliente agregar productos a un carrito de compras, calcular el total de la compra y aplicar un descuento según el tipo de cliente.

El sistema está diseñado de forma modular y extensible, utilizando el patrón de diseño Factory Method para encapsular la creación de los distintos tipos de clientes y aplicar sus reglas de descuento sin acoplar el código principal a implementaciones concretas.

### ¿Por qué Factory Method es el patrón más adecuado?:

El patrón Factory Method es el más adecuado para este problema porque el sistema debe crear distintos tipos de clientes que comparten un mismo comportamiento general, pero tienen reglas internas diferentes (descuentos).
Este patrón permite centralizar la lógica de creación de clientes. Evitar condicionales repetidos (if / else) en el sistema.Y cumplir el principio Open/Closed, permitiendo agregar nuevos tipos de clientes sin modificar el código existente.

### Aplicación de los principios SOLID:

### S – Single Responsibility Principle: 
Cada clase tiene una única responsabilidad:
* Producto: representa un producto con nombre y precio.

* ItemCarrito: maneja la cantidad y el subtotal de un producto.

* Carrito: gestiona los productos agregados y calcula el total.

* ClienteNuevo y ClienteFrecuente: definen su propio descuento.

* ClienteFactory: se encarga exclusivamente de crear clientes.

### O – Open/Closed Principle
El sistema está abierto a extensión pero cerrado a modificación.
Si se quisiera un nuevo tipo de cliente, basta con:

1. Crear una nueva clase que implemente Cliente.

2. Ajustar la fábrica para reconocer el nuevo tipo.

No es necesario modificar la lógica del carrito ni del cálculo del total.

### L – Liskov Substitution Principle
Cualquier objeto de tipo ClienteNuevo o ClienteFrecuente puede ser utilizado donde se espere un objeto de tipo Cliente, sin afectar el funcionamiento del sistema. El código principal no depende de la clase concreta, solo de la interfaz Cliente.

### I – Interface Segregation Principle (Segregación de Interfaces)
La interfaz Cliente contiene únicamente los métodos necesarios (getDescuento, getTipo), evitando interfaces grandes o innecesarias. Cada implementación utiliza solo los métodos que necesita.

### D – Dependency Inversion Principle
El sistema depende de abstracciones, no de implementaciones concretas:
* El carrito y el flujo principal dependen de la interfaz Cliente.
* La creación del cliente se delega a la fábrica.
Esto reduce el acoplamiento.
---

### Reto 2: El chef de 5 estrellas

**Evidencia:**


**Descripción:**
El reto consistía en desarrollar una aplicación que permitiera a un chef preparar hamburguesas personalizadas, donde cada cliente pudiera seleccionar libremente los ingredientes que deseara agregar. No todos los ingredientes eran obligatorios, y además el sistema debía permitir la incorporación de nuevos ingredientes en tiempo de ejecución, junto con su respectivo precio. Finalmente, se debía mostrar la hamburguesa completa con todos los ingredientes seleccionados y calcular el precio total utilizando Streams.

### Categoría
Creacional

### Patrón
El patron que se utilizo fue Builder

### Justificación
El patrón Builder permite construir objetos complejos paso a paso,
facilitando la creación de hamburguesas personalizadas con ingredientes
opcionales sin sobrecargar constructores en tiempo de.

### ¿Cómo lo aplico?

Se implementó un HamburguesaBuilder que permite agregar ingredientes
de forma incremental. El Chef actúa como director, controlando el proceso
de construcción. El precio total se calcula usando Streams.
---

### Reto 3: El Reino de los Vehiculos

**Evidencia:**
**Descripción:**

---

### Reto 4: La Estafa de la Casa de Cambio

**Evidencia:**
**Descripción:**

---

### Reto 5: El Café Personalizado

**Evidencia:**
**Descripción:**

---

### Reto 6: Habla con Soporte Técnico

**Evidencia:**
**Descripción:**

---

### Reto 7: El Control Remoto Mágico

**Evidencia:**
**Descripción:**

---

