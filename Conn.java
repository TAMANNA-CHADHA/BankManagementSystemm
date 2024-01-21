package bankmanagementsystem;

//import java.awt.Color;
//import java.awt.Font;
//import java.util.*;
//import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
import java.sql.*;

public class Conn {
    
    
    //Second step ---> to create a connection
    Connection c;
    Statement s;
    public Conn(){
        
        //Third Step--__>create Statement
        
        // Here We have to do exceptional Handling Because Mysql is an external entity so it can give run time error
        
        try{
           // First step-->Driver Ko register krna h 
           //here Class is a class and forname is a static method , inside forname we write our classname
           //WE do't need to write this line because driver isko automatically register krta h
           //Class.forName(com.mysql.cj.jdbc.Driver );
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","root");
           s= c.createStatement();
        }
        catch (Exception e){
            System.out.println(e);
        }
        
                }
    
}