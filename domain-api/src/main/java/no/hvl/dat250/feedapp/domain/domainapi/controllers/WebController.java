package no.hvl.dat250.feedapp.domain.domainapi.controllers;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1")
public class WebController {

    @GetMapping(value = "/health", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HealthCheck> healthCheck() {
        return ResponseEntity.ok(
            HealthCheck.builder()
                    .status("UP")
                    .time(LocalDateTime.now())
                    .build()
        );
    }

    @Builder
    @Data
    private static class HealthCheck {
        private String status;
        private LocalDateTime time;
    }
}
