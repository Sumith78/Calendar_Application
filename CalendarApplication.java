import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CalendarApplication  extends JFrame{
    private List<Event> events =new ArrayList<>();
    private JList<Event> eventList;
    private DefaultListModel<Event> listModel;
    private JButton addButton , editButton , deleteButton;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
        new CalendarApplication().setVisible(true));
    }
    public CalendarApplication(){
        setTitle("Calendar Application");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents(){
        listModel=new DefaultListModel<>();
        eventList=new JList<>(listModel);
        addButton=new JButton("Add Event");
        editButton=new JButton("Edit Event");   
        deleteButton=new JButton("Delete Event");


        setLayout(new BorderLayout());
    }
}