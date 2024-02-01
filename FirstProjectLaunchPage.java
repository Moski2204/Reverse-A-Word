import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    public class FirstProjectLaunchPage implements ActionListener {

        JFrame frame = new JFrame();
        JButton myButton = new JButton();
        FirstProjectLaunchPage(){
            myButton.setText("Welcome to Reverse A Word");
            myButton.setBounds(80,150,250,40);
            myButton.setFocusable(false);
            myButton.addActionListener(this);

            frame.add(myButton);
            frame.getContentPane().setBackground(Color.blue);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(420,420);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setResizable(false);

        }

        //this code will output what is in the new window when the user presses on the button to open the new window
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == myButton){
                frame.dispose(); //this code closes the LaunchPage (the one with the button) when the user presses on the buttons
                FirstProjectNewWindow myWindow = new FirstProjectNewWindow();
            }
        }

        public static void main(String[] args) {
           FirstProjectLaunchPage LAUNCHING  = new FirstProjectLaunchPage();
        }
    }
