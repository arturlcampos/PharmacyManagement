package com.devinpharmacy.pharmacymanagement.exception;


public class ServerErrorException extends RuntimeException{

    public ServerErrorException(){
        super();
    }

    public ServerErrorException(String message){
        super(message);
    }
}