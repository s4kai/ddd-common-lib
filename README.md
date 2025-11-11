# Common Library - DDD Architecture

Biblioteca comum contendo componentes fundamentais para implementação de Domain-Driven Design (DDD).

## Estrutura

### Domain
- **Entity**: Classes base para entidades e agregados
  - `BaseEntity<ID>`: Entidade base com identificador
  - `AggregateRoot<ID>`: Raiz de agregado com suporte a eventos de domínio

- **Events**: Sistema de eventos de domínio
  - `DomainEvent`: Interface para eventos
  - `DomainEventPublisher`: Publicador de eventos

- **Value Objects**: Objetos de valor
  - `BaseValueObject`: Classe base para value objects

- **Tenant**: Suporte a multi-tenancy
  - `TenantAware`: Interface para entidades tenant-aware

### Exception
Sistema de exceções estruturado:
- `DomainException`: Exceção base do domínio
- `BusinessException`: Exceções de regras de negócio
- `ValidationException`: Exceções de validação
- `NotFoundException`: Recurso não encontrado
- `NotAuthorizedException`: Acesso não autorizado
- `ErrorCode`: Códigos de erro padronizados

### Security
- `AuthorizedUser`: Usuário autenticado
- `UserContext`: Contexto do usuário atual

### Logging
- `DomainLogger`: Logger específico para o domínio

## Dependências

- **Lombok**: Redução de boilerplate
- **SLF4J**: Logging abstraction

## Uso

```xml
<dependency>
    <groupId>com.sakai</groupId>
    <artifactId>common-lib</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## Build

```bash
mvn clean install
```