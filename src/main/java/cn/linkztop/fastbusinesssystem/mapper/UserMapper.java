package cn.linkztop.fastbusinesssystem.mapper;

import cn.linkztop.fastbusinesssystem.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author nasico
 */
@Repository
public interface UserMapper {
    /**
     * 根据用户名获取用户信息
     * @param username
     * @return
     */
    User loadUserByUsername(String username);
}
