alter table ticket add constraint ck_ticket_countnum check(countnum < 5);

create table card(
    consumerid varchar2(20) primary key,
    amount number(4)
);

create table ticket(
    consumerid varchar2(20) primary key,
    countnum number(4)
);