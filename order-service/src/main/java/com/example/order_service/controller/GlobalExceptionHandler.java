//package com.example.order_service.controller;
//
//import com.example.order_service.dto.ApiErrorResponse;
//import feign.FeignException;
//import jakarta.persistence.EntityNotFoundException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(FeignException.class)
//    public ResponseEntity<ApiErrorResponse> handleFeignException(FeignException ex) {
//        ApiErrorResponse error =
//                new ApiErrorResponse("Dependent service unavailable", 503);
//        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(error);
//    }
//
//    @ExceptionHandler(EntityNotFoundException.class)
//    public ResponseEntity<ApiErrorResponse> handleEntityNotFound(EntityNotFoundException ex) {
//        ApiErrorResponse error =
//                new ApiErrorResponse(ex.getMessage(), 404);
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
//    }
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ApiErrorResponse> handleGenericException(Exception ex) {
//        ApiErrorResponse error =
//                new ApiErrorResponse("Internal server error", 500);
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
//    }
//}
