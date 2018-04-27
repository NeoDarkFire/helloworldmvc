package helloworldmvc.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DAOHelloWorld {

	private static final String FILENAME = "helloworld.txt";
	private static DAOHelloWorld instance = null;
	
	private String helloWorldMessage = null;
	
	private DAOHelloWorld() {
		try {
			this.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static public DAOHelloWorld getInstance() {
		if (instance == null) {
			setInstance( new DAOHelloWorld() );
		}
		return instance;
	}
	
	static private void setInstance(DAOHelloWorld instance) {
		DAOHelloWorld.instance = instance;
	}
	
	private void readFile() throws FileNotFoundException {
		Scanner sc = new Scanner( new File(FILENAME) );
		this.setHelloWorldMessage( sc.nextLine() );
		sc.close();
	}
	
	public String getHelloWorldMessage() {
		return this.helloWorldMessage;
	}
	
	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}

}
