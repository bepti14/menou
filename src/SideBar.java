import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SideBar extends JPanel implements ListSelectionListener {
    public static DefaultListModel data;
    JList list;
//    FsUtils fs;
//    ContentBox cbx;

    SideBar() {
        data = new DefaultListModel();
        data.addElement("pusty-plik.txt");
        data.addElement("plik2.txt");
        data.addElement("plik3.txt");
        data.addElement("komandosi.txt");
        data.addElement("zakrętka.txt");

        list = new JList(data);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        list.setSelectedIndex(2);
        list.setVisibleRowCount(4);
        list.addListSelectionListener(this);

        JScrollPane scrList = new JScrollPane(list);
        this.add(scrList);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {

    }
}
