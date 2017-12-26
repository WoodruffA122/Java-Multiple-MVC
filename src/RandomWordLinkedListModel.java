
import java.util.LinkedList;
import java.util.Random;


/**
 *
 * @author arw5550
 */
public class RandomWordLinkedListModel {
    private LinkedList<String> list;
    private Random rand = new Random();
    RandomWordLinkedListModel()
    {
        list = new LinkedList();
//        list.add("Tree");
//        list.add("Desk");
//        list.add("Elephant");
//        list.add("Banana");
//        list.add("Rock");

    }
    
    public String getWord()
    {
        int num;
        String word;
        
        if(list.isEmpty())
            return "Empty";
        else
        {
            //num = rand.nextInt(list.size()-1);
            num = (int) (Math.random() * list.size());
            word = list.get(num);
            return word;
        }
    }
    
    public void putWord(String word)
    {
        list.add(word);
    }
    
}
