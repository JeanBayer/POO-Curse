from payment import Payment

class Paypal(Payment):

    email = str
    password = str

    def __init__(self, id, monto, email, password):
        super().__init__(id, monto)
        self.email = email
        self.password = password

