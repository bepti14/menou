import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Scanner;

public class FsUtils extends Component {
    private Path actualDirectory;
    private String actualFile;
    public boolean openDirectory(){ return true; };
    public void readDirectory(){};
    private JTextArea area;

    FsUtils(JTextArea area) {
        this.area = area;
    }

    public String getActiveFile() { return actualFile; }
    public void setActiveFile(String actualFile) { this.actualFile = actualFile; }
    public void saveFile(String name, String content){
        File file = new File(name);

        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(name);
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            System.out.println("Nie zapisano pliku");
        }
    }

    public void readFile(String name){
        File file = new File(name);
        StringBuilder out = new StringBuilder();

        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                out.append(reader.nextLine()).append("\n");
            }
            area.setText(out.toString());
        } catch (FileNotFoundException e) {
            System.out.println("Nie znaleziono pliku " + file.getAbsolutePath());
        }
    }
}
