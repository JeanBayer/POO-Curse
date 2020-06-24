public class Card extends Payment{

    String cardType;
    Integer cardPassword;
    
    public Card(Integer id, Integer monto, String cardType, Integer cardPassword){
       
        super(id, monto);
        this.cardType = cardType;
        this.cardPassword = cardPassword;

    }
    
}