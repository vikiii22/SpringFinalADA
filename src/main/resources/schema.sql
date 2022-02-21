DROP TABLE IF EXISTS companyias, consumidor, videojuegos, videojuegos_has_companyias, videojuegos_has_consumidores;

CREATE TABLE IF NOT EXISTS companyias (
  id_companyias INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NULL,
  PRIMARY KEY (id_companyias));

CREATE TABLE IF NOT EXISTS videojuegos (
  id_videojuegos INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NULL,
  PRIMARY KEY (id_videojuegos));

CREATE TABLE IF NOT EXISTS consumidor (
  id_consumidor INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NULL,
  PRIMARY KEY (id_consumidor));

CREATE TABLE IF NOT EXISTS videojuegos_has_companyias(
  videojuegos_id_videojuegos INT NOT NULL,
  companyias_id_companyias INT NOT NULL,
  PRIMARY KEY (videojuegos_id_videojuegos, companyias_id_companyias),
    FOREIGN KEY (videojuegos_id_videojuegos)
    REFERENCES videojuegos (id_videojuegos),
    FOREIGN KEY (companyias_id_companyias)
    REFERENCES companyias (id_companyias));

CREATE TABLE IF NOT EXISTS videojuegos_has_consumidores(
  videojuegos_id_videojuegos INT NOT NULL,
  consumidor_id_consumidor INT NOT NULL,
  PRIMARY KEY (videojuegos_id_videojuegos, consumidor_id_consumidor),
    FOREIGN KEY (videojuegos_id_videojuegos)
    REFERENCES videojuegos (id_videojuegos),
    FOREIGN KEY (consumidor_id_consumidor)
    REFERENCES consumidor (id_consumidor));