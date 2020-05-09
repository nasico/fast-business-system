package cn.linkztop.fasebusinesssystem.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nasico
 */
@Data
public class User implements UserDetails {
    private String username;
    private String password;
    private String nickName;
    private LocalDateTime registerTime;
    private LocalDateTime lastLoginTime;
    private List<Role> roles;
    private List<GrantedAuthority> authorities;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;

    @Override
    public List<GrantedAuthority> getAuthorities() {
        if (roles != null) {
            authorities = new ArrayList<>(roles.size());
            roles.forEach(role -> {
                authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName()));
            });
        }
        return authorities;
    }
}
