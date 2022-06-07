


CREATE TABLE IF NOT EXISTS public.tb_email
(
    id bigint NOT NULL,
    assunto varchar(255) NOT NULL,
    data_envio timestamp without time zone,
    email_de varchar(255) NOT NULL,
    email_para varchar(255) NOT NULL,
    status_email integer NOT NULL,
    texto text NOT NULL,
    usuario_ref varchar(255) NOT NULL,
    CONSTRAINT tb_email_pkey PRIMARY KEY (id)
);


CREATE SEQUENCE IF NOT EXISTS public.tb_email INCREMENT 1 START 3 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1; 
CREATE SEQUENCE IF NOT EXISTS hibernate_sequence INCREMENT 1  MINVALUE 1  MAXVALUE 9223372036854775807 START 1 CACHE 1;