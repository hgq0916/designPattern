package com.mashibing.designpattern.chainOfResponsibility.servlet;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.chainOfResponsibility.servlet.SensiveFilter
 * @Description: TODO
 * @date 2020/7/30 17:17
 */
public class FaceFilter implements Filter {

  @Override
  public boolean doFilter(Request request, Response response, FilterChain filterChain) {

    System.out.println("FaceFilter doFilter pre handle");

    String content = request.getContent();
    content = content.replace(":)","^V^");
    request.setContent(content);

    filterChain.doFilter(request,response,filterChain);

    response.write(" [FaceFilter] ");

    System.out.println("FaceFilter doFilter post handle");

    return true;
  }
}
