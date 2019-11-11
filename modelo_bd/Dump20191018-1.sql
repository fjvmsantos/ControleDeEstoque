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
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `caixa`
--

LOCK TABLES `caixa` WRITE;
/*!40000 ALTER TABLE `caixa` DISABLE KEYS */;
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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'ELETRÔNICOS'),(2,'FERRAMENTAS'),(3,'CAMA MESA E BANHO'),(4,'INFORMÁTICA'),(5,'PAPELARIA'),(6,NULL),(7,'TESTR'),(8,'FGFSGFSGDF'),(9,'MEDICAMENTOS');
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dado_bancario`
--

LOCK TABLES `dado_bancario` WRITE;
/*!40000 ALTER TABLE `dado_bancario` DISABLE KEYS */;
INSERT INTO `dado_bancario` VALUES (1,'ITAÚU','000','00','000','000',0,1,2,2),(2,'BANCO DO BRASIL','1142310-2','0674','0674','1142310-2',0,2,2,1),(3,'Santander','07928948-1','0994','001','07928948-1',1,0,1,1),(4,'Banco do Brasil','176590-6','3600','001','176590-6',2,0,1,2),(5,'SANTANDER','00000','0000','0000','0000',0,3,2,1),(6,'Bradesco','0665447-9','3236','001','0665447-9',3,0,1,1),(7,'Santander','13189109-9','4201','001','13189109-9',4,0,1,2),(8,'ST','000','0000','0000','000',0,4,2,1);
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dado_complementar`
--

LOCK TABLES `dado_complementar` WRITE;
/*!40000 ALTER TABLE `dado_complementar` DISABLE KEYS */;
INSERT INTO `dado_complementar` VALUES (1,'000','0000','pinto@sp.senac.com.br','TESTE TESTE',0,1,2,2),(2,'2736799832','27998189235','jenniferritapinto-81@dddrin.com.br','teste 2',0,2,2,1),(3,'1627388039','16999402530','manutencao@propagandaltda.com.br','TESTE CLIENTE PESSOA JURIDICA',1,0,1,1),(4,'1829644589','18981840738','tesouraria@aparecidaemarinainformaticaltda.com.br','teste cadastro de fornecedor pj',2,0,1,2),(5,'2222','22222','araujo-94@gimail.com','TESTE CLIENTE PESSOA FISICA TESTE',0,3,2,1),(6,'1136189576','11981114103','ouvidoria@bebidasme.com.br','TESTE CADASTRO DE CLIENTE PESSOA JURIDICA',3,0,1,1),(7,'1127685955','11995184977','juridico@pietroeemanuellyfinanceirame.com.br','teste',4,0,1,2),(8,'15999999999','15999999999','santossilva@gmail.com','teste',0,4,2,1);
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'9511054000','RUA L. PIERUCCINI','790T','DESVIO RIZZOTESTE','CASATESTE','RO','CAXIAS DO SULTESET',0,1,2,2),(2,'29936250','RUA ALMIR DE QUEIROZ','991','JAQUELINE','CASA','SP','São Mateus',0,2,2,1),(3,'13568804','RUA MARIA MADALENA KANEBLAY SAVIO','442','RESIDENCIAL  ASTOLPHO LUIZ DO PRADO','CASA','RS','SÃO CARLOS',1,0,1,1),(4,'19030130','Rua Rio Grande do Sul','934','Vila Marcondes','casa','SP','Presidente Prudente',2,0,1,2),(5,'85863-460','TESTE - TERMINAL RODOVIÁRIA INTERNACIONAL','TESET','TESTE JARDIM POLO CENTRO','TESTE CASA','RO','TESTEFOZ DO IGUAÇU',0,3,2,1),(6,'18315000','RUA MILTON SANTOS','564','PARQUE GUAIANAZES','CASA','SP','SÃO PAULO',3,0,1,1),(7,'13201141','Rua José Amato','653','Ponte de Campinas','teste','SP','Jundiaí',4,0,1,2),(8,'18315000','RUA DAS FLORES','123','NUNES','CASA','SP','ribeirão grande',0,4,2,1);
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
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entrada_estoque`
--

LOCK TABLES `entrada_estoque` WRITE;
/*!40000 ALTER TABLE `entrada_estoque` DISABLE KEYS */;
INSERT INTO `entrada_estoque` VALUES (1,'123','2019-10-07','',20,30,20,26,520,4,2,1,0,'444','789','2019-10-09'),(2,'654','2019-10-07','',50.25,30,20,65.325,1306.5,5,3,3,0,'555','789','2019-10-08'),(3,'32','1111-01-01','',5,30,20,6.5,130,11,5,3,0,'166','654','2019-10-07'),(4,'321','1111-01-01','',3,30,20,3.9,78,13,1,1,0,'122','654','2019-10-06'),(5,'213','1111-01-01','',30,20,20,36,720,15,1,1,0,'144','152','2019-10-05');
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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `extrato_conta_emhaver`
--

LOCK TABLES `extrato_conta_emhaver` WRITE;
/*!40000 ALTER TABLE `extrato_conta_emhaver` DISABLE KEYS */;
INSERT INTO `extrato_conta_emhaver` VALUES (1,1,0,69,9,1,1,'2019-08-30'),(2,0,4,54,4,3,3,'2019-08-30'),(3,5,0,100,10,7,7,'2019-08-30'),(4,1,0,69,5,1,1,'2019-08-30'),(5,1,0,69,10,1,1,'2019-10-02'),(6,1,0,69,5,1,1,'2019-10-02'),(7,1,0,69,5,1,1,'2019-10-02'),(8,1,0,69,4,1,1,'2019-10-02'),(9,1,0,69,8,1,1,'2019-10-02'),(10,1,0,69,9,1,1,'2019-10-02'),(11,1,0,69,14,1,1,'2019-10-02'),(12,1,0,195,5,5,5,'2019-10-02'),(13,1,0,195,10,5,5,'2019-10-02'),(14,1,0,195,10,5,5,'2019-10-02'),(15,1,0,195,50,5,5,'2019-10-02'),(16,0,4,54,10,3,3,'2019-10-03'),(17,0,4,54,5,3,3,'2019-10-03'),(18,0,4,54,5,3,3,'2019-10-03'),(19,0,4,54,13,3,3,'2019-10-03'),(20,0,4,54,7,3,3,'2019-10-03'),(21,0,4,54,10,3,3,'2019-10-03');
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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lancamento_em_haver_venda`
--

