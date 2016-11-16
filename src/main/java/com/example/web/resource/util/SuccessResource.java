
package com.example.web.resource.util;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author msaritas
 *
 */
public class SuccessResource extends AbstractMessage implements Serializable {

     private static final long serialVersionUID = 1L;

     @JsonProperty(value = "success")
     private final String success;

     @JsonProperty(value = "success_description")
     private final String desc;

     public SuccessResource(String success) {
          super(MessageType.SUCCESS);
          this.success = success;
          this.desc = "";
     }

     public SuccessResource(String success, String desc) {
          super(MessageType.SUCCESS);
          this.success = success;
          this.desc = desc;
     }

     public String getSuccess() {
          return success;
     }

     public String getDesc() {
          return desc;
     }

}
