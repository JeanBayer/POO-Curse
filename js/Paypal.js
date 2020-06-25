class Paypal extends Payment{

    constructor(id, monto, email, password){

        super(id, monto)
        this.email = email
        this.password = password

    }

    printDataPaypal(){
        console.log("email: " + this.email + " password: " + this.password );
    }

}