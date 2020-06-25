<?php 
require_once("Payment.php");
class Card extends Payment { 

    public $cardType;
    public $cardPassword;

    public function __construct($id, $monto, $cardType, $cardPassword){

        parent::__construct($id, $monto);
        $this->cardType = $cardType;
        $this->cardPassword = $cardPassword;

    }




}


?>