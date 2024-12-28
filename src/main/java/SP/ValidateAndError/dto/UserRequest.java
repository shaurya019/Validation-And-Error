package SP.ValidateAndError.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;
}


//these are request come from frontend application
//particular we need to add the validation that is why i created a separate dto class