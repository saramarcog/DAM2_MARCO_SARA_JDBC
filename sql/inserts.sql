 "INSERT INTO satelite " +
                    "(" +
                    "nombre, " +
                    "prbita, " +
                    "peso, " +
                    "coste, " +
                    "activo" +
                    "agencia_id" +
                    "autor_examen" +
                    ") " +
                    "VALUES " +
                    "(" +
                    "?, ?, ?, ?, ?" +
                    ")";

INSERT INTO AGENCIA (nombre, pais, fecha_fundacion, Autor_examen) VALUES ("DAM SA", "Spain", "2026", "Sara Marco");
INSERT INTO AGENCIA (nombre, pais, fecha_fundacion, Autor_examen) VALUES ("Lolo SA", "Spain", "2026", "Sara Marco");
INSERT INTO AGENCIA (nombre, pais, fecha_fundacion, Autor_examen) VALUES ("NASA", "USA", "1950", "Sara Marco");
INSERT INTO AGENCIA (nombre, pais, fecha_fundacion, Autor_examen) VALUES ("NOSE", "Spain", "2007", "Sara Marco");
INSERT INTO AGENCIA (nombre, pais, fecha_fundacion, Autor_examen) VALUES ("NUSE", "Spain", "2026", "Sara Marco");

INSERT INTO satelite (nombre, orbita, peso, coste, activo, agencia_id, autor_examen)
VALUES("Apruebame porfi", "1DAM", "5220", "283239283", true, 1, "Sara Marco");
INSERT INTO satelite (nombre, orbita, peso, coste, activo, agencia_id, autor_examen)
VALUES("Lolo", "1DAM", "5220", "283239283", true, 2, "Sara Marco");
INSERT INTO satelite (nombre, orbita, peso, coste, activo, agencia_id, autor_examen)
VALUES("Verano", "2DAM", "22222", "1000000", true, 3, "Sara Marco");
INSERT INTO satelite (nombre, orbita, peso, coste, activo, agencia_id, autor_examen)
VALUES("No quiero la recu", "Imaginacion", "8323", "283239283", true, 1, "Sara Marco");
INSERT INTO satelite (nombre, orbita, peso, coste, activo, agencia_id, autor_examen)
VALUES("He aprendido mucho", "Via Lactea", "5420", "283239283", true, 2, "Sara Marco");

INSERT INTO DETALLESATELITE VALUES (velocidad, combustible, vidaUtil,temperatura_maxima, satelite_id, Autor_examen)
VALUES (120, 50, 3, 222, 1, "Sara Marco");
INSERT INTO DETALLESATELITE VALUES (velocidad, combustible, vidaUtil,temperatura_maxima, satelite_id, Autor_examen)
VALUES (120, 55, 4, 333, 2, "Sara Marco");
INSERT INTO DETALLESATELITE VALUES (velocidad, combustible, vidaUtil,temperatura_maxima, satelite_id, Autor_examen)
VALUES (120, 55, 5, 555, 3, "Sara Marco");
INSERT INTO DETALLESATELITE VALUES (velocidad, combustible, vidaUtil,temperatura_maxima, satelite_id, Autor_examen)
VALUES (120, 55, 6, 444, 4, "Sara Marco");
INSERT INTO DETALLESATELITE VALUES (velocidad, combustible, vidaUtil,temperatura_maxima, satelite_id, Autor_examen)
VALUES (120, 55, 7, 111, 5, "Sara Marco");