import javax.swing.JFrame;

/**
 * Frame for the Rolodex project
 */
public class RolodexFrame extends JFrame{
    public RolodexFrame() {
        // FRAME SETUP -----------------------------------------
        super("Rolodex Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 600);
        setLayout(null);

        setResizable(false);
        //------------------------------------------------------
    }
}
