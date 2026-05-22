# Kafka Microservices

Два микросервиса, взаимодействующих асинхронно через Apache Kafka.

## Стек технологий

- **Java 17**, **Spring Boot 3**
- **Apache Kafka** — асинхронный обмен сообщениями
- **Docker** / **Docker Compose**
- **Lombok**, **Maven**

## Сервисы

### order-service (порт 8080)
Принимает POST-запросы на создание заказов и публикует события в Kafka топик `orders`.

### warehouse-service (порт 8081)
Подписан на топик `orders` и обрабатывает входящие заказы.

## API

### Создать заказ

| Метод | Эндпоинт | Описание |
|-------|----------|----------|
| POST | `/orders` | Создать заказ |

## Запуск

1. Поднять Kafka и Kafdrop:
```bash
docker-compose up -d
```
2. Запустить order-service и warehouse-service из IDE

Kafdrop (мониторинг топиков) доступен на `http://localhost:9000`
