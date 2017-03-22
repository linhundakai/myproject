/**  
 * @Title: AccessFilter.java 
 * @Package cn.demo.reverseProxy 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author linhong.li  
 * @date 2017年3月20日 下午6:15:09 
 * @version V1.0  
 */ 
package cn.demo.config;

import com.netflix.zuul.ZuulFilter;

/** 
 * @ClassName: AccessFilter 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author linhong.li 
 * @date 2017年3月20日 下午6:15:09  
 */
public class AccessFilter extends ZuulFilter {

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
    System.err.println("test");
    return null;
  }

  /**
   * 
   * @Title: filterType 
   * @Description: filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
    pre：可以在请求被路由之前调用
    routing：在路由请求时候被调用
    post：在routing和error过滤器之后被调用
    error：处理请求时发生错误时被调用
   * @return 
   * @see com.netflix.zuul.ZuulFilter#filterType()
   */
  @Override
  public String filterType() {
    return "pre";
  }

  /**
   * 
   * @Title: filterOrder 
   * @Description: filterOrder：通过int值来定义过滤器的执行顺序
   * @return 
   * @see com.netflix.zuul.ZuulFilter#filterOrder()
   */
  @Override
  public int filterOrder() {
    return 0;
  }

}
