Hola profesora, tuvimos problemas con las computadoras, mi PC no tiene espacio para correr las imagenes, estuve intentando solucionarlo hace tiempo y no logro darle la vuelta, el formateo no es opción porque ya lo intenté varias veces y aún así vuelvo con poco espacio, ya para el proximo cuatrimeste tendré un nuevo disco, por otro lado, mi compañero Yamall tiene una computadora que al intentar correr varias instancias se le tranca todo y se apaga.
Nuestro encare con este exámen (que pusimos fecha de inicialización del mismo la semana pasada para acomodarnos con horarios) fue hacerlo de manera conceptual, estuvimos en las clases y seguimos la consigna para poner todo lo necesario y que a la hora de compilar funcione, puede que haya errores por despiste y falten algunas cosas a causa de no poder compilar.
Lamentamos esta situación y entendemos si no es acpetable.

Resilience4J respuesta justificación:
Es necesaria la implementación ya que primero el catalogo se comunica con Movies y saca películas de ahí, pero en cualquier momento o por otros motivos este puede fallar, está bueno meter el circuit breaker para que no rompa toda la app y que por lo menos devuelva algo vacío
