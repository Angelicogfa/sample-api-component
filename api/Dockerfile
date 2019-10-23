FROM clojure:lein AS api
WORKDIR /src/api
COPY . /src/api
RUN lein uberjar

FROM openjdk:8-alpine
ENV HOST=
ENV DATABASE=
ENV USER=
ENV PASSWORD=
COPY --from=api src/api/target/uberjar/sample-api-0.0.1-standalone.jar sample-api-0.0.1-standalone.jar
EXPOSE 8081
CMD ["java", "-jar", "sample-api-0.0.1-standalone.jar"]