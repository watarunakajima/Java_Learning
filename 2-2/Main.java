public class Main {
    public static void main(String[] args) {
        PremiumUser premiumUser = new PremiumUser("user01", "user01@example.com", 10);
        GuestUser guestUser = new GuestUser();

        System.out.println("premiumUserの情報");
        premiumUser.displayUserInfo();
        System.out.println("\nguestUserの情報");
        guestUser.displayUserInfo();
    }
}

class User {
    private String id;
    private String mail;

    User(String id, String mail) {
        this.id = id;
        this.mail = mail;
    }

    void displayUserInfo() {
        System.out.println("ID: " + this.id + "\nE-Mail: " + this.mail);
    }
}
class PremiumUser extends User{
    private int premiumRank;

    PremiumUser(String id, String mail,int premiumRank){
        super(id,mail);
        this.premiumRank = premiumRank;
    }

    @Override
    void displayUserInfo() {
        super.displayUserInfo();
        System.out.println("PremiumRank: " + this.premiumRank);
        //System.out.println("ID: " + this.id + "\nE-Mail: " + this.mail+ "\nPremiumRank: " + this.premiumRank);
    }
}

class GuestUser extends User{
    GuestUser(){
        super("","");
    }

    @Override
    void displayUserInfo() {
        System.out.println("ゲストユーザなので情報はありません");
    }
}