package main;

import primitive_wrapers.ODouble;

public class DemoTestCase {
	public static void main(String[] args) {
		//double values[] = {24, 0, 0, 9.8, 0};
		//boolean flags[] = {true, true, false, true, false};
		//Suvat test = new Suvat(values, flags);
		
		//load up the MainForm
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainForm().setVisible(true);
			}
		});
		
		
		
		
	}
	
	static void print_all(Suvat test){
		ODouble var = new ODouble(0);	//stores the value from retrieve function
		char suvat[] = {'s', 'u', 'v', 'a', 't'};
		System.out.println("\n");
		
		//this for loops goes through the suvat variables and outputs them
		for(int i = 0; i < suvat.length; i++){
			if(test.retrieve(suvat[i], var)) print(suvat[i] + " = " + var.val);
			else { print(suvat[i] + " is not declared!"); }
		}
	}
	static void print(Object out){ System.out.println(out);}
	static void BasicSuvatTest(Suvat test){
		//Demonstrates basic usage of suvat class
		print("Test case \"BasicSuvatTest\"!");
		
		print_all(test);
		test.clear('a');
		test.clear('v');
		print_all(test);
		test.set(56.7, 'a');
		test.set(345.86, 's');
		print_all(test);
		
	}
	static void ResolveTest(Suvat test){
		print("Test case \"ResolveTest\"!");
		test.resolve();	//all are set to true
		test.clear('v');
		test.clear('u');
		test.resolve();	//'v' and 'u' unset
	}

}
