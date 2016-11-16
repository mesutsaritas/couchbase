
package com.example.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;
import com.example.service.UserService;
import com.example.web.resource.UserResource;
import com.example.web.resource.UserResourceAssembler;

/**
 * @author msaritas
 *
 */

@RestController
@RequestMapping("/users")
public class UserController {

     private final UserService userService;

     private final UserResourceAssembler userResourceAssembler;

     private final PagedResourcesAssembler<User> pagedResourcesAssembler;

     @Autowired
     public UserController(UserService userService, PagedResourcesAssembler<User> pagedResourcesAssembler) {
          this.userService = userService;
          this.userResourceAssembler = new UserResourceAssembler();
          this.pagedResourcesAssembler = pagedResourcesAssembler;
     }

     /**
      * 
      * @param user
      * @return
      */
     @RequestMapping(method = RequestMethod.POST)
     public ResponseEntity<UserResource> create(@RequestBody UserResource user) {
          return ResponseEntity.ok().body(userResourceAssembler.toResource(userService.create(user)));
     }

     /**
      * 
      * @return
      */
     @RequestMapping
     public ResponseEntity<PagedResources<UserResource>> list(@PageableDefault Pageable pageable) {
          Page<User> users = userService.findAll(pageable);
          return ResponseEntity.ok().body(pagedResourcesAssembler.toResource(users, userResourceAssembler));
     }

     /**
      * 
      * @param documentId
      * @return
      * @throws Exception
      */
     @RequestMapping(value = "/{documentId}", method = RequestMethod.GET)
     public ResponseEntity<UserResource> load(@PathVariable Long documentId) throws Exception {
          return ResponseEntity.ok().body(userResourceAssembler.toResource(userService.load(documentId)));
     }

}
