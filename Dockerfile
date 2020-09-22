FROM demo2sq5-dep

COPY pom.xml /build/

WORKDIR /build/

COPY src /build/src/

ENV DB_HOST=db
ENV SPRING_DATASOURCE_USERNAME=postgres
ENV SPRING_DATASOURCE_PASSWORD=postgres

ENTRYPOINT mvn spring-boot:run -Dspring-boot.run.profiles=dev