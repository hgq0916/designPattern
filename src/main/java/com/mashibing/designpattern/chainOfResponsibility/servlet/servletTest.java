package com.mashibing.designpattern.chainOfResponsibility.servlet;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.chainOfResponsibility.servlet.servletTest
 * @Description: TODO
 * @date 2020/7/30 17:23
 */
public class servletTest {

  public static void main(String[] args) {
    FilterChain filterChain = new FilterChain();
    filterChain.addFilter(new UrlFilter()).addFilter(new SensiveFilter()).addFilter(new FaceFilter());

    Request request = new Request();
    request.setContent("大家好，:),<script>欢迎来到mashibing.com,大家一起交流，工作966");
    Response response = new Response();
    filterChain.doFilter(request,response);
  }

}
