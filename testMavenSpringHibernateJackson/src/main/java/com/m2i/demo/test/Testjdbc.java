package com.m2i.demo.test;
import java.sql.*;

public class Testjdbc {

		public static void main(String [] args) {
			Connection maConnexion = null;
			String user = "hbstudent";
			String password = "hbstudent";
			String jdbcUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

				
				try {
					System.out.println("connexion en attente ... ");
					maConnexion = DriverManager.getConnection(jdbcUrl, user, password);
					System.out.println("connexion réussie :) ");
					maConnexion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}

	}
