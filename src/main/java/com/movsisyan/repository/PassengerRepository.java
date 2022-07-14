package com.movsisyan.repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.movsisyan.model.Passenger;

import java.io.*;
import java.util.ArrayList;

public class PassengerRepository {
    private ArrayList<Passenger> passengers = new ArrayList<Passenger>();

    public PassengerRepository(String fileName) throws IOException {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            bufferedReader.readLine();
            while(bufferedReader.ready()) {
                try {
                    String[] split = bufferedReader.readLine().split(";");
                    Passenger passenger = new Passenger(split[0], split[1], split[2], split[3], split[4], split[5],
                            split[6], split[7], split[8], split[9], split[10], split[11], split[12], split[12]);
                    this.passengers.add(passenger);
                } catch (RuntimeException ignored) {}
            }
        }
    }

    public void toJson(String fileName) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(fileName), this.passengers);
    }


    @Override
    public String toString() {
        return "PassengerRepository{" +
                "passengers=" + passengers +
                '}';
    }
}
