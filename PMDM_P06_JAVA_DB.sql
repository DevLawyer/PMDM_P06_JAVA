CREATE TABLE Lawyer(
    cod_lawyer      INTEGER,
    lawyer_nif      VARCHAR(10),
    lawyer_name     VARCHAR(30),
    lawyer_surname  VARCHAR(30),
    phone_ext       NUMERIC(4),
    user_name       VARCHAR(15) NOT NULL,
    user_password   VARCHAR(15) NOT NULL,
    photo           VARCHAR(15) DEFAULT 'default.jpg',
    entry_date      DATE,
    hours_fee       NUMERIC,

    CONSTRAINT pk_lawyer
        PRIMARY KEY (cod_lawyer),
    CONSTRAINT unique_nif
        UNIQUE (lawyer_nif),
    CONSTRAINT unique_user 
        UNIQUE (user_name)
);

INSERT INTO lawyer VALUES (0,'55334689X','Miguel María','Vázquez',4011,'migvazmar','migvazmar1',null,CURRENT_DATE,150);

CREATE TABLE Client(
    cod_client      INTEGER,
    client_name     VARCHAR(30) NOT NULL,
    client_surname  VARCHAR(30),
    client_nif      VARCHAR(10),
    client_address  VARCHAR(30),
    telephone_num   VARCHAR(15) NOT NULL,
    cod_lawyer      INTEGER NOT NULL,
    
    CONSTRAINT pk_client
        PRIMARY KEY (cod_client),
    CONSTRAINT fk_lawyer
	    FOREIGN KEY (cod_lawyer)
	    REFERENCES Lawyer(cod_lawyer)

);

CREATE TABLE Entity(
    cod_entity      INTEGER,
    entity_name     VARCHAR(40),
    entity_address  VARCHAR(30),
    telephone_num   VARCHAR(15),

    CONSTRAINT pk_entity
        PRIMARY KEY (cod_entity)
);

CREATE TABLE Issue(
    cod_issue           INTEGER,
    issue_description   VARCHAR(50),
    entry_date          DATE NOT NULL,
    end_date            DATE,
    hours_num           NUMERIC,
    cod_client          INTEGER,
    cod_entity          INTEGER,
    cost                NUMERIC, --Result of hours_num per hours_fee(lawyer)

    CONSTRAINT pk_issue
        PRIMARY KEY (cod_issue, cod_client, cod_entity),
    CONSTRAINT fk_client
        FOREIGN KEY (cod_client)
        REFERENCES Client(cod_client),
    CONSTRAINT fk_entity
        FOREIGN KEY (cod_entity)
        REFERENCES Entity(cod_entity)
);