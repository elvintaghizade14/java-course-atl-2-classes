create table if not exists public.students
(
    id           serial
        constraint students_pk
            primary key,
    name         varchar(255)               not null,
    created_date timestamp(3) default now(),
    active       boolean      default false not null,
    pin          varchar                    not null
        constraint pin_check
            check (length((pin)::text) = ANY (ARRAY [5, 7]))
);

alter table public.students
    owner to postgres;

create unique index if not exists students_pin_uindex
    on public.students (pin);


create table if not exists public.phone_numbers
(
    id           serial
        constraint phone_numbers_pk
            primary key,
    phone_number varchar(10) not null
);

create table if not exists public.students
(
    id              serial
        constraint students_pk
            primary key,
    name            varchar(255)               not null,
    created_date    timestamp(3) default now(),
    active          boolean      default false not null,
    pin             varchar                    not null
        constraint pin_check
            check (length((pin)::text) = ANY (ARRAY [5, 7])),
    phone_number_id integer
        constraint students_phone_numbers_id_fk
            references public.phone_numbers
);

create unique index if not exists students_pin_uindex
    on public.students (pin);

