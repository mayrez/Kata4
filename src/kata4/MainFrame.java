package kata4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

    public MainFrame() {
        this.setTitle("Money Calculator");
        this.setMinimumSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createComponent();
        this.setVisible(true);
    }

    private void createComponent() {
        this.add(createContent());
        this.add(createToolbar(), BorderLayout.SOUTH);
    }
     private JPanel createContent() {
         JPanel panel = new JPanel();
         panel.add(new MoneyPanel());
         panel.add(new CurrencyPanel());
         return panel;
     }

    private JPanel createToolbar(){
        JPanel toolBar = new JPanel();
        toolBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
        toolBar.add(createCalculateButton());
        toolBar.add(createExitButton());
        return toolBar;
    }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new  ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
        return button;
    }

    private JButton createExitButton() {
        JButton button = new JButton("Exit");
             button.addActionListener(new  ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });

        return button;
    }
    private void calculate(){
        System.out.println("Calculating...");
    }
    private void exit(){
        dispose();
    }

   
   
}


