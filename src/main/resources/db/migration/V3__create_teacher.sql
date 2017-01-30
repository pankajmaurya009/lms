CREATE TABLE `teachers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `version` int(11) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `name` varchar(45) NOT NULL,
  `gender` ENUM('MALE','FEMALE') NOT NULL,
  `klass_id` int(11) NOT NULL,
  `created` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `klass_id_idx` (`klass_id`),
  CONSTRAINT `klass_id` FOREIGN KEY (`klass_id`) REFERENCES `klasses` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
