package no.hvl.dat250.controllers;

import lombok.RequiredArgsConstructor;
import no.hvl.dat250.models.DomainResponse;
import no.hvl.dat250.models.ScheduleResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/v1/schedule")
@RequiredArgsConstructor
public class SchedulerController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ScheduleResponse> schedule() {
        var template = new RestTemplate();
        var response = template
                .getForObject("http://domain-api:8080/api/v1/health", DomainResponse.class);

        return ResponseEntity.ok(
                ScheduleResponse.builder()
                        .scheduleTime(LocalDateTime.now())
                        .domainResponse(response)
                        .build()
        );
    }
}
