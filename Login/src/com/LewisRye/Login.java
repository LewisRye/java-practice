package com.LewisRye;

import java.sql.*;
import java.util.*;

public class Login
{
    public static void main(String[] args)
    {
        System.out.println(java.lang.System.getProperty("java.library.path")); // only required to see path of JDK
        try
                (
                        Connection conn = DriverManager.getConnection("jdbc:jtds:sqlserver://LEWISLAPTOP:49672/InventoryDatabase;instance=SQLEXPRESS");
                        Statement stmt = conn.createStatement();
                )
        {
            // logging in

            Scanner sc = new Scanner(System.in);

            System.out.print("Username: ");
            String username = sc.next();

            System.out.print("Password: ");
            String password = sc.next();

            String query = String.format("SELECT COUNT(*) FROM Account WHERE Username = '" + username + "' AND PasswordHash = '" + password + "';");
            System.out.println("\nThe SQL statement is: " + query + "\n");
            ResultSet resultset = stmt.executeQuery(query);

            int result = 0;

            while (resultset.next())
            {
                result = resultset.getInt("");
            }

            if (result == 0)
            {
                System.out.println("Details are incorrect.");
            }
            else
            {
                System.out.println(String.format("Welcome %s!", username));
            }
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}
