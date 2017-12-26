import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author arw5550
 */
public class FancyRandomWordView extends JFrame{
    private JTextField currentWordField;
    private JTextField wordDisplay;
    private JButton getWordButton;
    private JButton putWordButton;
    
    private RandomWordArrayListModel model;
    private RandomWordLinkedListModel model2;
    
    FancyRandomWordView(RandomWordArrayListModel model){
        this.model = model;
        
        //this.setSize(6000,4000);
        
        currentWordField = new JTextField(20);
        currentWordField.setBounds(10, 10, 200, 50);
        
        
        wordDisplay = new JTextField(20);
        wordDisplay.setBounds(10, 100, 200, 50);
        
        
        getWordButton = new JButton("Get new word");
        getWordButton.setBounds(250, 10, 200, 50);
        
        putWordButton = new JButton("Add word");
        putWordButton.setBounds(250, 100, 200, 50);
        
        JPanel content = new JPanel();
        
        content.setLayout(null);
        content.setSize(6000,4000);
        
        
        content.add(currentWordField);
        content.add(getWordButton);
        content.add(wordDisplay);
        content.add(putWordButton);
        
        
        this.setContentPane(content);
        this.pack();
        this.setTitle("Random Word MVC Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  
    }
    
    FancyRandomWordView(RandomWordLinkedListModel model){
        this.model2 = model;
        
        //this.setSize(6000,4000);
        
        currentWordField = new JTextField(20);
        currentWordField.setBounds(10, 10, 200, 50);
        
        
        wordDisplay = new JTextField(20);
        wordDisplay.setBounds(10, 100, 200, 50);
        
        
        getWordButton = new JButton("Get word");
        getWordButton.setBounds(250, 10, 200, 50);
        
        putWordButton = new JButton("Add word");
        putWordButton.setBounds(250, 100, 200, 50);
        
        JPanel content = new JPanel();
        
        content.setLayout(null);
        content.setSize(6000,4000);
        
        
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
