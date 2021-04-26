INSERT INTO position(name, description, salary)
VALUES  ('mechanic', 'worker', '35000'),
        ('manager', 'head', '50000');

INSERT INTO privilege(name)
VALUES ('user'),
       ('admin');

INSERT INTO employee(name, surname, contact, login, password, position_id, privilege_id)
VALUES ('Admin', 'Adminov', '8928000000', 'Admin', 'Admin', 2, 2),
       ('Ivan', 'Ivanov', '8928000001', 'Ivan', 'Ivan', 1, 1),
       ('Sergei', 'Sergeev', '8928000002', 'Sergei', 'Sergei', 1, 1),
       ('Petr', 'Petrov', '8928000003', 'Petr', 'Petr', 1, 1);


INSERT INTO carbrand(name, description, image)
VALUES ('Mercedes', 'German company', 'image1'),
       ('Bmw', 'Better german company', 'image2'),
       ('Tesla', 'American newcomer', 'image3');


INSERT INTO carmodel(name, description, image, carbrand_id)
VALUES ('w211', 'E class car', 'image1', 1),
       ('e60', 'Coolest sedan ever', 'image2', 2),
       ('Model 3', 'Cheapest tesla on market', 'image1', 1),;