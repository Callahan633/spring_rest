INSERT INTO users VALUES
(1, 'test_login_1'),
(2, 'test_login_2');

INSERT INTO cars VALUES
(1, 'test_manufacturer_1', 'test_model_1', (SELECT id from users where login = 'test_login_1')),
(2, 'test_manufacturer_2', 'test_model_2', (SELECT id from users where login = 'test_login_2'));

INSERT INTO insurances VALUES
(1, TRUE, 10000.00, 8700.00, (SELECT id from cars where model = 'test_model_1')),
(2, FALSE, 50000.00, 20000.00, (SELECT id from cars where model = 'test_model_2'));

INSERT INTO penalties VALUES
(1, TRUE, 500.00, (SELECT id from cars where model = 'test_model_1')),
(2, FALSE, 1500.00, (SELECT id from cars where model = 'test_model_2'));