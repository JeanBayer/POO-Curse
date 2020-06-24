class Payment {
    
    Integer id;
    Integer monto;

    public Payment(Integer id, Integer monto){
        this.id = id;
        this.monto = monto;
    }

    void printDataCar(){
        System.out.println("id: " + id + " monto: " + monto);
    }
    
}