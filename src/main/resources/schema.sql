create table friend
(
   id integer not null,
   emailID varchar(255) not null,
   friendList varchar(255) ,
   subscriptionList varchar(255) ,
   message varchar(255), 
   primary key(id)
);