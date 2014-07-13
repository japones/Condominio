CREATE SCHEMA 'SLC';

USE SLC;

CREATE TABLE USUARIOS (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  NOME VARCHAR(250) NOT NULL,
  USUARIO VARCHAR(50) NOT NULL,
  SENHA VARCHAR(10) NOT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID)
);

CREATE TABLE SINDICOS (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  NOME VARCHAR(250) NOT NULL,
  CPF VARCHAR(20) NOT NULL,
  ATIVO BOOL NOT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  INDEX SINDICOS_FKIndex1(USUARIOINCLUSAO),
  INDEX SINDICOS_FKIndex2(USUARIOALTERACAO),
  FOREIGN KEY(USUARIOINCLUSAO)
    REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(USUARIOALTERACAO)
    REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE REMESSAS (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  UNIDADECONSUMIDORA INTEGER UNSIGNED NOT NULL,
  REMESSASANTERIOR FLOAT NOT NULL,
  DATALEITURAANTERIOR DATE NOT NULL,
  CONSUMO INTEGER UNSIGNED NOT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  INDEX REMESSAS_FKIndex1(USUARIOINCLUSAO),
  INDEX REMESSAS_FKIndex2(USUARIOALTERACAO),
  FOREIGN KEY (USUARIOINCLUSAO) 
	REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) 
	REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE OCORRENCIAS (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  DESCRICAO VARCHAR(250) NOT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATEINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE TIPOSUC (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  NOME VARCHAR(250) NOT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE TIPOMEDIDORES (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  DESCRICAO VARCHAR(250) NOT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE CONDOMINIOS (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  NOME VARCHAR(250) NOT NULL,
  CNPJ VARCHAR(20) NOT NULL,
  ENDERECO VARCHAR(250) NOT NULL,
  EMAIL VARCHAR(250) NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE COMPETENCIAS (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  CONDOMINIO INTEGER UNSIGNED NOT NULL,
  COMPETENCIA DATE NOT NULL,
  SITUACAO BOOL NOT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  INDEX COMPETENCIAS_FKIndex1(CONDOMINIO),
  FOREIGN KEY(CONDOMINIO)
    REFERENCES CONDOMINIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE ABASTECIMENTOS (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  COMPETENCIA INTEGER UNSIGNED NOT NULL,
  DATAABASTECIMENTO DATE NOT NULL,
  QUANTIDADE FLOAT NOT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  INDEX ABASTECIMENTOS_FKIndex1(COMPETENCIA),
  FOREIGN KEY(COMPETENCIA)
    REFERENCES COMPETENCIAS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE UNIDADECONSUMIDORA (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  CONDOMINIO INTEGER UNSIGNED NOT NULL,
  TIPOUC INTEGER UNSIGNED NOT NULL,
  ULTIMONOVEL BOOL NOT NULL,
  NIVELSUPERIOR INTEGER UNSIGNED NULL,
  NUMERO INTEGER UNSIGNED NOT NULL,
  DATAULTIMALEITURA DATE NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  INDEX UNIDADECONSUMIDORA_FKIndex1(TIPOUC),
  INDEX UNIDADECONSUMIDORA_FKIndex2(CONDOMINIO),
  FOREIGN KEY(TIPOUC)
    REFERENCES TIPOSUC(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(CONDOMINIO)
    REFERENCES CONDOMINIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE LEITURAS (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  UNIDADECONSUMIDORA INTEGER UNSIGNED NOT NULL,
  COMPETENCIA INTEGER UNSIGNED NOT NULL,
  DATALEITURA DATE NOT NULL,
  REMESSAS FLOAT NOT NULL,
  CONSUMO FLOAT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  FOREIGN KEY(COMPETENCIA)
    REFERENCES COMPETENCIAS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(UNIDADECONSUMIDORA)
    REFERENCES UNIDADECONSUMIDORA(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE MEDIDORES (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  CONDOMINIO INTEGER UNSIGNED NOT NULL,
  TIPOMEDIDOR INTEGER UNSIGNED NOT NULL,
  NUMEROSERIE VARCHAR(100) NOT NULL,
  DATAAQUISICAO DATE NOT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  INDEX MEDIDORES_FKIndex1(TIPOMEDIDOR),
  INDEX MEDIDORES_FKIndex2(CONDOMINIO),
  FOREIGN KEY(TIPOMEDIDOR)
    REFERENCES TIPOMEDIDORES(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(CONDOMINIO)
    REFERENCES CONDOMINIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE MEDIDORESUCS (
  ID INTEGER UNSIGNED NOT NULL AUTO_INCREMENT,
  UNIDADECONSUMIDORA INTEGER UNSIGNED NOT NULL,
  MEDIDOR INTEGER UNSIGNED NOT NULL,
  DATAINSTALACAO DATE NOT NULL,
  DATARETIRADA DATE NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  INDEX MEDIDORESUCS_FKIndex1(UNIDADECONSUMIDORA),
  INDEX MEDIDORESUCS_FKIndex2(MEDIDOR),
  FOREIGN KEY(UNIDADECONSUMIDORA)
    REFERENCES UNIDADECONSUMIDORA(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(MEDIDOR)
    REFERENCES MEDIDORES(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE RETORNO (
  ID INTEGER UNSIGNED NOT NULL,
  OCORRENCIA INTEGER UNSIGNED NOT NULL,
  REMESSA INTEGER UNSIGNED NOT NULL,
  DATALEITURA DATE NOT NULL,
  CONSUMO INTEGER UNSIGNED NOT NULL,
  LEITURA FLOAT NOT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  INDEX RETORNO_FKIndex1(REMESSA),
  INDEX RETORNO_FKIndex2(OCORRENCIA),
  FOREIGN KEY(REMESSA)
    REFERENCES REMESSAS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(OCORRENCIA)
    REFERENCES OCORRENCIAS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE TABLE MANDATOS (
  ID INTEGER UNSIGNED NOT NULL,
  SINDICO INTEGER UNSIGNED NOT NULL,
  CONDOMINIO INTEGER UNSIGNED NOT NULL,
  MANDATOINICIO DATE NOT NULL,
  MANDATOFIM DATE NOT NULL,
  USUARIOINCLUSAO INTEGER UNSIGNED NOT NULL,
  DATAINCLUSAO DATE NOT NULL,
  USUARIOALTERACAO INTEGER UNSIGNED NULL,
  DATAALTERACAO DATE NULL,
  PRIMARY KEY(ID),
  INDEX MANDATOS_FKIndex1(SINDICO),
  INDEX MANDATOS_FKIndex2(CONDOMINIO),
  FOREIGN KEY(SINDICO) REFERENCES SINDICOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY(CONDOMINIO) REFERENCES CONDOMINIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOINCLUSAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION,
  FOREIGN KEY (USUARIOALTERACAO) REFERENCES USUARIOS(ID)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION
);

CREATE USER 'slc'@'localhost' IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON * . * TO 'slc'@'localhost';