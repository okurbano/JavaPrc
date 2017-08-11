package swings.myevents;

import java.awt.*;
import java.awt.event.*;

public class AwtListenerDemo {
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public AwtListenerDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      AwtListenerDemo  awtListenerDemo = new AwtListenerDemo();  
      awtListenerDemo.showMouseListenerDemo();
   }

   private void prepareGUI(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
   
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   private void showMouseListenerDemo(){
      headerLabel.setText("Listener in action: MouseListener");      

      Panel panel = new Panel();      
      panel.setBackground(Color.magenta);
      panel.setLayout(new FlowLayout());        
      panel.addMouseListener(new CustomMouseListener());

      Label msglabel = new Label();
      msglabel.setAlignment(Label.CENTER);
      msglabel.setText("Welcome to TutorialsPoint AWT Tutorial.");

      msglabel.addMouseListener(new CustomMouseListener());
      panel.add(msglabel);

      controlPanel.add(panel);

      mainFrame.setVisible(true);  
   }

   class CustomMouseListener implements MouseListener{

      public void mouseClicked(MouseEvent e) {
         statusLabel.setText("Mouse Clicked: ("
         +e.getX()+", "+e.getY() +")");
      }   

      public void mousePressed(MouseEvent e) {
    	  statusLabel.setText("Mouse Pressed: ("
    		         +e.getX()+", "+e.getY() +")");
      }

      public void mouseReleased(MouseEvent e) {
    	  statusLabel.setText("Mouse Released: ("
    		         +e.getX()+", "+e.getY() +")");
      }

      public void mouseEntered(MouseEvent e) {
    	  statusLabel.setText("Mouse Entered: ("
    		         +e.getX()+", "+e.getY() +")");
      }

      public void mouseExited(MouseEvent e) {
    	  statusLabel.setText("Mouse Existed: ("
    		         +e.getX()+", "+e.getY() +")");
      }
   }
}