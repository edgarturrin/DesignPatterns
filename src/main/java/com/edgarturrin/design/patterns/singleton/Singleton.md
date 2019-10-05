# Singleton Pattern 
##Introducción y nombre 
Singleton. Creacional. La idea del patrón Singleton es proveer un mecanismo para limitar el número de instancias de una clase. Por lo tanto el mismo objeto es siempre compartido por distintas partes del código. Puede ser visto como una solución más elegante para una variable global porque los datos son abstraídos por detrás de la interfaz que publica la clase singleton.

##Intención 
Garantizar que una clase sólo tenga una instancia y proporcionar un punto de acceso global a ella.

##También conocido como 
Algunas clases sólo pueden tener una instancia. Una variable global no garantiza que sólo se instancia una vez. Se utiliza cuando tiene que haber exactamente una instancia de una clase y deba ser accesible a los clientes desde un punto de acceso conocido.

## Motivación 
Algunas clases sólo pueden tener una instancia. Una variable global no garantiza que sólo se instancia una vez. Se utiliza cuando tiene que haber exactamente una instancia de una clase y deba ser accesible a los clientes desde un punto de acceso conocido.

## Solución 
Usaremos este patrón cuando:

Debe haber exactamente una instancia de una clase y deba ser accesible a los clientes desde un punto de acceso conocido.

Se requiere de un acceso estandarizado y conocido públicamente.