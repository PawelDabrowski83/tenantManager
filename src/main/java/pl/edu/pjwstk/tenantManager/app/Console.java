package pl.edu.pjwstk.tenantManager.app;

import java.util.Scanner;

public class Console {
    public static final String MSG_INTRO = "Witaj w aplikacji TENANT_MANAGER.";
    public static final String MSG_MAIN_MENU = """
            Wybierz opcję:
            1 - Zaloguj się.
            2 - Obejrzyj zasoby developera.
            0 - Wyjście z aplikacji.""";
    public static final String MSG_EXIT = "Do zobaczenia!";

    public static void run(){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(MSG_INTRO);

            String command = "";
            while(!"0".equals(command)) {
                switch(command){
                    case "1" -> login();
                    case "2" -> showAssets();
                }

                System.out.println(MSG_MAIN_MENU);
                command = scanner.nextLine();
            }
            System.out.println(MSG_EXIT);
            System.exit(0);
        }
    }

    private static void login(){

    }

    private static void showAssets(){

    }
}
