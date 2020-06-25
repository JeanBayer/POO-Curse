<?php
    require_once ('Car.php');
    require_once ('uberX.php');
    require_once ('uberPool.php');
    require_once ('Account.php');
    require_once ("Payment.php");
    require_once ("Paypal.php");
    

    $uberX = new uberX("BCB19N", new Account("Andres Herrera", "AJ629XA"), "Chevrolet", "Spark");
    $uberX->printDataCar();

    $uberPool = new uberPool("TCY334", new Account("Andrea Herrera", "AND567"), "Dodge", "Attitude");
    $uberPool->printDataCar();

    $paypal = new Paypal(1, 5000, "jhanbayer@gmail.com", "jhanbayer7");
    $paypal->printDataPayment();

?>