SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS Pedidos_SeComponen_Prodcutos;
DROP TABLE IF EXISTS Pedidos;
DROP TABLE IF EXISTS Clientes;
DROP TABLE IF EXISTS Empleados;
DROP TABLE IF EXISTS Oficinas;
DROP TABLE IF EXISTS Productos;




/* Create Tables */

CREATE TABLE Clientes
(
	Cod_cli int NOT NULL,
	Nombre text,
	Email text,
	Calle text,
	Numero int,
	Cp int,
	Fk_Cod_emp int NOT NULL,
	PRIMARY KEY (Cod_cli),
	UNIQUE (Cod_cli),
	UNIQUE (Fk_Cod_emp)
);


CREATE TABLE Empleados
(
	Cod_emp int NOT NULL,
	Nombre text,
	Email text,
	Calle text,
	Numero int,
	Cp int,
	Fk_Cod_emp int NOT NULL,
	Fk_Cod_ofi int NOT NULL,
	PRIMARY KEY (Cod_emp),
	UNIQUE (Cod_emp),
	UNIQUE (Fk_Cod_emp),
	UNIQUE (Fk_Cod_ofi)
);


CREATE TABLE Oficinas
(
	Cod_ofi int NOT NULL,
	Nombre text,
	Ciudad text,
	PRIMARY KEY (Cod_ofi),
	UNIQUE (Cod_ofi)
);


CREATE TABLE Pedidos
(
	Cod_ped int NOT NULL,
	Fecha date,
	Fk_Cod_cli int NOT NULL,
	PRIMARY KEY (Cod_ped),
	UNIQUE (Cod_ped),
	UNIQUE (Fk_Cod_cli)
);


CREATE TABLE Pedidos_SeComponen_Prodcutos
(
	Cod_ped int NOT NULL,
	Cod_pro int NOT NULL,
	Unidades int,
	Num_orden int,
	UNIQUE (Cod_ped),
	UNIQUE (Cod_pro)
);


CREATE TABLE Productos
(
	Cod_pro int NOT NULL,
	PVP int,
	Nombre text,
	Stock int,
	PRIMARY KEY (Cod_pro),
	UNIQUE (Cod_pro)
);



/* Create Foreign Keys */

ALTER TABLE Pedidos
	ADD FOREIGN KEY (Fk_Cod_cli)
	REFERENCES Clientes (Cod_cli)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Clientes
	ADD FOREIGN KEY (Fk_Cod_emp)
	REFERENCES Empleados (Cod_emp)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Empleados
	ADD FOREIGN KEY (Fk_Cod_emp)
	REFERENCES Empleados (Cod_emp)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Empleados
	ADD FOREIGN KEY (Fk_Cod_ofi)
	REFERENCES Oficinas (Cod_ofi)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Pedidos_SeComponen_Prodcutos
	ADD FOREIGN KEY (Cod_ped)
	REFERENCES Pedidos (Cod_ped)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Pedidos_SeComponen_Prodcutos
	ADD FOREIGN KEY (Cod_pro)
	REFERENCES Productos (Cod_pro)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



