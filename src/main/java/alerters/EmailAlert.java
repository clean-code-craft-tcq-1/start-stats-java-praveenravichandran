package alerters;

public class EmailAlert implements IAlerter {
  
  public boolean emailSent = false;

  @Override
  public void alert() {
    // TODO Auto-generated method stub
    emailSent = true;
  }

}
