package com.quickshow.backend.service;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendBookingConfirmation(String movieName) {
        System.out.println("Booking Confirmed for: " + movieName);
    }
}
