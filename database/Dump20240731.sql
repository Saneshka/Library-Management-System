-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: library
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS book;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE book (
  bid int NOT NULL AUTO_INCREMENT,
  bCode varchar(45) DEFAULT NULL,
  title varchar(100) DEFAULT NULL,
  author varchar(100) DEFAULT NULL,
  publisher varchar(100) DEFAULT NULL,
  publishDate date DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  qty int DEFAULT NULL,
  cid int DEFAULT NULL,
  PRIMARY KEY (bid),
  UNIQUE KEY bCode_UNIQUE (bCode),
  KEY cid_idx (cid),
  CONSTRAINT cid FOREIGN KEY (cid) REFERENCES category (cid)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES book WRITE;
/*!40000 ALTER TABLE book DISABLE KEYS */;
INSERT INTO book VALUES (1,'B001','Adventures of Jimmy','Miller','SH Productions','2001-07-30','Child story book',14,1),(3,'B002','Cinderella','Charles Perrault','Disney','2002-04-30','Fairy Tale',23,2),(4,'B003','Harry Potter','J. K. Rowling','Bloomsbury','2003-07-21','Childrens Book',1,1),(9,'B004','The Haunted House','Chris Anderson','FOX','2007-07-10','Scary',14,3);
/*!40000 ALTER TABLE book ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS category;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE category (
  cid int NOT NULL AUTO_INCREMENT,
  cCode varchar(45) DEFAULT NULL,
  categoryName varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  PRIMARY KEY (cid),
  UNIQUE KEY cCode_UNIQUE (cCode)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES category WRITE;
/*!40000 ALTER TABLE category DISABLE KEYS */;
INSERT INTO category VALUES (1,'C001','Fiction','something'),(2,'C002','Fantasy','someNothing'),(3,'C003','Horror','scary');
/*!40000 ALTER TABLE category ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fine`
--

DROP TABLE IF EXISTS fine;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE fine (
  fineId int NOT NULL AUTO_INCREMENT,
  lendId int DEFAULT NULL,
  amount double DEFAULT NULL,
  paid tinyint DEFAULT NULL,
  PRIMARY KEY (fineId),
  KEY lendId_idx (lendId),
  CONSTRAINT lendId FOREIGN KEY (lendId) REFERENCES lend (lid)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fine`
--

LOCK TABLES fine WRITE;
/*!40000 ALTER TABLE fine DISABLE KEYS */;
INSERT INTO fine VALUES (4,1,450,1),(5,4,550,1),(6,12,400,1),(7,12,400,1),(8,14,350,1),(9,16,1050,1);
/*!40000 ALTER TABLE fine ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lend`
--

DROP TABLE IF EXISTS lend;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE lend (
  lid int NOT NULL AUTO_INCREMENT,
  lCode varchar(45) DEFAULT NULL,
  bookId int DEFAULT NULL,
  memberId int DEFAULT NULL,
  borrowDate date DEFAULT NULL,
  dueDate date DEFAULT NULL,
  returnDate date DEFAULT NULL,
  fine double DEFAULT NULL,
  PRIMARY KEY (lid),
  UNIQUE KEY lCode_UNIQUE (lCode),
  KEY bookId_idx (bookId),
  KEY member_idx (memberId),
  CONSTRAINT bookId FOREIGN KEY (bookId) REFERENCES book (bid),
  CONSTRAINT memberId FOREIGN KEY (memberId) REFERENCES `member` (mid)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lend`
--

LOCK TABLES lend WRITE;
/*!40000 ALTER TABLE lend DISABLE KEYS */;
INSERT INTO lend VALUES (1,'L001',1,5,'2024-07-17','2024-07-10','2024-07-19',0),(2,'L002',3,1,'2024-07-17','2024-07-19','2024-07-19',0),(3,'L003',1,1,'2024-07-17','2024-07-24','2024-07-18',0),(4,'L004',1,1,'2024-07-22','2024-07-11','2024-07-22',0),(5,'L005',3,5,'2024-07-22','2024-07-29','2024-07-22',0),(6,'L006',3,7,'2024-07-22','2024-07-29','2024-07-22',0),(7,'L007',1,7,'2024-07-22','2024-07-29','2024-07-22',0),(8,'L008',4,5,'2024-07-23','2024-07-30','2024-07-23',0),(9,'L009',3,1,'2024-07-26','2024-07-30',NULL,-1),(10,'L010',3,7,'2024-07-25','2024-07-25',NULL,-1),(11,'L011',1,7,'2024-07-25','2024-07-31',NULL,-1),(12,'L012',9,9,'2024-07-29','2024-07-21','2024-07-29',0),(14,'L013',1,1,'2024-07-29','2024-07-22','2024-07-29',0),(15,'L014',9,9,'2024-07-29','2024-08-07','2024-07-29',0),(16,'L015',1,1,'2024-07-09','2024-07-10','2024-07-31',0);
/*!40000 ALTER TABLE lend ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS member;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  mid int NOT NULL AUTO_INCREMENT,
  mCode varchar(45) DEFAULT NULL,
  firstName varchar(100) DEFAULT NULL,
  lastName varchar(100) DEFAULT NULL,
  phoneNo varchar(15) DEFAULT NULL,
  address varchar(150) DEFAULT NULL,
  PRIMARY KEY (mid),
  UNIQUE KEY mCode_UNIQUE (mCode)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES member WRITE;
/*!40000 ALTER TABLE member DISABLE KEYS */;
INSERT INTO member VALUES (1,'M001','Sameeraaaa','Jayakodi','0775690234','N0 45 Kuliyapitiya Rd'),(5,'M002','Saneshka','Costa','0774830592','Ja-ela'),(7,'M003','Gihan','Gamini','0775689098','No 42 Thudella Rd'),(9,'M004','Sandil','Costa','0761541007','No 508 Dandugama Ja-ela');
/*!40000 ALTER TABLE member ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS user;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  uid int NOT NULL AUTO_INCREMENT,
  uCode varchar(45) DEFAULT NULL,
  firstName varchar(100) DEFAULT NULL,
  lastName varchar(100) DEFAULT NULL,
  username varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (uid),
  UNIQUE KEY uCode_UNIQUE (uCode)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES user WRITE;
/*!40000 ALTER TABLE user DISABLE KEYS */;
INSERT INTO user VALUES (1,'U001','Saneshka','Costa','saneshka','P@55w0rd'),(6,'U003','Miss.Floby','Costa','floby','floby123'),(8,'U002','Gihan','Gamini','Gihan','password');
/*!40000 ALTER TABLE user ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-31 20:17:27
