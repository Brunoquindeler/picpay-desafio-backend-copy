DELETE FROM TRANSACTIONS;

DELETE FROM WALLETS;

INSERT INTO WALLETS
(ID, FULL_NAME, CPF, EMAIL, "PASSWORD", "TYPE", BALANCE)
VALUES
(1, 'User 1', 123345678900, 'user1@mail.com', '12345', 1, 1000.00);

INSERT INTO WALLETS
(ID, FULL_NAME, CPF, EMAIL, "PASSWORD", "TYPE", BALANCE)
VALUES
(2, 'User 2', 123345678901, 'user2@mail.com', '12345', 2, 1000.00);