package ch07;

class Singleton{
	
	static Singleton singleton;
	private Singleton(){
		System.out.println("������ ���� �Ұ���");
	}
	public static Singleton getInstance() {
		if(singleton==null)
				singleton = new Singleton();
		return singleton;
	}
}

public class SingletonEx {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}
}
