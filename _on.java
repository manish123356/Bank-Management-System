package bank.management.system;

import java.sql.*;

public class _on {

    Connection connection;
    Statement statement;

    public _on(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Manish1223#_");
            statement = connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
//jdbc:mysql://127.0.0.1:3306/?user=root
//root@127.0.0.1:3306