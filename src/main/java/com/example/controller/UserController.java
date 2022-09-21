package com.example.controller;

import com.example.bean.User;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Controller("/user")
@Slf4j
public class UserController {

    @Get("/{id}")
    @Produces(MediaType.TEXT_JSON   )
    public Mono<User> getUser(final Long id){
        log.info("getUser id={}",id);
        return Mono.just(User.builder()
                .id(1L)
                .name("Abraham")
                .lastName("Munoz")
                .email("amg3000@hotmail.com")
                .build());
    }
}

