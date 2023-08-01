import java.io.IOException;

public class App {
  public static void main(String[] args) {
    int[] initialState = {3, 0, 2, 1, 0, 2, 1, 2, 0};
    Cross_feeld gameBoard = new Cross_feeld(initialState);

    try {
      gameBoard.writeToFile("Cross_feeld.bin");
      gameBoard.readFromFile("Cross_feeld.bin");
    } catch (IOException e) {
      e.printStackTrace();
    }

    gameBoard.printfeeld();
  }
}