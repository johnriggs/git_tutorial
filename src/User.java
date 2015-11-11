public class User {
    private static String userName;

    public static void setName(String name){
        userName = name;
    }

    public static String getName(){
        return userName;
    }
}
