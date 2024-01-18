package com.employee.response;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ResponseMessage {
	
	String message;
	Integer code;
	String status;
	LocalDateTime dateTime;

}
