package by.zti;

import java.io.Serializable;

/**
 * Класс, комплектующийся в библиотеке ZTI-Serialization-Tool, предназначенный для хранения
 * и сереализации скалярных типов данных.
 * 
 * @author Cvazer
 *
 */
public class DataHolder implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String stringVar = "";
	private int intVar = 0;
	private char charVar = 'a';
	private boolean boolVar = false;
	private float floatVar = 1F;
	private double doubleVar = 1.0;
	
	/**
	 * Автоматически сохраняет в классе параметр типа String, все остальное инициализированно
	 * стандартными(пустыми) параметрами
	 * 
	 * @param value - значение, которое нужно сохранить.
	 * 
	 */
	public DataHolder(String value){
		setStringVar(value);
	}
	/**
	 * Автоматически сохраняет в классе параметр типа int, все остальное инициализированно
	 * стандартными(пустыми) параметрами
	 * 
	 * @param value - значение, которое нужно сохранить.
	 * 
	 */
	public DataHolder(int value){
		setIntVar(value);
	}
	/**
	 * Автоматически сохраняет в классе параметр типа char, все остальное инициализированно
	 * стандартными(пустыми) параметрами
	 * 
	 * @param value - значение, которое нужно сохранить.
	 * 
	 */
	public DataHolder(char value){
		setCharVar(value);
	}
	/**
	 * Автоматически сохраняет в классе параметр типа boolean, все остальное инициализированно
	 * стандартными(пустыми) параметрами
	 * 
	 * @param value - значение, которое нужно сохранить.
	 * 
	 */
	public DataHolder(boolean value){
		setBoolVar(value);
	}
	/**
	 * Автоматически сохраняет в классе параметр типа float, все остальное инициализированно
	 * стандартными(пустыми) параметрами
	 * 
	 * @param value - значение, которое нужно сохранить.
	 * 
	 */
	public DataHolder(float value){
		setFloatVar(value);
	}
	/**
	 * Автоматически сохраняет в классе параметр типа double, все остальное инициализированно
	 * стандартными(пустыми) параметрами
	 * 
	 * @param value - значение, которое нужно сохранить.
	 * 
	 */
	public DataHolder(double value){
		setDoubleVar(value);
	}	
	public String getStringVar() {
		return stringVar;
	}
	public void setStringVar(String stringVar) {
		this.stringVar = stringVar;
	}
	public int getIntVar() {
		return intVar;
	}
	public void setIntVar(int intVar) {
		this.intVar = intVar;
	}
	public char getCharVar() {
		return charVar;
	}
	public void setCharVar(char charVar) {
		this.charVar = charVar;
	}
	public boolean isBoolVar() {
		return boolVar;
	}
	public void setBoolVar(boolean boolVar) {
		this.boolVar = boolVar;
	}
	public float getFloatVar() {
		return floatVar;
	}
	public void setFloatVar(float floatVar) {
		this.floatVar = floatVar;
	}
	public double getDoubleVar() {
		return doubleVar;
	}
	public void setDoubleVar(double doubleVar) {
		this.doubleVar = doubleVar;
	}
}
