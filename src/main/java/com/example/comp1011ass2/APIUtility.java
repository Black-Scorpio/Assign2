package com.example.comp1011ass2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIUtility {

    public static String getJsonString() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        String uri = "https://official-joke-api.appspot.com/random_joke";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        HttpResponse<Path> jokeFile = client.send(request, HttpResponse.BodyHandlers.ofFile(Paths.get("jokeInfo.json")));
        return response.body();
    }
}
