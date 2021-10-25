package no.hvl.dat250.models;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class ScheduleResponse {
    private DomainResponse domainResponse;
    private LocalDateTime scheduleTime;

    public ScheduleResponse() {}

    public ScheduleResponse(DomainResponse domainResponse, LocalDateTime scheduleTime) {
        this.domainResponse = domainResponse;
        this.scheduleTime = scheduleTime;
    }
}
