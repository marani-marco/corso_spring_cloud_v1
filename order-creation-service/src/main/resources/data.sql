CREATE TABLE ORDERS(
    ID INT PRIMARY KEY auto_increment,
    PRODUCT_ID INT,
    QUANTITY INT,
    DATE_CREATION DATE,
    DATE_UPDATE DATE
    STATUS VARCHAR(50)
    STATUS_DESCRIPTION VARCHAR(255),
    CUSTOMER_ID INT,
    USER_ID_LAST_UPDATE INT,
    foreign key (PRODUCT_ID) references PRODUCTS(ID),
    foreign key (CUSTOMER_ID) references CUSTOMERS(ID),
    foreign key (USER_ID_LAST_UPDATE) references USERS(ID)
);

CREATE TABLE PRODUCTS(
ID INT PRIMARY KEY auto_increment,
CATEGORY_ID INT,
CODE VARCHAR(50),
SHORT_DESCRIPTION VARCHAR(100),
DESCRIPTION VARCHAR(255)
NUMBER_AVAILABILITY INT,
STATUS VARCHAR(50),
foreign key (CATEGORY_ID) references CATEGORIES(ID)
);

CREATE TABLE CATEGORIES(
ID INT PRIMARY KEY auto_increment,
CATEGORY VARCHAR(50),
SUB_CATEGORY VARCHAR(50)
);

CREATE TABLE CUSTOMERS(
ID INT PRIMARY KEY auto_increment,
FIRST_NAME VARCHAR(255),
LAST_NAME VARCHAR(255),
ADDRESS VARCHAR(255),
EMAIL VARCHAR(255),
PHONE_NUMBER VARCHAR(255)
);

CREATE TABLE USERS(
ID INT PRIMARY KEY auto_increment,
FIRST_NAME VARCHAR(255),
LAST_NAME VARCHAR(255),
ROLE VARCHAR(50)
);