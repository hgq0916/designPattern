package com.mashibing.designpattern.chainOfResponsibility.servlet;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.chainOfResponsibility.servlet.SensiveFilter
 * @Description: TODO
 * @date 2020/7/30 17:17
 */
public class SensiveFilter implements Filter {

  @Override
  public boolean doFilter(Request request, Response response, FilterChain filterChain) {

    System.out.println("SensiveFilter doFilter pre handle");

    String content = request.getContent();
    content = content.replace("966","955");
    request.setContent(content);

    filterChain.doFilter(request,response);

    response.write(" [SensiveFilter] ");

    System.out.println("SensiveFilter doFilter post handle");

    return true;
  }
}
