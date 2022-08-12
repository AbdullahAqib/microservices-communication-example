# microservices-communication-example

This microservices communication example is using RabbitMQ message broker.

To run this example you need to have rabbitmq installed and running on default port.

There are two services a producer that will publish the message and a consumer that will consume the message. You need to start both services producer will be running on port 9001 and consumer on 9002.

In this example /api/publish is being used to publish user information. You can have a look at this endpoint in producer service.
