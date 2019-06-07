package com.github.fb010001.webfluxdemo.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

/**
 * @author fangbin
 * @date 19-6-7
 */

@Configuration
public class GoodGenerator {

    public Flux<Good> findGoods(){
        List<Good> goods = new ArrayList<Good>();
        goods.add(new Good(1,"小米","2000"));
        goods.add(new Good(2,"华为","4000"));
        goods.add(new Good(3,"苹果","8000"));
        return Flux.fromIterable(goods);
    }

}
