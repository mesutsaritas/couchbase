
package com.example.web.resource;

import org.springframework.hateoas.ResourceSupport;

/**
 * @author msaritas
 *
 */
public class UserResource extends ResourceSupport {

     private Long userId;

     private String userName;

     private String lastName;

     private String phoneNumber;

     public UserResource() {
          super();
     }

     /**
      * 
      * @param id
      * @param userName
      * @param lastName
      * @param phoneNumber
      */
     public UserResource(Long userId, String userName, String lastName, String phoneNumber) {
          this.userId = userId;
          this.userName = userName;
          this.lastName = lastName;
          this.phoneNumber = phoneNumber;
     }

     /**
      * 
      * @param userName
      * @param lastName
      * @param phoneNumber
      */
     public UserResource(String userName, String lastName, String phoneNumber) {
          this.userName = userName;
          this.lastName = lastName;
          this.phoneNumber = phoneNumber;
     }

     public Long getuUerId() {
          return userId;
     }

     public String getUserName() {
          return userName;
     }

     public String getLastName() {
          return lastName;
     }

     public String getPhoneNumber() {
          return phoneNumber;
     }

     public void setId(Long userId) {
          this.userId = userId;
     }

     public void setUserName(String userName) {
          this.userName = userName;
     }

     public void setLastName(String lastName) {
          this.lastName = lastName;
     }

     public void setPhoneNumber(String phoneNumber) {
          this.phoneNumber = phoneNumber;
     }

}
