https://start.spring.io/

https://www.youtube.com/watch?v=ArW93visVhc


=============================================================================

mvn clean package -DskipTests

java -jar target/movies-microservice-1.0.0.jar


todas las peliculas:
GET http://localhost:8080/movies

por ID:
GET http://localhost:8080/movies/1

=============================================================================