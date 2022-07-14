package com.movsisyan.program;

import com.movsisyan.repository.PassengerRepository;

import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        try {
            PassengerRepository repository = new PassengerRepository("C:\\Users\\Yoga-M\\Desktop\\Java\\Airlines\\BoardingData.csv");
            System.out.println(repository);
            repository.toJson("passengers.json");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
