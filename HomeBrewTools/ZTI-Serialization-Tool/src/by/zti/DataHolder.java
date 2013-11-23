package by.zti;

import java.io.Serializable;

/**
 * �����, ��������������� � ���������� ZTI-Serialization-Tool, ��������������� ��� ��������
 * � ������������ ��������� ����� ������.
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
	 * ������������� ��������� � ������ �������� ���� String, ��� ��������� �����������������
	 * ������������(�������) �����������
	 * 
	 * @param value - ��������, ������� ����� ���������.
	 * 
	 */
	public DataHolder(String value){
		setStringVar(value);
	}
	/**
	 * ������������� ��������� � ������ �������� ���� int, ��� ��������� �����������������
	 * ������������(�������) �����������
	 * 
	 * @param value - ��������, ������� ����� ���������.
	 * 
	 */
	public DataHolder(int value){
		setIntVar(value);
	}
	/**
	 * ������������� ��������� � ������ �������� ���� char, ��� ��������� �����������������
	 * ������������(�������) �����������
	 * 
	 * @param value - ��������, ������� ����� ���������.
	 * 
	 */
	public DataHolder(char value){
		setCharVar(value);
	}
	/**
	 * ������������� ��������� � ������ �������� ���� boolean, ��� ��������� �����������������
	 * ������������(�������) �����������
	 * 
	 * @param value - ��������, ������� ����� ���������.
	 * 
	 */
	public DataHolder(boolean value){
		setBoolVar(value);
	}
	/**
	 * ������������� ��������� � ������ �������� ���� float, ��� ��������� �����������������
	 * ������������(�������) �����������
	 * 
	 * @param value - ��������, ������� ����� ���������.
	 * 
	 */
	public DataHolder(float value){
		setFloatVar(value);
	}
	/**
	 * ������������� ��������� � ������ �������� ���� double, ��� ��������� �����������������
	 * ������������(�������) �����������
	 * 
	 * @param value - ��������, ������� ����� ���������.
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
