package com.github.fb010001.webfluxdemo;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import com.github.fb010001.webfluxdemo.demo.Good;
import com.github.fb010001.webfluxdemo.demo.GoodGenerator;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author fangbin
 * @date 19-6-7
 */

@Component
@Configuration
public class GoodHandler {

    private final Flux<Good> goods;

    public GoodHandler(GoodGenerator goodGenerator){
        this.goods = goodGenerator.findGoods();
    }

    public Mono<ServerResponse> hello(ServerRequest request){
        return ok().contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromObject("hello Spring!!!"));
    }

    public Mono<ServerResponse> echo(ServerRequest request){
        return ok().contentType(MediaType.APPLICATION_STREAM_JSON).body(this.goods,Good.class);
    }
}
