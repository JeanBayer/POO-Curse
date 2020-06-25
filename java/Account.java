class Account {

    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document, String email, String password){

        this.name     = name;
        this.document = document;
        this.email    = email;
        this.password = password;

    }
    
    public void printDataAccount(){
        System.out.println("name: " + this.name + " email: " + this.email + " password: " + this.password  );
    }

}