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
 * Класс, предназначенный для управления библиотекой ZTI-Serialization-Tool. Реализует сереализацию
 * и десереализацию классов и файлов. Также в библиотеке имеется класс DataHolder, для работы с 
 * скалярными типами данных, такими как int, float, char итд.
 * 
 * @author Cvazer
 * @version 1.0
 *
 */
public class SerializationManager {
	
	/**
	 * Метод, предназначенный для сохранения ваших данных в файл, с кастомным именем. Для сереализации
	 * скалярных типов данных используйте предоставленный класс DataHolder из библиотеки.
	 * 
	 * @param obj - Объект для сереализации (сохранения)
	 * @param name - имя файла на выходе (без указания формата)
	 * @param format - формат выходного файла (любая комбинация букв)
	 * @param path - путь к вашему файлу ("С:\1\" для Windows, "~/home/" для Unix)
	 * 
	 */
	public static void serializeData(Object obj, String name, String format, String path){
		File exportfile = new File(path+name+"."+format);
		checkFileExistence(exportfile);
		exportData(exportfile, obj);
	}
	
	/**
	 * Метод, предназначенный для загрузки ваших данных из файла. При использовании кастомного класса 
	 * DataHolder из библиотеки, возвращает именно его.
	 * 
	 * @param name - имя файла, из которого нужно достать данные
	 * @param format - формат входного файла
	 * @param path - путь к вашему файлу ("С:\1\" для Windows, "~/home/" для Unix)
	 * @return Возвращает либо ваш конкретный класс, либо, при использовании DataHolde, класс
	 * содержаший ваши данные.
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
					+ "\n узнайте причину ошибки в error-codes.txt");
			System.exit(11);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error code #10, stack messgae: "+e.getMessage()+""
					+ "\n узнайте причину ошибки в error-codes.txt");
			System.exit(10);
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error code #12, stack messgae: "+e.getMessage()+""
					+ "\n узнайте причину ошибки в error-codes.txt");
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
					+ "\n узнайте причину ошибки в error-codes.txt");
			System.exit(11);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error code #10, stack messgae: "+e.getMessage()+""
					+ "\n узнайте причину ошибки в error-codes.txt");
			System.exit(10);
		}
	}
	private static void checkFileExistence(File file){
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				JOptionPane.showMessageDialog(null, "Error code #10, stack messgae: "+e.getMessage()
						+ "\n узнайте причину ошибки в error-codes.txt");
			}
		}
	}
}
