
package com.example.web.resource.util;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author msaritas
 *
 */
public abstract class AbstractMessage {

     @JsonProperty("type")
     private final MessageType type;

     public AbstractMessage(MessageType type) {
          this.type = type;
     }

     public MessageType getType() {
          return type;
     }
}