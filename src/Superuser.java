public class Superuser implements Loginable{

    public String name;
    public Login login;

    @Override
    public Login getLogin() {
        return this.login;
    }

}
