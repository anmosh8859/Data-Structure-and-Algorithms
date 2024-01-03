package bookrecordmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class InputFormJDBC {
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    String s;

    private JFrame iframe, oframe;
    private JLabel id, tit, pri, auNa, puNa, bRM, status;
    private JTextField bookId, title, price, authorName, publisherName;
    private JButton submit, print;
    private JTable dataTable;
    private void initComponents(){
        iframe = new JFrame("Book Record");
        iframe.setLayout(null);
        iframe.setSize(350,350);
        iframe.setVisible(true);
        iframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        bRM =new JLabel("BOOK RECORD MANAGEMENT");
        id = new JLabel("Book ID: ");
        tit = new JLabel("Book Title: ");
        pri = new JLabel("Book Price: ");
        auNa = new JLabel("Author Name: ");
        puNa = new JLabel("Publisher Name: ");
        bookId = new JTextField();
        title = new JTextField();
        price = new JTextField();
        authorName = new JTextField();
        publisherName = new JTextField();
        status = new JLabel("Connecting to Database...");
        submit = new JButton("Submit");
        print = new JButton("Print Data");


        iframe.add(bRM);
        iframe.add(id);
        iframe.add(bookId);
        iframe.add(tit);
        iframe.add(title);
        iframe.add(pri);
        iframe.add(price);
        iframe.add(auNa);
        iframe.add(authorName);
        iframe.add(puNa);
        iframe.add(publisherName);
        iframe.add(submit);
        iframe.add(print);
        iframe.add(status);



        bRM.setBounds(70,10,300,40);
        id.setBounds(20,50,100,20);
        bookId.setBounds(150,50,150,20);
        tit.setBounds(20,70,100,20);
        title.setBounds(150,70,150,20);
        pri.setBounds(20,90,100,20);
        price.setBounds(150,90,150,20);
        auNa.setBounds(20,110,100,20);
        authorName.setBounds(150,110,150,20);
        puNa.setBounds(20,130,100,20);
        publisherName.setBounds(150,130,150,20);
        submit.setBounds(30,170,100,30);
        print.setBounds(170,170,100,30);
        status.setBounds(20,220,150,30);



        submit.addActionListener(new InputFormJDBC.Submit());
        print.addActionListener(new InputFormJDBC.PrintData());




    }
    public InputFormJDBC(){
        initComponents();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","admin@123");
            s = "USE db1";
            ps = con.prepareStatement(s);

            if(con!=null){
                status.setForeground(Color.orange);
                status.setText("Database connected...");
                return;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    class Submit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            String id = bookId.getText();
            String pri = price.getText();
            String [] ids = new String[20];

            try {
                int currid = Integer.parseInt(id);
                double currpri = Double.parseDouble(pri);
            } catch (NumberFormatException nfm){
                status.setForeground(Color.red);
                status.setText("Id or Price are not number...");
                return;
            }

            try {

                s = "SELECT * from Book";
                ps = con.prepareStatement(s);
                rs = ps.executeQuery();
                int i = 0;
                while(rs.next()){
                    ids[i] = String.valueOf(rs.getInt(1));
                    i++;
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            if(ids[0]!=null){
                int i = 0;
                while(ids[i]!=null) {
                    System.out.println(ids[0]);
                    int d1 = Integer.parseInt(id);
                    int d2 = Integer.parseInt(ids[i]);
                    if (d1 == d2) {
                        status.setForeground(Color.red);
                        status.setText("BookID already exist...");
                        return;
                    }
                    i++;
                }
            }

//            s = "INSERT INTO book"+
//                    "(BookId, title, price, author, publisher)" +
//                    "values (" +
//                    id +","+
//                    "'" + title.getText() + "'," +
//                    pri + "," +
//                    "'"+ authorName.getText() +"',"+
//                    "'" + publisherName.getText() +
//                    "')";

            s = "INSERT INTO book (bookid, title,price, author,publisher) VALUES (?,?,?,?,?)";

            try {

                ps = con.prepareStatement(s);
                ps.setInt(1,Integer.parseInt(id));
                ps.setString(2,title.getText());
                ps.setDouble(3,Double.parseDouble(pri));
                ps.setString(4,authorName.getText());
                ps.setString(5,publisherName.getText());

                if(!ps.execute()) {
                    status.setForeground(Color.green);
                    status.setText("Data Saved...");

                    bookId.setText("");
                    title.setText("");
                    price.setText("");
                    authorName.setText("");
                    publisherName.setText("");


                } else {
                    status.setForeground(Color.red);
                    status.setText("Data Not Saved...");
                }


            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    class PrintData implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String [] columnNames = {"ID", "Title", "Price", "Author Name", "Publisher Name"};
            String [][] data = new String[20][5];

            try {

                s = "SELECT * from Book";
                ps = con.prepareStatement(s);
                rs = ps.executeQuery();
                int i = 0;
                while(rs.next()){
                    data[i][0] = String.valueOf(rs.getInt(1));
                    data[i][1] = String.valueOf(rs.getString(2));
                    data[i][2] = String.valueOf(rs.getDouble(3));
                    data[i][3] = String.valueOf(rs.getString(4));
                    data[i][4] = String.valueOf(rs.getString(5));
                    i++;
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

            oframe = new JFrame("Data referred to Database db1 : book");
            oframe.setVisible(true);
            oframe.setSize(600,600);
            dataTable = new JTable(data,columnNames);
            dataTable.setBounds(30,40,200,300);
            JScrollPane sp = new JScrollPane(dataTable);
            oframe.add(sp);
        }
    }
}