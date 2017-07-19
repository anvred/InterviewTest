package test.interview.com.interviewtest.network;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import test.interview.com.interviewtest.model.DataModel;

/**
 * Created by ashishkarnay on 7/19/17.
 */

public interface RequestInterface {
    @GET("users")
    Observable<List<DataModel>> register();

}
