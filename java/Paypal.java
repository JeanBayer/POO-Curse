public class Paypal extends Payment {

    String email;
    String password;

    public Paypal(Integer id, Integer monto, String email, String password){
        super(id, monto);
        this.email = email;
        this.password = password;
    }

    void emailPrint(){
        System.out.println("email:" + email);
    }
    
}