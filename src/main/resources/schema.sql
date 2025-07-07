INSERT INTO `users` (`username`, `password`)
VALUES ('bill', '123456');

INSERT INTO `authorities` (`name`)
VALUES ('read');

INSERT INTO users_authorities (user_id, authority_id)
VALUES (1, 1);