create database empleados;

use empleados;

create table empleado (
	id int not null auto_increment primary key,
    nombre varchar(20) not null,
    apellido  varchar(20) not null, 
    cargo  varchar(20) not null, 
    salario  double not null,
    fechaInicio date not null
    
);
	
INSERT INTO empleado (nombre, apellido, cargo, salario, fechaInicio) 
VALUES ('Juan', 'Pérez', 'Gerente', 50000, '2023-01-15');

INSERT INTO empleado (nombre, apellido, cargo, salario, fechaInicio) 
VALUES ('María', 'González', 'Analista', 35000, '2022-06-10');

INSERT INTO empleado (nombre, apellido, cargo, salario, fechaInicio) 
VALUES ('Carlos', 'Ramírez', 'Desarrollador', 40000, '2021-09-20');

INSERT INTO empleado (nombre, apellido, cargo, salario, fechaInicio) 
VALUES ('Ana', 'López', 'Diseñadora', 3800, '2020-03-01');

INSERT INTO empleado (nombre, apellido, cargo, salario, fechaInicio) 
VALUES ('Luis', 'Martínez', 'Tester', 32000, '2023-07-12');

INSERT INTO empleado (nombre, apellido, cargo, salario, fechaInicio) 
VALUES ('Laura', 'Hernández', 'Gerente de Proyecto', 55000, '2021-12-01');

INSERT INTO empleado (nombre, apellido, cargo, salario, fechaInicio) 
VALUES ('Miguel', 'Fernández', 'Soporte Técnico', 30000, '2022-04-18');

INSERT INTO empleado (nombre, apellido, cargo, salario, fechaInicio) 
VALUES ('Sofía', 'Jiménez', 'Analista', 36000, '2023-05-23');

INSERT INTO empleado (nombre, apellido, cargo, salario, fechaInicio) 
VALUES ('Andrés', 'Castillo', 'Desarrollador', 42000, '2020-11-30');

INSERT INTO empleado (nombre, apellido, cargo, salario, fechaInicio) 
VALUES ('Lucía', 'Ortiz', 'Administrativa', 29000, '2019-08-15');

select * from empleado;