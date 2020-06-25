class UberPool extends Car{

    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){

        super(license, driver);
        this.brand = brand;
        this.model = model;

    }

    //polimorfismo al metodo printDataCar de la CLase Car
    @Override
    public void printDataCar(){
        super.printDataCar(); //esto es para que haga lo que hace el metodo de la clase padre
        System.out.println("Model: " + model + " Brand: " + brand); //las funciones adicionales
    }

     //polimorfismo con el metodo set passenger que pertenece a car
     @Override
     public void setPassenger(Integer passenger) {
        
         if(passenger == 4){
             super.setPassenger(passenger);
         } else {
             System.out.println("Necesitas aginar 4 pasajeros");
         }
         
 
     }


}