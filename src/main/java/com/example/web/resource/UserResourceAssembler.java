
package com.example.web.resource;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.example.domain.User;
import com.example.web.controller.UserController;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * @author msaritas
 * 
 */
public class UserResourceAssembler extends ResourceAssemblerSupport<User, UserResource> {

     public UserResourceAssembler() {
          super(UserController.class, UserResource.class);
     }

     @Override
     public UserResource toResource(User user) {
          UserResource userResource = new UserResource(user.getUserName(), user.getLastName(), user.getPhoneNumber());
          try {
               userResource.add(linkTo(methodOn(UserController.class).load(user.getId())).withSelfRel());
          } catch (Exception e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
          }

          return userResource;

     }

}
