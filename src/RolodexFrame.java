import javax.swing.*;
import java.awt.Font;
import java.util.ArrayList;

/**
 * Frame for the Rolodex project
 */
public class RolodexFrame extends JFrame {
    JLabel[] labels = new JLabel[4];
    JTextField[] txt_info = new JTextField[4];

    JButton save = new JButton("Save");
    JButton clear = new JButton("New");

    JButton saveChanges = new JButton("Save Changes");
    JButton delete = new JButton("Delete Contact");

    ArrayList<Person> people = new ArrayList<>();

    JList list = new JList<Person>();

    public RolodexFrame() {
        // FRAME SETUP -----------------------------------------
        super("Rolodex Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(750, 425);
        setLayout(null);

        setResizable(false);
        //------------------------------------------------------
        for (int i = 0; i < labels.length; i++) {
            if (i == 0) {
                labels[i] = new JLabel("First Name:");
                labels[i].setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                labels[i].setBounds(300, (i * 55) + 10, 200, 35);
                add(labels[i]);
            } else if (i == 1) {
                labels[i] = new JLabel("Last Name:");
                labels[i].setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                labels[i].setBounds(300, (i * 55) + 10, 200, 35);
                add(labels[i]);
            } else if (i == 2) {
                labels[i] = new JLabel("Phone Number: ");
                labels[i].setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                labels[i].setBounds(300, (i * 55) + 10, 200, 35);
                add(labels[i]);
            } else if (i == 3) {
                labels[i] = new JLabel("Address:");
                labels[i].setFont(new Font("Comic Sans MS", Font.BOLD, 20));
                labels[i].setBounds(300, (i * 55) + 10, 200, 35);
                add(labels[i]);
            }

        }
        for (int i = 0; i < labels.length; i++) {
            txt_info[i] = new JTextField("");
            txt_info[i].setFont(new Font("Comic Sans MS", Font.BOLD, 20));
            txt_info[i].setBounds(475, (i * 55) + 10, 250, 35);
            add(txt_info[i]);
        }

        save.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        save.setBounds(350, 250, 150, 35);
        add(save);

        clear.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        clear.setBounds(510, 250, 150, 35);
        add(clear);

        saveChanges.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        saveChanges.setBounds(350, 250, 150, 35);
        add(saveChanges);

        delete.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        delete.setBounds(510, 250, 150, 35);
        add(delete);

        list.setListData(people.toArray());

        list.setBounds(0, 0, 250, getHeight());
        add(list);

        save.addActionListener(e -> {
            people.add(new Person(txt_info[0].getText(), txt_info[1].getText(),
                    txt_info[2].getText(), txt_info[3].getText()));

            for (int i = 0; i < txt_info.length; i++) {
                txt_info[i].setText("");
            }

            list.setListData(people.toArray());
        });

        saveChanges.addActionListener(e -> {
            list.clearSelection();

            for (int i = 0; i < txt_info.length; i++) {
                txt_info[i].setText("");
            }

            save.setVisible(true);
            clear.setVisible(true);

            saveChanges.setVisible(false);
            delete.setVisible(false);
        });

        list.addListSelectionListener(e -> {
            if (list.getSelectedIndex() != -1) {
                for (int i = 0; i < txt_info.length; i++) {
                    if (i == 0) {
                        txt_info[i].setText(people.get(list.getSelectedIndex()).getFirstName());
                    } else if (i == 1) {
                        txt_info[i].setText(people.get(list.getSelectedIndex()).getLastName());
                    } else if (i == 2) {
                        txt_info[i].setText(people.get(list.getSelectedIndex()).getPhoneNumber());
                    } else if (i == 3) {
                        txt_info[i].setText(people.get(list.getSelectedIndex()).getAddress());
                    }
                }
                save.setVisible(false);
                clear.setVisible(false);

                saveChanges.setVisible(true);
                delete.setVisible(true);
            }


        });

        delete.addActionListener(e -> {
            if (list.getSelectedIndex() != -1) {
                for (int i = 0; i < txt_info.length; i++) {
                    txt_info[i].setText("");
                }

                save.setVisible(true);
                clear.setVisible(true);

                saveChanges.setVisible(false);
                delete.setVisible(false);

                people.remove(list.getSelectedIndex());
            }
            list.setListData(people.toArray());
        });

        setVisible(true);
        list.setListData(people.toArray());
    }
}
