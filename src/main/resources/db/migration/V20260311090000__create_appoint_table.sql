CREATE TABLE appoint(
    id BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL ,
    description TEXT NOT NULL ,
    stats VARCHAR(50),
    date TIMESTAMP
)