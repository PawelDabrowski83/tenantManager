package pl.edu.pjwstk.tenantManager.app;

import pl.edu.pjwstk.tenantManager.model.Developer;
import pl.edu.pjwstk.tenantManager.service.DeveloperGenerator;

public class Main {
    public static void main(String[] args) {



        Developer developer = DeveloperGenerator.generateDeveloper();


        Console.run();




    }

}
