 private static final String SQL_FIND_ALL =
                            "SELECT * " +
                                    "FROM satelite " +
                                    "ORDER BY id";
private static final String SQL_FIND =
            "SELECT * " +
                    "FROM satelite " +
                    "WHERE id = ?";


private static final String SQL_FIND_BY_ORBITA =
                    "SELECT * " +
                            "FROM satelite " +
                            "WHERE orbita = ? " +
                            "ORDER BY nombre";
        
private static final String SQL_FIND_BY_AGENCIA =
                    "SELECT * " +
                            "FROM satelite " +
                            "WHERE id_agencia= ? " +
                            "ORDER BY nombre DESC";


--Sin utilizar aun 
--INNER JOINS 


SELECT A.ID, A.NOMBRE, S.ID, S.NOMBRE, S.ORBITA, S.PESO
FROM AGENCIA A
INNER JOIN SATELITE S ON S.ID_AGENCIA = A.ID
ORDER BY A.ID;

SELECT S.nombre, S.orbita, D.velocidad, D.combustible
FROM satelite S 
INNER JOIN DETALLESATELITE D ON S.ID = D.satelite_id;

