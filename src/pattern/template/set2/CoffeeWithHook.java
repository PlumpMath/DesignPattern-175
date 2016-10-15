package pattern.template.set2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter!");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk!");
	}
	
	@Override
	boolean customerWantsCondiments(){
		String answer = getUserInput();
		if(answer.toLowerCase().equals("y"))
			return true;
		else
			return false;
	}
	
	private String getUserInput() {
		String answer = null;
		System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch(IOException e){
			System.out.println("User input Error");
		}
		
		if(answer == null)
			return "n";
		
		return answer;
	}

}
