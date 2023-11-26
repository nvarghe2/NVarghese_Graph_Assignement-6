/*
 * CLASS : CMSC204
 * ASSIGNMENT 6
 * DESCRIPTION : Town class that holds the name of the town and a list of adjacent towns, 
 * 				 and other fields as desired, and the traditional 
 * 				 methods (constructors, getters/setters, toString, etc.).  
 * 				 It will implement the Comparable interface
 * INSTRUCTOR : Dr.Kuijt
 *  I pledge that I have completed the programming assignment independently.
 *  I have not copied the code from a student or any source.
 * STUDENT : NIKITTA JOAN VARGHESE
 */

import java.util.ArrayList;

public class Town implements Comparable<Town>{

	private String name;
	private ArrayList<Town> adjacentTowns;

	/**
	 * constructor
	 * @param name - name of the town
	 */
	Town(String name){
		this.name = name;
	}

	/**
	 * Copy constructor
	 * @param templateTown - town to copy
	 */
	Town(Town templateTown){
		this.name=templateTown.name;
	}

	/**
	 * Compare two towns by name
	 * @param t - town to compare with
	 * @return 0 if names are equal, a positive or negative number if the names are not equal
	 */
	@Override
	public int compareTo(Town t) {      
		return this.name.compareTo(t.name);
	}

	/**
	 * The comparison for equality will be based in the name
	 * @param obj - object to be compared with
	 * @return true if the town names are equal, false if not
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Town)) {
			return false;
		}
		Town t = (Town) obj;
		return this.name.equals(t.name);
	}

	/**
	 * @return name of the town
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the hashcode for the name of the town
	 */
	public int hashCode() {
		return name.hashCode();
	}

	/**
	 * To string method
	 * @return the town name
	 */
	public String toString() {
		return name;
	}
}