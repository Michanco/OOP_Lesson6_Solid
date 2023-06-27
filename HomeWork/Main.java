public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		User user2 = new User("John");
		user.report();
		user2.report();
		user.save();
		user2.save();
	}
}