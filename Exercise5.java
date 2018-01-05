package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

To make class Singleton single 
	1. make contructor private
	2. add a private static Singleton variable,
	3. create a getInstance method
	4. In the main method use getInstance to create a Singleton object
*/
public class Exercise5 {
	
		public static class Singleton {
			private static Singleton instance;
		
			//make constructor private
			private Singleton() {

			}
		

		/* Create a get instance methode. 
		*/ 
		public static Singleton getInstance(){ 
			if(instnce == null){ 
				instance = new Singleton(); 
			} 
			return instance; 
		}
		

		public void doSomething() {
			System.out.println("Doing something....");
		}
	}	
		
	public static void main(String a[]){
		Singleton st = Singleton..getInstance();
		st.doSomeThing();
	}
}