/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codedestine;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author dk
 */
public class Weather_Json {

    public static void main(String args[]) {
        String json = "{\n"
                + "  \"coord\": {\n"
                + "    \"lon\": 75.93,\n"
                + "    \"lat\": 10.77\n"
                + "  },\n"
                + "  \"weather\": [\n"
                + "    {\n"
                + "      \"id\": 802,\n"
                + "      \"main\": \"Clouds\",\n"
                + "      \"description\": \"scattered clouds\",\n"
                + "      \"icon\": \"03n\"\n"
                + "    }\n"
                + "  ],\n"
                + "  \"base\": \"stations\",\n"
                + "  \"main\": {\n"
                + "    \"temp\": 302.15,\n"
                + "    \"pressure\": 1011,\n"
                + "    \"humidity\": 74,\n"
                + "    \"temp_min\": 302.15,\n"
                + "    \"temp_max\": 302.15\n"
                + "  },\n"
                + "  \"visibility\": 6000,\n"
                + "  \"wind\": {\n"
                + "    \"speed\": 1.5,\n"
                + "    \"deg\": 330\n"
                + "  },\n"
                + "  \"clouds\": {\n"
                + "    \"all\": 40\n"
                + "  },\n"
                + "  \"dt\": 1492358400,\n"
                + "  \"sys\": {\n"
                + "    \"type\": 1,\n"
                + "    \"id\": 7828,\n"
                + "    \"message\": 0.0093,\n"
                + "    \"country\": \"IN\",\n"
                + "    \"sunrise\": 1492303472,\n"
                + "    \"sunset\": 1492348045\n"
                + "  },\n"
                + "  \"id\": 1259411,\n"
                + "  \"name\": \"Ponnani\",\n"
                + "  \"cod\": 200\n"
                + "}";

        JSONObject obj = new JSONObject(json);

        System.out.println("Coordinates : Longitude " + obj.getJSONObject("coord").getDouble("lon") + ", Latitute " + obj.getJSONObject("coord").getDouble("lat"));

        JSONArray arr = obj.getJSONArray("weather");
        for (int i = 0; i < arr.length(); i++) {
            System.out.println("Weather Condition : " + arr.getJSONObject(i).getString("main") + "-" + arr.getJSONObject(i).getString("description"));

        }

        System.out.println("Temperature : " + obj.getJSONObject("main").getDouble("temp") + "Kelvin (" + obj.getJSONObject("main").getDouble("temp_min") + " Kelvin -" + obj.getJSONObject("main").getDouble("temp_max") + " Kelvin)");

        System.out.println("Pressure : " + obj.getJSONObject("main").getDouble("pressure") + " hPa");
        System.out.println("Humidity: " + obj.getJSONObject("main").getDouble("humidity") + " %");

        System.out.println("Wind : Speed " + obj.getJSONObject("wind").getDouble("speed") + " meter/sec , Direction " + obj.getJSONObject("wind").getDouble("deg") + " degrees");

        System.out.println("Time : " + new Date((long) obj.getLong("dt") * 1000));
        
        SimpleDateFormat simpleTimeFormat = new SimpleDateFormat("hh:mm:ss");
        
        System.out.println("Sun : Rise " + simpleTimeFormat.format(new Date((long) obj.getJSONObject("sys").getLong("sunrise") * 1000)) + ", Set " + simpleTimeFormat.format(new Date((long) obj.getJSONObject("sys").getDouble("sunset") * 1000)));
    }
}
