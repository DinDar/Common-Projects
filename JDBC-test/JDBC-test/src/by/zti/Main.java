package by.zti;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Main {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/test";
	private static final String NAME = "root";
	private static final String PASSWORD = "jumpjet123";
	
	public static void main(String[] args){
		try {
			//Class.forName("Driver");
			System.out.println("Драйвер подключен");
			@SuppressWarnings("unused")
			Connection connection = (Connection) DriverManager.getConnection(URL, NAME, PASSWORD);
			System.out.println("Соединение установлено");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
