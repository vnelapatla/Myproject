package com.example.gfg.jdblmavenexamples61;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
@SpringBootApplication
public class Jdblmavenexamples61Application

{
	

	public static void main(String[] args) throws SQLException
	{
		SpringApplication.run(Jdblmavenexamples61Application.class, args);
		System.out.println("create a connection with db and  a new table");	

		Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentDetails","root","W7301@jqir#");

		Statement stmnt=con.createStatement();
		stmnt.execute("create table jdbl61MvnSpringBoot(id int, name varchar(20),address varchar(20))");

	}

}
