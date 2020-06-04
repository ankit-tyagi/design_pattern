/**
 * 
 */
package com.tyagi.factory.person_assignment;

/**
 * @author ankit
 *
 */
public class personFactory {
	
	public static Person createPerson(String type)
	{
		
		Person p = null;
		
		if(type.equals("male"))
		{
			p = new malePerson();
		}
		else if(type.equals("female"))
		{
			p = new femalePerson();
		}
		
		return p;
	}

}
