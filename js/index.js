var car = new Car("AW456", new Account("Andres Herrera", "AND123"))
car.passenger = 4;
car.printDataCar();

var uberX = new UberX("AW456", new Account("Andres Herrera UberX", "AND123"), "Chevrolet", "Spark")
uberX.passenger = 4;
uberX.printDataCar();

var paypal = new Paypal(1, 5000, "jhanbayer@gmail.com", "Salem2019");
paypal.printDataPayment();
paypal.printDataPaypal();