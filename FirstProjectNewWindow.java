import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FirstProjectNewWindow extends JFrame implements KeyListener{


    JButton button;
    JButton buttonTwo;
    JTextField textField;
    JTextField textFieldTwo;

        FirstProjectNewWindow() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new BorderLayout());
            this.setResizable(true);
            this.setSize(340, 200);
            this.addKeyListener(this);
            this.setVisible(true);

            //creating a button
            button = new JButton();
            button.setText("Enter a word: ");

            buttonTwo = new JButton();
            buttonTwo.setText("Output: ");

            //creating textField
            textField = new JTextField();
            textField.setPreferredSize(new Dimension(250, 40)); //W & H of the textField
            textField.setFont(new Font("Consolas", Font.BOLD, 15));

            textFieldTwo= new JTextField();
            textFieldTwo.setPreferredSize(new Dimension(250, 40));
            textFieldTwo.setFont(new Font("Consolas", Font.BOLD, 15));

            // Create a panel to hold the button and text field
            JPanel panel = new JPanel();
            panel.add(button);
            panel.add(textField);

            JPanel panelTwo = new JPanel();
            panel.add(buttonTwo);
            panel.add(textFieldTwo);

            // Add the panel to the frame
            this.add(panel, BorderLayout.CENTER);
            this.add(panelTwo, BorderLayout.SOUTH);
            this.pack();
            this.setVisible(true);

            // Add action listener to the button
            buttonTwo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    reverseText();
                }
            });
            // Add key listener to the text field
            textField.addKeyListener(this);
        }

    @Override
    public void keyTyped(KeyEvent e) {
        // Invoked when a key is typed. See the class description for KeyEvent for a definition of a key typed event.
    }

    //When enter is pressed, it shows the output.
    @Override
    public void keyPressed(KeyEvent e) {
        // Invoked when a key has been pressed.
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            reverseText();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Invoked when a key has been released.
    }

    //creating a method to reverse the text that is typed in
    private void reverseText() {
        String str = textField.getText();
        String reversed = "";

        System.out.print(" " + "Reversed word: ");
        for(int i = str.length() - 1; i >= 0; i--){
            reversed = reversed + str.charAt(i);
            System.out.print(str.charAt(i) + "");
        }
        System.out.println();
        //outputting the answer into the output textField.
        textFieldTwo.setText(reversed);

    }


    public static void main(String[] args){
            FirstProjectNewWindow testing = new FirstProjectNewWindow();
        }

}
