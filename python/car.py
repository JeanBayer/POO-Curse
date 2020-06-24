from account import Account

class Car:
    id        = int
    license   = str
    driver    = Account("","") #solicita dos datos el tipo Account
    passenger = int

    def __init__(self, license, driver):
        self.license    = license
        self.driver     = driver