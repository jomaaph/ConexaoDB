# 🏦 Projeto Fintech Java-MySQL

Sistema de gestão financeira desenvolvido como parte do currículo de Informática de Gestão Financeira (ISAF). O foco deste projeto é a integração segura entre Java 21 e uma base de dados relacional.

## 🚀 Tecnologias Utilizadas

* **Linguagem:** Java 21 (Microsoft Build via SDKMAN!)
* **Base de Dados:** MySQL 8.0 (Docker Container)
* **Gestão de Dependências:** Maven
* **Ambiente:** Ubuntu (Bash Shell)

## 🛠️ Configuração do Ambiente

### 1. Base de Dados (Docker)
O projeto utiliza um contentor Docker para o MySQL. Para iniciar o banco de dados:
```bash
docker run --name mysql-fintech -e MYSQL_ROOT_PASSWORD=sua_senha -p 3306:3306 -d mysql:8.0