
package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.couchbase.core.CouchbaseTemplate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.view.ViewQuery;
import com.example.domain.User;
import com.example.exception.UserNotFoundException;
import com.example.repository.UserRepository;
import com.example.web.resource.UserResource;

/**
 * @author msaritas
 *
 */

@Service
public class UserService {

     private static final String DESIGN_DOC = "user";

     private final Bucket bucket;

     private final UserRepository userRepository;

     private final CouchbaseTemplate template;

     @Autowired
     public UserService(UserRepository userRepository, Bucket bucket, CouchbaseTemplate template) {
          this.userRepository = userRepository;
          this.bucket = bucket;
          this.template = template;

     }

     /**
      * 
      * @param resource
      * @return
      */
     public User create(UserResource resource) {
          long id = bucket.counter("user", 1, 1).content();
          User user = new User(id, resource.getUserName(), resource.getLastName(), resource.getPhoneNumber());
          userRepository.save(user);
          return user;
     }

     /**
      *
      * @return
      */
     public Page<User> findAll(Pageable pageable) {
          return userRepository.findByDeletedFalse(pageable);

     }

     /**
      * 
      * @param documentId
      * @return
      * @throws UserNotFoundException
      */
     public User load(Long id) throws UserNotFoundException {
          User user = template.findById(id.toString(), User.class);
          if (user != null) {
               return user;
          } else {
               throw new UserNotFoundException();
          }

     }

     public List<User> findAll() {
          return template.findByView(ViewQuery.from(DESIGN_DOC, "all"), User.class);
     }

}
