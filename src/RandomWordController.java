import java.awt.event.*;
/**
 *
 * @author arw5550
 */
public class RandomWordController {
    RandomWordController(RandomWordArrayListModel model, SimpleRandomWordView view) {
        
        // Note the inner ButtonListener class.
        // This is used so we can access private members of RandomWordController
        // and allow the Controller to specify behavior of the View.
        
        class GetButtonListener implements ActionListener {            
            public void actionPerformed(ActionEvent e)
            {
                view.setCurrentWord(model.getWord());
            }
        }
        
        view.addWordButtonListener(new GetButtonListener());
        
        
        class AddButtonListener implements ActionListener {            
            public void actionPerformed(ActionEvent e)
            {
                //view.setCurrentWord(model.getWord());
                model.putWord(view.getAdd());
            }
        }
        
        view.putWordButtonListener(new AddButtonListener());
    }
    
    RandomWordController(RandomWordArrayListModel model, FancyRandomWordView view) {
        
        // Note the inner ButtonListener class.
        // This is used so we can access private members of RandomWordController
        // and allow the Controller to specify behavior of the View.
        
        class GetButtonListener implements ActionListener {            
            public void actionPerformed(ActionEvent e)
            {
                view.setCurrentWord(model.getWord());
            }
        }
        
        view.addWordButtonListener(new GetButtonListener());
        
        
        class AddButtonListener implements ActionListener {            
            public void actionPerformed(ActionEvent e)
            {
                //view.setCurrentWord(model.getWord());
                model.putWord(view.getAdd());
            }
        }
        
        view.putWordButtonListener(new AddButtonListener());
    }
    
    RandomWordController(RandomWordLinkedListModel model, SimpleRandomWordView view) {
        
        // Note the inner ButtonListener class.
        // This is used so we can access private members of RandomWordController
        // and allow the Controller to specify behavior of the View.
        
        class GetButtonListener implements ActionListener {            
            public void actionPerformed(ActionEvent e)
            {
                view.setCurrentWord(model.getWord());
            }
        }
        
        view.addWordButtonListener(new GetButtonListener());
        
        
        class AddButtonListener implements ActionListener {            
            public void actionPerformed(ActionEvent e)
            {
                //view.setCurrentWord(model.getWord());
                model.putWord(view.getAdd());
            }
        }
        
        view.putWordButtonListener(new AddButtonListener());
    }
    
    RandomWordController(RandomWordLinkedListModel model, FancyRandomWordView view) {
        
        // Note the inner ButtonListener class.
        // This is used so we can access private members of RandomWordController
        // and allow the Controller to specify behavior of the View.
        
        class GetButtonListener implements ActionListener {            
            public void actionPerformed(ActionEvent e)
            {
                view.setCurrentWord(model.getWord());
            }
        }
        
        view.addWordButtonListener(new GetButtonListener());
        
        
        class AddButtonListener implements ActionListener {            
            public void actionPerformed(ActionEvent e)
            {
                //view.setCurrentWord(model.getWord());
                model.putWord(view.getAdd());
            }
        }
        
        view.putWordButtonListener(new AddButtonListener());
    }
}
