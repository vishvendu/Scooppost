package com.vishvendupalawat.scooppost.http;

import com.vishvendupalawat.scooppost.apimodel.TopStory;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by vishvendu on 22/12/17.
 */

public interface NycAPI {

        @GET("svc/topstories/v2/{section}.json")
        Call<TopStory> getTopStories(@Path("section") int section ,
                                     @Query("api_key") String apikey);

}
