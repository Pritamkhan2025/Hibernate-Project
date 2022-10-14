package com.onetomany;

import com.onetomany.daoimpl.DepartmentDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        DepartmentDaoImpl dao = new DepartmentDaoImpl();
        dao.addDept();
    	
    }
}
