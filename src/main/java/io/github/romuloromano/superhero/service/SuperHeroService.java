package io.github.romuloromano.superhero.service;

import com.google.gson.Gson;
import io.github.romuloromano.superhero.model.*;

import static io.github.romuloromano.superhero.util.ConvertJsonToStringUtil.getJsonToString;


public class SuperHeroService {

    private static String WEBSERVICE = "https://superheroapi.com/api/5844502089001507/";
    final static String POWERSTATS = "/powerstats";
    final static String BIOGRAPHY = "/biography";
    final static String APPEARANCE = "/appearance";
    final static String WORK = "/work";
    private static String CONNECTIONS= "/connections";
    final static String IMAGE = "/image";

    public static PowerStats findByIdSuperheroPowerStats(String hero) throws Exception {

        String urlForCall = WEBSERVICE + hero + POWERSTATS;

        try {
            String jsonToString = getJsonToString(urlForCall);

            Gson gson = new Gson();

            return gson.fromJson(jsonToString, PowerStats.class);
        } catch (Exception e) {
            throw new Exception("Error: " + e);
        }
    }


    public static Biography findByIdSuperheroBiography(String hero) throws Exception {

        String urlForCall = WEBSERVICE + hero + BIOGRAPHY;

        try {
            String jsonToString = getJsonToString(urlForCall);

            Gson gson = new Gson();

            return gson.fromJson(jsonToString, Biography.class);
        } catch (Exception e) {
            throw new Exception("Error: " + e);
        }
    }

    public static Appearance findByIdSuperheroAppearance(String hero) throws Exception {

        String urlForCall = WEBSERVICE + hero + APPEARANCE;

        try {
            String jsonToString = getJsonToString(urlForCall);

            Gson gson = new Gson();

            return gson.fromJson(jsonToString, Appearance.class);
        } catch (Exception e) {
            throw new Exception("Error: " + e);
        }
    }

    public static Work findByIdSuperheroWork(String hero) throws Exception {

        String urlForCall = WEBSERVICE + hero + WORK;

        try {
            String jsonToString = getJsonToString(urlForCall);

            Gson gson = new Gson();

            return gson.fromJson(jsonToString, Work.class);
        } catch (Exception e) {
            throw new Exception("Error: " + e);
        }
    }

    public static Connections findByIdSuperheroConnections(String hero) throws Exception {

        String urlForCall = WEBSERVICE + hero + CONNECTIONS;

        try {
            String jsonToString = getJsonToString(urlForCall);

            Gson gson = new Gson();

            return gson.fromJson(jsonToString, Connections.class);
        } catch (Exception e) {
            throw new Exception("Error: " + e);
        }
    }

    public static Image findByIdSuperheroImage(String hero) throws Exception {

        String urlForCall = WEBSERVICE + hero + IMAGE;

        try {
            String jsonToString = getJsonToString(urlForCall);

            Gson gson = new Gson();

            return gson.fromJson(jsonToString, Image.class);
        } catch (Exception e) {
            throw new Exception("Error: " + e);
        }
    }
}
