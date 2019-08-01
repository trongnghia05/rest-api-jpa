package com.maitrongnghia.restapi.security;


import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//@Component
//public class AuthenticationSuccessEventListener extends SimpleUrlAuthenticationSuccessHandler {
//    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//
//    @Override
//    protected void handle(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
//        String targetUrl = determineTargetUrl(authentication);
//        if (response.isCommitted()) {
//            logger.error("Can't redirect");
//            return;
//        }
//        redirectStrategy.sendRedirect(request, response, targetUrl);
//    }
//
//    public String determineTargetUrl(Authentication authentication) {
//        String url = "";
//        List<String> roles = SecurityUtils.getAuthorities();
//        if (isAdmin(roles)) {
//            url = "/admin";
//        } else if (isUser(roles)) {
//            url = "/user";
//        }else if(isTeacher(roles)){
//            url = "/teacher";
//        }
//        return url;
//    }
//
//    public RedirectStrategy getRedirectStrategy() {
//        return redirectStrategy;
//    }
//
//    public void setRedirectStrategy(RedirectStrategy redirectStrategy) {
//        this.redirectStrategy = redirectStrategy;
//    }
//
//    private boolean isUser(List<String> roles) {
//        return roles.contains("ROLE_USER");
//    }
//
//    private boolean isAdmin(List<String> roles) {
//        return roles.contains("ROLE_ADMIN");
//    }
//    private boolean isTeacher(List<String> roles) {
//        return roles.contains("ROLE_TEACHER");
//    }
//}
