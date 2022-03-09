/**
* Java 1. Home Work #8
*
* @author Artem Anurin
* @version 09.03.2022
*/

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


class CounterApp extends JFrame {
    
    private int value;
    
    public static void main(String[] args) {
        new CounterApp(0);
    }
    
    CounterApp(final int intialValue) {
        setTitle("Simple Counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 120);
        setLocationRelativeTo(null);
        
        Font font = new Font("Arial", Font.BOLD, 42);
        Font font1 = new Font("Arial", Font.BOLD, 24);
        
        value = intialValue;
        
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);
        
        counterValueView.setText(String.valueOf(value));
        
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(decrementButton, BorderLayout.WEST);
        
        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(incrementButton, BorderLayout.EAST);
        
        //Обнуление счетчика
        JButton resetButton = new JButton("rst");
        resetButton.setFont(font1);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value=0;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(resetButton, BorderLayout.SOUTH);
        
        
        setVisible(true);
    }
}