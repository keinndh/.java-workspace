/**
 * Represents the individual hotel rooms that users can reserve.
 * This class encapsulates key attributes such as room ID, type, price, capacity, and availability status.
 * It also includes methods for updating room availability, checking booking status, and interacting with reservation data.
 * @author Jhon Kylle C. Clarang
 * @version 1 - April 09 2025
 * @version 2 - April 17, 2025
 */

import java.util.ArrayList;
import java.util.List;

public class Room {
    private String roomId; // Identifier for the room
    private String roomNumber; // Room number
    private String roomType; // Type of the room (e.g., Single, Double)
    private double pricePerNight; // Price per night for the room
    private boolean available; // Availability status of the room
    private List<Reservation> reservations; // List of reservations for the room

    // Constructor for list Reservation
    public Room() {
        this.reservations = new ArrayList<>();
    }

    // Method to check if the room is available
    public boolean checkAvailability() {
        return available;
    }

    // Method to book a room
    public Reservation bookRoom(User user, String checkInDate, String checkOutDate) {
        if (!available) {
            System.out.println("Room is not available.");
            return null;
        }

        Reservation reservation = new Reservation(user, this);
        reservation.setCheckInDate(java.sql.Date.valueOf(checkInDate));
        reservation.setCheckOutDate(java.sql.Date.valueOf(checkOutDate));
        reservations.add(reservation);
        this.available = false; // Mark the room as booked
        return reservation;
    }

    // Method to view all reservations for the room
    public  List<Reservation> viewReservations() {
        return reservations;
    }

    // Getters and setters
    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}