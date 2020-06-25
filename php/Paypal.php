<?php
require_once('Payment.php');
class Paypal extends Payment {
    public $email;
    public $password;

    public function __construct($id, $monto, $email, $password){
       parent::__construct($id, $monto);
        $this->email = $email;
        $this->password = $password;
    }


}

?>