<?php
    require_once 'Account.php';
    require_once 'Car.php';

    $car = new Car("BCB19N", new Account("Andres Herrera", "AJ629XA"));
    $car->printDataCar();

    $car2 = new Car("XYZ", new Account("Andrea Herrera", "XYZ"));
    $car2->printDataCar();
?>