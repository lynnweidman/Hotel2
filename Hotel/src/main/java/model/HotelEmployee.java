package model;

import enummeration.Division;

public abstract class HotelEmployee {
   /* protected enum Division{
        CLEANING, RECEPTIONIST, MANAGEMENT
    }*/
    protected int hotelEmployeeId;
    protected int hotelId;
    protected String hotelEmployeeFirstName;
    protected String hotelEmployeeLastName;
    protected int salary;
    protected Division division;

    HotelEmployee(int hotelEmployeeId, int hotelId, String hotelEmployeeFirstName, String hotelEmployeeLastName, int salary, Division division) {
        this.hotelEmployeeId = hotelEmployeeId;
        this.hotelId = hotelId;
        this.hotelEmployeeFirstName = hotelEmployeeFirstName;
        this.hotelEmployeeLastName = hotelEmployeeLastName;
        this.salary = salary;
        this.division = division;
    }


    @Override
    public String toString() {
        return "HotelEmployee{" +
                "hotelEmployeeId=" + hotelEmployeeId +
                ", hotelId=" + hotelId +
                ", hotelEmployeeFirstName='" + hotelEmployeeFirstName + '\'' +
                ", hotelEmployeeLastName='" + hotelEmployeeLastName + '\'' +
                ", salary=" + salary +
                ", division=" + division +
                '}';
    }
}

