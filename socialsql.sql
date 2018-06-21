CREATE TABLE `socialjinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO `sys`.`socialjinfo`
(`id`,
`title`,
`description`)
VALUES
(1,
'SocialJ App',
'Group Project for SocialJ');
