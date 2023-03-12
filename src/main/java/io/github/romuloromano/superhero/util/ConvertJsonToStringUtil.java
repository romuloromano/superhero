package io.github.romuloromano.superhero.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConvertJsonToStringUtil {

    private static int successCode = 200;

    public static String convertJsonToString(BufferedReader bufferedReader) {
        String response;
        String jsonToString = "";

        while (true) {
            try {
                if (!((response = bufferedReader.readLine()) != null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            jsonToString += response;
        }
        return jsonToString;
    }

    public static String getJsonToString(String urlForCall) throws IOException {
        URL url = new URL(urlForCall);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        if (connection.getResponseCode() != successCode) {
            throw new RuntimeException("Http error code: " + connection.getResponseCode());
        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String jsonToString = ConvertJsonToStringUtil.convertJsonToString(bufferedReader);
        return jsonToString;
    }
}
