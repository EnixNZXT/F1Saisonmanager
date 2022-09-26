package F1;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    JFrame window;
    JTabbedPane tabbedOuterPane;
    JTabbedPane tabbedInnerPane;
    JLabel tabTitelLabel;
    JLabel overviewLabel,driverLabel,teamLabel,trackLabel;
    JTextArea overviewTextArea,teamTextArea, trackTextArea;
    int count;
public GUI() {
    //window
    window = new JFrame();
    window.setTitle("F1 Crossplay Season Manager");
    window.setSize(1024, 768);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setLocationRelativeTo(null);
    window.setResizable(true);

    //tab pane
    tabbedOuterPane = new JTabbedPane();
    count=2022;
    do {

        InnerTab(count);
        count++;
    }while (count<=2030);
    window.setVisible(true);
}

public void InnerTab(int count){

    tabbedInnerPane = new JTabbedPane(JTabbedPane.LEFT);
    overviewLabel = new JLabel("Overview");
    overviewLabel.setPreferredSize(new Dimension(75, 25));
    overviewTextArea = new JTextArea();
    driverLabel = new JLabel("Driver");
    driverLabel.setPreferredSize(new Dimension(75, 25));
    teamLabel = new JLabel("Teams");
    teamLabel.setPreferredSize(new Dimension(75, 25));
    teamTextArea = new JTextArea();
    trackLabel = new JLabel("Tracks");
    trackLabel.setPreferredSize(new Dimension(75, 25));
    trackTextArea = new JTextArea();

    tabbedInnerPane.addTab("", overviewTextArea);
    tabbedInnerPane.setTabComponentAt(tabbedInnerPane.getTabCount() - 1, overviewLabel);
    tabbedInnerPane.setTabComponentAt(tabbedInnerPane.getTabCount() - 1, driverLabel);
    tabbedInnerPane.addTab("", teamTextArea);
    tabbedInnerPane.setTabComponentAt(tabbedInnerPane.getTabCount() - 1, teamLabel);
    tabbedInnerPane.addTab("", trackTextArea);
    tabbedInnerPane.setTabComponentAt(tabbedInnerPane.getTabCount() - 1, trackLabel);

    tabbedOuterPane.addTab(String.valueOf(count), tabbedInnerPane);
    tabbedOuterPane.setTabComponentAt(tabbedOuterPane.getTabCount() - 1, tabTitelLabel);
    window.add(tabbedOuterPane);
}
public static void main(String[] args) {
        GUI gui=new GUI();
    }
}
