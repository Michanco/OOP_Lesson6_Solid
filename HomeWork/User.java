public class User {
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public void save(){
		Outputable.outSave(this.name);
	}
	
	public void report(){
		Outputable.outReport(this.name);
	}
}