package ind.charlie.frameworkfeign.service;

import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Description
 * @Author yh
 * @Date 2019/9/6
 **/
@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String hello() {
        return "error";
    }
}
