import javax.swing.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        new MovingObject();

      }

    });

  }
}
