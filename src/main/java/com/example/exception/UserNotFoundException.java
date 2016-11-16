
package com.example.exception;

import com.example.web.resource.util.ErrorResource;

/**
 * @author msaritas
 *
 */

public class UserNotFoundException extends Exception {
     private static final long serialVersionUID = 1L;

     private final ErrorResource errorResource;

     public UserNotFoundException() {
          this.errorResource = new ErrorResource("user_not_found", "user is not found!");
     }

     public ErrorResource getErrorResource() {
          return errorResource;
     }
}
