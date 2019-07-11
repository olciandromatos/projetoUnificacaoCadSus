# Sistema de Cadastro Unificado de Saúde Pública (SUS 2.0)
SISUNI-sistema de saúde unificada (apelido)

- Cadastro do paciente uma única vez, independente do hospital ou postos de saúde pública.
- o sistema busca os dados do seu histórico anterior de saúde registrado em outros postos/hospitais.
- recadastro, apenas com adição dos dados atuais, caso ele já exista, haverá necessidade apenas do cpf.
- cadastro disponível para os hospitais e postos de saúde pública.

# documentacao
- reservado para adicionar documentos importantes que facilite a comprienção dos envolvidos no projeto.

# susclient
- lado do cliente(Frontend), criado usando Angular versão 6 e node versão 8.
- PrimeNG versão 7 - é um framework da Primetek para ser usado para criar telas do frontend.

# susservice
- lado do servidor(Backend), criado usando Spring boot 2.1.2, Spring Data JPA, Spring MVC e posteriormente Spring security.
- Postgres é o banco de dados usado, há também como utilizar o mysql, apenas comentando os dados do postgres e descomentando os dados do mysql.
- H2 é um banco em memoria usado para teste.
- Liquibase é um versionador de registros no banco de dados.

# Importante
- rodar esses script no banco:

  CREATE DATABASE sus;
  
  CREATE SCHEMA susservice;
  
  Antes de executar o frontend, executar 'npm install' em seu diretório, para baixar as dependências do projeto.
  
  Antes de executar o backend, executar 'update project' do maven em seu diretório, para baixar as dependências do projeto.
  
  Para logar foi cadastrado o seguinte usuário teste: 
  
  usuário: root@gmail.com 
  
  senha: root
