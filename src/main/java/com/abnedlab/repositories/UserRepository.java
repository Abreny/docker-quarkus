package com.abnedlab.repositories;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import com.abnedlab.entities.User;
import com.abnedlab.forms.UserForm;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {

    @Transactional
    public User create(UserForm form) {
        final User todo = form.user(null);
        persist(todo);
        return todo;
    }
}
