INSERT INTO Companyias(nombre)
    VALUES('Ubisoft'), ('RIOT'), ('Naugty Dogs');

INSERT INTO Videojuegos(nombre)
    VALUES('Far Cry'), ('Assasins Creed'), ('LOL'), ('Valorant');

INSERT INTO consumidor(nombre)
    VALUES('Parrales'), ('Torrente'), ('Ander'), ('Garrix');

INSERT INTO videojuegos_has_companyias
    VALUES(1, 1), (2, 1), (3, 2), (4, 2);

INSERT INTO videojuegos_has_consumidores
    VALUES(1, 1), (2, 1), (3, 4), (4, 2);