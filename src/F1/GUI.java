package F1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI extends JFrame {

public GUI(){
    //window
    JFrame window =new JFrame();
    setTitle("F1");
    window.setSize(1024,768);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setLocationRelativeTo(null);
    window.setResizable(true);

    //tab pane
    JTabbedPane tabbedPane=new JTabbedPane();
//_______________________________________________first test_____________________________________________________________
/*
// first tab

    JPanel firstPanel=new JPanel();
    GridLayout gridLayout=new GridLayout();
    firstPanel.setLayout(gridLayout);
    //stuff in tab
    JTextArea  jTextArea=new JTextArea();
    firstPanel.add(jTextArea);

    JPanel secondPanel=new JPanel();
    GridLayout gridLayout2=new GridLayout();
    secondPanel.setLayout(gridLayout2);

    JPanel thirdpanel=new JPanel();
    GridLayout gridLayout3=new GridLayout();
    thirdpanel.setLayout(gridLayout3);

    //add tab on tabpane

    tabbedPane.add("2022",firstPanel);
    tabbedPane.add("2023",secondPanel);
    tabbedPane.add("2024",thirdpanel);
*/
//_____________________________________________end first test___________________________________________________________
    //setting up to make a add and remove tab bar, starting with making it not focusable

    tabbedPane.setFocusable(false);

    //after adding the + button: we could need a delete tab function, so we add a mouse listener for that
    //decided to choose to press the right mouse button to enter a popup sub menue for a delete func.

    tabbedPane.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            //need a if to have the function only on the right button
            if(SwingUtilities.isRightMouseButton(e)) {

                int index = tabbedPane.getSelectedIndex();

                //safe the add button from delete
                if (index != 0) {
                    JPopupMenu popupMenu = new JPopupMenu();
                    JMenuItem delete = new JMenuItem("Delete");
                    delete.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            tabbedPane.remove(index);
                        }
                    });
                    popupMenu.add(delete);
                    popupMenu.show(window, e.getX(), e.getY());
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    });




    //create button +
    JButton addButton =new JButton("+");
    //style
    addButton.setBorder(null);
    addButton.setFocusPainted(false);
    addButton.setContentAreaFilled(false);
    addButton.setPreferredSize(new Dimension(25,25));
    //set action listener
    addButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            //edit and set input dialog
            UIManager.put("OptionPane.okButtonText","Ok");
            UIManager.put("OptionPane.cancelButtonText","Cancel");
            String tabName = JOptionPane.showInputDialog(null,"Please Enter Season Name","NEW SEASON", JOptionPane.INFORMATION_MESSAGE);
            //shitty if function for cancel i like
            if (tabName!=null){
                JLabel tabTitelLabel =new JLabel(tabName);
                JTextArea textArea =new JTextArea();

                tabbedPane.addTab(tabName,textArea);
                tabbedPane.setTabComponentAt(tabbedPane.getTabCount()-1,tabTitelLabel);
            }
        }
    });



    //add add button
    tabbedPane.addTab("",null);
    tabbedPane.setTabComponentAt(0,addButton);



    //add tabpane on window
    window.add(tabbedPane);
    window.setVisible(true);



}

    public static void main(String[] args) {
        GUI gui=new GUI();


    }
}