package org.revo

import org.springframework.security.core.authority.AuthorityUtils
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

/**
 * Created by revo on 3/24/16.
 */
@Service
class LoginService implements UserDetailsService {

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        new User(username,new BCryptPasswordEncoder().encode(username),AuthorityUtils.createAuthorityList("USER"))
    }
}
