import okhttp3.*;

import java.io.IOException;
import java.net.*;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.Arrays;

public class API {

    public static void M(String name) throws IOException {
        OkHttpClient client = new OkHttpClient();



        //MediaType mediaType = MediaType.parse("text/plain");
        //RequestBody body = RequestBody.create(mediaType, "Никита");

        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
        RequestBody body = RequestBody.create(mediaType, String.format("name=%s&key=674de42f7d6ad14eba118fb0",name) );
        Request request = new Request.Builder()
                .url("https://api.genderapi.io/api/")
                .method("POST", body)
                .addHeader("Content-Type", "application/x-www-form-urlencoded")
                .build();

        //Request request = new Request.Builder()
        //        .url("https://api.genderapi.io/api/?name=michael&key=674de42f7d6ad14eba118fb0")
        //        .method("GET", null)
        //        .build();

        String[] gender = new String[0];

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Запрос к серверу не был успешен: " +
                        response.code() + " " + response.message());
            }
            // вывод тела ответа
            gender = response.body().string().split(",");
        } catch (IOException e) {
            System.out.println("Ошибка подключения: " + e);
        }

        for(int i = 0; i< gender.length; i++){
            if(gender[i].contains("male") || gender[i].contains("female")){
                //System.out.print(gender[i].substring(10, gender[i].length() - 1));
            }

        }
        System.out.print(Arrays.toString(gender) );

    }



}
