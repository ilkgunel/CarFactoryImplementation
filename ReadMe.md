#Car Factory Implementation Project

There is a Car Interface and 3 implementations of Car Interface. The code detects implementation of one of them according to Rest API input. 

1. If you hit http://localhost:8080/car/hatchback address, you will get "Hatchback Car has produced." message. 
2. If you hit http://localhost:8080/car/sedan address, you will get "Sedan Car has produced." message.
3. If you hit http://localhost:8080/car/cabrio address, you will get "Cabrio Car has produced." message.
4. If you send a card type except above 3 ones, you will get "This car type not supported" message. 