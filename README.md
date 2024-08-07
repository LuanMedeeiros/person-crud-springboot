# Projeto CRUD de Pessoas

Este é um projeto de exemplo para a implementação de um sistema CRUD (Create, Read, Update, Delete) para gerenciar pessoas. O projeto foi desenvolvido utilizando Java com Spring Boot.

## Funcionalidades

- **Criar Pessoa**: Adicionar uma nova pessoa ao sistema.
- **Listar Pessoas**: Listar todas as pessoas cadastradas no sistema.
- **Atualizar Pessoa**: Atualizar os dados de uma pessoa existente.
- **Deletar Pessoa**: Remover uma pessoa do sistema.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven
- PostgreSQL
- H2 Database (para testes em memória)
- Postman (para testes de API)

## Configuração do Projeto

### Pré-requisitos

- JDK 11 ou superior
- Maven
- PostgreSQL
- Postman (opcional, para testar a API)

### Configuração do Banco de Dados

1. Instale e configure o PostgreSQL em sua máquina.
2. Crie um banco de dados chamado `crud_pessoas`:
   ```sql
   CREATE DATABASE crud_pessoas;
