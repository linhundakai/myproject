/**  
 * @Title: ConfigBeans.java 
 * @Package cn.demo.service0 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author linhong.li  
 * @date 2017年3月21日 上午11:26:54 
 * @version V1.0  
 */ 
package cn.demo.service0.comfig;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/** 
 * @ClassName: ConfigBeans 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author linhong.li 
 * @date 2017年3月21日 上午11:26:54  
 */
@Configuration
public class ConfigBeans {

  @Bean  
  @LoadBalanced  
  public RestTemplate restTemplate() {  
      return new RestTemplate();  
  }  
}
