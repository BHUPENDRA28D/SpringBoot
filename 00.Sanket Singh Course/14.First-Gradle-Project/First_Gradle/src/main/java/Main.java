import okhttp3.OkHttp;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String url = "https://jsonplaceholder.typicode.com/todos";


        System.out.println("Hello Bhupendra Makode");

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()){
           if(!response.isSuccessful()){
               System.out.println("Something want wrong !! ");
           }
            System.out.println(response.body().string());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
