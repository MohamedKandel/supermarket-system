create database market2;
use market2;

create table cashier(
ID               int primary key,
Username         varchar(150),
Pass             varchar(150),
Statuss          varchar(20)              
);

insert into cashier values(1,'admin','admin','Active');
insert into cashier values(2,'a','a','Active');
insert into cashier values(3,'b','b','Active');

ALTER TABLE cashier
RENAME TO users;

create table category(
ID             int primary key,
Category       varchar(150),
Statuss        varchar(20)
);

create table brand(
ID             int primary key,
Brand          varchar(150),
Statuss        varchar(20)
);

create table product(
ID             int primary key,
ProName        varchar(200),
Cat_ID         int,
Brand_ID       int,
Price          double,
Qty            int,
Barcode        varchar(150),
Statuss        varchar(20),

foreign key (Cat_ID) references category(ID),
foreign key (Brand_ID) references brand(ID)
);

create view product_data
as
select product.ID as 'ID',
       product.ProName as 'ProName',
       product.Cat_ID as 'Cat_ID',
       category.Category as 'CatName',
       product.Brand_ID as 'Brand_ID',
       brand.Brand as 'BrandName',
       product.Price as 'Price',
       product.Qty as 'Qty',
       product.Barcode as 'Barcode',
       product.Statuss as 'Statuss'
       from product , category , brand
       where product.Cat_ID = category.ID and product.Brand_ID = brand.ID;


create table sales(
ID               int primary key auto_increment,
Datee            varchar(15),
SubTotal         double,
Pay              double,
Balance          double
);

create table sales_product(
ID               int primary key auto_increment,
Sales_ID         int,
Prod_ID          varchar(150),
Total            double,
Sell_Price       double,
QTY              int,
foreign key (Sales_ID) references sales(ID)
);

create view report_data
as
select product.ID as 'ID',
       product.ProName as 'Product',
	   category.Category as 'Category',
       brand.Brand as 'Brand',
       product.Price as 'Price',
       SUM(sales_product.QTY) as 'QTY',
       SUM(sales_product.Total) as 'Total'
from sales_product , product , category , brand
where product.Cat_ID = category.ID and product.Brand_ID = brand.ID and product.Barcode = sales_product.Prod_ID
group by product.ID;

ALTER DATABASE market2
CHARACTER SET utf8
COLLATE utf8_general_ci;