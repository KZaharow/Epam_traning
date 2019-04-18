DROP DATABASE IF EXISTS autopark;
CREATE DATABASE IF NOT EXISTS autopark;

USE autopark;

DROP TABLE IF EXISTS dispatchers;

DROP TABLE IF EXISTS route_points;
DROP TABLE IF EXISTS routes;

DROP TABLE IF EXISTS orders;
DROP TABLE IF EXISTS order_status;

DROP TABLE IF EXISTS drivers;
DROP TABLE IF EXISTS driver_category;

DROP TABLE IF EXISTS cars;
DROP TABLE IF EXISTS car_status;
DROP TABLE IF EXISTS car_models;

USE autopark;


CREATE TABLE dispatchers (
  dispatcher_id int(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  sourname VARCHAR(50) NOT NULL,
  PRIMARY KEY (dispatcher_id),
  INDEX Id (dispatcher_id)
);

CREATE TABLE routes (
  route_id  int(11) NOT NULL AUTO_INCREMENT,
  point_a INT NOT NULL,
  point_b INT NOT NULL,
  PRIMARY KEY (route_id),
  INDEX Id (route_id)
);


CREATE TABLE route_points (
  point_id int(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(50),
  PRIMARY KEY (point_id),
  INDEX Id (point_id)
);

CREATE TABLE orders (
  order_id int(11) NOT NULL AUTO_INCREMENT,
  dispatcher INT NOT NULL, 
  status INT NOT NULL,
  opened datetime NOT NULL,
  closed datetime NOT NULL,
  route INT NOT NULL,
  car INT NOT NULL,
  comment VARCHAR(100),
PRIMARY KEY (order_id),
  INDEX Id (order_id)
);

 CREATE TABLE order_status (
  order_status_id int(11) NOT NULL AUTO_INCREMENT,
  description VARCHAR(50) NOT NULL,
PRIMARY KEY (order_status_id),
INDEX Id (order_status_id)
);

CREATE TABLE drivers (
  driver_id int(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  sourname VARCHAR(50) NOT NULL,
  driver_category INT NOT NULL,
  PRIMARY KEY (driver_id),
  INDEX Id (driver_id)
);

CREATE TABLE driver_category (
  cat_id int(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
PRIMARY KEY (cat_id),
  INDEX Id (cat_id)
);


CREATE TABLE cars (
  car_id int(11) NOT NULL AUTO_INCREMENT,
  reg_num VARCHAR(50) NOT NULL,
  model INT NOT NULL,
  driver INT NOT NULL,
  status INT NOT NULL,
PRIMARY KEY (car_id),
  INDEX Id (car_id)
);


CREATE TABLE car_status (
  car_status_id int(11) NOT NULL AUTO_INCREMENT,
  value VARCHAR(50) NOT NULL,
  PRIMARY KEY (car_status_id),
  INDEX Id (car_status_id)
);


CREATE TABLE car_models (
  model_id int(11) NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  PRIMARY KEY (model_id),
  INDEX Id (model_id)
);



