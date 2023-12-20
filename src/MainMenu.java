import javax.swing.*;
import java.awt.*;

public class MainMenu extends JMenuBar {
    MainMenu(Main frame) {
        JMenu menu, submenu;
        JMenuItem mi1, mi2, mi4, si1, si2;

        menu = new JMenu("Plik");

        mi1 = new JMenuItem("Otwórz");
        mi2 = new JMenuItem("Zapisz");
        submenu = new JMenu("Submenu");
        mi4 = new JMenuItem("Wyjdź");

        si1 = new JMenuItem("Opcja1");
        si2 = new JMenuItem("Opcja2");

        submenu.add(si1);
        submenu.add(si2);

        menu.add(mi1);
        menu.add(mi2);
        menu.add(submenu);
        menu.add(mi4);

        add(menu);

//        mi1.addActionListener(e -> {
//            panel.setBackground(Color.CYAN);
//        });
//
//        mi2.addActionListener(e -> {
//            panel.setBackground(Color.GREEN);
//        });
//
//        mi4.addActionListener(e -> {
//            frame.dispose();
//        });
//
//        si1.addActionListener(e -> {
//            panel.setBackground(Color.RED);
//        });
//
//        si2.addActionListener(e -> {
//            panel.setBackground(Color.MAGENTA);
//        });
    }
}
