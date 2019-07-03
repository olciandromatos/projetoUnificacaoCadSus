# sistema de cadastro unificado de saúde pública
SISUNI-sistema de saúde unificada

- Cadastro do paciente uma única vez, independente do hospital ou postos de saúde pública
- o sistema busca seus dodos do último atendimento, e seu histórico anterior de saúde registrado em outros postos/hospitais
- recadastro, apenas com adição dos dados atuais, caso ele já exista
- atendimento com necessidade apenas do cpf 
- cadastro disponível para os hospitais e postos de saúde pública

# susservice
- lado do servidor(Backend), criado usando Spring boot, Spring Data JPA, Spring MVC e posteriormente Spring security
- Postgres é o banco de dados usado 
- H2 é um banco em memoria usado para teste 
- Liquibase é um versionador de registros no banco de dados

# susclient
- lado do cliente(Frontend), criado usando Angular 6
- PrimeNG é um framework da Primetek para ser usado para criar telas

# Importante
- rodar esses script no banco

  CREATE DATABASE sus;
  CREATE SCHEMA susservice;
  
  na tela de login foi cadastrado para teste o seguinte usuario; usuario: root@gmail.com senha: root
