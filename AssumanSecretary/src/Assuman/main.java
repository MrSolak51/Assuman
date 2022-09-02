package Assuman;
import java.io.*;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
	public static void system(String choose) {
		String path = null;
		switch(choose) {
			case "calculator": choose="calc";System.out.println("opening calculator"); break;
			case "internet": choose = "start chrome"; System.out.println("opening Chrome Browser"); break;
			case "communication": choose = "start Discord.lnk";path="cd C:\\Users\\MrSolak\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Discord Inc"; System.out.println("opening Discord"); break;
			case "notes": choose = "notepad"; break;
			default: choose=null;System.out.println("I can not do it yet, sorry!"); break;
		}
		String[] command =
		    {
		        "cmd",
		    };
		    Process p;
			try {
				p = Runtime.getRuntime().exec(command);
			        	new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
		                new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
		                PrintWriter stdin = new PrintWriter(p.getOutputStream());
		                if (path != null) {
							stdin.println(path);
						}
		                if(choose != null) {
			                stdin.println(choose);
			                
		                }
		                stdin.close();
		                p.waitFor();
		    	} 
			catch (Exception e) {
		 		e.printStackTrace();
		    }
	}
}
