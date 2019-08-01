package com.maitrongnghia.restapi.security.utils;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.List;
import java.util.stream.Collectors;

public class SecurityUtils {
//
//    public static MyUserDetail getMyUserDetail() {
//        return (MyUserDetail) (SecurityContextHolder.getContext()).getAuthentication().getPrincipal();
//    }
//
//    public static List<String> getAuthorities() {
//        List<GrantedAuthority> authorities = (List<GrantedAuthority>) (SecurityContextHolder.getContext().getAuthentication().getAuthorities());
//        return authorities.stream()
//                .map(GrantedAuthority::getAuthority)
//                .collect(Collectors.toList());
//    }
}
