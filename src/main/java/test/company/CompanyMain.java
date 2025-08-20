package test.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CompanyMain {
    public static void main(String[] args) {
        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

        Company company = new Company(100, "Apple",
                "Apple Computer Inc. 1 infinite Loop", "Cupertino",
                "CA", "95014");
        String jsonCompany = gsonBuilder.toJson(company);
        System.out.println(jsonCompany);
    }
}
