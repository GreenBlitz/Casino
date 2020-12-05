package base;
import java.util.Collections;
import java.util.Stack;

/**
 * @author Raz Rishoni
 */
public class Deck{
    private Stack<Card> cards;

    /**
     * constructor, creates a deck with 52 cards
     */
    public Deck(){
        cards = new Stack<Card>();
        for(Card card : Card.values()){
            cards.add(card);
        }
    }

    /**
     * constructor, creates a deck with many small decks
     * @param numOfDecks the number of small decks
     */
    public Deck(int numOfDecks){
        cards = new Stack<Card>();
        for(Card card : Card.values()){
            for(int i = 0; i < numOfDecks; i++){
                cards.add(card);
            }
        }
    }

    /**
     * shuffles the deck
     */
    public void shuffle(){
        Collections.shuffle(cards);
    }

    /**
     * draws a card from the deck
     * @return the card
     */
    public Card draw(){
        return cards.pop();
    }

    /**
     * adds a card to the deck
     * @param newCard the new card
     */
    public void addCard(Card newCard){
        cards.add(newCard);
    }

    @Override
    public String toString(){
        String strToReturn = "";
        for(int i = 0; i < cards.size(); i++){
            strToReturn += cards.get(i).toString() + "\n";
        }
        return strToReturn;
    }
}
