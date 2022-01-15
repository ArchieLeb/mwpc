import javax.swing.*;
import java.awt.*;

public class Main  {

    public static void main(String[] args) {
        Model begruessung = new Model();
        System.out.println(begruessung.gethi());

        JFrame hibox = new JFrame("Willkommen, willkommen");
        hibox.setSize(350,350);
        hibox.setLocationRelativeTo(null);
        hibox.add(new Panel(), BorderLayout.CENTER);
        hibox.setVisible(true);

    }
}


