/**
 * Represents a booking transaction between a user and a room for a specific time period.
 * This class binds a User instance and a Room instance, along with attributes such as
 * check-in/check-out dates, timestamps, and current status. It handles logic related
 * to booking creation, modification, and cancellation.
 * @author Jhon Kylle C. Clarang
 * @version 1 - April 09, 2025
 * @version 2 - April 21, 2025
 */

import java.util.Date;
import java.util.Random;

public class Reservation {
    private String reservationId; // Identifier for the reservation
    private Room room; // Room associated with the reservation
    private User user; // User who made the reservation
    private Date checkInDate; // Check-in date
    private Date checkOutDate; // Check-out date
    private double totalPrice; // Total price for the reservation
    private ReservationStatus status; // Status of the reservation (e.g., ACTIVE, CANCELLED)

    // Constructor to initialize Reservation with User and Room
    public Reservation(User user, Room room) {
        this.reservationId = generateReservationId();
        this.user = user;
        this.room = room;
        this.status = ReservationStatus.ACTIVE; // Default status
    }

    // Method to create a reservation
    public void createReservation() {
        this.status = ReservationStatus.ACTIVE; // Set the status to active
        System.out.println("Reservation created successfully.");
    }

    // Method to cancel a reservation
    public void cancelReservation() {
        this.status = ReservationStatus.CANCELLED; // Set the status to cancelled
        this.room.setAvailable(true); // Mark the room as available again
        System.out.println("\nReservation cancelled successfully.");
    }

    // Method to complete a reservation
    public void completeReservation() {
        this.status = ReservationStatus.COMPLETED; // Set the status to completed
        this.room.setAvailable(true); // Mark the room as available again
        System.out.println("\nReservation completed successfully.");
    }

    public static String generateReservationId() {
        int reservationId = new Random().nextInt(9000000) + 1000; // Generate a random 6-digit number
        return String.valueOf(reservationId); // Convert the number to a string
    }

    // Method to calculate the total price for the reservation
    public double calculateTotal() {
        long diffInMillies = Math.abs(checkOutDate.getTime() - checkInDate.getTime()); // Calculate the difference in milliesecond in in - out 
        long diffInDays = diffInMillies / (1000 * 60 * 60 * 24); // Calculate the difference in days
        this.totalPrice = diffInDays * room.getPricePerNight(); // Multiply by the room's price per night
        return this.totalPrice;
    }

    // Getters and setters for all attributes
    public String getReservationId() {
        return reservationId;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}