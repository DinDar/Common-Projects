package by.zti;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;

public class Main {
	private static String url = "jdbc:mysql://127.0.0.1:3306/test";
	private static String name = "root";
	// TODO add password
	private static String password = "";
	private static boolean isConnected = false;
	
	public static void main(String[] args){
		while(!isConnected)
			try {
				//Class.forName("Driver");
				System.out.println("Драйвер подключен\n");
				@SuppressWarnings("unused")
				Connection connection = (Connection) DriverManager.getConnection(url, name, password);
				System.out.println("Соединение установлено\n---------------------");
				isConnected = true;
			} catch (SQLException e) {
				System.out.println("Соедениться не удалось");
				url = JOptionPane.showInputDialog("Введите URL базы");
				name = JOptionPane.showInputDialog("Введите имя");
				password = JOptionPane.showInputDialog("Введите пароль");
			}
	}
}
