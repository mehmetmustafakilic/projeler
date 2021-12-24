package com.exam.repository;

import com.exam.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by burakkutbay on 14.02.2019.
 */

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);

    User findByEmail(String email);
}
