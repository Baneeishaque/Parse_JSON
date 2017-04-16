/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codedestine;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author dk
 */
public class Nested_Json {

    public static void main(String args[]) {
        String json = "{ \"pageInfo\": {\"pageName\": \"abc\",\"pagePic\": \"http://example.com/content.jpg\"},\"posts\": [{\"post_id\": \"123456789012_123456789012\",\"actor_id\": \"1234567890\",\"picOfPersonWhoPosted\": \"http://example.com/photo.jpg\",\"nameOfPersonWhoPosted\": \"Jane Doe\",\"message\": \"Sounds cool. Can't wait to see it!\",\"likesCount\": \"2\",\"comments\": [],\"timeOfPost\": \"1234567890\"}]}";

        JSONObject obj = new JSONObject(json);
        String pageName = obj.getJSONObject("pageInfo").getString("pageName");
        System.out.println(pageName);

        JSONArray arr = obj.getJSONArray("posts");
        for (int i = 0; i < arr.length(); i++) {
            String post_id = arr.getJSONObject(i).getString("post_id");
            System.out.println(post_id);

        }
    }

}
