# TaskManager API

Uma API simples para gerenciamento de tarefas, criada para fins de estudo sobre desenvolvimento backend com Java e Spring Boot utilizando Arquitetura Hexagonal.

## Install

Certifique-se de ter o **JDK 25** instalado.

```bash
git clone https://github.com/JulianoCLI/TaskManagerAPI.git
cd TaskManagerAPI
./mvnw clean install
```

## Run the app

```bash
./mvnw spring-boot:run
```
A API estará disponível em `http://localhost:8080/tasks`.

## Run the tests

Para rodar os testes e gerar a documentação técnica (Spring REST Docs):

```bash
./mvnw test
```
A documentação gerada poderá ser acessada em `http://localhost:8080/docs/index.html` com a aplicação rodando, ou visualizando o arquivo `target/generated-docs/index.html`.

## REST API

A API REST para o TaskManager está descrita abaixo.

### Create a Task

#### Request
`POST /tasks`
```bash
curl -i -X POST http://localhost:8080/tasks \
     -H "Content-Type: application/json" \
     -d '{"title": "Estudar Java", "description": "Ler documentação do Java 25"}'
```

#### Response
```http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "id": "550e8400-e29b-41d4-a716-446655440000",
  "title": "Estudar Java",
  "description": "Ler documentação do Java 25",
  "status": "TODO"
}
```

### List all Tasks

#### Request
`GET /tasks`
```bash
curl -i http://localhost:8080/tasks
```

#### Response
```http
HTTP/1.1 200 OK
Content-Type: application/json

[
  {
    "id": "550e8400-e29b-41d4-a716-446655440000",
    "title": "Estudar Java",
    "description": "Ler documentação do Java 25",
    "status": "TODO"
  }
]
```

### Get a Task by ID

#### Request
`GET /tasks/:id`
```bash
curl -i http://localhost:8080/tasks/550e8400-e29b-41d4-a716-446655440000
```

#### Response
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "id": "550e8400-e29b-41d4-a716-446655440000",
  "title": "Estudar Java",
  "description": "Ler documentação do Java 25",
  "status": "TODO"
}
```

### Update a Task

#### Request
`PATCH /tasks/:id`
```bash
curl -i -X PATCH http://localhost:8080/tasks/550e8400-e29b-41d4-a716-446655440000 \
     -H "Content-Type: application/json" \
     -d '{"status": "DONE"}'
```

#### Response
```http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "id": "550e8400-e29b-41d4-a716-446655440000",
  "title": "Estudar Java",
  "description": "Ler documentação do Java 25",
  "status": "DONE"
}
```

### Delete a Task

#### Request
`DELETE /tasks/:id`
```bash
curl -i -X DELETE http://localhost:8080/tasks/550e8400-e29b-41d4-a716-446655440000
```

#### Response
```http
HTTP/1.1 204 No Content
```
