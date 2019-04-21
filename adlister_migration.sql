USE adlister_db;

CREATE TABLE ads(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT FOREIGN KEY (id),
    title VARCHAR(255),
    description TEXT NOT NULL,
    PRIMARY KEY (user_id) REFERENCES (id)
);



CREATE TABLE ads(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED DEFAULT NULL,
    title VARCHAR(255),
    description TEXT NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);
