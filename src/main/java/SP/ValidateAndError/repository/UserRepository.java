package SP.ValidateAndError.repository;
import SP.ValidateAndError.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUserId(int id);

}
