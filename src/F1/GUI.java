package F1;

import org.json.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;


public class GUI extends JFrame {
    JFrame window;
    JTabbedPane tabbedOuterPane;
    JTabbedPane tabbedInnerPane;
    JLabel tabTitelLabel;
    JTable driverTable;
    JScrollPane driverPane;
    JLabel overviewLabel,driverLabel,teamLabel,trackLabel;
    JTextArea overviewTextArea,teamTextArea, trackTextArea;
    JSONArray Array;
    int count;
    String driverText;
    String[] driverText2;

    String data[][]={
            {"Lewis Hamilton", "Mercedes","44","0"},
            {"George Russel", "Mercedes","63","0"},
            {"Charles Leclerc", "Ferrari","16","0"},
            {"Carlos Sainz", "Ferrari","55","0"},
            {"George Russel", "Mercedes","63","0"},
            {"Charles Leclerc", "Ferrari","16","0"},
            {"Carlos Sainz", "Ferrari","55","0"},
            {"George Russel", "Mercedes","63","0"},
            {"Charles Leclerc", "Ferrari","16","0"},
            {"Carlos Sainz", "Ferrari","55","0"},
            {"Lewis Hamilton", "Mercedes","44","0"},
            {"George Russel", "Mercedes","63","0"},
            {"Charles Leclerc", "Ferrari","16","0"},
            {"Carlos Sainz", "Ferrari","55","0"},
            {"George Russel", "Mercedes","63","0"},
            {"Charles Leclerc", "Ferrari","16","0"},
            {"Carlos Sainz", "Ferrari","55","0"},
            {"George Russel", "Mercedes","63","0"},
            {"Charles Leclerc", "Ferrari","16","0"},
            {"Carlos Sainz", "Ferrari","55","0"},

    };
    String column[]={"Name","Team","Fahrernummer","Fahrerpunkte"};

public GUI() throws IOException {
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
    ReadJson();
    do {

        InnerTab(count);
        count++;
    }while (count<=2030);
    window.setVisible(true);
    WriteJson();

}

public void InnerTab(int count){

    tabbedInnerPane = new JTabbedPane(JTabbedPane.LEFT);

    overviewLabel = new JLabel("Overview");
    overviewLabel.setPreferredSize(new Dimension(75, 25));
    overviewTextArea = new JTextArea();

    driverLabel = new JLabel("Driver");
    driverLabel.setPreferredSize(new Dimension(75, 25));

    driverTable = new JTable(data,column);
    driverPane = new JScrollPane(driverTable);


    teamLabel = new JLabel("Teams");
    teamLabel.setPreferredSize(new Dimension(75, 25));
    teamTextArea = new JTextArea();
    trackLabel = new JLabel("Tracks");
    trackLabel.setPreferredSize(new Dimension(75, 25));
    trackTextArea = new JTextArea();

    tabbedInnerPane.addTab("", overviewTextArea);
    tabbedInnerPane.setTabComponentAt(tabbedInnerPane.getTabCount() - 1, overviewLabel);
    tabbedInnerPane.addTab("",driverPane);
    tabbedInnerPane.setTabComponentAt(tabbedInnerPane.getTabCount() - 1, driverLabel);

    tabbedInnerPane.addTab("", teamTextArea);
    tabbedInnerPane.setTabComponentAt(tabbedInnerPane.getTabCount() - 1, teamLabel);
    tabbedInnerPane.addTab("", trackTextArea);
    tabbedInnerPane.setTabComponentAt(tabbedInnerPane.getTabCount() - 1, trackLabel);

    tabbedOuterPane.addTab(String.valueOf(count), tabbedInnerPane);
    tabbedOuterPane.setTabComponentAt(tabbedOuterPane.getTabCount() - 1, tabTitelLabel);
    window.add(tabbedOuterPane);
}
    public void ReadJson() throws IOException {
        String filePath = "src/F1/driver.json";
        BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath));
        String json;
        while ((json=bufferedReader.readLine())!=null){
            driverText+=json;
        }
        bufferedReader.close();
        String[] ary=driverText.split("[{,:}]");
        int i=0;
        System.out.println(ary[0]);
        System.out.println(ary[1]);
        System.out.println(ary[2]);

        System.out.println(ary[9]);
        System.out.println(ary[8]);
        System.out.println(ary[10]);
        System.out.println(ary[11]);






    }
public void WriteJson(){
    String filePath = "src/F1/driver.json";
    JSONArray arr = new JSONArray();
    try(FileWriter fw = new FileWriter(filePath)){
        boolean firstRow=true;
        fw.write("[");
        for (int i = 0; i < driverTable.getRowCount(); i++) {
            JSONObject jsonObj = new JSONObject();
            for (int j = 0; j < driverTable.getColumnCount(); j++) {
                Object value = driverTable.getValueAt(i, j);
                String columnName = driverTable.getColumnName(j);
                jsonObj.put(columnName,value);
            }
            fw.write(firstRow ? jsonObj.toString() : ("," + jsonObj.toString()));
            firstRow = false;
        }
        fw.write("]");
    } catch (IOException e1) {
        e1.printStackTrace();
    }
}


public static void main(String[] args) throws IOException {
        GUI gui=new GUI();
    }
}
