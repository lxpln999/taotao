#用户表
CREATE TABLE IF NOT EXISTS `user` (
  `id`         INT AUTO_INCREMENT,
  `username`   VARCHAR(128),
  `mobileNo`   VARCHAR(11),
  `password`   VARCHAR(256),
  `createTime` VARCHAR(14),
  `status`     INT,
  `nickname`   VARCHAR(128),
  `email`      VARCHAR(512),
  PRIMARY KEY (`id`)
)
  DEFAULT CHARSET =utf8;

#菜单表
CREATE TABLE IF NOT EXISTS `menu` (
  `id`       INT AUTO_INCREMENT,
  `pid`      INT,
  `url`      VARCHAR(512),
  `name`     VARCHAR(256),
  `orderNum` INT,
  `type`     INT,
  PRIMARY KEY (`id`)
)
  DEFAULT CHARSET =utf8;

#系统参数表
CREATE TABLE IF NOT EXISTS `sys_param` (
  `id`                     INT AUTO_INCREMENT,
  `name`                   VARCHAR(512),
  `www`                    VARCHAR(512),
  `manageHttp`             VARCHAR(512),
  `title`                  VARCHAR(256),
  `description`            VARCHAR(2048),
  `keywords`               VARCHAR(512),
  `shortIco`               VARCHAR(512),
  `tel`                    VARCHAR(11),
  `email`                  VARCHAR(512),
  `icp`                    VARCHAR(512),
  `isOpen`                 INT,
  `closeMsg`               VARCHAR(1024),
  `imageRootPath`          VARCHAR(1024),
  `manageLeftTreeLeafIcon` VARCHAR(512),
  PRIMARY KEY (`id`)
)
  DEFAULT CHARSET =utf8;

#商品目录表
CREATE TABLE IF NOT EXISTS `catalog` (
  `id`        INT AUTO_INCREMENT,
  `name`      VARCHAR(512),
  `code`      VARCHAR(512),
  `pid`       INT,
  `title`     VARCHAR(256),
  `order`     INT,
  `showInNav` INT default 0,
  PRIMARY KEY (`id`)
)
  DEFAULT CHARSET =utf8;

#商品表
CREATE TABLE IF NOT EXISTS `product` (
  `id`              INT AUTO_INCREMENT,
  `catalogId`       INT,
  `name`            VARCHAR(512),
  `introduce`       VARCHAR(2048),
  `price`           DECIMAL(9, 2),
  `nowPrice`        DECIMAL(9, 2),
  `picture`         VARCHAR(512),
  `isNew`           INT,
  `idSale`          INT,
  `activityId`      INT,
  `giftId`          INT,
  `hit`             INT,
  `isTimePromotion` INT,
  `status`          INT,
  `productHtml`     LONGTEXT,
  `searchKey`       VARCHAR(512),
  `title`           VARCHAR(1024),
  `description`     VARCHAR(1024),
  `keywords`        VARCHAR(1024),
  `sellCount`       INT,
  `stock`           INT,
  `createTime`      VARCHAR(14),
  PRIMARY KEY (`id`)
)
  DEFAULT CHARSET =utf8;
