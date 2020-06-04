package com.tyagi.Singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		DateUtil dateUtil1 = DateUtil.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("C:/Users/ankit/Desktop/Practise/Projects/Java Project/Design Patterns/corepatterns/src/com/tyagi/Singleton/dateUtil.ser")));
		oos.writeObject(dateUtil1);
		
		DateUtil dateUtil2 = null;
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:/Users/ankit/Desktop/Practise/Projects/Java Project/Design Patterns/corepatterns/src/com/tyagi/Singleton/dateUtil.ser")));
		dateUtil2 = (DateUtil) ois.readObject();
		
		System.out.println(dateUtil1 == dateUtil2);
		
		oos.close();
		ois.close();
	}

}
