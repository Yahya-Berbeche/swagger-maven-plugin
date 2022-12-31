package com.ecom.ber.api.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Review {
    private String reviewId;
    private String title;
    private String reviewText;
    private int rating;
}
