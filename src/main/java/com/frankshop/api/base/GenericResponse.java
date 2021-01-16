package com.frankshop.api.base;

import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GenericResponse {

    public Object data;

    public String errorCode;

    public static ResponseEntity createGenericSuccessResponse(Object t) {

        return ResponseEntity.ok().body(new GenericResponse(t, null));
    }
}
