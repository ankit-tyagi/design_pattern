/**
 * 
 */
package com.tyagi.abstractfactory;

/**
 * @author ankit
 *
 */
public class DBDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {
		
		Dao dao = null;
		
		if(type.equals("emp"))
		{
			dao = new DBEmpDao();
		}else if(type.equals("dept"))
		{
			dao = new DBDeptDao();
		}
		// TODO Auto-generated method stub
		return dao;
	}

}
