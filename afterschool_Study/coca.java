package pepsi;

public class coca {

	public static void main(String[] args) {
		
		Poketmon p1 = new Poketmon();
		p1.name = "고라파덕";
		
		System.out.println(p1.name+"의 레벨은 : "+p1.level);
		System.out.println("level up");
		
		p1.levelup();
		System.out.println(p1.name+"의 레벨은 : "+p1.level);
	
		System.out.println(System.getProperty("user.dir"));
	}
	

}

