package cn.linkztop.fastbusinesssystem.service.impl;

import cn.linkztop.fastbusinesssystem.entity.User;
import cn.linkztop.fastbusinesssystem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author nasico
 */
@Service
public class AuthServiceImpl implements UserDetailsService {

    @Autowired
    UserMapper userMapper;

    /**
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException(String.format("the user %s is not found",username));
        }
        return user;
    }

}
