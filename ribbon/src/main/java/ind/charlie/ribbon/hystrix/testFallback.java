package ind.charlie.ribbon.hystrix;

import ind.charlie.ribbon.service.TestFeign;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Description
 * @Author yh
 * @Date 2019/9/4
 **/
@Component
public class testFallback implements TestFeign {
    @Override
    public String test() {
        return "error";
    }
}
