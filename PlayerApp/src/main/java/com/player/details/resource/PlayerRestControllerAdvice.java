package com.player.details.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.player.details.dto.ErrorDTO;


@RestControllerAdvice
public class PlayerRestControllerAdvice {
	@Autowired
	private ErrorDTO errorDTO;
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<ErrorDTO> exceptionHandler(NullPointerException ex)
	{
		errorDTO.setErrorCode(404);
		errorDTO.setDescription(ex.getMessage());
		return new ResponseEntity<ErrorDTO>(errorDTO, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDTO> exceptionHandler(Exception ex)
	{
		errorDTO.setErrorCode(500);
		errorDTO.setDescription(ex.getMessage());
		return new ResponseEntity<ErrorDTO>(errorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
