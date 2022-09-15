package F1;

import javax.swing.*;

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

    //add add button
    JButton addButton =new JButton("+");
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
