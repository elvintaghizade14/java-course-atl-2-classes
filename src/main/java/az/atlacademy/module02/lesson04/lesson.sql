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
