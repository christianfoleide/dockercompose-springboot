package no.hvl.dat250.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
public class DomainResponse {
    private String status;
    private LocalDateTime time;

    public DomainResponse() {}

    public DomainResponse(String status, LocalDateTime time) {
        this.status = status;
        this.time = time;
    }
}
