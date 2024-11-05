package com.cos.jwt.filter;

import jakarta.servlet.*;

import java.io.IOException;

public class MyFilter1 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        System.out.println("필터1");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
