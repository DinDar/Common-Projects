package by.zti;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DataBaseConnector {
	private String url;
	private String name;
	private String password;
	private boolean isConnected = false;
	private Connection connection;

	public DataBaseConnector(String url,String name,String password){
		this.url=url;
		this.name=name;
		this.password=password;
		createConnection();
	}
	
	public static void main(String[] args){
		new DataBaseConnector("jdbc:mysql://127.0.0.1:3306/test", "root", "jumpjet123");
	}
	
	public void createConnection(){
		while(!isConnected)
			try {
				System.out.println("Драйвер подключен\n");
				connection = (Connection) DriverManager.getConnection(url, name, password);
				System.out.println("Соединение установлено\n---------------------");
				isConnected = true;
			} catch (SQLException e) {
				System.out.println("Соедениться не удалось\n\n");
				e.printStackTrace();
				url = JOptionPane.showInputDialog("Введите URL базы");
				name = JOptionPane.showInputDialog("Введите имя");
				password = JOptionPane.showInputDialog("Введите пароль");
			}
	}
	
	public ResultSet getDataList(String table_name){
		ResultSet result = null;
		try {
			Statement statement = (Statement) connection.createStatement();
			result = statement.executeQuery(
					"SELECT * FROM "+table_name
					);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return result;
	}
	
	public ResultSet executeAndGetResult(String query){
		ResultSet result = null;
		try {
			Statement statement = (Statement) connection.createStatement();
			result = statement.executeQuery(query);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return result;
	}
}
