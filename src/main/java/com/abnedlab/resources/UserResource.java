package com.abnedlab.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.abnedlab.entities.User;
import com.abnedlab.forms.UserForm;
import com.abnedlab.repositories.UserRepository;

import org.jboss.resteasy.annotations.Form;

@Produces(MediaType.APPLICATION_JSON)
@Path("/users")
public class UserResource {

    @Inject
    UserRepository userRepository;

    @GET
    public List<User> getAll() {
        return userRepository.findAll().list();
    }

    @POST
    public User createUser(@Form UserForm form) {
        return userRepository.create(form);
    }
}