package com.onetoone;

import com.onetoone.daoimpl.CitizenDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        CitizenDaoImpl dao=new CitizenDaoImpl();
        dao.addCitizen();
        dao.fetchCitizen();
    }
}
