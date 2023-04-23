package model;

import java.util.Objects;

public class Hotel {
    private String hotelName;
    private int numOfEmployees;

    public Hotel(String hotelName, int numOfEmployees) {
        this.hotelName = hotelName;
        this.numOfEmployees = numOfEmployees;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }


    @Override
    public String toString() {
        return "HotelManagement{" +
                "hotelName='" + hotelName + '\'' +
                ", numOfEmployees=" + numOfEmployees +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return numOfEmployees == hotel.numOfEmployees && Objects.equals(hotelName, hotel.hotelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hotelName, numOfEmployees);
    }
}
