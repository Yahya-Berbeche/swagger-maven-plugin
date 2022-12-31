package com.ecom.ber.api.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema
public class Feedback {
    private Integer identification;
}
