package Assuman;

import javax.swing.JButton;

public class myButton extends JButton{
	public myButton() {}
	public myButton(int X, int Y, int WIDTH, int HEIGHT, String text) {
		// TODO Auto-generated constructor stub
		this.setText(text);
		this.setBounds(X, Y, WIDTH, HEIGHT);
	}
}
