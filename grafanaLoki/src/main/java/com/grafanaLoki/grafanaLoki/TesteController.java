package com.grafanaLoki.grafanaLoki;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/loki")
public class TesteController {

    @GetMapping
    public String teste() {
        log.warn("Testando grafana loki");
        return "Passou";
    }
}
