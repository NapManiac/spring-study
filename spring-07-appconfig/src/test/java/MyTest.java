import com.fly.config.MyConfig;
import com.fly.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
   @Test
   public void test() {
       ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
       User user = context.getBean("getUser", User.class);
       System.out.println(user.getName());
   }
}
