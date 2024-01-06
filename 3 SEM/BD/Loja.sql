drop database if exists loja;
create database loja;
use loja;

CREATE TABLE Pessoa (
    id_pessoa INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    sobrenome VARCHAR(100) NOT NULL
);

CREATE TABLE Telefone (
    id_pessoa INT,
    ddd CHAR(3),
    numero VARCHAR(12),
    PRIMARY KEY (ddd , numero , id_pessoa),
    FOREIGN KEY (id_pessoa)
        REFERENCES Pessoa (id_pessoa)
        ON UPDATE CASCADE
ON DELETE RESTRICT
);

CREATE TABLE Endereco (
    id_pessoa INT,
    tipo ENUM('comercial', 'residencial', 'cobranca'),
    logradouro VARCHAR(100) NOT NULL,
    numero VARCHAR(100),
    bairro VARCHAR(50),
    cidade VARCHAR(100) NOT NULL,
    sigla_estado CHAR(2) NOT NULL,
    PRIMARY KEY (id_pessoa , tipo),
    FOREIGN KEY (id_pessoa)
        REFERENCES Pessoa (id_pessoa)
        ON UPDATE CASCADE
ON DELETE RESTRICT
);
CREATE TABLE Pessoa_fisica (
    id_pessoa INT,
    cpf CHAR(12) NOT NULL,
    PRIMARY KEY (id_pessoa),
    FOREIGN KEY (id_pessoa)
        REFERENCES Pessoa (id_pessoa)
        ON UPDATE CASCADE
ON DELETE RESTRICT
);
CREATE TABLE Pessoa_juridica (
    id_pessoa INT,
    cnpj VARCHAR(14) NOT NULL,
    PRIMARY KEY (id_pessoa),
    FOREIGN KEY (id_pessoa)
        REFERENCES Pessoa (id_pessoa)
        ON UPDATE CASCADE
ON DELETE RESTRICT
);
CREATE TABLE Cliente (
    id_cliente INT,
    PRIMARY KEY (id_cliente),
    FOREIGN KEY (id_cliente)
        REFERENCES Pessoa_fisica (id_pessoa)
        ON UPDATE CASCADE
ON DELETE RESTRICT

);
CREATE TABLE cartao (
    numero_cartao VARCHAR(20) PRIMARY KEY,
    id_cliente INT,
    tipo ENUM('credito', 'debito', 'credito e debito') NOT NULL,
    nome_cliente VARCHAR(50) NOT NULL,
    data_vencimento DATE NOT NULL,
    FOREIGN KEY (id_cliente)
        REFERENCES Cliente (id_cliente)
        ON UPDATE CASCADE
ON DELETE RESTRICT

);
CREATE TABLE Fabricante (
    id_fabricante INT,
    PRIMARY KEY (id_fabricante),
    FOREIGN KEY (id_fabricante)
        REFERENCES Pessoa_juridica (id_pessoa)
        ON UPDATE CASCADE
ON DELETE RESTRICT

);
CREATE TABLE Fornecedor (
    id_fornecedor INT,
    PRIMARY KEY (id_fornecedor),
    FOREIGN KEY (id_fornecedor)
        REFERENCES Pessoa_fisica (id_pessoa)
        ON UPDATE CASCADE
ON DELETE RESTRICT

);
CREATE TABLE Produto (
    id_produto INT,
    id_fabricante INT,
    descriçao VARCHAR(100) NOT NULL,
    preco DECIMAL(10 , 2 ) NOT NULL,
    peso DECIMAL(6 , 2 ) NOT NULL,
    qtde INT NOT NULL,
    PRIMARY KEY (id_produto , id_fabricante),
    FOREIGN KEY (id_fabricante)
        REFERENCES Fabricante (id_fabricante)
        ON UPDATE CASCADE
ON DELETE RESTRICT

);
CREATE TABLE Fornecimento (
    id_produto INT,
    id_fornecedor INT,
    PRIMARY KEY (id_produto , id_fornecedor),
    FOREIGN KEY (id_produto)
        REFERENCES Produto (id_produto)
        ON UPDATE CASCADE
ON DELETE RESTRICT,
    FOREIGN KEY (id_fornecedor)
        REFERENCES Fornecedor (id_fornecedor)
        ON UPDATE CASCADE
ON DELETE RESTRICT

);
CREATE TABLE Recebimento (
    id_fornecedor INT,
    data_hora_recebimento DATETIME,
    PRIMARY KEY (id_fornecedor , data_hora_recebimento),
    FOREIGN KEY (id_fornecedor)
        REFERENCES Fornecedor (id_fornecedor)
        ON UPDATE CASCADE
ON DELETE RESTRICT

);
CREATE TABLE Recebimento_produto (
    id_fornecedor INT,
    data_hora_recebimento DATETIME,
    id_produto INT,
    qtde_itens INT NOT NULL,
    preco_custo DECIMAL(10 , 2 ) NOT NULL,
    FOREIGN KEY (id_produto)
        REFERENCES Fornecimento (id_produto)
        ON UPDATE CASCADE
ON DELETE RESTRICT,
    FOREIGN KEY (id_fornecedor , data_hora_recebimento)
        REFERENCES Recebimento (id_fornecedor , data_hora_recebimento)
        ON UPDATE CASCADE
ON DELETE RESTRICT

);
CREATE TABLE Categoria (
    categoria VARCHAR(50) PRIMARY KEY

);
CREATE TABLE produto_categoria (
    id_produto INT,
    categoria VARCHAR(50),
    PRIMARY KEY (id_produto , categoria),
    FOREIGN KEY (id_produto)
        REFERENCES Produto (id_produto)
        ON UPDATE CASCADE
ON DELETE RESTRICT,
    FOREIGN KEY (categoria)
        REFERENCES Categoria (categoria)
        ON UPDATE CASCADE
ON DELETE RESTRICT

);

CREATE TABLE Entrega (
    entrega VARCHAR(50) PRIMARY KEY,
    data_hora_entrega DATETIME

);
CREATE TABLE Forma_pagto (
    forma_pagto VARCHAR(50) PRIMARY KEY
   
);

CREATE TABLE Pedido (
    id_pedido INT PRIMARY KEY,
    id_cliente INT,
    entrega VARCHAR(50),
    forma_pagto VARCHAR(50),
    data_hora_pedido DATETIME,
    FOREIGN KEY (id_cliente)
        REFERENCES Cliente (id_cliente)
        ON UPDATE CASCADE
ON DELETE RESTRICT,
        
    FOREIGN KEY (entrega)
        REFERENCES Entrega (entrega)
        ON UPDATE CASCADE
ON DELETE RESTRICT,
    FOREIGN KEY (forma_pagto)
        REFERENCES Forma_pagto (forma_pagto)
        ON UPDATE CASCADE
ON DELETE RESTRICT

);
create table Pedido_Produto(
	id_pedido int,
    id_produto int,
    qtde int,
    preco decimal(10,2),
    primary key(id_pedido,id_produto),
	FOREIGN KEY (id_pedido)
        REFERENCES Pedido(id_pedido)
    ON UPDATE CASCADE
	ON DELETE RESTRICT,
        
	FOREIGN KEY (id_produto)
        REFERENCES Produto(id_produto)
        
        ON UPDATE CASCADE
ON DELETE RESTRICT

 );
