public class MethodsPractice {
    public static void main(String[] args) {
        loginUser("neo", "followthewhiterabbit");
    }

    public static void loginUser(String Username, String password) {

        if (Username.equals("neo") && password.equals("followthewhiterabbit")){
            System.out.println("Welcome,Neo");

        } else {
            System.out.println("Invalid username or password");
        }
    }
}

