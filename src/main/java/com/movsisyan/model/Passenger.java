package com.movsisyan.model;

import java.util.StringJoiner;

public class Passenger {
    private String firstName;
    private String secondName;
    private String lastName;
    private String sex;
    private String birthday;
    private String document;
    private String bookingCode;
    private String ticketNumber;
    private String baggage;
    private String flightDate;
    private String flightTime;
    private String flightNumber;
    private String codeShare;
    private String destination;

    public Passenger() {
    }

    public Passenger(String firstName, String secondName, String lastName, String sex, String birthday, String document,
                     String bookingCode, String ticketNumber, String baggage, String flightDate, String flightTime,
                     String flightNumber, String codeShare, String destination) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
        this.document = document;
        this.bookingCode = bookingCode;
        this.ticketNumber = ticketNumber;
        this.baggage = baggage;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.flightNumber = flightNumber;
        this.codeShare = codeShare;
        this.destination = destination;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public String getBaggage() {
        return baggage;
    }

    public void setBaggage(String baggage) {
        this.baggage = baggage;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getCodeShare() {
        return codeShare;
    }

    public void setCodeShare(String codeShare) {
        this.codeShare = codeShare;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * serialize passenger to Json
     */
    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", document='" + document + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", ticketNumber='" + ticketNumber + '\'' +
                ", baggage='" + baggage + '\'' +
                ", flightDate='" + flightDate + '\'' +
                ", flightTime='" + flightTime + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", codeShare='" + codeShare + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
