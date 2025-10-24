CREATE TABLE nursery (
                         id BIGSERIAL PRIMARY KEY,
                         name VARCHAR(50) NOT NULL UNIQUE,
                         address VARCHAR(100) NOT NULL UNIQUE,
                         city VARCHAR(50) NOT NULL,
                         post_code INT,
                         nb_children_max INT,
                         hourly VARCHAR(100),
                         user_id BIGINT NOT NULL,
                         CONSTRAINT fk_nursery_user
                             FOREIGN KEY (user_id)
                                 REFERENCES users (id)
                                 ON DELETE CASCADE
);
