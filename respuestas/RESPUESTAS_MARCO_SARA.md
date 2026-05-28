PREGUNTA 1

Explica cómo funciona la relación 1:N entre Agencia y Satelite tanto en SQL como en Java.



PREGUNTA 2

Explica por qué en Java utilizamos:

private Agencia agencia;

y no:

private int agenciaId;

Porque queremos guardar el objeto, no el id. El id es en la base de datos, 
en Java queremos acceder al objeto cuando accedemos a agencia, sus metodos,... no queremos ver el id simplemente.

PREGUNTA 3

Explica qué ventaja aporta PreparedStatement frente a concatenar SQL manualmente.

Tiene una ventaja de seguridad principalmente, porque al hacer la consulta
le pasamos un ?, y ya en le pasamos el valor. Porque sino podrian inyectarle a 
la consulta sql un 1=1, un true o algo, y ya tendrian acceso a la BD. 