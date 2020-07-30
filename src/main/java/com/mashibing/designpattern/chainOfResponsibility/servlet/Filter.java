package com.mashibing.designpattern.chainOfResponsibility.servlet;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.chainOfResponsibility.servlet.Filter
 * @Description: TODO
 * @date 2020/7/30 16:54
 */
public interface Filter {

  boolean doFilter(Request request,Response response,FilterChain filterChain);

}
