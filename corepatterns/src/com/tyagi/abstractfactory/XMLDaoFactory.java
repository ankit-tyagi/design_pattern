/**
 * 
 */
package com.tyagi.abstractfactory;

/**
 * @author ankit
 *
 */
public class XMLDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {
		
		Dao dao = null;
		
		if(type.equals("emp"))
		{
			dao = new XMLEmpDao();
		}else if(type.equals("dept"))
		{
			dao = new XMLDeptDao();
		}
		// TODO Auto-generated method stub
		return dao;
	}

}
