package service0;

import java.util.Date;

import org.apache.commons.lang.time.FastDateFormat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
public class MyTest {

  @Autowired
  private RestTemplate restTemplate;

  @Test
  public String test() {
    System.err.println("test1");
    System.err.println(
        restTemplate.getForEntity("http://testservice-provider/test", String.class).getBody());
    return FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss.sss").format(new Date());
  }
}
