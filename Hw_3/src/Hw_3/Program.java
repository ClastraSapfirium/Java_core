package Hw_3;

public class Program {
    public static void main(String[] args) {
        PhoneBook b1 = new PhoneBook();
        FileInFixer fit = new FileIn();
        fit.read(b1, "HW_5/Book1.txt");
        ConsoleOutFixer cop = new ConsoleOut();
        cop.write(b1);
        FileOutFixer fot = new FileOut("HW_5/Book2.txt");
        fot.write(b1);
    }
}