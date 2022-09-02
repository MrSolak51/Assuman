package Assuman;

import java.awt.*;

import javax.swing.JLabel;

public class MyLabel extends JLabel{
	String text;
	public MyLabel() {}
	public MyLabel(int X, int Y, int WIDTH, int HEIGHT, String text) {
		// TODO Auto-generated method stub
		this.setBounds(X, Y, WIDTH, HEIGHT);
		this.setText(text);
	}
}
