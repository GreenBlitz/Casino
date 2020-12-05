package base;
import java.util.Stack;

/**
 * @author Raz Rishoni
 */
public class DeckWithTrash extends Deck{
    private Stack<Card> trash;

    /**
     * constructor, creates a new deck with trash
     */
    public DeckWithTrash(){
        super();
        trash = new Stack<Card>();
    }
    
    /**
     * takes a card from the deck and move it to the trash pile
     * @return the card
     */
    public Card throwCard(){
        trash.add(draw());
        return trash.peek();
    }

    /**
     * empty the trash pile
     */
    public void emptyTrash(){
        trash = new Stack<Card>();
    }

    /**
     * add a new card to the trash pile
     * @param cardToTrash the new card
     */
    public void addToTrash(Card cardToTrash){
        trash.add(cardToTrash);
    }

    /**
     * reshuffle the trash to the deck
     */
    public void reshuffleTrash(){
        for(int i = 0; i < trash.size(); i++){
            addCard(trash.get(i));
        }
        shuffle();
        trash = new Stack<Card>();
    }

    @Override
    public String toString(){
        String strToReturn = "";
        strToReturn = "Deck: \n" + super.toString() + "\n Trash: \n";
        for(int i = 0; i < trash.size(); i++){
            strToReturn += trash.get(i).toString() + "\n";
        }
        return strToReturn;
    }
}
