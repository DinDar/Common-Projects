package by.zti;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

/**
 * �����, ��������������� ��� ���������� ����������� ZTI-Serialization-Tool. ��������� ������������
 * � �������������� ������� � ������. ����� � ���������� ������� ����� DataHolder, ��� ������ � 
 * ���������� ������ ������, ������ ��� int, float, char ���.
 * 
 * @author Cvazer
 * @version 1.0
 *
 */
public class SerializationManager {
	
	/**
	 * �����, ��������������� ��� ���������� ����� ������ � ����, � ��������� ������. ��� ������������
	 * ��������� ����� ������ ����������� ��������������� ����� DataHolder �� ����������.
	 * 
	 * @param obj - ������ ��� ������������ (����������)
	 * @param name - ��� ����� �� ������ (��� �������� �������)
	 * @param format - ������ ��������� ����� (����� ���������� ����)
	 * @param path - ���� � ������ ����� ("�:\1\" ��� Windows, "~/home/" ��� Unix)
	 * 
	 */
	public static void serializeData(Object obj, String name, String format, String path){
		File exportfile = new File(path+name+"."+format);
		checkFileExistence(exportfile);
		exportData(exportfile, obj);
	}
	
	/**
	 * �����, ��������������� ��� �������� ����� ������ �� �����. ��� ������������� ���������� ������ 
	 * DataHolder �� ����������, ���������� ������ ���.
	 * 
	 * @param name - ��� �����, �� �������� ����� ������� ������
	 * @param format - ������ �������� �����
	 * @param path - ���� � ������ ����� ("�:\1\" ��� Windows, "~/home/" ��� Unix)
	 * @return ���������� ���� ��� ���������� �����, ����, ��� ������������� DataHolde, �����
	 * ���������� ���� ������.
	 *  
	 */
	public static Object deSerializeData(String name, String format, String path){
		File importfile = new File(path+name+"."+format);
		checkFileExistence(importfile);
		Object returnObject = importData(importfile);
		return returnObject;
	}
	private static Object importData(File file) {
		Object returnObject = null;
		try {
			FileInputStream inputFile = new FileInputStream(file);
			ObjectInputStream input = new ObjectInputStream(inputFile);
			returnObject = input.readObject();
			inputFile.close();
			input.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error code #11, stack messgae: "+e.getMessage()+""
					+ "\n ������� ������� ������ � error-codes.txt");
			System.exit(11);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error code #10, stack messgae: "+e.getMessage()+""
					+ "\n ������� ������� ������ � error-codes.txt");
			System.exit(10);
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error code #12, stack messgae: "+e.getMessage()+""
					+ "\n ������� ������� ������ � error-codes.txt");
		}
		return returnObject;
	}
	private static void exportData(File file, Object obj){
		try {
			FileOutputStream outputFile = new FileOutputStream(file);
			ObjectOutputStream output = new ObjectOutputStream(outputFile);
			output.writeObject(obj);
			outputFile.close();
			output.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error code #11, stack messgae: "+e.getMessage()+""
					+ "\n ������� ������� ������ � error-codes.txt");
			System.exit(11);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error code #10, stack messgae: "+e.getMessage()+""
					+ "\n ������� ������� ������ � error-codes.txt");
			System.exit(10);
		}
	}
	private static void checkFileExistence(File file){
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Error code #10, stack messgae: "+e.getMessage()
						+ "\n ������� ������� ������ � error-codes.txt");
			}
		}
	}
}
