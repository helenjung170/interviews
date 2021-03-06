package com.elsevier.education;

import java.util.*;

/**

TODO Examine the failing test case for this class.
 We should be able to call people.add() twice but end with only one object in it.
 We can test with "gradlew test"
Answer:
HashSet implements Set which dooes not allow duplicated object. Therefore, adding same object to HashSet will not add an additional object to the HashSet.
*/
public class Exercise3 {

	public static class Person {
	
		private static Random generator = new java.util.Random();
		private Integer id;
		
		public Person(int newId) {
			id = newId;
		}
		
		public int hashCode() {
			return id * generator.nextInt();
		}
		
		public boolean equals(Object other) {
			return id.equals(((Person)other).id);
		}
	}
}