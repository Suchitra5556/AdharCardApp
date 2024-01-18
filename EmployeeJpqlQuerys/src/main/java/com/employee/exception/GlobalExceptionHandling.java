package com.employee.exception;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employee.response.ResponseMessage;

@RestControllerAdvice
public class GlobalExceptionHandling {
	
//	@ExceptionHandler(EmployeeNotFoundWithAddressAndNameException.class)
//	public String employeeNotFoundWithAddressAndNameException(EmployeeNotFoundWithAddressAndNameException e) {
//		
//		return e.getMessage();
//		
//	}
	
//	@ExceptionHandler(EmployeeNotFoundWithAddressAndNameException.class)
//	public ResponseMessage employeeNotFoundWithAddressAndNameException(EmployeeNotFoundWithAddressAndNameException e) {
//		
//		ResponseMessage responseMessage = new ResponseMessage();
//		responseMessage.setMessage(e.getMessage());
//		return  responseMessage;
//		
//	}
	
	@ExceptionHandler(EmployeeNotFoundWithAddressAndNameException.class)
	public ResponseEntity<ResponseMessage> employeeNotFoundWithAddressAndNameException(EmployeeNotFoundWithAddressAndNameException e) {
		
		ResponseMessage responseMessage = new ResponseMessage();
		responseMessage.setMessage(e.getMessage());
		responseMessage.setCode(HttpStatus.NOT_FOUND.value());
		responseMessage.setStatus("Value Not Found In DB");
		responseMessage.setDateTime(LocalDateTime.now());
		return  new ResponseEntity<ResponseMessage>(responseMessage,HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(SalaryNotFoundException.class)
	public ResponseEntity<ResponseMessage> salaryNotFoundException(SalaryNotFoundException e) {
		
		ResponseMessage responseMessage = new ResponseMessage();
		responseMessage.setMessage(e.getMessage());
		responseMessage.setCode(HttpStatus.NOT_FOUND.value());
		responseMessage.setStatus("Value Not Found In DB");
		responseMessage.setDateTime(LocalDateTime.now());
		return  new ResponseEntity<ResponseMessage>(responseMessage,HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(EmployeeNotFoundByIdException.class)
	public ResponseEntity<ResponseMessage> employeeNotFoundByIdException(EmployeeNotFoundByIdException e) {
		
		ResponseMessage responseMessage = new ResponseMessage();
		responseMessage.setMessage(e.getMessage());
		responseMessage.setCode(HttpStatus.NOT_FOUND.value());
		responseMessage.setStatus("Value Not Found In DB");
		responseMessage.setDateTime(LocalDateTime.now());
		return  new ResponseEntity<ResponseMessage>(responseMessage,HttpStatus.NOT_FOUND);
		
	}
	@ExceptionHandler(EmployeeNotFoundWithAddressException.class)
	public ResponseEntity<ResponseMessage> employeeNotFoundWithAddressException(EmployeeNotFoundWithAddressException e) {
		
		ResponseMessage responseMessage = new ResponseMessage();
		responseMessage.setMessage(e.getMessage());
		responseMessage.setCode(HttpStatus.NOT_FOUND.value());
		responseMessage.setStatus("Value Not Found In DB");
		responseMessage.setDateTime(LocalDateTime.now());
		return  new ResponseEntity<ResponseMessage>(responseMessage,HttpStatus.NOT_FOUND);
		
	}
	// Gloable Exception Handdler
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseMessage> gloableExceptionHandler(Exception e) {
		
		ResponseMessage responseMessage = new ResponseMessage();
		responseMessage.setMessage(e.getMessage());
		responseMessage.setCode(HttpStatus.NOT_FOUND.value());
		responseMessage.setStatus("Value Not Found In DB");
		responseMessage.setDateTime(LocalDateTime.now());
		return  new ResponseEntity<ResponseMessage>(responseMessage,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	//Entity Filed Validation
	
	/*
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value= MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    Map<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	    });
	    return errors;
	}
	*/
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value= MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) 
	{
		
	    Map<String, String> errors = new HashMap<>();
	   List<ObjectError> listOfError = ex.getBindingResult().getAllErrors();
	   for(ObjectError e: listOfError)
	   {
		   String fieldName = ((FieldError) e).getField();
		   String defaultMessage = e.getDefaultMessage();
		   errors.put(fieldName, defaultMessage);
	   }
	    return errors;
	}


}
