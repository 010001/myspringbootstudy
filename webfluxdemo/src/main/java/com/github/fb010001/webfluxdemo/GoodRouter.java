package com.github.fb010001.webfluxdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author fangbin
 * @date 19-6-7
 */
@Configuration
public class GoodRouter {

    @Bean
    public RouterFunction<ServerResponse> route(GoodHandler goodHandler){
        return RouterFunctions.route(
                RequestPredicates.GET("/good").and(RequestPredicates.accept(MediaType.ALL.TEXT_PLAIN)),goodHandler::hello)
                .andRoute(RequestPredicates.GET("/goods").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),goodHandler::echo);
    }

}
