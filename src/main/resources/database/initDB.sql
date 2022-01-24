DROP TABLE IF EXISTS penalties;
DROP TABLE IF EXISTS insurances;
DROP TABLE IF EXISTS cars;
DROP TABLE IF EXISTS users;

CREATE TABLE IF NOT EXISTS users
(
    id BIGSERIAL PRIMARY KEY ,
    login VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS cars
(
    id BIGSERIAL PRIMARY KEY ,
    manufacturer VARCHAR(50) NOT NULL,
    model VARCHAR(50) NOT NULL,
    user_id BIGSERIAL ,
    CONSTRAINT fk_user
        FOREIGN KEY(user_id)
            REFERENCES users(id)
);

CREATE TABLE IF NOT EXISTS insurances
(
    id BIGSERIAL PRIMARY KEY ,
    is_active BOOLEAN NOT NULL ,
    tax_sum NUMERIC(10, 2) NOT NULL ,
    insurance_sum NUMERIC(10, 2) NOT NULL ,
    car_id BIGSERIAL ,
    CONSTRAINT fk_car
        FOREIGN KEY(car_id)
            REFERENCES cars(id)
);

CREATE TABLE IF NOT EXISTS penalties
(
    id BIGSERIAL PRIMARY KEY ,
    is_paid BOOLEAN NOT NULL ,
    penalty_sum NUMERIC(10, 2) NOT NULL ,
    car_id BIGSERIAL ,
    CONSTRAINT fk_car
        FOREIGN KEY(car_id)
            REFERENCES cars(id)
);