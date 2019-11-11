-- MySQL dump 10.13  Distrib 5.7.9, for Win32 (AMD64)
--
-- Host: localhost    Database: estoque
-- ------------------------------------------------------
-- Server version	5.6.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `caixa`
--

DROP TABLE IF EXISTS `caixa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `caixa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `valorDeEntra` double DEFAULT NULL,
  `valorDeSaida` double DEFAULT NULL,
  `dataMovimento` date DEFAULT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caixa`
--

LOCK TABLES `caixa` WRITE;
/*!40000 ALTER TABLE `caixa` DISABLE KEYS */;
INSERT INTO `caixa` VALUES (1,20,15,'2019-08-01',NULL),(2,20,15,'2019-08-01',NULL),(3,300,30,'2019-08-14',NULL),(4,300,0,'2019-08-14',NULL),(5,20,15,'2019-08-14',NULL),(6,500,0,'2019-08-14',NULL),(7,0,500,'2019-08-14',NULL),(8,100.5,0,'2019-08-14',NULL),(9,50,0,'2019-08-14',NULL),(10,500,0,'2019-08-14',NULL),(11,500,0,'2019-08-14',NULL),(12,0,100,'2019-08-14',NULL),(13,0,100,'2019-08-14',NULL),(14,20,15,'2019-08-14','teste'),(15,0,100,'2019-08-14',NULL),(16,100,0,'2019-08-14','VALOR DE ABERTURA DE CAIXA'),(17,100,0,'2019-08-14','VALOR DE ABERTURA DE CAIXA'),(18,0,50,'2019-08-14','GAS'),(19,100,0,'2019-08-14','VALOR DE ABERTURA DE CAIXA'),(20,130,0,'2019-08-14','VALOR DE ABERTURA DE CAIXA'),(21,0,100,'2019-08-14','LUZ'),(22,100,0,'2019-08-14','VALOR DE ABERTURA DE CAIXA'),(23,0,0,'2019-08-10','VALOR DE ABERTURA DE CAIXA'),(24,100,0,'2019-08-14','VALOR DE ABERTURA DE CAIXA'),(25,0,0,'2019-08-14','VALOR DE ABERTURA DE CAIXA'),(26,0.001,0,'2019-08-14','VALOR DE ABERTURA DE CAIXA'),(27,0.001,0,'2019-08-14','VALOR DE ABERTURA DE CAIXA'),(28,0.001,0,'2019-08-15','VALOR DE ABERTURA DE CAIXA'),(29,0,150,'2019-08-15','LUZ'),(30,0,150,'2019-08-15','AGUA'),(31,0,200,'2019-08-15','BOLETO TESTE'),(32,0,50,'2019-08-15','TESTE'),(33,0,50,'2019-08-15','TESTE'),(34,0,30,'2019-08-15','TESTE'),(35,0,30,'2019-08-15','TESTE');
/*!40000 ALTER TABLE `caixa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Categoria` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'ELETRÔNICOS'),(2,'FERRAMENTAS'),(3,'CAMA MESA E BANHO'),(4,'INFORMÁTICA'),(5,'PAPELARIA'),(6,NULL);
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dado_bancario`
--

DROP TABLE IF EXISTS `dado_bancario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dado_bancario` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `banco` varchar(30) DEFAULT NULL,
  `tpConta` varchar(30) DEFAULT NULL,
  `agencia` varchar(30) DEFAULT NULL,
  `operacao` varchar(30) DEFAULT NULL,
  `conta` varchar(40) DEFAULT NULL,
  `pessoa_juridica_id` int(11) DEFAULT NULL,
  `pessoa_fisica_id` int(11) DEFAULT NULL,
  `tipoPessoa` int(11) DEFAULT NULL,
  `tpFornecedorCliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dado_bancario`
--

