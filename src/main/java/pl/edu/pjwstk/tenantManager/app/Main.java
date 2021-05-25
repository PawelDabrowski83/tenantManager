package pl.edu.pjwstk.tenantManager.app;

import pl.edu.pjwstk.tenantManager.model.Developer;
import pl.edu.pjwstk.tenantManager.model.HousingEstate;
import pl.edu.pjwstk.tenantManager.service.DeveloperGenerator;
import pl.edu.pjwstk.tenantManager.service.HousingEstateGenerator;

import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) {



        Developer developer = DeveloperGenerator.generateDeveloper();


        System.out.println(developer);




    }

}
