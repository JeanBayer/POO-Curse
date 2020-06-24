from payment import Payment

class Card(Payment):

    cardType = str
    cardPassword = str

    def __init__(self, id, monto, cardType, cardPassword):
        super().__init__(id, monto)
        self.cardType = cardType
        self.cardPassword = cardPassword
