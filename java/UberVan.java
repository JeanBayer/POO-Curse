import java.util.ArrayList;
import java.util.Map;


class UberVan extends Car{

    Map<String, Map<String,Integer>> typeCarAccepted; //se cambia arraylist por map en el segundo map
    ArrayList<String> seatsMaterial;
    

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
                     ArrayList<String> seatsMaterial   ) {

        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;

    }

    public UberVan(String license, Account driver){
        super(license, driver);
    }


    //polimorfismo con el metodo set passenger que pertenece a car
    @Override
    public void setPassenger(Integer passenger) {
       
        if(passenger == 6){
            super.setPassenger(passenger);
        } else {
            System.out.println("Necesitas aginar 6 pasajeros");
        }
        

    }

    

}