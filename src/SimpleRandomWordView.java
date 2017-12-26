import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author arw5550
 */
public class SimpleRandomWordView extends JFrame{
    private JTextField currentWordField;
    private JTextField wordDisplay;
    private JButton getWordButton;
    private JButton putWordButton;
    
    private RandomWordArrayListModel model;
    private RandomWordLinkedListModel model2;
    
    SimpleRandomWordView(RandomWordArrayListModel model){
        this.model = model;
        
        currentWordField = new JTextField(20);
        wordDisplay = new JTextField(20);
        
        getWordButton = new JButton("Get new word");
        putWordButton = new JButton("Add word");
        
        JPanel content = new JPanel();
        content.add(currentWordField);
        content.add(getWordButton);
        content.add(wordDisplay);
        content.add(putWordButton);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Random Word MVC Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  
    }
    SimpleRandomWordView(RandomWordLinkedListModel model){
        this.model2 = model;
        
        currentWordField = new JTextField(20);
        wordDisplay = new JTextField(20);
        
        getWordButton = new JButton("Get word");
        putWordButton = new JButton("Add word");
        
        JPanel content = new JPanel();
        content.add(currentWordField);
        content.add(getWordButton);
        content.add(wordDisplay);
        content.add(putWordButton);
        this.setContentPane(content);
        this.pack();
        this.setTitle("Random Word MVC Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  
    }
  
    public void addWordButtonListener(ActionListener al) 
    {    
        getWordButton.addActionListener(al);
    }
    
    public void putWordButtonListener(ActionListener al) 
    {    
        putWordButton.addActionListener(al);
    }
    
    public void setCurrentWord(String newWord)
    {
        currentWordField.setText(newWord);
    }
    
    public String getAdd()
    {
        return wordDisplay.getText();
    }
}
