DATABASE pharmacymanagement

CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    email VARCHAR (33) NOT NULL,
    senha VARCHAR (33) NOT NULL,
);

CREATE TABLE medicamento (
     id SERIAL PRIMARY KEY,
     nome_medicamento VARCHAR (50) NOT NULL,
     nome_laboratorio VARCHAR (50) NOT NULL,
     dosagem_medicamento VARCHAR (50) NOT NULL,
     descricao_medicamento TEXT NULL,
     preco_un_medicamento NUMERIC CHECK (preco_un_medicamento > 0 ) NOT NULL,
     tipo_medicamento VARCHAR (50) NOT NULL
);

CREATE TABLE farmacia (
    id SERIAL PRIMARY KEY,
    razao_social VARCHAR (87) NOT NULL,
    cnpj VARCHAR (15) NOT NULL,
    nome_fantasia VARCHAR (87) NOT NULL,
    email VARCHAR (50) NOT NULL,
    telefone VARCHAR (20) NULL,
    celular VARCHAR (20) NULL,
    id_endereco INT NOT NULL REFERENCES endereco (id)
);

CREATE TABLE endereco (
    id SERIAL PRIMARY KEY,
    cep VARCHAR (10) NOT NULL,
    logradouro VARCHAR (80) NOT NULL,
    numero SMALLINT NOT NULL,
    bairro VARCHAR (50) NOT NULL,
    cidade  VARCHAR (50) NOT NULL,
    estado VARCHAR (50) NOT NULL,
    complemento VARCHAR (50),
    latitude VARCHAR (40) NOT NULL,
    longitude VARCHAR (40) NOT NULL
);
