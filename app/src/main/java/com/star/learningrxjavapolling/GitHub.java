package com.star.learningrxjavapolling;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

import static com.star.learningrxjavapolling.MainActivity.PATH;

public interface GitHub {

    @GET(PATH)
    Observable<List<Contributor>> contributors(
            @Path("owner") String owner,
            @Path("repo") String repo);
}
