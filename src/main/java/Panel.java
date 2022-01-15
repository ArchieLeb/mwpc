import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel implements ActionListener {
    public JButton button = new JButton("Verstanden");

    public Panel() {
        Model Paneltexto = new Model();
        String InsertText = Paneltexto.getPaneltext();
        button.addActionListener(this);
        setLayout(new BorderLayout());
        add(new JLabel(InsertText), BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            if (button.getText() == "Verstanden") {
                button.setText("Sehr gut! Dann klicke um zu schließen");
                button.setEnabled(true);
            } else {
                button.setText("GoodBye");
                System.exit(0);
            }
        }
    }
}
