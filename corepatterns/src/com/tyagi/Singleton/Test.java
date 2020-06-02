package com.tyagi.Singleton;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateUtil dateUtil1 = DateUtil.getInstance();
		DateUtil dateUtil2 = DateUtil.getInstance();
		
		System.out.println(dateUtil1 == dateUtil2);
	}

}
