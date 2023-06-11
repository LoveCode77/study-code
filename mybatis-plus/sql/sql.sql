/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.15 : Database - mybatis_plus
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis_plus` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatis_plus`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(30) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `deleted` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1474366076954370057 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`age`,`email`,`create_time`,`update_time`,`version`,`deleted`) values (1,'Jone',18,'test1@baomidou.com',NULL,NULL,NULL,NULL),(2,'Jack',20,'test2@baomidou.com',NULL,NULL,NULL,NULL),(3,'Tom',28,'test3@baomidou.com',NULL,NULL,NULL,NULL),(4,'Sandy',21,'test4@baomidou.com',NULL,NULL,NULL,NULL),(5,'Billie',24,'test5@baomidou.com',NULL,NULL,NULL,NULL),(1474366076954370049,'阿昌',18,'995931576@qq.com',NULL,NULL,NULL,NULL),(1474366076954370050,'阿昌',18,'995931576@qq.com',NULL,NULL,NULL,NULL),(1474366076954370051,'熊都',23,'995931576@qq.com','2021-12-25 14:12:00','2021-12-25 14:15:54',NULL,NULL),(1474366076954370052,'ben',18,'1822649761@qq.com','2021-12-25 14:36:39','2021-12-25 14:39:21',3,NULL),(1474366076954370053,'logicDelete',18,'995931576@qq.com','2021-12-25 15:19:00','2021-12-25 15:19:00',1,1),(1474366076954370054,'我是Helen',18,'helen@sina.com','2021-12-25 15:41:26','2021-12-25 15:41:26',1,0),(1474366076954370055,'我是Helen',18,'helen@sina.com','2021-12-25 15:42:08','2021-12-25 15:42:08',1,0),(1474366076954370056,'我是Helen',18,'helen@sina.com','2021-12-25 15:42:26','2021-12-25 15:42:26',1,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
