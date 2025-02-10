import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//        String url = "https://jsonplaceholder.typicode.com/";


        System.out.println("Hello Bhupendra Makode");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetroInterface retroInterface = retrofit.create(RetroInterface.class);

        Root t = retroInterface.getPostById("1").execute().body();
        if (t != null) {
            System.out.println("Post Object downloaded : " + t.toString());
        } else {
            System.out.println("Failed to download the Post Object.");
        }



//        OkHttpClient client = new OkHttpClient();
//
//        Request request = new Request.Builder()
//                .url(url)
//                .build();
//
//        try (Response response = client.newCall(request).execute()){
//           if(!response.isSuccessful()){
//               System.out.println("Something want wrong !! ");
//           }
//            System.out.println(response.body().string());
//        }catch (IOException e){
//            e.printStackTrace();
//        }

    }
}
