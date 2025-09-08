package com.paning.deleteemployee.modeldto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private LocalDateTime temestamp;
    private int status;
    private String error;
    private String message;
    private String path;
    private List<String> details;
}
