-- Crear la tabla Tecnicos
CREATE TABLE TECNICOS (
                          ID INT PRIMARY KEY,
                          NOMBRE VARCHAR(255) NOT NULL,
                          APELLIDO VARCHAR(255) NOT NULL,
                          FECHA_NACIMIENTO DATE,
                          DIRECCION VARCHAR(255),
                          TELEFONO VARCHAR(20),
                          CORREO_ELECTRONICO VARCHAR(100) NOT NULL,
                          ESPECIALIDAD VARCHAR(100),
                          EXPERIENCIA INT,
                          CERTIFICADO BOOLEAN DEFAULT FALSE
);

-- Crear la tabla Empresas con la clave foránea a Tecnicos
CREATE TABLE EMPRESAS (
                          ID INT PRIMARY KEY,
                          NOMBRE VARCHAR(255) NOT NULL,
                          DIRECCION VARCHAR(255),
                          TELEFONO VARCHAR(20),
                          CORREO_ELECTRONICO VARCHAR(100) NOT NULL,
                          FECHA_CREACION DATE,
                          TIPO_EMPRESA ENUM('Pequeña', 'Mediana', 'Grande'),
                          ESTADO BOOLEAN DEFAULT TRUE,
                          TECNICO_ID INT,
                          FOREIGN KEY (TECNICO_ID) REFERENCES Tecnicos(id)
);
