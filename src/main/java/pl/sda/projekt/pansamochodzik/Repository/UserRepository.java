package pl.sda.projekt.pansamochodzik.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.projekt.pansamochodzik.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
  //  Optional<User> findByMail(String mail);
}

