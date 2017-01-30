CREATE TABLE `teachers` (
  `id`        int(11)               NOT NULL AUTO_INCREMENT,
  `version`   int(11)               NOT NULL,
  `age`       int(11)               NULL,
  `name`      varchar(45)           NOT NULL,
  `gender`    ENUM('MALE','FEMALE') NOT NULL,
  `teacher_id`  int(11)               NOT NULL,
  `created`   timestamp             NOT NULL  CURRENT_TIMESTAMP,
  `modified`  timestamp             NOT NULL  CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `klass_id_idx` (`klass_id`),
  CONSTRAINT `klass_id` FOREIGN KEY (`klass_id`) REFERENCES `klasses` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
