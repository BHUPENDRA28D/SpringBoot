import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface RetroInterface {


        @GET("posts/{id}")
        Call<Root> getPostById(@Path("id") String id);

}
