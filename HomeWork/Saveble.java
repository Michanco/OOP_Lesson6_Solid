public interface Saveble {
    static void save(User user){
        System.out.println("Save user: " + user.getName());
    }
}
