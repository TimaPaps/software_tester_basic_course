DROP TABLE IF EXISTS Goods;

CREATE TABLE Goods (
  id INTEGER,
  name VARCHAR(50),
  supplier_id INTEGER,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS Prices;

CREATE TABLE Prices (
  id INTEGER  ,
  goods_id INTEGER ,
  value INTEGER ,
  discount INTEGER ,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS Suppliers;

CREATE TABLE Suppliers (
  id INTEGER ,
  name VARCHAR(50) ,
  manufacturer_id INTEGER ,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS Manufacturer;

CREATE TABLE Manufacturer (
  id INTEGER ,
  name VARCHAR(50) ,
  INN INTEGER ,
  location VARCHAR(50) ,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS Quantity;

CREATE TABLE Quantity (
  goods_id INTEGER ,
  value INTEGER ,
  PRIMARY KEY (goods_id)
);