
package com.example.web.resource.util;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author msaritas
 *
 */
public class ErrorResource extends AbstractMessage implements Serializable {

     private static final long serialVersionUID = 1L;

     @JsonProperty(value = "error_description")
     private final String desc;

     @JsonProperty(value = "error")
     private final String error;

     public ErrorResource(String error) {
          super(MessageType.ERROR);
          this.error = error;
          this.desc = "";
     }

     public ErrorResource(String error, String desc) {
          super(MessageType.ERROR);
          this.error = error;
          this.desc = desc;
     }

     public String getDesc() {
          return desc;
     }

     public String getError() {
          return error;
     }
}
