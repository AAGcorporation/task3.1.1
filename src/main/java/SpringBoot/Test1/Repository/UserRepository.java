package SpringBoot.Test1.Repository;

import SpringBoot.Test1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
