class Main {

    public static void main(String[] args) {
        
        System.out.println("Hola mundo");

        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.passenger = 4;
        car.printDataCar();

        UberX car2 = new UberX("QWE567", new Account("Andrea Herrera UberX", "ANDA876"), "Chevrolet", "Camaro");
        car2.passenger = 3;
        car2.printDataCar();

        Paypal paypal = new Paypal(1, 5000, "jhanbayer@gmail.com", "Password");
        paypal.printDataCar();
        paypal.emailPrint();
    }
}