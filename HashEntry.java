package SAP;

public class HashEntry<T>{
	
	T value;
	int key;
	HashEntry(int key,T value)
	{
		this.value=value;
		this.key=key;
	}
   public int getKey(){
	   return key;
   }
   public T getValue(){
	   return value;
   }
}
