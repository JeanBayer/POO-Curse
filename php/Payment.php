<?php
class Payment
{
    public $id;
    public $monto;

    public function __construct($id, $monto){
        
        $this->id = $id;
        $this->monto = $monto;

    }

    public function printDataPayment(){
        
        echo  " id: $this->id monto: ".$this->monto;

    }

}
?>