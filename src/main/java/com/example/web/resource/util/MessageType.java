
package com.example.web.resource.util;

/**
 * @author msaritas
 *
 */
public enum MessageType {
     ERROR("error"), SUCCESS("success"), WARNING("warning"), INFO("info");

     private String type;

     MessageType(String type) {
          this.type = type;
     }

     public String type() {
          return this.type;
     }

}