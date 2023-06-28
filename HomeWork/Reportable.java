public interface Reportable {
    static void report(User user){
        System.out.println("Report for user: " + user.getName());
    }

}
