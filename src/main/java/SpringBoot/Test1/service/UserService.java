package SpringBoot.Test1.service;

import SpringBoot.Test1.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User addUser(User user);

    void delete(User user);

    Optional<User> findById(Long id);

    User editUser(User user);

    List<User> getAll();
}
