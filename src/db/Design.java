package db;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Design extends JFrame {
    JTextField label1_field, label2_field;
    JRadioButton male, female;
    JCheckBox check;

    public Design(){
        super("Registration");
        super.setBounds(450, 250, 350, 350);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 3, 5, 10));

        JLabel label_1 = new JLabel("Name");
        label1_field = new JTextField("", 1);
        JLabel label_2 = new JLabel("Email");
        label2_field = new JTextField("", 1);
        container.add(label_1);
        container.add(label1_field);
        container.add(label_2);
        container.add(label2_field);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        check = new JCheckBox("Are you agree with this laws?", false);
        JButton send = new JButton("Send");

        container.add(male);
        container.add(female);

        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        container.add(check);
        container.add(send);

        send.addActionListener(new ButtonRes());
    }

     class ButtonRes implements ActionListener {

        @Override
        public void  actionPerformed(ActionEvent e) {
            String name = label1_field.getText();
            String email = label2_field.getText();

            String ismale = "Male";
            if (!male.isSelected()){
                ismale = "Female";
            }

            boolean ischeck = check.isSelected();

            JOptionPane.showMessageDialog(null, "Your email: " + email +  "\nYour Gender: " + ismale +
                    "\n You are agree: " + ischeck
                    , "Hi, " + name, JOptionPane.PLAIN_MESSAGE);


        }

    }
;


}
