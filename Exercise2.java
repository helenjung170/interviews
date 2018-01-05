package com.elsevier.education;

/**

TODO refactor the Car to use dependency injection of the engine
TODO allow use of either a gas engine or electric engine (create an appropriate abstraction)
TODO make sure we have no-op implementations of the gas engine and electric engine

*/
public class Exercise2 {

	public static class Car {
		private Engine engine;
		
		/**
			Create contructor with dependency injection
		*/
		public Car(Engine engine) {
			this.engine = engine;
		}
		
		public void moveForward() {
			engine.spinWheels();
		}
	}
	
	/**
	  Create abstract class
	*/
	abstract static class Engine {
		public void spinWheels();
	}
	/**
		extends Engine class for Gas Engine
	*/
	public static class GasEngine exends Engine {
		@override
		public void spinWheels() {
			// no-op for now
			System.out.println("Spinning gas engine wheels");
		}
	}
	/**
		extends Engine class for Electic Engine
	*/
	public static class ElectricEngine exends Engine {
		@override
		public void spinWheels() {
			// no-op for now
			System.out.println("Spinning electric engine wheels");
		}
	}


}