create database mapping;

use mapping;

create table Company(companyId int Primary key,companyName varchar(25),companyCity varchar(25));

create table items(itemId int Primary key,itemname varchar(25),UnitSold int, companyId int, Foreign key(companyId) references Company(companyId));

insert into Company(companyId,companyName,companyCity) values(1,'Dominos','Los Angeles'),(2,'Pizza Hut','San Francisco'),(3,'papa johns','san diego'),
(4,'ah pizz','fremont'),(5,'nino pizza','Las Vegas'),(6,'Pizzeria','Boston'),(7,'Chuck & cheese','Chicago');

insert into items(itemId,itemName,UnitSold,companyId) values(1,'large pizza',5,2),(2,'Gralic knots',6,3),(3,'large pizza',3,3)
,(4,'medium pizza',8,4),(5,'breadsticks',7,1),(6,'medium pizza',11,1),(7,'small pizza',9,6),(8,'small pizza',6,7);

select items.itemName,Company.companyCity,items.UnitSold
from Company INNER JOIN items On 
Company.companyId=items.companyId;