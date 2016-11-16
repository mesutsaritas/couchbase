package com.example.domain.util;

import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.couchbase.core.mapping.Document;

/**
 * @author msaritas
 *
 */

@Document
public class AbstractAuditingCouchBaseEntity {

     private String value;

     @CreatedBy
     private String creator;

     @LastModifiedBy
     private String lastModifiedBy;

     @LastModifiedDate
     private Date lastModification;

     @CreatedDate
     private Date creationDate;

     @Version
     private long version;

     public String getValue() {
          return value;
     }

     public void setValue(String value) {
          this.value = value;
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
