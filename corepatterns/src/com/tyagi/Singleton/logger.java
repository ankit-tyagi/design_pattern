package com.tyagi.Singleton;

import java.io.Serializable;

public class logger implements Serializable,Cloneable{
	
	private static volatile logger instance = null;
	
	private logger()
	{
		
	}
	
	public static logger getInstance()
	{
		if(instance == null)
		{
			synchronized (logger.class) {
				if(instance == null)
				{
					instance = new logger();
				}	
			}
		}
		return instance;
	}
	
	public void log (String message)
	{
		System.out.println(message);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
