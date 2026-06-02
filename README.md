# TaskManager API

Uma API simples para gerenciamento de tarefas, criada para fins de estudo sobre desenvolvimento backend com Java e Spring Boot.

## O que é?
Este projeto é um gerenciador de tarefas (CRUD) que permite criar, listar, atualizar e excluir tarefas. Foi desenvolvido para praticar conceitos de arquitetura limpa e organização de código.

## Stack Técnica
- **Linguagem:** Java 25
- **Framework:** Spring Boot 4.0.6
- **Gerenciador de Dependências:** Maven
- **Documentação:** Spring REST Docs (Asciidoctor)
- **Outras bibliotecas:** Lombok, Spring Validation, JUnit 5

## Estrutura do Projeto
O projeto utiliza uma abordagem baseada em **Arquitetura Hexagonal** (ou Ports and Adapters) para manter a lógica de negócio isolada:

- `domain`: Contém as entidades de negócio (Task, TaskId) e a interface do repositório.
- `application`: Contém os Casos de Uso (Use Cases) que executam as regras de negócio.
- `infrastructure`: Contém as implementações técnicas:
    - `http`: Controladores REST, Requests e Responses.
    - `repository`: Implementação de persistência em memória (`InMemoryTaskRepository`).

## Como rodar o projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/JulianoCLI/TaskManagerAPI.git
   ```
2. Entre na pasta do projeto e compile com o Maven:
   ```bash
   ./mvnw clean install
   ```
3. Execute a aplicação:
   ```bash
   ./mvnw spring-boot:run
   ```
4. A API estará disponível em `http://localhost:8080/tasks`.

## Documentação
A documentação da API é gerada automaticamente através dos testes com o **Spring REST Docs**.

- **Como gerar:** Execute o comando `./mvnw package`. O HTML será gerado em `target/generated-docs/index.html`.
- **Como acessar:** Com a aplicação rodando (`./mvnw spring-boot:run`), você pode visualizar a documentação técnica diretamente no navegador através do endereço:
  `http://localhost:8080/docs/index.html`

