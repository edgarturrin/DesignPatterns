#Template Method Pattern 
##Introducción y nombre 
Template Method. De Comportamiento. Define una estructura algorítmica.

##Intención 
Escribe una clase abstracta que contiene parte de la lógica necesaria para realizar su finalidad. Organiza la clase de tal forma que sus métodos concretos llaman a un método abstracto donde la lógica buscada tendría que aparecer. Facilita la lógica buscada en métodos de subclases que sobrescriben a los métodos abstractos. Define un esqueleto de un algoritmo, delegando algunos pasos a las subclases. Permite redefinir parte del algoritmo sin cambiar su estructura.

##También conocido como 
Método plantilla.

##Motivación 
Usando el Template Method, se define una estructura de herencia en la cual la superclase sirve de plantilla ("Template" significa plantilla) de los métodos en las subclases. Una de las ventajas de este método es que evita la repetición de código, por tanto la aparición de errores.

##Solución 
Se debe utilizar este patrón cuando:

Se quiera factorizar el comportamiento común de varias subclases.

Se necesite implementar las partes fijas de un algoritmo una sola vez y dejar que las subclases implementen las partes variables.

Se busque controlar las ampliaciones de las subclases, convirtiendo en métodos plantillas aquéllos métodos que pueden ser redefinidos.