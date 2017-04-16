package com.codedestine;
 
import java.util.Iterator;
 
import org.json.JSONArray;
import org.json.JSONObject;
 
public class JsonUtility {
 
   public static String json = "{ \"id\": 01, \"language\": \"Java\", \"edition\": \"third\", \"author\": \"Herbert Schildt\", \"chapters\": [\"chapter 1\",\"chapter 2\",\"chapter 3\"] }";
  
   public void readJson(String json){
     JSONObject jsonObj = new JSONObject(json);
  
     String id = jsonObj.getString("id");
     System.out.println(id);
  
     String language = jsonObj.getString("language");
     System.out.println(language);
  
     String edition = jsonObj.getString("edition");
     System.out.println(edition);
  
     String author = jsonObj.getString("author");
     System.out.println(author);
  
     JSONArray chapters = (JSONArray) jsonObj.get("chapters");
     Iterator<Object> iterator = chapters.iterator();
     while (iterator.hasNext()) {
        System.out.println(iterator.next());
     }
   }
  
   public static void main(String args[]){
     JsonUtility utility = new JsonUtility();
     //read
     utility.readJson(json);
   }
 
}