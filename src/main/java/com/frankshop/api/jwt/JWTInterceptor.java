package com.frankshop.api.jwt;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import io.jsonwebtoken.Jwts;
import io.micrometer.core.instrument.util.StringUtils;

@Component
public class JWTInterceptor implements HandlerInterceptor {

    private static final Logger logger = LoggerFactory.getLogger(JWTInterceptor.class);

    @Autowired
    RequestContext context;

    @Value("${jwt.token.secret}")
    String tokenSecret;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        try {

            String tokenData = request.getHeader("Authorization");

            if (!StringUtils.isEmpty(tokenData)) {

                String userId = Jwts.parserBuilder().setSigningKey(tokenSecret.getBytes("UTF-8"))
                        .build().parseClaimsJws(tokenData).getBody().getSubject();
                if (!StringUtils.isEmpty(userId)) {

                    context.setUserId(userId);
                }
            }

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        return true;
    }

}
