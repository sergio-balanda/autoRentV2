DROP DATABASE IF EXISTS autorent;
CREATE DATABASE IF NOT EXISTS autorent;
USE autorent;
/*despues de correr el proyecto*/
INSERT INTO Vehiculo (patente, marca, nombre ,imagen, capacidadPasajeros, capacidadValijas, kilometraje) VALUES
('AB111CD', 'Toyota', 'Hilux', 'http://soundinmotion.com.au/wp-content/uploads/2016/08/sr5-.png', 5, 6, 0),
('BC222DE', 'Ford', 'Ranger', 'http://soundinmotion.com.au/wp-content/uploads/2016/08/sr5-.png', 5, 5, 0),
('CD333EF', 'Chevrolet', 'Spin', 'http://soundinmotion.com.au/wp-content/uploads/2016/08/sr5-.png', 7, 3, 0);