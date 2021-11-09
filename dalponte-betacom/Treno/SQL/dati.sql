drop table passeggero;

create table passeggero(
nome varchar2(30) not null,
cognome varchar2(30) not null,
username varchar2(30),
classe varchar2(30) not null,
constraints p_user_passeggero primary key(username));