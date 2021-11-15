import javax.swing.JLabel;

public class MouseClick {
  JLabel calibrateStatus;
  private int xPosition;
  private int yPosition;
  public MouseClick() {
    calibrateStatus = new JLabel("Uncalibrated");
    xPosition = 0;
    yPosition = 0;
  }
  
  public int getXPosition() {
    return xPosition;
  }
  
  public int getYPosition() {
    return yPosition;
  }
  
  public void setXPosition(int x) {
    xPosition = x;
  }
  
  public void setYPosition(int y) {
    yPosition = y;
  }
  
  
}
