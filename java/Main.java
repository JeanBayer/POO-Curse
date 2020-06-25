class Main {

    public static void main(String[] args) {
        
        System.out.println("Hola mundo");

        /*
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123", "andres@", "andrexxx"));
        car.passenger = 4;
        car.printDataCar();
        */

        UberX uberx = new UberX("QWE567", new Account("Andrea Herrera UberX", "ANDA876", "andrea@", "anderaxx"), "Chevrolet", "Camaro");
        uberx.setPassenger(4);
        uberx.printDataCar();

        UberVan ubervan = new UberVan("QWE567", new Account("Andrea Herrera UberVan", "ANDA876", "andrea@", "anderaxx"));
        ubervan.setPassenger(4);
        ubervan.printDataCar();

        /*
        Paypal paypal = new Paypal(1, 5000, "jhanbayer@gmail.com", "Password");
        paypal.printDataCar();
        paypal.emailPrint();

        User user = new User("Andrea Herrera UberX", "ANDA876", "andrea@", "anderaxx");
        user.printDataAccount();
        */
    }
}