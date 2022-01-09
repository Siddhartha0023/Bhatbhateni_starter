package view.customer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.Customer;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {

    public Dashboard(Customer customer) {

        setTitle("Dashboard");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JLabel lblUsername = new JLabel("Welcome " + customer.getCustFname() + " " + customer.getCustLname());
        lblUsername.setFont(new Font("Arial", Font.BOLD, 20));
        lblUsername.setHorizontalAlignment(JLabel.CENTER);
        add(lblUsername, BorderLayout.NORTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}