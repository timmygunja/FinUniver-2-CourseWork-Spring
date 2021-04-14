INSERT INTO position(name, description, salary, employee_id)
VALUES ('head', 'manager', '50000', null),
       ('mechanic', 'worker', '35000', null);

INSERT INTO privilege(name, employee_id)
VALUES ('admin', null),
       ('user', null);

INSERT INTO employee(name, surname, contact, login, password)
VALUES ('name1', 'surname1', 'phone1', 'login1', 'password1');


INSERT INTO carbrand(name, description, image)
VALUES ('name1', 'description1', 'image1');


INSERT INTO carmodel(name, description, image, carbrand_id)
VALUES ('name1', 'description1', 'image1', null);