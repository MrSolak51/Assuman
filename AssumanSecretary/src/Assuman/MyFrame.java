package Assuman;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	myButton calc, internet, communication, notes, quit;
	MyLabel Screen;
	main m;
	public MyFrame() {
		// TODO Auto-generated constructor stub
		m = new main();
		Screen = new MyLabel(0, 0, 415, 300, "Chose an app,plz");
		calc = new myButton(0, 300, 100, 100,"calculator");
		internet = new myButton(100, 300, 100, 100, "internet");
		communication = new myButton(200, 300, 100, 100, "communication");
		notes = new myButton(300, 300, 100, 100, "notes");
		quit = new myButton(0, 400, 400, 100, "quit");
		
		calc.addActionListener(this);
		internet.addActionListener(this);
		communication.addActionListener(this);
		notes.addActionListener(this);
		quit.addActionListener(this);
		
		this.setTitle("Asuman");
		this.setSize(415, 540);
		this.add(Screen);
		this.add(calc);
		this.add(internet);
		this.add(communication);
		this.add(notes);
		this.add(quit);
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == calc) {
			m.system("calculator");
			Screen.setText("Calculator has opened.");
		}
		if(e.getSource() == internet) {
			m.system("internet");
			Screen.setText("Chrome Browser has opened.");
		}
		if(e.getSource() == communication) {
			m.system("communication");
			Screen.setText("Discord has opened.");
		}
		if (e.getSource() == notes) {
			m.system("notes");
			Screen.setText("Notepad has opened.");
		}
		if (e.getSource() == quit) {
			System.exit(0);
		}
	}
}