LOCK TABLES `lancamento_em_haver_venda` WRITE;
/*!40000 ALTER TABLE `lancamento_em_haver_venda` DISABLE KEYS */;
INSERT INTO `lancamento_em_haver_venda` VALUES (1,1,0,1,69,2,'2019-08-28'),(2,4,0,2,195,1,'2019-08-28'),(3,0,4,3,54,2,'2019-08-28'),(4,0,6,4,19.5,1,'2019-08-28'),(5,1,0,5,195,1,'2019-08-30'),(6,0,4,6,195,1,'2019-08-30'),(7,5,0,7,100,1,'2019-08-30'),(8,2,0,1,20,1,'2019-10-07'),(9,4,0,2,50.53,1,'2019-10-07');
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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pagamento`
--

LOCK TABLES `pagamento` WRITE;
/*!40000 ALTER TABLE `pagamento` DISABLE KEYS */;
INSERT INTO `pagamento` VALUES (1,1,1,20,62.4,0,0,2,'2019-10-07'),(2,1,2,20,62.4,0,0,2,'2019-10-07'),(3,1,3,2.4,62.4,0,0,2,'2019-10-07'),(4,1,4,20,62.4,2,0,1,'2019-10-07'),(5,2,1,50,210.53,0,0,2,'2019-10-07'),(6,2,2,50,210.53,0,0,2,'2019-10-07'),(7,2,3,60,210.53,0,0,2,'2019-10-07'),(8,2,4,50.53,210.53,4,0,1,'2019-10-07');
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa_fisica`
--

