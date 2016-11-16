package com.example.web.resource.util;

import java.util.Date;

/**
 * @author msaritas
 *
 */
public class AuditResource {

     private String creator;

     private String lastModifiedBy;

     private Date lastModification;

     private Date creationDate;

     private long version;

     /**
      * 
      * @param creator
      * @param lastModifiedBy
      * @param lastModification
      * @param creationDate
      * @param version
      */
     public AuditResource(String creator, String lastModifiedBy, Date lastModification, Date creationDate, long version) {
          this.creator = creator;
          this.lastModifiedBy = lastModifiedBy;
          this.lastModification = lastModification;
          this.creationDate = creationDate;
          this.version = version;
     }

     public String getCreator() {
          return creator;
     }

     public void setCreator(String creator) {
          this.creator = creator;
     }

     public String getLastModifiedBy() {
          return lastModifiedBy;
     }

     public void setLastModifiedBy(String lastModifiedBy) {
          this.lastModifiedBy = lastModifiedBy;
     }

     public Date getLastModification() {
          return lastModification;
     }

     public void setLastModification(Date lastModification) {
          this.lastModification = lastModification;
     }

     public Date getCreationDate() {
          return creationDate;
     }

     public void setCreationDate(Date creationDate) {
          this.creationDate = creationDate;
     }

     public long getVersion() {
          return version;
     }

     public void setVersion(long version) {
          this.version = version;
     }

}
