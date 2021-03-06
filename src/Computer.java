import java.util.ArrayList;

public class Computer {

    public ArrayList<Loginable> user = new ArrayList<>();

    private ArrayList<Loginable> loggedInUser = new ArrayList<>();

    public void zeigeAngemeldeteUser(){

        System.out.println("Angemeldet sind:");
        for (Loginable loginable : this.loggedInUser) {
            System.out.println(loginable.getLogin().benutzername + " als " + loginable.getClass().getSimpleName());
        }
    }

    public void anmelden(String username, String pass){

        for (Loginable user : this.user) {
            if(user.getLogin().benutzername.equals(username) &&
                    user.getLogin().passwort.equals(pass)){

                if(!this.loggedInUser.contains(user)) {
                    this.loggedInUser.add(user);
                    System.out.println(user.getLogin().benutzername + " hat sich angeledet.");
                }

            }
        }
    }

    // Abmelden ueber den Benutzernamen
    public void abmelden(String username){

        for (Loginable loginable : this.loggedInUser) {
            if(loginable.getLogin().benutzername.equals(username) ){
                System.out.println(loginable.getLogin().benutzername + " wurde abgemeldet");
                this.loggedInUser.remove(loginable);
                return;
            }
        }
        System.out.println(username + " ist nicht in der Benutzerdatenbank vorhanden.");
    }

    // Abmelden ueber den Benutzer
    public void abmelden(Loginable user){

        this.loggedInUser.remove(user);
        System.out.println(user.getLogin().benutzername + " wurde direkt abgemeldet");

    }

}
