package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?
 Anser:
Counter is not thread safe, because the methods can be accessed by multiple threads. To make Counter a thread safe class, make count a static variable and make all the mehtods Synchronized static method.
*/
public class Exercise4 {

	public static class Counter {
	
		private static int count = 0;
		
		public static synchronized int increment() {
			return ++count;
		}
		
		public static synchronized int getCount() {
			return count;
		}
		
		public static synchronized  void resetCount() {
			count = 0;
		}

	}
}