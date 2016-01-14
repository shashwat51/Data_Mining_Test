package SAP;

public class Singleton {
	public static Singleton instance=new Singleton();
	private Singleton()
	{}
	static Singleton getInstance()
	{
	
			return instance;
	}

}
