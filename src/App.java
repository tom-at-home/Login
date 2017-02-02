public class App {

    public static void main(String[] args) {

        User hans = new User();
        User maria = new User();
        Superuser ute = new Superuser();
        hans.name = "Hans";
        maria.name = "Maria";
        ute.name = "Ute";
        Login loginHans = new Login();
        loginHans.benutzername = "hans123";
        loginHans.passwort = "hallo";
        hans.login = loginHans;
        Login loginMaria = new Login();
        loginMaria.benutzername = "Darkblade1";
        loginMaria.passwort = "asd";
        maria.login = loginMaria;
        Login loginUte = new Login();
        loginUte.benutzername = "root";
        loginUte.passwort = "aaaudb2s!";
        ute.login = loginUte;
        Computer computer1 = new Computer();
        computer1.user.add(hans);
        computer1.user.add(maria);
        computer1.user.add(ute);
        computer1.zeigeAngemeldeteUser();
        computer1.anmelden("hans123", "hallo");
        computer1.anmelden("Darkblade1", "weissnichtmehr");
        computer1.anmelden("root", "aaaudb2s!");
        computer1.anmelden("root", "aaaudb2s!");
        computer1.zeigeAngemeldeteUser();

        // Abmeldung ueber den Benutzernamen
        computer1.abmelden("hans123");
        computer1.zeigeAngemeldeteUser();

        // Abmeldung ueber den Benutzer
        computer1.anmelden("hans123", "hallo");
        computer1.zeigeAngemeldeteUser();
        computer1.abmelden(ute);
        computer1.zeigeAngemeldeteUser();

    }
}
