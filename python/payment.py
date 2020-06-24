class Payment:
    id = int
    monto = int

    def __init__(self, id, monto):
        self.id    = id
        self.monto = monto