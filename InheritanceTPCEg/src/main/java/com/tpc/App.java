package com.tpc;

import com.tpc.daoimpl.VehicleDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
        VehicleDaoImpl vdao = new VehicleDaoImpl();
        vdao.addVehicle();
    }
}
