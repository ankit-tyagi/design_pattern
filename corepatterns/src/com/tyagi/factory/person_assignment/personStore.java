/**
 * 
 */
package com.tyagi.factory.person_assignment;

/**
 * @author ankit
 *
 */
public class personStore {
	
	public Person genderstore(String type)
	{
		Person p = personFactory.createPerson(type);
		p.wish();
		return p;
	}
	
}
