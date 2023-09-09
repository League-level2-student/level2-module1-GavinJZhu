package _02_array_list_guestbook;

import java.awt.*;

public class GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
    Frame uiFrame;


    public static void main(String[] args) {
      new GuestBook().run();
    }
    public void run(){
        //create a frame
        createFrame();
        //create a panel, add to frame
        //create 2 buttons, add both to panel
        //display the frame

    }
    public void createFrame(){
        uiFrame = new Frame();
    }
    public void createPanel(){
        Panel panel = new Panel();
        uiFrame.add(panel);
    }
    public void createButtons(){

    }
    public void displayFrame(){

    }
}
