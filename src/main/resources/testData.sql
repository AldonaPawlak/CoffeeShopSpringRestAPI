INSERT INTO clients (address, firstname, lastname) VALUES ('Kraków, Rzemieslnicza', 'Wojtek', 'Tokarz');
INSERT INTO clients (address, firstname, lastname) VALUES ('Wrocław, Prosta 2', 'Roman', 'Bratny');
INSERT INTO clients (address, firstname, lastname) VALUES ('Poznan, Wesoła 1', 'Ala', 'Paskuda');
INSERT INTO clients (address, firstname, lastname) VALUES ('Rzeszów, Piwna 8', 'Ola', 'Piskarska');
INSERT INTO clients (address, firstname, lastname) VALUES ('Lublin, Szewska', 'Zenek', 'Kowalski');

INSERT INTO products (details, product_name, price) VALUES ('Piwo details','piwo', 4);
INSERT INTO products (details, product_name, price) VALUES ('Sok details', 'sok', 3);
INSERT INTO products (details, product_name, price) VALUES ('Jabłko details', 'jablko', 1);
INSERT INTO products (details, product_name, price) VALUES ('Ser details', 'ser', 10);
INSERT INTO products (details, product_name, price) VALUES ('Chleb details', 'chleb', 4.5);
INSERT INTO products (details, product_name, price) VALUES ('Mleko details', 'mleko', 3.5);
INSERT INTO products (details, product_name, price) VALUES ('Kwiaty details', 'kwiaty', 15);
INSERT INTO products (details, product_name, price) VALUES ('Kawa details', 'kawa', 25);

INSERT INTO client_order (details, client_id) VALUES ('zamowienie do domu', 1);
INSERT INTO client_order (details, client_id) VALUES ('zamowienie do domu', 2);
INSERT INTO client_order (details, client_id) VALUES ('zamowienie do paczkomatu', 3);
INSERT INTO client_order (details, client_id) VALUES ('zamowienie do sklepu', 4);
INSERT INTO client_order (details, client_id) VALUES ('zamowienie do domu', 4);


INSERT INTO order_products (order_id, product_id) VALUES (1, 1);
INSERT INTO order_products (order_id, product_id) VALUES (1, 3);
INSERT INTO order_products (order_id, product_id) VALUES (1, 2);
INSERT INTO order_products (order_id, product_id) VALUES (2, 3);
INSERT INTO order_products (order_id, product_id) VALUES (2, 4);
INSERT INTO order_products (order_id, product_id) VALUES (2, 5);
INSERT INTO order_products (order_id, product_id) VALUES (3, 1);
INSERT INTO order_products (order_id, product_id) VALUES (3, 2);
INSERT INTO order_products (order_id, product_id) VALUES (3, 6);