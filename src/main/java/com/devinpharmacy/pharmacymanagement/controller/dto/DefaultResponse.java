package com.devinpharmacy.pharmacymanagement.controller.dto;

import java.time.LocalDateTime;

public class DefaultResponse <T> {

    private String  status;
    private LocalDateTime timeStamp;
    private T data;
}
