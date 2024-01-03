package bookrecordmanagement;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputForm {
    private Book [] bookarr;
    private int records = 0;
    private JFrame iframe, oframe;
    private JLabel id, tit, pri, auNa, puNa, bRM;
    private JTextField bookId, title, price, authorName, publisherName, status;
    private JButton submit, printData;
    private JTable dataTable;
    private void initComponents(){
        iframe = new JFrame("Book Record");
        iframe.setSize(350,350);
        iframe.setVisible(true);
        iframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        bRM =new JLabel("BOOK RECORD MANAGEMENT");
        id = new JLabel("Book ID: ");
        tit = new JLabel("Book Title: ");
        pri = new JLabel("Book Price: ");
        auNa = new JLabel("Author Name: ");
        puNa = new JLabel("Publisher Name: ");
        bookId = new JTextField("Id here");
        title = new JTextField("Title here");
        price = new JTextField("Price here");
        authorName = new JTextField("Author Name here");
        publisherName = new JTextField("Publisher Name here");
        status = new JTextField("Waiting to Submit...");
        submit = new JButton("Submit");
        printData = new JButton("Print Data");


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
        iframe.add(status);
        iframe.add(printData);



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
        submit.setBounds(50,170,100,30);
        printData.setBounds(170,170,100,30);
        status.setBounds(20,220,150,30);

        status.setEditable(false);



        submit.addActionListener(new Submit());
        printData.addActionListener(new PrintData());




    }
    public InputForm(){
        initComponents();
        bookarr = new Book[10];
    }
    class Submit implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            bookarr[records] = new Book();

            if (records == 9) {
                status.setForeground(Color.red);
                status.setText("Memory Full...");
                return;
            }
            bookarr[records].setBookId(Integer.parseInt(bookId.getText()));
            bookarr[records].setTitle(title.getText());
            bookarr[records].setPrice(Double.parseDouble(price.getText()));
            bookarr[records].setAuthorName(authorName.getText());
            bookarr[records].setPublisherName(publisherName.getText());
            status.setForeground(Color.green);
            status.setText("Data Saved...");
            if (records < 10) records++;
        }
    }
    class PrintData implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String [] columnNames = {"ID", "Title", "Price", "Author Name", "Publisher Name"};
            String [][] data = new String[records][5];
            for(int i = 0; i < records ; i++){
                data[i][0] = String.valueOf(bookarr[i].getBookId());
                data[i][1] = String.valueOf(bookarr[i].getTitle());
                data[i][2] = String.valueOf(bookarr[i].getPrice());
                data[i][3] = String.valueOf(bookarr[i].getAuthorName());
                data[i][4] = String.valueOf(bookarr[i].getPublisherName());
            }
            oframe = new JFrame();
            oframe.setSize(600,600);
            dataTable = new JTable(data,columnNames);
            dataTable.setBounds(30,40,200,300);
            JScrollPane sp = new JScrollPane(dataTable);
            oframe.add(sp);
            oframe.setVisible(true);
        }
    }
}
