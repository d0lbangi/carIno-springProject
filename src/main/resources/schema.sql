CREATE TABLE CAR(
                    id bigint auto_increment,
                    model_name varchar(255) not null,
                    company_id bigint not null,
                    passenger_capacity int,
                    created_at TIMESTAMP not null,
                    updated_at TIMESTAMP not null,

                    primary key(id)
)