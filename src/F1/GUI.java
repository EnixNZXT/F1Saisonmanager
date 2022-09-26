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
    window.setTitle("F1 Crossplay Season Manager");
    window.setSize(1024,768);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setLocationRelativeTo(null);
    window.setResizable(true);

    //tab pane
    JTabbedPane tabbedOuterPane =new JTabbedPane();



// first tab

    JPanel firstPanel=new JPanel();
    GridLayout gridLayout=new GridLayout();
    firstPanel.setLayout(gridLayout);
    //stuff in tab
    JTabbedPane tabbedinnerPane=new JTabbedPane(JTabbedPane.LEFT);
    JLabel overviewLabel =new JLabel("Overview");
    overviewLabel.setPreferredSize(new Dimension(75,25));
    JTextArea overviewTextArea=new JTextArea();



    JPanel secondPanel=new JPanel();
    GridLayout gridLayout2=new GridLayout();
    secondPanel.setLayout(gridLayout2);

    JPanel thirdpanel=new JPanel();
    GridLayout gridLayout3=new GridLayout();
    thirdpanel.setLayout(gridLayout3);

    //add tab on tabpane

    tabbedOuterPane.add("2022",firstPanel);
    tabbedOuterPane.add("2023",secondPanel);
    tabbedOuterPane.add("2024",thirdpanel);



    //add tabpane on window
    window.add(tabbedOuterPane);
    window.setVisible(true);



}

    public static void main(String[] args) {
        GUI gui=new GUI();


    }
}
