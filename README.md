# sistema de cadastro unificado de saúde pública
SISUNI-sistema de saúde unificada

- Cadastro do paciente uma única vez, independente do hospital o posto de saúde público
- o sistema busca seus dodos do ultimo atendimento, e seu histórico anterior de saúde registrados em outros outros postos/hospitais
- recadastro, apenas adição dos dados atuais, se seu cadastro existir
- atendimento com necessidade apenas de cpf 
- cadastro disponível para os hospitais e postos de saúde publica

# susservice
- lado do servidor(Backend), criado usando Spring boot, Spring Data JPA, Spring MVC e posteriormente Spring security
- Postgres é o banco de dados usado 
- H2 é um banco em memoria usado para teste 
- Liquibase é um versionador de registros no banco de dados

# susclient
- lado do cliente(Frontend), criando usando Angular 6
- PrimeNG é um framework da Primetek para ser usado para criar telas
