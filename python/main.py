from car import Car
from account import Account
from paypal import Paypal
from payment import Payment

if __name__ ==  "__main__":
    print("Hola mundo")

    car = Car("AMS234", Account("Andres Herrera", "ANDA876"))
    print(vars(car))  #vars y dentro la variable, imprime todo lo que esta contenga
    print(vars(car.driver))

    car2 = Car("QWE567", Account("Andrea Herrera", "AND123"))
    print(vars(car2))

    pagos = Paypal(1, 5000, "jhanbayer@gmail.com", "password")
    print(vars(pagos))
     