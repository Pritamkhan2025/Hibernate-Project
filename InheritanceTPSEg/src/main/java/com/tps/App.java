package com.tps;

import com.tps.daoimpl.VehicleDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        VehicleDaoImpl vdao = new VehicleDaoImpl();
        vdao.addVehicle();
    }
}
