import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Cross_feeld {
  private int[] feeldState;

  public Cross_feeld(int[] feeldState) {
    this.feeldState = feeldState;
  }


  public int encodefeeld() {
    int encodedfeeld = 0;
    for (int i = 0; i < feeldState.length; i++) {
      encodedfeeld = encodedfeeld << 2;
      encodedfeeld = encodedfeeld | feeldState[i];
    }
    return encodedfeeld;
  }

  public void decodefeeld(int encodedfeeld) {
    for (int i = feeldState.length - 1; i >= 0; i--) {
      int cellState = encodedfeeld & 3;
      encodedfeeld = encodedfeeld >> 2;
      feeldState[i] = cellState;
    }
  }

  public void writeToFile(String fileName) throws IOException {
    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
      dos.writeInt(encodefeeld());
    }
  }

  public void readFromFile(String fileName) throws IOException {
    try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
      int readfeeld = dis.readInt();
      decodefeeld(readfeeld);
    }
  }

  public void printfeeld() {
    for (int i = 0; i < feeldState.length; i++) {
      char cellSymbol;
      switch (feeldState[i]) {
        case 0:
          cellSymbol = '.';
          break;
        case 1:
          cellSymbol = 'x';
          break;
        case 2:
          cellSymbol = 'o';
          break;
        default:
          cellSymbol = '?';
          break;
      }
      System.out.print(cellSymbol + " ");
      if ((i + 1) % 3 == 0) {
        System.out.println();
      }
    }
  }
}