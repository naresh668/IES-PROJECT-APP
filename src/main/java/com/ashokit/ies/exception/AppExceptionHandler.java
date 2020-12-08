package com.ashokit.ies.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@Controller
@ControllerAdvice
public class AppExceptionHandler {
	
	
	
	
	
   @ExceptionHandler(value=NullPointerException.class)
	public String handleNullPonterException(Model model) {
		
    	model.addAttribute("null","your entered number is wrong try with correct valid number");
    	
    	return "error";
		
		
	}
   
  
   @ExceptionHandler(NoSuchElementException.class)
   public final ResponseEntity<Object> handleUserNotFoundException(NoSuchElementException ex, WebRequest request) {
       List<String> details = new ArrayList<>();
       details.add(ex.getLocalizedMessage());
       ErrorResponse error = new ErrorResponse("Record Not Found", details);
       return new ResponseEntity(error, HttpStatus.NOT_FOUND);
   }
}

