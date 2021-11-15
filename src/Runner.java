import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
    JButton secCalibrate = new JButton("Calibrate");
    JButton thirdCalibrate = new JButton("Calibrate");
    JButton fourthCalibrate = new JButton("Calibrate");
    JButton fifthCalibrate = new JButton("Calibrate");
    JButton sixthCalibrate = new JButton("Calibrate");
    
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
            .addComponent(firstCalibrate)
            .addComponent(secCalibrate)
            .addComponent(thirdCalibrate)
            .addComponent(fourthCalibrate)
            .addComponent(fifthCalibrate)
            .addComponent(sixthCalibrate))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
              .addComponent(firstWait)
              .addComponent(secWait)
              .addComponent(thirdWait)
              .addComponent(fourthWait)
              .addComponent(fifthWait)
              .addComponent(sixthWait))
          
             
                  
 
              
              
    );
    
    layout.setVerticalGroup(
        layout.createSequentialGroup()
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(firstCaliStatus)
              .addComponent(firstCalibrate)
              .addComponent(firstWait))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(secCaliStatus)
              .addComponent(secCalibrate)
              .addComponent(secWait))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(thirdCaliStatus)
              .addComponent(thirdCalibrate)
              .addComponent(thirdWait))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(fourthCaliStatus)
              .addComponent(fourthCalibrate)
              .addComponent(fourthWait))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(fifthCaliStatus)
              .addComponent(fifthCalibrate)
              .addComponent(fifthWait))
          .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
              .addComponent(sixthCaliStatus)
              .addComponent(sixthCalibrate)
              .addComponent(sixthWait))
    );
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 300);
    frame.getContentPane().add(panel);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}
