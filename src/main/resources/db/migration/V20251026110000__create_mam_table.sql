CREATE TABLE IF NOT EXISTS mam(
    id integer PRIMARY KEY ,
    name CHAR(50),
    addess CHAR(100),
    city CHAR(100),
    post_code INTEGER,
    nb_children INTEGER,
    hourly CHAR(15),
    user_id INTEGER
)
