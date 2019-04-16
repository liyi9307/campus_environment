CREATE TABLE `campus_nodes` (
`id`  int NOT NULL AUTO_INCREMENT ,
`number`  varchar(30) NOT NULL COMMENT '�ڵ���' ,
`name`  varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '�ڵ�������' ,
`location`  varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '�ڵ�λ��' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_wind` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '�ڵ���' ,
`wind_speed`  varchar(20) NULL COMMENT '����m/s' ,
`wind_direction`  varchar(20) NULL COMMENT '����(������Ϊ0�㣬�Ƕ�˳ʱ������)' ,
`receive_time`  datetime NULL COMMENT '���ݽ���ʱ��' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_soil` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '�ڵ���' ,
`soil_hum`  varchar(30) NULL COMMENT '����ʪ��' ,
`soil_tem`  varchar(30) NULL COMMENT '�����¶�(���϶�)' ,
`soil_ph`  varchar(30) NULL COMMENT '����phֵ' ,
`receive_time`  datetime NULL COMMENT '���ݽ���ʱ��' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_noise` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '�ڵ���' ,
`noise`  varchar(30) NULL COMMENT '����dB' ,
`receive_time`  datetime NULL COMMENT '���ݽ���ʱ��' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_intensity` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '�ڵ���' ,
`intensity`  varchar(30) NULL COMMENT '��ǿ(����)' ,
`receive_time`  datetime NULL COMMENT '���ݽ���ʱ��' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_pressure` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '�ڵ���' ,
`pressure`  varchar(30) NULL COMMENT '����ѹǿPa' ,
`receive_time`  datetime NULL COMMENT '���ݽ���ʱ��' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_air_th` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '�ڵ���' ,
`air_tem`  varchar(30) NULL COMMENT '�����¶�(���϶�)' ,
`air_hum`  varchar(30) NULL COMMENT '����ʪ��%' ,
`receive_time`  datetime NULL COMMENT '���ݽ���ʱ��' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_pm` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '�ڵ���' ,
`air_pm1`  varchar(30) NULL COMMENT '����PM1.0Ũ��(ug/m3)' ,
`air_pm25`  varchar(30) NULL COMMENT '����PM2.5Ũ��(ug/m3)' ,
`air_pm10`  varchar(30) NULL COMMENT '����PM10Ũ��(ug/m3)' ,
`receive_time`  datetime NULL COMMENT '���ݽ���ʱ��' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_co2` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '�ڵ���' ,
`air_co2`  varchar(30) NULL COMMENT '����CO2Ũ��(PPM)' ,
`receive_time`  datetime NULL COMMENT '���ݽ���ʱ��' ,
PRIMARY KEY (`id`)
);

CREATE TABLE `campus_tvoc` (
`id`  int NOT NULL AUTO_INCREMENT ,
`node`  varchar(30) NOT NULL COMMENT '�ڵ���' ,
`tvoc`  varchar(30) NULL COMMENT 'TVOCŨ��(PPB)' ,
`receive_time`  datetime NULL COMMENT '���ݽ���ʱ��' ,
PRIMARY KEY (`id`)
);