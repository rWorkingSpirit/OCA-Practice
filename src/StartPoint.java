// Default package has no 'package xxx'.

import basics.*;


public class StartPoint 
{
	// Start point of every program is the main method.
	// you are allowed to make this final, parameters like String...	String args[]	String[] name	are also allowed
	public static void main(String[] args)
	{
		BasicsEx basicEX = new BasicsEx();
	}
	
	// This is a regular method, NOT the start point of a class.
	public void main() {}
	private int main(int a) {return 1;}
	protected void main(String a, boolean b) {}
	void main(boolean a, String[] b) {}
	
}
