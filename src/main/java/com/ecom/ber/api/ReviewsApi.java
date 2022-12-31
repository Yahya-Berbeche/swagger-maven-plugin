package com.ecom.ber.api;


import com.ecom.ber.api.models.SearchReviews;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/data")
public interface ReviewsApi {

    @GET
    @ApiOperation("ReviewsApi")
    @Path("/reviews.json")
    @Produces(MediaType.APPLICATION_JSON)
    SearchReviews getReviews(@QueryParam("api_version") String apiVersion, @QueryParam("Feedback") String feedback);
}
