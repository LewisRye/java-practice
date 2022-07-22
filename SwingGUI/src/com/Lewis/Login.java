package com.Lewis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener
{
    private JFrame frame;
    private JPanel panel;

    public static void main(String[] args)
    {
        new Login();
    }

    public Login()
    {
        panel = new JPanel();
        frame = new JFrame();
        frame.setSize(290,155);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel lblUser = new JLabel("Username:");
        lblUser.setBounds(10,20,80,25);
        panel.add(lblUser);

        JTextField userText = new JTextField(20);
        userText.setBounds(97,20,168,25);
        panel.add(userText);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(10,50,80,25);
        panel.add(lblPass);

        JPasswordField userPass = new JPasswordField();
        userPass.setBounds(97,50,168,25);
        panel.add(userPass);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(10,80,80,25);
        panel.add(btnLogin);

        JButton btnForgot = new JButton("Forgot");
        btnForgot.setBounds(97,80,80,25);
        panel.add(btnForgot);

        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(185,80,80,25);
        panel.add(btnExit);

        //infoBox("contents", "title");

        frame.setLocationRelativeTo(null);
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Login");
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {

    }

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
}
