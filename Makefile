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

build-dep:
	docker build . -t demo2sq5-dep -f ./Dockerfile-dep

build:
	docker build . -t demo2sq5 -f ./Dockerfile-mini

run:
	docker run -it demo2sq5