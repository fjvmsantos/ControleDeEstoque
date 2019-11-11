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
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-23  7:44:13
