import java.util.Scanner;
/**
 *
 * @author arw5550
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("ArrayList Model or LinkedList Model? ");
        String arrayOrLinked = scan.nextLine();
        System.out.println("Simple or Fancy? ");
        String simpleOrFancy = scan.nextLine();
        
        //System.out.println(arrayOrLinked + ' ' + simpleOrFancy);
        
        if (arrayOrLinked.equalsIgnoreCase("ArrayList"))
        {
            if (simpleOrFancy.equalsIgnoreCase("Simple"))
            {
                RandomWordArrayListModel model = new RandomWordArrayListModel();
                SimpleRandomWordView view = new SimpleRandomWordView(model);
                RandomWordController controller = new RandomWordController(model, view);
        
                view.setVisible(true);
            }
            else if(simpleOrFancy.equalsIgnoreCase("Fancy"))
            {
                RandomWordArrayListModel model = new RandomWordArrayListModel();
                FancyRandomWordView view = new FancyRandomWordView(model);
                RandomWordController controller = new RandomWordController(model, view);
        
                view.setVisible(true);
            }
        }
        
        else if(arrayOrLinked.equalsIgnoreCase("LinkedList"))
        {
            if (simpleOrFancy.equalsIgnoreCase("Simple"))
            {
                RandomWordLinkedListModel model = new RandomWordLinkedListModel();
                SimpleRandomWordView view = new SimpleRandomWordView(model);
                RandomWordController controller = new RandomWordController(model, view);
        
                view.setVisible(true);
            }
            else if(simpleOrFancy.equalsIgnoreCase("Fancy"))
            {
                RandomWordLinkedListModel model = new RandomWordLinkedListModel();
                FancyRandomWordView view = new FancyRandomWordView(model);
                RandomWordController controller = new RandomWordController(model, view);
        
                view.setVisible(true);
            }
        }
        
        else
        {
            System.out.println("Wrong Input\nInput: 'ArrayList', 'LinkedList', 'Simple', 'Fancy'");
        }
        
//        RandomWordArrayListModel model = new RandomWordArrayListModel();
//        //SimpleRandomWordView view = new SimpleRandomWordView(model);
//        FancyRandomWordView view = new FancyRandomWordView(model);
//        RandomWordController controller = new RandomWordController(model, view);
//        
//        view.setVisible(true);
        
    }
    
}
