DROP TABLE IF EXISTS children;

CREATE TABLE children(
    id BIGSERIAL PRIMARY KEY,
    first_name VARCHAR(255),
    name VARCHAR(255),
    sex VARCHAR(255),
    birth_day TIMESTAMP
);

