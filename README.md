\# Kafka Microservices



Два микросервиса, взаимодействующих асинхронно через Apache Kafka.



\## Сервисы



\- \*\*order-service\*\* (порт 8080) — принимает POST-запросы на создание заказов и отправляет события в Kafka топик orders

\- \*\*warehouse-service\*\* (порт 8081) — слушает топик orders и обрабатывает входящие заказы



\## Стек



Java 17, Spring Boot 3, Apache Kafka, Docker, Maven, Lombok



\## Запуск



1\. Поднять Kafka и Kafdrop:

docker-compose up -d



2\. Запустить order-service и warehouse-service из IDE



Kafdrop (мониторинг топиков) доступен на http://localhost:9000

