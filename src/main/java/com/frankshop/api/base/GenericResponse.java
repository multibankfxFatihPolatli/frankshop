package com.frankshop.api.base;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GenericResponse {

    public Object data;

    public String errorCode;

    public String errorMessage;

    public static ResponseEntity createGenericSuccessResponse(Object t) {

        return ResponseEntity.ok().body(new GenericResponse(t, null, null));
    }

    public static ResponseEntity createGenericFailResponse(Exception e) {

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new GenericResponse(null, "11", e.getMessage()));
    }
}
