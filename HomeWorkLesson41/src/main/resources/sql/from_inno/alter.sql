ALTER TABLE Quantity ADD FOREIGN KEY (goods_id) REFERENCES Goods (id);
ALTER TABLE Goods ADD FOREIGN KEY (supplier_id) REFERENCES Suppliers (id);
ALTER TABLE Prices ADD FOREIGN KEY (goods_id) REFERENCES Goods (id);
ALTER TABLE Suppliers ADD FOREIGN KEY (manufacturer_id) REFERENCES Manufacturer (id);