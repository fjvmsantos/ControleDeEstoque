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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dado_complementar`
--

LOCK TABLES `dado_complementar` WRITE;
/*!40000 ALTER TABLE `dado_complementar` DISABLE KEYS */;
INSERT INTO `dado_complementar` VALUES (1,'000','0000','pinto@sp.senac.com.br','TESTE TESTE',0,1,2,2),(2,'2736799832','27998189235','jenniferritapinto-81@dddrin.com.br','teste 2',0,2,2,1),(3,'1627388039','16999402530','manutencao@propagandaltda.com.br','TESTE CLIENTE PESSOA JURIDICA',1,0,1,1),(4,'1829644589','18981840738','tesouraria@aparecidaemarinainformaticaltda.com.br','teste cadastro de fornecedor pj',2,0,1,2),(5,'2222','22222','araujo-94@gimail.com','TESTE CLIENTE PESSOA FISICA TESTE',0,3,2,1),(6,'1136189576','11981114103','ouvidoria@bebidasme.com.br','TESTE CADASTRO DE CLIENTE PESSOA JURIDICA',3,0,1,1),(7,'1127685955','11995184977','juridico@pietroeemanuellyfinanceirame.com.br','teste',4,0,1,2);
/*!40000 ALTER TABLE `dado_complementar` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-23  7:44:14
