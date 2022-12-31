package com.ecom.ber.api.models;

import lombok.Builder;
import lombok.Getter;

import java.util.Calendar;
import java.util.Map;

@Builder
@Getter
public class SearchReviews {
    private Calendar updateDate;
    private Map<String, Review> reviews;

}
