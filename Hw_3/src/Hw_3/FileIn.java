package Hw_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIn implements FileInFixer {

    @Override
    public void read(PhoneBook b, String pt) {
        List<String> dt = new ArrayList<>();
        try {
            dt = Files.readAllLines(Paths.get(pt));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        for (String item : dt) {
            String [] nms = item.split(":");
            Contact ct = new Contact(nms[1],nms[0]);
            b.updateContact(ct);
        }
    }
}