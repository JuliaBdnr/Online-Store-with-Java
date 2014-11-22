create database if not exists `store`;
use `store`;

create table if not exists `category`(
	`id` int not null auto_increment,
	`name` varchar(50) not null,
	`ancestor_category_id` int default null,
	foreign key(`ancestor_category_id`)
    references `category`(`id`)
    on delete set null on update set null,
    primary key (`id`),
    unique(`name`)
);


create table if not exists `goods`(
	`id` int not null auto_increment,
	`name` varchar(50) not null,
	`description` varchar(200),
    `category_id` int not null,
    foreign key(`category_id`)
    references `category`(`id`)
    on delete cascade on update cascade,
	primary key(`id`)
);

create table if not exists `tag`(
	`id` int not null auto_increment,
	`name` varchar(50) not null,
    primary key(`id`),
    unique(`name`)
);

create table if not exists `tag_to_goods`(
	`goods_id` int not null,
    `tag_id` int not null,
    primary key (`goods_id`, `tag_id`),
    foreign key (`goods_id`) 
    references `goods`(`id`)
    on delete cascade on update cascade,
    
    foreign key (`tag_id`)
    references `tag`(`id`)
    on delete cascade on update cascade
);

create table if not exists `feature`(
	`id` int not null auto_increment,
    `name` varchar(50) not null,
    `description` varchar(100),
    `measure` varchar(10),
    primary key (id)
);

create table if not exists `value`(
	`value_id` int not null auto_increment,
    `goods_id` int not null,
    `feature_id` int not null,
    `value` double not null,
    primary key (value_id),
    foreign key (goods_id)
    references goods(id)
    on delete cascade
	on update cascade,
    foreign key (feature_id)
    references feature(id)
    on delete cascade 
    on update cascade,
    unique(goods_id, feature_id)
);

create table if not exists `relation_type`(
	`id` int not null auto_increment,
    `name` varchar(50) not null,
    primary key (`id`),
    unique (`name`)
);

create table if not exists `relation_goods`(
	`first_goods_id` int not null,
    `second_goods_id` int not null,
    `type_id` int not null,
    primary key (`first_goods_id`, `second_goods_id`),
    foreign key (`first_goods_id`)
	references `goods`(`id`)
    on delete cascade
    on update cascade,
	foreign key (`second_goods_id`)
    references `goods` (`id`)
    on delete cascade
    on update cascade,
    foreign key (`type_id`)
    references `relation_type`(`id`)
    on delete cascade
    on update cascade
);


