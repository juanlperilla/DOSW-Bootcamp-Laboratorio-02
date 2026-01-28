# DOSW-Bootcamp-Laboratorio-02

## Integrantes
- Cristian Aristizabal
- Juan Camilo Lizarazo
- Santiago Andres Pinzón

---

## PREGUNTAS INICIALES:

1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?:
Con el polimorfismo lo que sucede es que nos ofrece una principal ventaja y es de escalabilidad y mantenimiento al eliminar condiciones complejas, como las que vemos con if-else o switch, asi nos permite añadir nuevas funcionalidades sin necesidad de modificar el código ya propuesto. Con esto tambien podemos ver un mejor código limpio (clean code) y tambien nos da una mayor flexibilidad.

2. ¿Por qué una clase inmutable puede mejorar la seguridad?:
Una clase inmutable permite mayor seguridad al garantizar que su estado no pueda ser modificado ya despues de ser creado, asi podemos prevenir que hayan modificaciones en esta clase, ya sean maliciosas o accidentales, errores de concurrencia(thread-safety) y corrupción de datos. También nos proporciona seguridad en el almacenamiento, asegurando que sus datos permanezcan intactos en todo su ciclo de vida.

3. Según el principio de Abierto/Cerrado, ¿cómo deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?:
El sistema se debe modificar mediante la extensión, no la modificacion del código existente, mediante herramientas como polimorfismo, herencia, interfaces, clases abstractas y añadir dependencias. 

4. ¿Qué es y por qué usamos el pom.xml?:
pom.xml es el núcleo de configuración de un proyecto en Apache Maven, es un archivo XML que define metadatos, dependencias plugins y la estructura de compilacion del proyecto, permitiendo la automatizacion de la gestion de librerias y el ciclo de vida del Software. Este nos sirve para tener una gestion automatizada de dependencias, estandarizacion, gestion del ciclo de vida, usar un repositorio centralizado y permite la herencia y flexibilidad del código.

5. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?:
Las diferencias entre mvn compile, mvn package y mvn install más que todo se basa en el alcance del ciclo de vida de Maven:
 - mvn compile: Compila el código fuente (.java a .class) de la carpeta src, main, java, colocando los archivos en el directorio target/classes.
 - mvn package: Ejecuta compile, luego las pruebas (test), y finalmente empaqueta el código compilado en un formato que es distribuible dentro de este directorio.
 - mvn install: Realiza todo el proceso de package y luego copia el archivo .jar o .war que surge al repositorio local de Maven. Esto nos permite que otros proyectos locales utilicen este artefacto como dependencia. 

6. ¿Qué diferencia existe entre una interfaz y una clase abstracta?:
Una interfaz define un contrato que una clase debe cumplir, especificando qué métodos debe implementar, sin contener estado ni lógica (salvo métodos default), y permite que una clase implemente múltiples interfaces; en cambio, una clase abstracta sirve como una base parcial que define tanto qué como cómo, ya que puede tener atributos, métodos con implementación y métodos abstractos, pero solo puede heredarse de una a la vez.