LOCK TABLES `pessoa_fisica` WRITE;
/*!40000 ALTER TABLE `pessoa_fisica` DISABLE KEYS */;
INSERT INTO `pessoa_fisica` VALUES (1,'ANTONIO VICENTE PINTO','10354777181','4565','SSPRJ','2012-12-12','RJ','1984-09-15','ISABEL J. MARINA','CASADOO',2),(2,'JENNIFER RITA PINTO','97053467716','443697929','SSP','2019-09-11','SP','1941-11-10','ROSÂNGELA SUELI RAFAELA','CASADO',1),(3,'SARA F. AGATHA ARAÚJO','65300672807','14.108','SSJ','2011-11-11','RS','1984-10-05','SIMONE H RAIMUNDA','CASADOO',2),(4,'SANTOS SILVA','00000000000','123456','SSPS','2019-01-01','SP','2019-01-01','MARTA','CASADO',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoa_juridica`
--

LOCK TABLES `pessoa_juridica` WRITE;
/*!40000 ALTER TABLE `pessoa_juridica` DISABLE KEYS */;
INSERT INTO `pessoa_juridica` VALUES (1,'55020387000130','2019-09-11','PAULO E DIOGO PUBLICIDADE E PROPAGANDA LTDA','PAULO E DIOGO PUBLICIDADE E PROPAGANDA LTDA','1231231','061335545312',2),(2,'29398979000180','2019-09-11','Aparecida e Marina Informática Ltda','Aparecida e Marina Informática Ltda','123123','094493628499',1),(3,'00000000000000','2019-09-03','minha','teste','00000','0000000',1),(4,'96397935000122','2014-10-12','Pietro e Emanuelly Financeira ME','Pietro e Emanuelly Financeira ME','943','943454943210',1);
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
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'CARREGADOR PORTÁTIL','UNI','111','1 PORTA USB','ANKER POWERCORE',10,'PRETO',1),(2,'FONES DE OUVIDO','UNI','222','SEM FIO','QUIETCOMFORT 35 II',10,'PRATA',1),(3,'MARTELO','UNI','333','MARTELO COM UNHA','STANLEY',10,'CABO DE MADEIRA',2),(4,'FURADEIRA','UNI','444','POTÊNCIA 760 WATTS','MAKITA',10,'DUAS FUNÇÕES',2),(5,'TOALHA DE BANHO','UNI','555','BANHÃO','IMPERIALE',10,'77X140CM',3),(6,'FAQUEIRO ','ESTOJO','666','MADEIRA FRACALANZA BEGE','FRACALANZA',10,'101 PEÇAS',3),(7,'SMART TV LED','UNI','777','ULTRA HD','SANSUNG',10,'40 POLEGADAS',4),(8,'IMPRESSORA MULTIFUNCIONAL','UNI','888','WIRELESS BIVOLT','HP',10,'TANQUE DE TINTA COLORIDA',4),(9,'SULFITE','PCT','999','A4','TILIBRA',10,'100 FOLHAS',5),(10,'CANETA','UNI','100','TRANSPARENTE','BIC',10,'AZUL',5),(11,'ESTOJO','UNI','166','ZIPER','TILIBRA',10,'AZUL',5),(12,'CANETA','UNI','100','TRANSPARENTE','BIC',10,'AZUL',5),(13,'TESTE','UNI','122','TESTE','TESTE',10,'TESTE',1),(14,'TESTE2','UNI','133','TESTE2','TESTE2',20,'TESTE2',1),(15,'TESTE3','UNI','144','TESTE3','TESTE3',50,'TESTE3',1),(16,'RÁDIO','UNI','10000','AUTO','NAVEG',20,'DISPLAY SIMPLES',3),(17,'DIPIRONA','UNI','1','COMPRIMIDO','DIPIRONA',50,'COMPRIMIDO',9);
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
INSERT INTO `saida_venda` VALUES (1,'444',4,'UNI',26,2,0,52,'2019-10-07',1,1),(2,'166',11,'UNI',6.5,1,0,6.5,'2019-10-07',1,2),(3,'122',13,'UNI',3.9,1,0,3.9,'2019-10-07',1,3),(4,'122',13,'UNI',3.9,3,0,11.7,'2019-10-07',2,1),(5,'444',4,'UNI',26,3,0,78,'2019-10-07',2,2),(6,'144',15,'UNI',36,1,0,36,'2019-10-07',2,3),(7,'166',11,'UNI',6.5,3,0,19.5,'2019-10-07',2,4),(8,'555',5,'UNI',65.33,1,0,65.33,'2019-10-07',2,5);
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
INSERT INTO `total_produto` VALUES (4,'444',15),(5,'555',19),(11,'166',16),(13,'122',16),(15,'144',19);
/*!40000 ALTER TABLE `total_produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomeUsuario` varchar(45) DEFAULT NULL,
  `senha` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'nome','123'),(2,'janaina','[1, 2, 3]');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
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

-- Dump completed on 2019-10-18 16:26:55
