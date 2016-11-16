
package com.example.domain;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;
import com.example.domain.util.AbstractAuditingCouchBaseEntity;

/**
 * @author msaritas
 *
 */

@Document
public class User extends AbstractAuditingCouchBaseEntity {

     @Id
     private Long id;

     @Field
     private String userName;

     @Field
     private String lastName;

     @Field
     private String phoneNumber;

     @Field
     private boolean deleted;

     @Field
     private String type = "user";

     /**
      * 
      */
     public User() {
     }

     /**
      * 
      * @param userName
      * @param lastName
      * @param phoneNumber
      */
     public User(String userName, String lastName, String phoneNumber) {
          this.userName = userName;
          this.lastName = lastName;
          this.phoneNumber = phoneNumber;
     }

     /**
      * 
      * @param id
      * @param userName
      * @param lastName
      * @param phoneNumber
      */
     public User(Long id, String userName, String lastName, String phoneNumber) {
          this.id = id;
          this.userName = userName;
          this.lastName = lastName;
          this.phoneNumber = phoneNumber;
     }

     public Long getId() {
          return id;
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

     public void setId(Long id) {
          this.id = id;
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

     public String getType() {
          return type;
     }

     public void setType(String type) {
          this.type = type;
     }

     public boolean isDeleted() {
          return deleted;
     }

     public void setDeleted(boolean deleted) {
          this.deleted = deleted;
     }

}
