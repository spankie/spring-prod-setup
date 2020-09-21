dev:
	./mvnw spring-boot:run -Dspring-boot.run.profiles=dev

prod:
	./mvnw spring-boot:run -Dspring-boot.run.profiles=prod

deploy:
	./mvnw -DskipTests package appengine:deploy

logs:
	gcloud app logs tail -s default

test:
	./mvnw test -Dspring.profiles.active=test