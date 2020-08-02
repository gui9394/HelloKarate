# Hello Karate

Implementação de testes utilizando [Karate](https://intuit.github.io/karate/) em aplicação [Spring Boot](https://spring.io/projects/spring-boot).

## Applicação

Uma aplicação simples Spring Boot baseada em REST com 2 endpoints.

### Buscar todas as músicas

```shell
curl 'http://localhost:8080/songs'
```

```json
[
    {
        "id": 1,
        "title": "Bohemian Rhapsody",
        "artist": "Queen"
    },
    {
        "id": 2,
        "title": "The Phantom Of The Opera",
        "artist": "Nightwish"
    },
    {
        "id": 3,
        "title": "Toxicity",
        "artist": "System Of A Down"
    },
    {
        "id": 4,
        "title": "Street Of Dreams",
        "artist": "Guns N' Roses"
    }
]
```

### Buscar música pelo ID

```shell
curl 'http://localhost:8080/songs/1'
```

```json
{
    "id": 1,
    "title": "Bohemian Rhapsody",
    "artist": "Queen"
}
```

## Testes

Antes de executar os testes você vai ter que executar a aplicação, o Karate não executa a aplicação durante os testes.

``` shell
mvn spring-boot:run
```

Depois da aplicaçãao estiver em execução, você pode executar os testes:

``` shell
mvn test -Dtest=SongsRunner
```
