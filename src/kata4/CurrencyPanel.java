package kata4;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class CurrencyPanel extends JPanel {
  private String[] currencies= {"EUR", "USD","GBR","CAD"};
    public CurrencyPanel() {
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(createCombo());
    }

    private JComboBox createCombo() {
        JComboBox combo =new JComboBox(currencies);
        return combo;
    }
    
}
