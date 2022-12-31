package com.ecom.ber.api.models;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
@Schema
public class SubmitReview {

    private String textContent;
    private Integer rating;
}
