import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Main() {
        setLayout(new BorderLayout()); // dupa
        setTitle("Main");

//        JPanel northPanel = new JPanel();
//        northPanel.setLayout(new BorderLayout());
//        add(northPanel, BorderLayout.CENTER);

        MainMenu mainMenu = new MainMenu(this);
        setJMenuBar(mainMenu);

        JTextArea area = new JTextArea();
        add(area, BorderLayout.CENTER);

        FsUtils fsUtils = new FsUtils(area);

        ToolBar toolBar = new ToolBar(fsUtils);
        add(toolBar, BorderLayout.NORTH);

        SideBar sideBar = new SideBar();
        add(sideBar, BorderLayout.WEST);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(600, 400));
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
