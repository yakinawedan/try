import javax.swing.*;
import java.awt.event.*;

public class MyApplication {

   public static void main(String[] args) {
      // Create JFrame object
      JFrame frame = new JFrame("My Application");

      // Create menu bar
      JMenuBar menuBar = new JMenuBar();

      // Create File menu
      JMenu fileMenu = new JMenu("File");
      fileMenu.setMnemonic(KeyEvent.VK_F);

      // Create Open menu item with icon
      ImageIcon openIcon = new ImageIcon("\"C:\\Users\\hp\\Downloads\\picture.png\"");
      JMenuItem openMenuItem = new JMenuItem("Open", openIcon);
      openMenuItem.setMnemonic(KeyEvent.VK_O);
      openMenuItem.setToolTipText("Open file");

      // Add action listener to open menu item
      openMenuItem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            // Todo: implement open file action
         }
      });

      // Create Exit menu item with icon
      ImageIcon exitIcon = new ImageIcon("exit.png");
      JMenuItem exitMenuItem = new JMenuItem("Exit", exitIcon);
      exitMenuItem.setMnemonic(KeyEvent.VK_X);
      exitMenuItem.setToolTipText("Exit application");

      // Add action listener to exit menu item
      exitMenuItem.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            System.exit(0);
         }
      });

      // Add menu items to File menu
      fileMenu.add(openMenuItem);
      fileMenu.add(exitMenuItem);

      // Add File menu to menu bar
      menuBar.add(fileMenu);

      // Set menu bar to the frame
      frame.setJMenuBar(menuBar);

      // Set frame properties
      frame.setSize(400, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}