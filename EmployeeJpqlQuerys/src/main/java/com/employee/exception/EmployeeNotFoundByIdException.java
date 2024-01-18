package com.employee.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeNotFoundByIdException extends RuntimeException{
	
	String message;
	
	

}
