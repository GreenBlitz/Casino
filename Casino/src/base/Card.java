package base;

/**
 * @author Raz Rishoni
 */
enum Card{
    DIAMONDS_ACE(Card.CardNumber.ACE,Card.Suit.DIAMONDS),
    DIAMONDS_TWO(Card.CardNumber.TWO,Card.Suit.DIAMONDS),
    DIAMONDS_THREE(Card.CardNumber.THREE,Card.Suit.DIAMONDS),
    DIAMONDS_FOUR(Card.CardNumber.FOUR,Card.Suit.DIAMONDS),
    DIAMONDS_FIVE(Card.CardNumber.FIVE,Card.Suit.DIAMONDS),
    DIAMONDS_SIX(Card.CardNumber.SIX,Card.Suit.DIAMONDS),
    DIAMONDS_SEVEN(Card.CardNumber.SEVEN,Card.Suit.DIAMONDS),
    DIAMONDS_EIGHT(CardNumber.EIGHT,Card.Suit.DIAMONDS),
    DIAMONDS_NINE(Card.CardNumber.NINE,Card.Suit.DIAMONDS),
    DIAMONDS_TEN(Card.CardNumber.TEN,Card.Suit.DIAMONDS),
    DIAMONDS_JACK(Card.CardNumber.JACK,Card.Suit.DIAMONDS),
    DIAMONDS_QUEEN(Card.CardNumber.QUEEN,Card.Suit.DIAMONDS),
    DIAMONDS_KING(Card.CardNumber.KING,Card.Suit.DIAMONDS),
    CLUBS_ACE(Card.CardNumber.ACE,Card.Suit.CLUBS),
    CLUBS_TWO(Card.CardNumber.TWO,Card.Suit.CLUBS),
    CLUBS_THREE(Card.CardNumber.THREE,Card.Suit.CLUBS),
    CLUBS_FOUR(Card.CardNumber.FOUR,Card.Suit.CLUBS),
    CLUBS_FIVE(Card.CardNumber.FIVE,Card.Suit.CLUBS),
    CLUBS_SIX(Card.CardNumber.SIX,Card.Suit.CLUBS),
    CLUBS_SEVEN(Card.CardNumber.SEVEN,Card.Suit.CLUBS),
    CLUBS_EIGHT(CardNumber.EIGHT,Card.Suit.CLUBS),
    CLUBS_NINE(Card.CardNumber.NINE,Card.Suit.CLUBS),
    CLUBS_TEN(Card.CardNumber.TEN,Card.Suit.CLUBS),
    CLUBS_JACK(Card.CardNumber.JACK,Card.Suit.CLUBS),
    CLUBS_QUEEN(Card.CardNumber.QUEEN,Card.Suit.CLUBS),
    CLUBS_KING(Card.CardNumber.KING,Card.Suit.CLUBS),
    HEARTS_ACE(Card.CardNumber.ACE,Card.Suit.HEARTS),
    HEARTS_TWO(Card.CardNumber.TWO,Card.Suit.HEARTS),
    HEARTS_THREE(Card.CardNumber.THREE,Card.Suit.HEARTS),
    HEARTS_FOUR(Card.CardNumber.FOUR,Card.Suit.HEARTS),
    HEARTS_FIVE(Card.CardNumber.FIVE,Card.Suit.HEARTS),
    HEARTS_SIX(Card.CardNumber.SIX,Card.Suit.HEARTS),
    HEARTS_SEVEN(Card.CardNumber.SEVEN,Card.Suit.HEARTS),
    HEARTS_EIGHT(CardNumber.EIGHT,Card.Suit.HEARTS),
    HEARTS_NINE(Card.CardNumber.NINE,Card.Suit.HEARTS),
    HEARTS_TEN(Card.CardNumber.TEN,Card.Suit.HEARTS),
    HEARTS_JACK(Card.CardNumber.JACK,Card.Suit.HEARTS),
    HEARTS_QUEEN(Card.CardNumber.QUEEN,Card.Suit.HEARTS),
    HEARTS_KING(Card.CardNumber.KING,Card.Suit.HEARTS),
    SPADES_ACE(Card.CardNumber.ACE,Card.Suit.SPADES),
    SPADES_TWO(Card.CardNumber.TWO,Card.Suit.SPADES),
    SPADES_THREE(Card.CardNumber.THREE,Card.Suit.SPADES),
    SPADES_FOUR(Card.CardNumber.FOUR,Card.Suit.SPADES),
    SPADES_FIVE(Card.CardNumber.FIVE,Card.Suit.SPADES),
    SPADES_SIX(Card.CardNumber.SIX,Card.Suit.SPADES),
    SPADES_SEVEN(Card.CardNumber.SEVEN,Card.Suit.SPADES),
    SPADES_EIGHT(CardNumber.EIGHT,Card.Suit.SPADES),
    SPADES_NINE(Card.CardNumber.NINE,Card.Suit.SPADES),
    SPADES_TEN(Card.CardNumber.TEN,Card.Suit.SPADES),
    SPADES_JACK(Card.CardNumber.JACK,Card.Suit.SPADES),
    SPADES_QUEEN(Card.CardNumber.QUEEN,Card.Suit.SPADES),
    SPADES_KING(Card.CardNumber.KING,Card.Suit.SPADES);

    enum CardNumber{
        ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        private int value;

        CardNumber(int value){
            this.value = value;
        }

        /**
         * @return the number of the card number (for example: ACE -> 1)
         */
        public int getVal(){
            return this.value;
        }
    }

    enum Suit{
        DIAMONDS,
        CLUBS,
        HEARTS,
        SPADES
    }

    private CardNumber number;
    private Suit suit;

    Card(CardNumber number, Suit suit){
        this.number = number;
        this.suit = suit;
    }

    /**
     * @return the card number
     */
    public CardNumber getCardNumber(){
        return this.number;
    }

    /**
     * @return the card suit
     */
    public Suit getSuit(){
        return this.suit;
    }

    /**
     * @return the value of the card
     */
    public int evaluate(){
        return this.getCardNumber().getVal();
    }

    @Override
    public String toString(){
        return this.getCardNumber() + " " + this.getSuit();
    }
}