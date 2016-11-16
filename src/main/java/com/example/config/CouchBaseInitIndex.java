
package com.example.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.query.N1qlQuery;

/**
 * @author msaritas
 *
 */

@Component
public class CouchBaseInitIndex {

     private final Bucket bucket;

     @Autowired
     public CouchBaseInitIndex(Bucket bucket) {
          this.bucket = bucket;
     }

     @PostConstruct
     private void initCreateIndexes() {
          bucket.query(N1qlQuery.simple("CREATE PRIMARY INDEX NETAS_PK ON netascouchdb USING GSI"));
          bucket.query(N1qlQuery.simple("CREATE INDEX TYPE_INDEX ON netascouchdb(`type`) USING GSI"));

     }
}
