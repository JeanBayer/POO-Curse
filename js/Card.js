class Card extends Payment{

    constructor(id, monto, cardType, cardPassword){

        super(id, monto)
        this.cardType = cardType
        this.cardPassword = cardPassword

    }

}