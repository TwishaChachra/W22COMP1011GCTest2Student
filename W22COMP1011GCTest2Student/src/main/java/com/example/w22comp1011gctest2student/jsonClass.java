/* Name - Twisha Chachra
Student Number - 200474646 */
package com.example.w22comp1011gctest2student;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.FileReader;
import java.util.ArrayList;

public class jsonClass {
    public static ArrayList<Customer> loadDataFromJson(){
        ArrayList<Customer> customers = new ArrayList<>();
        Gson gson = new Gson();
        try(FileReader fileReader = new FileReader("customer.json");
        JsonReader jsonReader = new JsonReader(fileReader)){
            customers = gson.fromJson(jsonReader, new TypeToken<ArrayList<Customer>>(){}.getType());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return customers;
    }
}
