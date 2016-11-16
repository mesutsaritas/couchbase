
package com.example.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.web.resource.util.ErrorResource;

/**
 * @author msaritas
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {

     @ExceptionHandler(value = UserNotFoundException.class)
     public @ResponseBody ResponseEntity<ErrorResource> userNotFoundError(HttpServletRequest req, UserNotFoundException e)
               throws Exception {
          return new ResponseEntity<ErrorResource>(new ErrorResource("user_not_found", "user_not_found..!"),
                    HttpStatus.ALREADY_REPORTED);
     }

}
