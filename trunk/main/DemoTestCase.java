package main;



public class DemoTestCase {
	public static void main(String[] args) {
                //sets the look and feel of swing UI to windows
                //since the user will most likely use windows...
		
		//load up the MainForm
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainForm().setVisible(true);
			}
		});	
	}
}
