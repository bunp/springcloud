package ind.charlie.frameworkfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @version 1.0
 * @Description
 * @Author yh
 * @Date 2019/9/6
 **/
@FeignClient(name = "charlie-manage",fallback = FeignServiceImpl.class)
public interface FeignService {

    @GetMapping(value = "/test/test3333")
    public String hello();
}
