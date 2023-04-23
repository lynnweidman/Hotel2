package model;

import enummeration.Division;

public class Manager extends HotelEmployee{
    Manager(int hotelEmployeeId, int hotelId, String hotelEmployeeFirstName, String hotelEmployeeLastName, int salary, Division division){
        super(hotelEmployeeId, hotelId,hotelEmployeeFirstName, hotelEmployeeLastName, salary, division);
    }
}
