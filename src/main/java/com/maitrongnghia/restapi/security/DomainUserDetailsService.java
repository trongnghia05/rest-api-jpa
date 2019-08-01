package com.maitrongnghia.restapi.security;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.text.MessageFormat;
import java.util.List;
import java.util.stream.Collectors;

//@Service("userDetailsService")
//@Transactional
//public class DomainUserDetailsService implements UserDetailsService {
//    private final Logger log = Logger.getLogger(DomainUserDetailsService.class);
//    private final UserRepository userRepository;
//    private final HttpServletRequest request;
//
//    public DomainUserDetailsService(UserRepository userRepository, HttpServletRequest request) {
//        this.userRepository = userRepository;
//        this.request = request;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(final String login) {
////        log.debug("load user by username: " + login);
////        String ip = RequestUtils.getClientIP(request);
////        if (loginAttemptService.isBlocked(ip)) {
////            log.debug("blocked ip address: " + ip);
////            throw new RuntimeException("block_ip");
////        }
//
//        String upperCaseLogin = login.toUpperCase();
//        return userRepository.findOneWithAuthoritiesByUsername(upperCaseLogin)
//                .map(user -> createSpringSecurityUser(upperCaseLogin, user))
//                .orElseThrow(() -> new UsernameNotFoundException("User " + upperCaseLogin + " was not found in the database"));
//
//    }
//
//    private org.springframework.security.core.userdetails.User createSpringSecurityUser(String upperCaseLogin, User user) {
//        log.debug(MessageFormat.format("create spring security user: {0}", user.toString()));
//        if (!user.isActivated()) {
//            throw new UserNotActivatedException(MessageFormat.format("User {0} was not activated", upperCaseLogin));
//        }
//        List<GrantedAuthority> grantedAuthorities = user.getAuthorities().stream()
//                .map(authority -> new SimpleGrantedAuthority(authority.getName()))
//                .collect(Collectors.toList());
//        MyUserDetail myUserDetail = new MyUserDetail(upperCaseLogin, user.getPassword(), grantedAuthorities);
//        BeanUtils.copyProperties(user, myUserDetail);
//        return myUserDetail;
//    }
//
//}
