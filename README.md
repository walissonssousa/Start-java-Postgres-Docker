# templatesbackend-backend

**para subir o oracle database:**

    $ docker-compose up -d templatesbackend_pgslq_db

**para rodar a aplicação pelo docker:**

    $ docker-compose up -d --build


## Como fazer um restart limpo do docker

Stop the container(s) using the following command:

    $ docker-compose down

Delete all containers using the following command:

    $ docker rm -f $(docker ps -a -q)

Delete all volumes using the following command:

    $ docker volume rm $(docker volume ls -q)

Restart the containers using the following command:

    $ docker-compose up -d