-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: localhost    Database: estoque
-- ------------------------------------------------------
-- Server version	5.5.16

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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dado_bancario`
--

LOCK TABLES `dado_bancario` WRITE;
/*!40000 ALTER TABLE `dado_bancario` DISABLE KEYS */;
INSERT INTO `dado_bancario` VALUES (1,'ITAÚU','000','00','000','000',0,1,2,2),(2,'BANCO DO BRASIL','1142310-2','0674','0674','1142310-2',0,2,2,1),(3,'Santander','07928948-1','0994','001','07928948-1',1,0,1,1),(4,'Banco do Brasil','176590-6','3600','001','176590-6',2,0,1,2),(5,'SANTANDER','00000','0000','0000','0000',0,3,2,1),(6,'Bradesco','0665447-9','3236','001','0665447-9',3,0,1,1),(7,'Santander','13189109-9','4201','001','13189109-9',4,0,1,2);
/*!40000 ALTER TABLE `dado_bancario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-23  7:44:12
