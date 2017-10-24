package dao;

import com.akvelon.RestapiTestingApplication;
import com.akvelon.dao.UserRepository;
import com.akvelon.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestapiTestingApplication.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void givenGenericEntityRepository_whenSaveAndRetreiveEntity_thenOK(){
        User user = userRepository.save(new User(0,"Vasya"));
        User foundUser = userRepository.findOne(user.getId());
        assertNotNull(foundUser);
    }
}
