package com.mashibing.designpattern.chainOfResponsibility.servlet;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.chainOfResponsibility.servlet.UrlFilter
 * @Description: TODO
 * @date 2020/7/30 17:02
 */
public class UrlFilter implements Filter{


  @Override
  public boolean doFilter(Request request, Response response, FilterChain filterChain) {

    System.out.println("UrlFilter doFilter pre handle");

    String content = request.getContent();
    content = content.replace("mashibing.com","http://mashibing.com");
    request.setContent(content);

    filterChain.doFilter(request,response,filterChain);

    response.write(" [UrlFilter] ");

    System.out.println("UrlFilter doFilter post handle");

    return true;
  }
}
