package com.exam.model;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by burakkutbay on 14.02.2019.
 */

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String role;
    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private Collection<com.exam.model.User> users;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Collection<com.exam.model.User> getUsers() {
        return users;
    }

    public void setUsers(Collection<com.exam.model.User> users) {
        this.users = users;
    }
}
