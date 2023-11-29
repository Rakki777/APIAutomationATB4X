package org.example.modules;

import io.qameta.allure.internal.shadowed.jackson.core.JsonProcessingException;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import org.example.payloads.Booking;
import org.example.payloads.Bookingdates;
import org.example.utils.FakerUtil;

public class PayloadManager {
    ObjectMapper objectMapper;

    public String createPayload() throws JsonProcessingException {
        objectMapper = new ObjectMapper();

        Booking booking = new Booking();
        booking.setFirstname("BS");
        booking.setLastname("Rakshith");
        booking.setTotalprice(421);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("lunch");

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2023-01-01");
        bookingdates.setCheckout("2023-01-10");
        booking.setBookingdates(bookingdates);

        String payload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
        return payload;
    }

    public String UpdatePayload() throws JsonProcessingException {
        objectMapper = new ObjectMapper();

        Booking booking = new Booking();
        booking.setFirstname(FakerUtil.getUserName());
        booking.setLastname("Rakshith");
        booking.setTotalprice(421);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("Breakfast, lunch");

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2023-01-01");
        bookingdates.setCheckout("2023-01-10");
        booking.setBookingdates(bookingdates);

        String payload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);
        return payload;
    }

}