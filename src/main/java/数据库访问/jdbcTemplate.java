package 数据库访问;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class jdbcTemplate {


}
@Data
@NoArgsConstructor
class User{
    private String name;
    private Integer age;
}
interface UserService{
    int create(String name,Integer age);
    List<User> getByname(String name);
}

@Service
class UserServiceImpl implements UserService{
    @Autowired
private JdbcTemplate jdbcTemplate;
    @Override
    public int create(String name, Integer age) {
        return jdbcTemplate.update("jdbc语句"，参数);
    }

    @Override
    public List<User> getByname(String name) {
        return jdbcTemplate.quary("jdbc语句",参数);
    }
}


