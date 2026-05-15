# 🔗 Encurtador de URL com Spring Boot

API REST desenvolvida com Java + Spring Boot para encurtamento de URLs, permitindo transformar links longos em URLs curtas e redirecionáveis.

O projeto gera identificadores únicos aleatórios, armazena os links no banco de dados e realiza redirecionamento automático para a URL original.

---

# 🚀 Funcionalidades

## 🔗 Encurtamento de URLs

* Geração automática de URL curta
* IDs aleatórios únicos
* Persistência das URLs no banco de dados

## ↪️ Redirecionamento

* Redirecionamento HTTP automático
* Resposta com status `302 FOUND`
* Recuperação da URL original pelo identificador

## ⚠️ Tratamento de exceções

* Tratamento global de erros
* Retorno padronizado em JSON
* Exceção personalizada para URL não encontrada

## 🗄 Banco de Dados

* Banco H2 em memória
* Persistência utilizando JPA/Hibernate
* Console H2 habilitado

---

# 🛠 Tecnologias Utilizadas

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Hibernate
* Lombok
* Apache Commons Lang
* Maven

---

# 📂 Estrutura do Projeto

```bash id="82md1k"
controller/
 └── UrlController

entities/
 └── Url

DTOs/
 ├── ShortUrlDTORequest
 └── ShortUrlDTOResponse

exceptions/
 ├── GlobalExceptionHandler
 └── RecursoNaoEncontradoException

repository/
 └── UrlRepository
```

---

# 🔄 Funcionamento da API

## Criar URL curta

### Endpoint

```http id="91dks2"
POST /shortURL
```

### Request

```json id="82md2s"
{
  "url": "https://www.google.com"
}
```

### Response

```json id="2md9s1"
{
  "url": "http://localhost:8080/abc123"
}
```

---

## Redirecionar URL

### Endpoint

```http id="91md2s"
GET /{id}
```

### Exemplo

```bash id="2md8s2"
GET /abc123
```

A API redireciona automaticamente para a URL original.

---

# ⚠️ Tratamento de erros

## URL não encontrada

```json id="82md9x"
{
  "timestamp": "2026-05-15T12:00:00",
  "status": 404,
  "Error": "Recurso nao encontrado",
  "message": "URL não encontrada para o id informado"
}
```

---

# 📚 Conceitos aplicados

* API REST
* Redirecionamento HTTP
* DTO Pattern
* Exception Handling
* Global Exception Handler
* Geração de IDs aleatórios
* Persistência com JPA
* Hibernate
* Banco em memória H2
* Clean Code
* Arquitetura em camadas

---

# ▶ Como executar

## Pré-requisitos

* Java 17+
* Maven

## Passos

1. Clone o repositório
2. Execute a aplicação Spring Boot
3. Acesse a API em:

```bash id="91dm1s"
http://localhost:8080
```

---

# 🗄 Console H2

```bash id="82md8s"
http://localhost:8080/h2-console
```

## Configuração padrão

```bash id="82md7s"
JDBC URL: jdbc:h2:mem:testdb
User: sa
Password:
```

---

# 🔥 Diferenciais do projeto

* URLs únicas geradas dinamicamente
* Redirecionamento HTTP real
* Tratamento global de exceções
* Estrutura limpa e organizada
* Banco H2 integrado
* API simples e escalável

---

# 👨‍💻 Autor

Felipe Movio
