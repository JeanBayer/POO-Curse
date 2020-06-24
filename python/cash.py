from payment import Payment

class Cash(Payment):

    def __init__(self, id, monto):
        super().__init__(id, monto)
        