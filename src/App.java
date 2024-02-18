import java.util.Scanner;

import javax.swing.SwingUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        File apiKeySrc = new File("src\\apiKey.txt");
        FileInputStream fis = new FileInputStream(apiKeySrc);

        Scanner scan = new Scanner(fis);
        String key = scan.nextLine();
        System.out.println(key);

        scan.close();

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VexUNow();
            } 
        });
    }
}
