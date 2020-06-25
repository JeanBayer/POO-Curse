class Car {
    
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    public Car(String license, Account driver){

        this.license = license;
        this.driver  = driver;

    }

    void printDataCar(){

        if(passenger != null){
        System.out.println("License: " + license + " Name Driver: " + driver.name + " passenger: " + passenger );
        }

    }

    //METODOS SETTER & GETTER

    //@Passenger
    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){

        if(passenger != null){
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas aginar pasajeros");
        }
        
    }

    //@id
    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    //@License
    public String getLicense(){
        return license;
    }

    public void setLicense(String license){
        this.license = license;
    }

    //@driver
    public Account getDriver(){
        return driver;
    }

    public void setDriver(Account driver){
        this.driver = driver;
    }
    
}