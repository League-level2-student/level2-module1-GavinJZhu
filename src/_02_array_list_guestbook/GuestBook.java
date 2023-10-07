package _02_array_list_guestbook;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuestBook implements ActionListener {
    // Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
    // When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
    // that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
    // all the names added to the list. Format the list as follows:
    // Guest #1: Bob Banders
    // Guest #2: Sandy Summers
    // Guest #3: Greg Ganders
    // Guest #4: Donny Doners
    Frame uiFrame;
    Button button1;
    Button button2;
    Panel panel;
    ArrayList<String> names = new ArrayList();

    public static void main(String[] args) {
        new GuestBook().run();
    }

    public void run() {
        //create a frame
        createFrame();
        //create a panel, add to frame
        //create 2 buttons, add both to panel
        //display the frame
        uiFrame.setVisible(true);
        createPanel();
        createButtons();
        uiFrame.pack();
        button1.addActionListener(this);
        button2.addActionListener(this);
        names.add("Guest #1: Bob Banders");
        names.add("Guest #2: Sandy Summers");
        names.add("Guest #3: Greg Ganders");
        names.add("Guest #4: Donny Doners");
    }

    public void createFrame() {
        uiFrame = new Frame();
    }

    public void createPanel() {
        panel = new Panel();
        uiFrame.add(panel);
    }

    public void createButtons() {
        button1 = new Button();
        button2 = new Button();
        panel.add(button1);
        panel.add(button2);
        button1.setLabel("Add name");
        button2.setLabel("View names");
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(button1)) {
            //retrieve/create strings of names
            //names = arraylist
            String nameAdd = JOptionPane.showInputDialog(null, "Add a name to the guest book!");
            int size = names.size() + 1;
            names.add("Guest #" + size + ": " + nameAdd);
        } else if (e.getSource().equals(button2)) {
            //display all names, vertically
            // Create String.  lineOfNames
            String lineOfNames = "";
            // Create for loop, iterate/loop all items in names
            for(int ith=0; ith<names.size(); ith++){
                //gets string from names
                String temp = names.get(ith);
                //build lineOfNames by adding a new name
                lineOfNames = lineOfNames + temp + "\n";
                //System.out.println(lineOfNames);

            }
            JOptionPane.showMessageDialog(null, lineOfNames);

        }
    }
}
