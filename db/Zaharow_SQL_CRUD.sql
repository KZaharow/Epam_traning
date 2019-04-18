USE autopark;

-- INSERT DATA IN ALL TABLES

-- dispatchers;
INSERT INTO dispatchers (name, sourname)
  VALUES ('GLORIA', 'LORAN'), ('TOMAS', 'NOVAK');

-- route_points;
INSERT INTO route_points (name)
  VALUES ('GOMEL'), ('MINSK'), ('BREST'), ('VITEBSK');

-- routes;
INSERT INTO routes (point_a, point_b)
  VALUES (1, 2), (2, 3), (3, 4);

-- orders;
INSERT INTO orders (dispatcher, status, opened, closed, route, car, comment)
  VALUES (1, 1, '00-00-00', '00-00-00', 1, 1, 'VOID'),
(2, 2, '00-00-00', '00-00-00', 2, 2, 'VOID'),
(3, 3, '00-00-00', '00-00-00', 3, 3, 'VOID');

-- order_status;
INSERT INTO order_status (description)
  VALUES ('OPEN'), ('CLOSE'), ('CANCEL'), ('CORRECT');

-- drivers;
INSERT INTO drivers (name, sourname, driver_category)
  VALUES ('JHON', 'WHITE', 1), ('MIKLE', 'TROWS', 2), ('KOTOVSKY', 'ALEX', 3);

-- driver_category;
INSERT INTO driver_category (name)
  VALUES ('CAT 1'), ('CAT 2'), ('CAT 3');

-- cars;
INSERT INTO cars (reg_num, model, driver, status)
  VALUES ('AE5060-3', 1, 1, 1), ('KI5894-3', 2, 2, 2), ('TE5210-3', 3, 3, 3);

-- car_status;
INSERT INTO car_status (value)
  VALUES ('READY'), ('SERVICE'), ('RESERVED');

-- car_models;
INSERT INTO car_models (name)
  VALUES ('FIAT'), ('LADA'), ('PEUGOT');




-- UPDATE DATE / DELETE / SELECT

UPDATE car_models
  SET name = 'RENAULT'
  WHERE name = 'FIAT'; 

DELETE FROM car_models
  WHERE name = 'RENAULT';

SELECT 
  o.order_id AS 'Заказ №',
  ord_st.description AS 'Статус',
  dsp.name AS 'Диспетчер',
  cars.reg_num AS 'Машина'
FROM
  orders AS o
INNER JOIN 
  dispatchers AS dsp ON o.dispatcher = dsp.dispatcher_id
INNER JOIN 
  order_status AS ord_st ON o.status = ord_st.order_status_id
INNER JOIN 
  cars ON o.car = cars.car_id
WHERE
  dsp.name = 'GLORIA'
ORDER BY ord_st.description;

--SELECT * FROM orders;

