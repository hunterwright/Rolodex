import javax.swing.*;
import java.awt.Font;

/**
 * Frame for the Rolodex project
 */
public class RolodexFrame extends JFrame {
    JLabel[] labels = new JLabel[4];

    JList list = new JList<String>();

    public RolodexFrame() {
        // FRAME SETUP -----------------------------------------
        super("Rolodex Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 425);
        setLayout(null);

        setResizable(false);
        //------------------------------------------------------
        for (int i = 0; i < labels.length; i++) {
            if(i == 0) {
                labels[i] = new JLabel("First Name:");
                labels[i].setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                labels[i].setBounds(200,10,200,35);
                add(labels[i]);
            }
        }


        list.setBounds(0,0,200,100);

        setVisible(true);
    }
}
