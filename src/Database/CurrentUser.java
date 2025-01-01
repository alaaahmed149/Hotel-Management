package Database;

public class CurrentUser {
    private static String username;
    private static int userId;
    public static void setUser(String user, int id) {
        username = user;
        userId = id;
    }
    public static int getUserId() {
        return userId;
    }
    public static String getUsername() {
        return username;
    }

    // Clear session
    public static void clearUser() {
        userId = 0;
        username = null;
    } 
}
