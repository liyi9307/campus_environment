CREATE TABLE `campus_nodes` (
`id`  int NOT NULL AUTO_INCREMENT ,
`number`  varchar(30) NOT NULL COMMENT '节点编号' ,
`name`  varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '节点中文名' ,
`location`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '节点位置' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_wind` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '节点编号' ,
`wind_speed`  varchar(20) NULL COMMENT '风速m/s' ,
`wind_direction`  varchar(20) NULL COMMENT '风向(正北方为0°，角度顺时针增加)' ,
`receive_time`  datetime NULL COMMENT '数据接收时间' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_soil` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '节点编号' ,
`soil_hum`  varchar(30) NULL COMMENT '土壤湿度' ,
`soil_tem`  varchar(30) NULL COMMENT '土壤温度(摄氏度)' ,
`soil_ph`  varchar(30) NULL COMMENT '土壤ph值' ,
`receive_time`  datetime NULL COMMENT '数据接收时间' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_noise` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '节点编号' ,
`noise`  varchar(30) NULL COMMENT '噪声dB' ,
`receive_time`  datetime NULL COMMENT '数据接收时间' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_intensity` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '节点编号' ,
`intensity`  varchar(30) NULL COMMENT '光强(流明)' ,
`receive_time`  datetime NULL COMMENT '数据接收时间' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_pressure` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '节点编号' ,
`pressure`  varchar(30) NULL COMMENT '大气压强Pa' ,
`receive_time`  datetime NULL COMMENT '数据接收时间' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_air_th` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '节点编号' ,
`air_tem`  varchar(30) NULL COMMENT '空气温度(摄氏度)' ,
`air_hum`  varchar(30) NULL COMMENT '空气湿度%' ,
`receive_time`  datetime NULL COMMENT '数据接收时间' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_pm` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '节点编号' ,
`air_pm1`  varchar(30) NULL COMMENT '空气PM1.0浓度(ug/m3)' ,
`air_pm25`  varchar(30) NULL COMMENT '空气PM2.5浓度(ug/m3)' ,
`air_pm10`  varchar(30) NULL COMMENT '空气PM10浓度(ug/m3)' ,
`receive_time`  datetime NULL COMMENT '数据接收时间' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_co2` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '节点编号' ,
`air_co2`  varchar(30) NULL COMMENT '空气CO2浓度(PPM)' ,
`receive_time`  datetime NULL COMMENT '数据接收时间' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_tvoc` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '节点编号' ,
`tvoc`  varchar(30) NULL COMMENT 'TVOC浓度(PPB)' ,
`receive_time`  datetime NULL COMMENT '数据接收时间' ,
PRIMARY KEY (`id`)
);