LOCK TABLES `dado_bancario` WRITE;
/*!40000 ALTER TABLE `dado_bancario` DISABLE KEYS */;
INSERT INTO `dado_bancario` VALUES (1,'ITAÚU','000','00','000','000',0,1,2,2),(2,'BANCO DO BRASIL','1142310-2','0674','0674','1142310-2',0,2,2,1),(3,'Santander','07928948-1','0994','001','07928948-1',1,0,1,1),(4,'Banco do Brasil','176590-6','3600','001','176590-6',2,0,1,2),(5,'SANTANDER','00000','0000','0000','0000',0,3,2,1),(6,'Bradesco','0665447-9','3236','001','0665447-9',3,0,1,1);
/*!40000 ALTER TABLE `dado_bancario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dado_complementar`
--

DROP TABLE IF EXISTS `dado_complementar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dado_complementar` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `telefone` varchar(60) DEFAULT NULL,
  `celular` varchar(60) DEFAULT NULL,
  `email` varchar(150) DEFAULT NULL,
  `observacao` varchar(3000) DEFAULT NULL,
  `pessoa_juridica_id` int(11) DEFAULT NULL,
  `pessoa_fisica_id` int(11) DEFAULT NULL,
  `tipoPessoa` int(11) DEFAULT NULL,
  `tpFornecedorCliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dado_complementar`
--

LOCK TABLES `dado_complementar` WRITE;
/*!40000 ALTER TABLE `dado_complementar` DISABLE KEYS */;
INSERT INTO `dado_complementar` VALUES (1,'000','0000','pinto@sp.senac.com.br','TESTE TESTE',0,1,2,2),(2,'2736799832','27998189235','jenniferritapinto-81@dddrin.com.br','teste 2',0,2,2,1),(3,'1627388039','16999402530','manutencao@propagandaltda.com.br','TESTE CLIENTE PESSOA JURIDICA',1,0,1,1),(4,'1829644589','18981840738','tesouraria@aparecidaemarinainformaticaltda.com.br','teste cadastro de fornecedor pj',2,0,1,2),(5,'2222','22222','araujo-94@gimail.com','TESTE CLIENTE PESSOA FISICA TESTE',0,3,2,1),(6,'1136189576','11981114103','ouvidoria@bebidasme.com.br','TESTE CADASTRO DE CLIENTE PESSOA JURIDICA',3,0,1,1);
/*!40000 ALTER TABLE `dado_complementar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `endereco` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cep` varchar(10) DEFAULT NULL,
  `logradouro` varchar(50) DEFAULT NULL,
  `numero` varchar(10) DEFAULT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  `complemento` varchar(45) DEFAULT NULL,
  `uf` varchar(45) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `pessoa_juridica_id` int(11) DEFAULT NULL,
  `pessoa_fisica_id` int(11) DEFAULT NULL,
  `tipoPessoa` int(11) DEFAULT NULL,
  `tpFornecedorCliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'9511054000','RUA L. PIERUCCINI','790T','DESVIO RIZZOTESTE','CASATESTE','RO','CAXIAS DO SULTESET',0,1,2,2),(2,'29936250','RUA ALMIR DE QUEIROZ','991','JAQUELINE','CASA','SP','São Mateus',0,2,2,1),(3,'13568804','RUA MARIA MADALENA KANEBLAY SAVIO','442','RESIDENCIAL  ASTOLPHO LUIZ DO PRADO','CASA','RS','SÃO CARLOS',1,0,1,1),(4,'19030130','Rua Rio Grande do Sul','934','Vila Marcondes','casa','SP','Presidente Prudente',2,0,1,2),(5,'85863-460','TESTE - TERMINAL RODOVIÁRIA INTERNACIONAL','TESET','TESTE JARDIM POLO CENTRO','TESTE CASA','RO','TESTEFOZ DO IGUAÇU',0,3,2,1),(6,'08431649','RUA MILTON SANTOS','564','PARQUE GUAIANAZES','CASA','SP','SÃO PAULO',3,0,1,1);
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entrada_estoque`
--

DROP TABLE IF EXISTS `entrada_estoque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entrada_estoque` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `lote` varchar(45) DEFAULT NULL,
  `data_vencimento` date DEFAULT NULL,
  `numero_calcado` varchar(45) DEFAULT NULL,
  `preco_custo` double DEFAULT NULL,
  `margem_venda` double DEFAULT NULL,
  `quantidade` double DEFAULT NULL,
  `preco_venda` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  `produto_id` int(11) NOT NULL,
  `categoria_id` int(11) NOT NULL,
  `fornecedor_pf` int(11) DEFAULT NULL,
  `fornecedor_pj` int(11) DEFAULT NULL,
  `codigoBarra` varchar(45) DEFAULT NULL,
  `num_nota_fiscal` varchar(30) DEFAULT NULL,
  `data_nota_fiscal` date DEFAULT NULL,
  PRIMARY KEY (`id`,`produto_id`,`categoria_id`),
  KEY `fk_entrada_estoque_produto_idx` (`produto_id`),
  KEY `fk_entrada_estoque_categoria1_idx` (`categoria_id`),
  CONSTRAINT `fk_entrada_estoque_categoria1` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`),
  CONSTRAINT `fk_entrada_estoque_produto` FOREIGN KEY (`produto_id`) REFERENCES `produto` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrada_estoque`
--

LOCK TABLES `entrada_estoque` WRITE;
/*!40000 ALTER TABLE `entrada_estoque` DISABLE KEYS */;
INSERT INTO `entrada_estoque` VALUES (1,'000','2019-07-15','',150,30,20,195,3900,1,1,10,0,'111','123','2019-07-15'),(2,'000','2019-07-15','',25,30,40,32.5,1300,2,1,10,0,'222','123','2019-07-15'),(3,'0000','2019-07-15','',20,23.3,50,24.66,1233,3,2,6,0,'333','321','2019-07-15'),(4,'000','2019-07-15','',200.23,40,30,280.322,8409.66,4,2,6,0,'444','321','2019-07-15'),(5,'00000','2019-07-15','',40,35,100,54,5400,5,3,0,1,'555','231','2019-07-15'),(6,'000','2019-07-15','',150,30,40,195,7800,6,3,0,4,'666','231','2019-07-15'),(7,'000','2019-07-15','',1500,45,20,2175,43500,7,4,0,3,'777','231','2019-07-15'),(8,'0000','2019-07-15','',500,30,40,650,26000,8,4,0,2,'888','312','2019-07-15'),(9,'000','2019-07-15','',500,30,45,650,29250,8,4,0,2,'999','312','2019-07-15'),(10,'000','2019-07-15','',1500,30,20,1950,39000,7,4,0,1,'777','312','2019-07-15'),(11,'000','2019-07-16','',500,30,50,650,32500,7,4,0,1,'777','123','2019-07-16'),(12,'654','2019-07-16','',50,30,35,65,2275,7,4,0,1,'777','654','2019-07-16'),(13,'000','2019-07-16','',20,30,20,26,520,3,2,0,1,'333','654','2019-07-16'),(14,'654','2019-07-16','',15,30,50,19.5,975,1,1,0,1,'111','6549','2019-07-16'),(15,'000','2019-07-17','',1500,30,20,1950,39000,7,4,0,1,'777','9876','2019-07-17'),(16,'666','2019-07-17','',30,30,30,39,1170,7,4,0,1,'777','98769','2019-07-17'),(17,'MBL2019','2019-01-09','40',40,30,40,52,2080,1,1,2,1,'11111','654','2019-06-24'),(18,'MBL2019','2019-01-09','40',40,30,40,52,2080,1,1,2,1,'11111','654','2019-06-24'),(19,'MBL2019','2019-01-09','40',40,30,40,52,2080,1,1,2,1,'11111','654','2019-06-24'),(20,'321','2019-08-07','',50,30,20,65,1300,3,2,10,0,'333','987','2019-08-07'),(21,'MBL2019','2019-01-09','40',40,30,40,52,2080,1,1,2,1,'11111','654','2019-06-24'),(22,'123','2019-08-09','',50,30,20,65,1300,11,5,0,3,'111','987','2019-08-09'),(23,'123','2019-08-09','',50,30,20,65,1300,11,5,0,1,'111','000','2019-08-09'),(24,'000','2019-08-09','',30,30,10,39,390,11,5,0,1,'111','222','2019-08-09'),(25,'000','2019-08-09','',30,30,30,39,1170,11,5,0,1,'111','333','2019-08-09'),(26,'000','2019-08-09','',30,30,30,39,1170,11,5,10,0,'111','444','2019-08-09'),(27,'000','2019-08-09','',30,30,30,39,1170,11,5,0,1,'111','666','2019-08-09'),(28,'MBL2019','2019-01-09','40',40,30,40,52,2080,1,1,2,1,'11111','654','2019-06-24'),(29,'MBL2019','2019-01-09','40',40,30,40,52,2080,1,1,2,1,'11111','654','2019-06-24'),(30,'000','2019-08-09','',30,30,30,39,1170,11,5,10,0,'111','7777','2019-08-09'),(31,'000','2019-08-09','',30,30,30,39,1170,11,5,10,0,'111','888','2019-08-09'),(32,'MBL2019','2019-01-09','40',40,30,40,52,2080,1,1,2,1,'11111','654','2019-06-24'),(33,'000','2019-08-09','',30,30,30,39,1170,11,5,10,0,'111','99999','2019-08-09'),(34,'000','2019-08-09','',30,30,30,39,1170,11,5,10,0,'111','999990','2019-08-09'),(35,'023','2019-08-09','',150,30,1,195,195,4,2,0,1,'444','123456789','2019-08-09'),(36,'12','2019-08-09','',30,30,30,39,1170,4,2,0,1,'444','1234567891','2019-08-09'),(37,'000','2019-08-09','',150,30,19,195,3705,4,2,0,1,'444','159847236','2019-08-09'),(38,'000','2019-08-09','',10,30,11,13,143,3,2,0,1,'333','159847236','2019-08-09'),(39,'000','2019-08-09','',2,30,10,2.6,26,11,5,0,1,'166','159847236','2019-08-09'),(40,'123','2019-08-09','',15,30,20,19.5,390,1,1,0,1,'111','357896541332','2019-08-09'),(41,'312','2019-08-09','',100,30,10,130,1300,4,2,0,1,'444','357896541332','2019-08-09'),(42,'123','2019-08-09','',20,30,50,26,1300,3,2,10,0,'333','000000000','2019-08-09'),(43,'123','2019-08-02','',30,30,200,39,7800,3,2,10,0,'333','999','2019-08-09'),(44,'987','2019-08-02','',150,30,5,195,975,6,3,10,0,'666','999','2019-08-09');
/*!40000 ALTER TABLE `entrada_estoque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `extrato_conta_emhaver`
--

DROP TABLE IF EXISTS `extrato_conta_emhaver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `extrato_conta_emhaver` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente_pf` int(11) DEFAULT NULL,
  `cliente_pj` int(11) DEFAULT NULL,
  `valor_conta` double DEFAULT NULL,
  `valor_pago` double DEFAULT NULL,
  `lancamento_em_haver_venda_id` int(11) DEFAULT NULL,
  `num_venda` int(11) DEFAULT NULL,
  `data_movimento` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `extrato_conta_emhaver`
--

LOCK TABLES `extrato_conta_emhaver` WRITE;
/*!40000 ALTER TABLE `extrato_conta_emhaver` DISABLE KEYS */;
INSERT INTO `extrato_conta_emhaver` VALUES (1,1,0,69,9,1,1,'2019-08-30'),(2,0,4,54,4,3,3,'2019-08-30'),(3,5,0,100,10,7,7,'2019-08-30'),(4,1,0,69,5,1,1,'2019-08-30');
/*!40000 ALTER TABLE `extrato_conta_emhaver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lancamento_em_haver_venda`
--

DROP TABLE IF EXISTS `lancamento_em_haver_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lancamento_em_haver_venda` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente_pf` int(11) DEFAULT NULL,
  `cliente_pj` int(11) DEFAULT NULL,
  `num_venda` double DEFAULT NULL,
  `valor_em_haver_compra` double DEFAULT NULL,
  `statusDaConta` int(11) DEFAULT NULL,
  `data_lancamento` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lancamento_em_haver_venda`
--

LOCK TABLES `lancamento_em_haver_venda` WRITE;
/*!40000 ALTER TABLE `lancamento_em_haver_venda` DISABLE KEYS */;
INSERT INTO `lancamento_em_haver_venda` VALUES (1,1,0,1,69,1,'2019-08-28'),(2,4,0,2,195,1,'2019-08-28'),(3,0,4,3,54,1,'2019-08-28'),(4,0,6,4,19.5,1,'2019-08-28'),(5,1,0,5,195,1,'2019-08-30'),(6,0,4,6,195,1,'2019-08-30'),(7,5,0,7,100,1,'2019-08-30');
/*!40000 ALTER TABLE `lancamento_em_haver_venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pagamento`
--

DROP TABLE IF EXISTS `pagamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pagamento` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `num_venda` int(11) DEFAULT NULL,
  `forma_pagamento` int(11) DEFAULT NULL,
  `valor_por_formaPgamento` double DEFAULT NULL,
  `total_venda` double DEFAULT NULL,
  `cliente_pf` int(11) DEFAULT NULL,
  `cliente_pj` int(11) DEFAULT NULL,
  `statusPagamento` int(11) DEFAULT NULL,
  `dataVenda` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagamento`
--

LOCK TABLES `pagamento` WRITE;
/*!40000 ALTER TABLE `pagamento` DISABLE KEYS */;
INSERT INTO `pagamento` VALUES (1,1,1,50,169,0,0,2,'2019-08-28'),(2,1,2,25,169,0,0,2,'2019-08-28'),(3,1,3,25,169,0,0,2,'2019-08-28'),(4,1,4,69,169,1,0,1,'2019-08-28'),(5,2,4,195,195,4,0,1,'2019-08-28'),(6,3,4,54,54,0,4,1,'2019-08-28'),(7,4,4,19.5,19.5,0,6,1,'2019-08-28'),(8,5,4,195,195,1,0,1,'2019-08-30'),(9,6,4,195,195,0,4,1,'2019-08-30'),(10,7,1,10,130,0,0,2,'2019-08-30'),(11,7,2,10,130,0,0,2,'2019-08-30'),(12,7,3,10,130,0,0,2,'2019-08-30'),(13,7,4,100,130,5,0,1,'2019-08-30');
/*!40000 ALTER TABLE `pagamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa_fisica`
--

DROP TABLE IF EXISTS `pessoa_fisica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pessoa_fisica` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) DEFAULT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `rg` varchar(30) DEFAULT NULL,
  `orgaoExpedidor` varchar(10) DEFAULT NULL,
  `dataExpedicao` date DEFAULT NULL,
  `ufExpedicao` varchar(10) DEFAULT NULL,
  `dataNascimento` date DEFAULT NULL,
  `nomeMae` varchar(45) DEFAULT NULL,
  `estadoCivil` varchar(30) DEFAULT NULL,
  `tpFornecedorCliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa_fisica`
--

LOCK TABLES `pessoa_fisica` WRITE;
/*!40000 ALTER TABLE `pessoa_fisica` DISABLE KEYS */;
INSERT INTO `pessoa_fisica` VALUES (1,'ANTONIO VICENTE PINTO','10354777181','4565','SSPRJ','2012-12-12','RJ','1984-09-15','ISABEL J. MARINA','CASADOO',2),(2,'JENNIFER RITA PINTO','97053467716','443697929','SSP','2019-09-11','SP','1941-11-10','ROSÂNGELA SUELI RAFAELA','CASADO',1),(3,'SARA F. AGATHA ARAÚJO','653.006.728-07','14.108','SSJ','2011-11-11','RS','1984-10-05','SIMONE H RAIMUNDA','CASADOO',1);
/*!40000 ALTER TABLE `pessoa_fisica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pessoa_juridica`
--

DROP TABLE IF EXISTS `pessoa_juridica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pessoa_juridica` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `cnpj` varchar(18) DEFAULT NULL,
  `abertura` date DEFAULT NULL,
  `nomeEmpresarial` varchar(45) DEFAULT NULL,
  `tituloEstabelecimento` varchar(45) DEFAULT NULL,
  `inscricaoMunicipal` varchar(45) DEFAULT NULL,
  `inscricaoEstadual` varchar(45) DEFAULT NULL,
  `tpFornecedorCliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa_juridica`
--

LOCK TABLES `pessoa_juridica` WRITE;
/*!40000 ALTER TABLE `pessoa_juridica` DISABLE KEYS */;
INSERT INTO `pessoa_juridica` VALUES (1,'55020387000130','2019-09-11','PAULO E DIOGO PUBLICIDADE E PROPAGANDA LTDA','PAULO E DIOGO PUBLICIDADE E PROPAGANDA LTDA','1231231','061335545312',1),(2,'29398979000180','2019-09-11','Aparecida e Marina Informática Ltda','Aparecida e Marina Informática Ltda','123123','094493628499',2),(3,'35649988000107','2014-07-27','MARCOS E ANTONIO COMERCIO DE BEBIDAS ME','MARCOS E ANTONIO COMERCIO DE BEBIDAS ME','1234123','424354473191',1);
/*!40000 ALTER TABLE `pessoa_juridica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `produto` varchar(150) DEFAULT NULL,
  `unidade` varchar(45) DEFAULT NULL,
  `codigoBarra` varchar(45) DEFAULT NULL,
  `modelo` varchar(45) DEFAULT NULL,
  `marca` varchar(45) DEFAULT NULL,
  `minimo_estoque` double DEFAULT NULL,
  `apresentacao` varchar(45) DEFAULT NULL,
  `categoria_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`categoria_id`),
  KEY `fk_produto_categoria1_idx` (`categoria_id`),
  CONSTRAINT `fk_produto_categoria1` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'CARREGADOR PORTÁTIL','UNI','111','1 PORTA USB','ANKER POWERCORE',10,'PRETO',1),(2,'FONES DE OUVIDO','UNI','222','SEM FIO','QUIETCOMFORT 35 II',10,'PRATA',1),(3,'MARTELO','UNI','333','MARTELO COM UNHA','STANLEY',10,'CABO DE MADEIRA',2),(4,'FURADEIRA','UNI','444','POTÊNCIA 760 WATTS','MAKITA',10,'DUAS FUNÇÕES',2),(5,'TOALHA DE BANHO','UNI','555','BANHÃO','IMPERIALE',10,'77X140CM',3),(6,'FAQUEIRO ','ESTOJO','666','MADEIRA FRACALANZA BEGE','FRACALANZA',10,'101 PEÇAS',3),(7,'SMART TV LED','UNI','777','ULTRA HD','SANSUNG',10,'40 POLEGADAS',4),(8,'IMPRESSORA MULTIFUNCIONAL','UNI','888','WIRELESS BIVOLT','HP',10,'TANQUE DE TINTA COLORIDA',4),(9,'SULFITE','PCT','999','A4','TILIBRA',10,'100 FOLHAS',5),(10,'CANETA','UNI','100','TRANSPARENTE','BIC',10,'AZUL',5),(11,'ESTOJO','UNI','166','ZIPER','TILIBRA',10,'AZUL',5),(12,'CANETA','UNI','100','TRANSPARENTE','BIC',10,'AZUL',5),(13,'TESTE','UNI','122','TESTE','TESTE',10,'TESTE',1),(14,'TESTE2','UNI','133','TESTE2','TESTE2',20,'TESTE2',1),(15,'TESTE3','UNI','144','TESTE3','TESTE3',50,'TESTE3',1),(16,'TESTE5','UNI','155','TESTE5','TESTE5',20,'TESTE5',1);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `saida_venda`
--

DROP TABLE IF EXISTS `saida_venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `saida_venda` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigoBarra` varchar(45) DEFAULT NULL,
  `produto_id` int(11) NOT NULL,
  `unidade` varchar(45) DEFAULT NULL,
  `preco_unitario` double DEFAULT NULL,
  `quantidade_venda` double DEFAULT NULL,
  `desconto` double DEFAULT NULL,
  `total_por_produto` double DEFAULT NULL,
  `data_hora_venda` date DEFAULT NULL,
  `num_venda` int(11) DEFAULT NULL,
  `item_venda_produto` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`,`produto_id`),
  KEY `fk_saida_venda_produto1` (`produto_id`),
  CONSTRAINT `fk_saida_venda_produto1` FOREIGN KEY (`produto_id`) REFERENCES `produto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `saida_venda`
--

LOCK TABLES `saida_venda` WRITE;
/*!40000 ALTER TABLE `saida_venda` DISABLE KEYS */;
INSERT INTO `saida_venda` VALUES (1,'333',3,'UNI',39,1,0,39,'2019-08-28',1,1),(2,'444',4,'UNI',130,1,0,130,'2019-08-28',1,2),(3,'666',6,'ESTOJO',195,1,0,195,'2019-08-28',2,1),(4,'555',5,'UNI',54,1,0,54,'2019-08-28',3,1),(5,'111',1,'UNI',19.5,1,0,19.5,'2019-08-28',4,1),(6,'333',3,'UNI',39,5,0,195,'2019-08-30',5,1),(7,'666',6,'ESTOJO',195,1,0,195,'2019-08-30',6,1),(8,'444',4,'UNI',130,1,0,130,'2019-08-30',7,1);
/*!40000 ALTER TABLE `saida_venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `total_produto`
--

DROP TABLE IF EXISTS `total_produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `total_produto` (
  `produto_id` int(11) NOT NULL,
  `codigoBarra` varchar(45) DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`produto_id`),
  CONSTRAINT `fk_total_produto_produto1` FOREIGN KEY (`produto_id`) REFERENCES `produto` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `total_produto`
--

LOCK TABLES `total_produto` WRITE;
/*!40000 ALTER TABLE `total_produto` DISABLE KEYS */;
INSERT INTO `total_produto` VALUES (1,'111',19),(2,'222',0),(3,'333',276),(4,'444',150),(5,'555',38),(6,'666',73),(7,'777',28),(8,'888',0),(9,'999',0),(10,'100',0),(11,'166',0),(12,'100',0),(14,'133',0),(15,'144',0),(16,'155',0);
/*!40000 ALTER TABLE `total_produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'estoque'
--

--
-- Dumping routines for database 'estoque'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-12 16:27:24
