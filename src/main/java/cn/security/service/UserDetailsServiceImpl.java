package cn.security.service;

import cn.security.common.bean.TestUser;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by viruser on 2018/8/8.
 */

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TestUser user = new TestUser(username, username, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
        return user;
    }
}
