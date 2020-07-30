package com.mashibing.designpattern.chainOfResponsibility.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gangquan.hu
 * @Package: com.mashibing.designpattern.chainOfResponsibility.servlet.FilterChain
 * @Description: TODO
 * @date 2020/7/30 16:55
 */
public class FilterChain{

  List<Filter> filters = new ArrayList<>();

  private int step = 0;

  FilterChain addFilter(Filter filter){
    filters.add(filter);
    return this;
  }

  public boolean doFilter(Request request, Response response) {

    System.out.println("FilterChain doFilter pre handle,step="+step);

    //找到下一个过滤器
    if(step<filters.size()){
      Filter filter = filters.get(step++);
      filter.doFilter(request,response,this);
    }

    System.out.println("FilterChain doFilter post handle,step="+step);

    return true;
  }

}
