import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Runner {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Auto Clicker");
    JPanel panel = new JPanel();
    GroupLayout layout = new GroupLayout(panel);
    panel.setLayout(layout);
    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);
    
    MouseClick[] mc = new MouseClick[6];
    for(int i = 0; i < mc.length; i++) {
      mc[i] = new MouseClick();
    }
    
    
    //Status reports on whether click is calibrated or not
    JLabel caliStatus[] = new JLabel[6];
    for(int i = 0; i < caliStatus.length; i++) {
      caliStatus[i] = mc[i].calibrateStatus;
    }
    
    //Buttons to adjust calibrations
    JButton calibrate[] = new JButton[6];
    for(int i = 0; i < calibrate.length;i++) {
      calibrate[i] = new JButton("Calibrate");
    }
    JButton start = new JButton("Start");
    JButton reset = new JButton("Reset");
    reset.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        resetSetting(mc);
      }
      
    });
    JButton help = new JButton("Help");
    help.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        JOptionPane.showMessageDialog(frame,"To start program press calibrate, hover over desired location then preform mouse click"
            + "\nRepeat for any amount of mouse clicks needed. Uncalibrated mouse clicks will not be used"
            + "\nAlong with setting up mouse clicks, set up delay between by entering the amount of time between clicks"
            + "\nAfter all settings are completed press start to start program"
            + "\nTo end program at any point press esc key to terminate");
        
      }
      
    });
    
    
    //Labels displaying what following explaining what following visuals do
    JLabel waitLabel[] = new JLabel[6];
    for(int i = 0; i < waitLabel.length; i++) {
      waitLabel[i] = new JLabel("Wait(Seconds)");
    }
    
    //Sets up duration between current mouse click and next mouse click
    JTextField wait[] = new JTextField[6];
    for(int i = 0; i < wait.length;i++) {
      wait[i] = new JTextField();
    }
    
    
    //Sets up the "look" of the GUI
    layout.setHorizontalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(caliStatus[0])
            .addComponent(caliStatus[1])
            .addComponent(caliStatus[2])
            .addComponent(caliStatus[3])
            .addComponent(caliStatus[4])
            .addComponent(caliStatus[5]))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(calibrate[0])
            .addComponent(calibrate[1])
            .addComponent(calibrate[2])
            .addComponent(calibrate[3])
            .addComponent(calibrate[4])
            .addComponent(calibrate[5])
            .addComponent(start))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addComponent(waitLabel[0])
              .addComponent(waitLabel[1])
              .addComponent(waitLabel[2])
              .addComponent(waitLabel[3])
              .addComponent(waitLabel[4])
              .addComponent(waitLabel[5]))
              .addComponent(help)
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addComponent(wait[0])
              .addComponent(wait[1])
              .addComponent(wait[2])
              .addComponent(wait[3])
              .addComponent(wait[4])
              .addComponent(wait[5])
              .addComponent(reset))
          
                
    );
    
    layout.setVerticalGroup(
        layout.createSequentialGroup()
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(caliStatus[0])
              .addComponent(calibrate[0])
              .addComponent(waitLabel[0])
              .addComponent(wait[0]))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(caliStatus[1])
              .addComponent(calibrate[1])
              .addComponent(waitLabel[1])
              .addComponent(wait[1]))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(caliStatus[2])
              .addComponent(calibrate[2])
              .addComponent(waitLabel[2])
              .addComponent(wait[2]))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(caliStatus[3])
              .addComponent(calibrate[3])
              .addComponent(waitLabel[3])
              .addComponent(wait[3]))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(caliStatus[4])
              .addComponent(calibrate[4])
              .addComponent(waitLabel[4])
              .addComponent(wait[4]))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(caliStatus[5])
              .addComponent(calibrate[5])
              .addComponent(waitLabel[5])
              .addComponent(wait[5]))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addComponent(start)
              .addComponent(help)
              .addComponent(reset))
    );
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(600, 280);
    frame.getContentPane().add(panel);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  static void OnCalibrateClick(MouseClick mc) {
    mc.calibrateStatus.setText("Calibrated");
  }
  
  static void resetSetting(MouseClick mc[]) {
    for(int i = 0; i < mc.length; i++) {
      mc[i].setXPosition(0);
      mc[i].setYPosition(0);
      mc[i].calibrateStatus.setText("Uncalibrated");
    }
    
  }
  
  static void startProgram() {
    
  }
}
