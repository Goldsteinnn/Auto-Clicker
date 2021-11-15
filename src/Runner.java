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
    
    
    //Status reports on whether click is calibrated or not
    JLabel firstCaliStatus = new JLabel("Uncalibrated");
    JLabel secCaliStatus = new JLabel("Uncalibrated");
    JLabel thirdCaliStatus = new JLabel("Uncalibrated");
    JLabel fourthCaliStatus = new JLabel("Uncalibrated");
    JLabel fifthCaliStatus = new JLabel("Uncalibrated");
    JLabel sixthCaliStatus = new JLabel("Uncalibrated");
    
    //Buttons to adjust calibrations
    JButton firstCalibrate = new JButton("Calibrate");
    firstCalibrate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        OnCalibrateClick(firstCaliStatus);
        
      }
      
    });
    JButton secCalibrate = new JButton("Calibrate");
    secCalibrate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        OnCalibrateClick(secCaliStatus);
        
      }
      
    });
    JButton thirdCalibrate = new JButton("Calibrate");
    thirdCalibrate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        OnCalibrateClick(thirdCaliStatus);
        
      }
      
    });
    JButton fourthCalibrate = new JButton("Calibrate");
    fourthCalibrate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        OnCalibrateClick(fourthCaliStatus);
        
      }
      
    });
    JButton fifthCalibrate = new JButton("Calibrate");
    fifthCalibrate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        OnCalibrateClick(fifthCaliStatus);
        
      }
      
    });
    JButton sixthCalibrate = new JButton("Calibrate");
    sixthCalibrate.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        OnCalibrateClick(sixthCaliStatus);
        
      }
      
    });
    JButton start = new JButton("Start");
    JButton reset = new JButton("Reset");
    reset.addActionListener(new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
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
    JLabel firstWaitLabel = new JLabel("Wait(Seconds)");
    JLabel secWaitLabel = new JLabel("Wait(Seconds)");
    JLabel thirdWaitLabel = new JLabel("Wait(Seconds)");
    JLabel fourthWaitLabel = new JLabel("Wait(Seconds)");
    JLabel fifthWaitLabel = new JLabel("Wait(Seconds)");
    JLabel sixthWaitLabel = new JLabel("Wait(Seconds)");
    
    //Sets up duration between current mouse click and next mouse click
    JTextField firstWait = new JTextField();
    JTextField secWait = new JTextField();
    JTextField thirdWait = new JTextField();
    JTextField fourthWait = new JTextField();
    JTextField fifthWait = new JTextField();
    JTextField sixthWait = new JTextField();
    
    
    //Sets up the "look" of the GUI
    layout.setHorizontalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(firstCaliStatus)
            .addComponent(secCaliStatus)
            .addComponent(thirdCaliStatus)
            .addComponent(fourthCaliStatus)
            .addComponent(fifthCaliStatus)
            .addComponent(sixthCaliStatus))
        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(firstCaliStatus)
            .addComponent(secCaliStatus)
            .addComponent(thirdCaliStatus)
            .addComponent(fourthCaliStatus)
            .addComponent(fifthCaliStatus)
            .addComponent(sixthCaliStatus))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(firstCalibrate)
            .addComponent(secCalibrate)
            .addComponent(thirdCalibrate)
            .addComponent(fourthCalibrate)
            .addComponent(fifthCalibrate)
            .addComponent(sixthCalibrate)
            .addComponent(start))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addComponent(firstWaitLabel)
              .addComponent(secWaitLabel)
              .addComponent(thirdWaitLabel)
              .addComponent(fourthWaitLabel)
              .addComponent(fifthWaitLabel)
              .addComponent(sixthWaitLabel))
              .addComponent(help)
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addComponent(firstWait)
              .addComponent(secWait)
              .addComponent(thirdWait)
              .addComponent(fourthWait)
              .addComponent(fifthWait)
              .addComponent(sixthWait)
              .addComponent(reset))
          
                
    );
    
    layout.setVerticalGroup(
        layout.createSequentialGroup()
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(firstCaliStatus)
              .addComponent(firstCalibrate)
              .addComponent(firstWaitLabel)
              .addComponent(firstWait))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(secCaliStatus)
              .addComponent(secCalibrate)
              .addComponent(secWaitLabel)
              .addComponent(secWait))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(thirdCaliStatus)
              .addComponent(thirdCalibrate)
              .addComponent(thirdWaitLabel)
              .addComponent(thirdWait))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(fourthCaliStatus)
              .addComponent(fourthCalibrate)
              .addComponent(fourthWaitLabel)
              .addComponent(fourthWait))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(fifthCaliStatus)
              .addComponent(fifthCalibrate)
              .addComponent(fifthWaitLabel)
              .addComponent(fifthWait))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(sixthCaliStatus)
              .addComponent(sixthCalibrate)
              .addComponent(sixthWaitLabel)
              .addComponent(sixthWait))
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
  static void OnCalibrateClick(JLabel label) {
    label.setText("Calibrated");
  }
}
