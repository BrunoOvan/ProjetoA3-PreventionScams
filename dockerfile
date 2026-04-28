# ESTÁGIO 1: Build (Construção)
# Usa uma imagem oficial do Maven com Java 17 para compilar o projeto
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copia o arquivo de dependências e baixa o que for necessário
COPY pom.xml .
RUN mvn dependency:go-offline

# Copia o código fonte e gera o arquivo .jar (ignorando os testes para ser mais rápido)
COPY src ./src
RUN mvn clean package -DskipTests

# ESTÁGIO 2: Run (Execução)
# Usa uma imagem super leve apenas com o Java 17 (sem o Maven) para rodar o app
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Pega o arquivo .jar gerado no Estágio 1 e coloca nesta nova imagem
COPY --from=build /app/target/*.jar app.jar

# Libera a porta 8080 (a mesma que o Spring Boot usa)
EXPOSE 8080

# Comando que será executado quando o container ligar
ENTRYPOINT ["java", "-jar", "app.jar"]
# Fim