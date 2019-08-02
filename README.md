# Sistema de Cadastro Unificado de Saúde Pública (SUS 2.0)

Informação do sistema: Projeto para restruturação do sus atual, usado no serviço público de saúde. A ideia desse projeto, é usar de forma efetiva, um sistema onde o paciente possa, usando apenas o CPF, se consultar no sistema de saúde público - hospitais e postos, e se cadastrarem caso não possuam registro no sistema, e ainda manter o histórico de cada paciente de forma a servir de insumos para uma consulta médica, onde através desses dados o médico possa ter um diagnóstico mais preciso, com o paciente.

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
  
  Caso use linux baseado no ubuntu:
  -Instalar angular na versão 6 - npm install @angular/cli@6.0.0 e visite a pagina https://cli.angular.io/ e siga os passos.
  
  -Instalar nodejs na versão 8 -  https://nodejs.org/de/download/
  
  -Caso queira baixar o gerenciador de pacotes do node - https://github.com/nvm-sh/nvm
  
  Antes de executar o frontend, executar 'npm install' em seu diretório, para baixar as dependências do projeto.
  
  Antes de executar o backend, executar 'update project' do maven em seu diretório, para baixar as dependências do projeto.
  Recomendado o uso do eclipse STS (Spring Suit Tools) - https://spring.io/tools, 
  pois já vem com plugins e as configurações do    spring instaladas.
  
  Para logar foi cadastrado o seguinte usuário teste: 
  
  usuário: root@gmail.com 
  
  senha: root
  
  Para quem deseja contribuir no código, temos também um backlog de demandas ou contribua após rodar a aplicação e verificar alguma necessidade no sistema, que seja de cordo com sua proposta final.
  link: https://trello.com/b/M0I4ONQg/sus
