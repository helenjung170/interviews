package com.elsevier.education;

import java.util.Set;

/**

TODO: Make this class immutable.
To make the class immutable, do the following:
1. make the class final: public final class Exercise1 {}.
2. make variables phoneNumbers,firstName and lastName final.
3. remove all setter methods for all variables.

*/
public final class Exercise1 {

	public static class Person {
		
		private final Set<String> phoneNumbers;
		private final String firstName;
		private final String lastName;
		
		public Person() {
		}

		public Set<String> getPhoneNumbers() {
			return phoneNumbers;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		
		public String getLastName() {
			return lastName;
		}
		
	}
}