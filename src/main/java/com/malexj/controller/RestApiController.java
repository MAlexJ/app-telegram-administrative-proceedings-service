package com.malexj.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class RestApiController {

  @PostMapping("status")
  public Mono<ResponseEntity<String>> status() {
    return Mono.just(ResponseEntity.ok().body("ok!"));
  }
}
