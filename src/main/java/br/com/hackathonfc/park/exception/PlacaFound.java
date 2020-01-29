package br.com.hackathonfc.park.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PlacaFound extends Exception{
    @Override
    public String getMessage() {
        return "Placa já cadastrada no sistema!";
    }
}
