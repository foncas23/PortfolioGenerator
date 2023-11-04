INSERT INTO Tecnicos (ID, NOMBRE, APELLIDO, FECHA_NACIMIENTO, DIRECCION, TELEFONO, CORREO_ELECTRONICO, ESPECIALIDAD, EXPERIENCIA, CERTIFICADO)
VALUES
    (1, 'Patricia', 'Gómez', '1992-05-11', 'C/Ramiro Valbuena 12 4B', '111-222-3333', 'PATRI@example.com', 'General', 8, true),
    (2, 'María', 'González', '1985-09-20', 'Dirección 2', '444-555-6666', 'maria@example.com', 'Mineria', 10, true),
    (3, 'Carlos', 'López', '1992-02-15', 'Dirección 3', '777-888-9999', 'carlos@example.com', 'Obra civil', 6, false);

INSERT INTO Empresas (ID, NOMBRE, DIRECCION, TELEFONO, CORREO_ELECTRONICO, FECHA_CREACION, TIPO_EMPRESA, ESTADO, TECNICO_ID)
VALUES
    (1, 'Empresa A', 'Dirección A', '123-456-7890', 'empresaA@example.com', '2020-01-01', 'Pequeña', true, 1),
    (2, 'Empresa B', 'Dirección B', '987-654-3210', 'empresaB@example.com', '2019-06-15', 'Mediana', true, 1),
    (3, 'Empresa C', 'Dirección C', '555-555-5555', 'empresaC@example.com', '2021-03-20', 'Grande', false, 3);