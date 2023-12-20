import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToolBar extends JToolBar {
    ToolBar(FsUtils fsUtils) {
        JButton b1, b2, b3, b4;

        b1 = new JButton("Przeglądaj");
        b2 = new JButton("Otwórz");
        b3 = new JButton("Zapisz");
        b4 = new JButton("Wklej");

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b2.addActionListener(e -> {
            fsUtils.readFile("utils/savenfilen.txt");
        });

        b3.addActionListener(e -> {
            fsUtils.saveFile("utils/savenfilen.txt", "Zapisany tekst");
        });
    }
}
