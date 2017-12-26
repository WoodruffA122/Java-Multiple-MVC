import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author arw5550
 */
public class RandomWordArrayListModel {
    private ArrayList<String> list;
    private Random rand = new Random();
    RandomWordArrayListModel()
    {
        list = new ArrayList();
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
