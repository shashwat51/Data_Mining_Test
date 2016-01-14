package SAP;

public class HashTable<T> {

	HashEntry<T> list[];
	
	HashTable(int n)
	{
		list=new HashEntry[n];
		for (int i = 0; i < n; i++)
			list[i] = null;
	}
   public void put(int key,T value)
   {
	   int hash=key%100;
	   while(list[hash]!=null&&list[hash].getKey()!=key)
		   hash=(hash+1)%100;
	   list[hash]=new HashEntry(key,value);
	 
   }
   public T get(int key)
   {
	   int hash =key%100;
	   while(list[hash]!=null && list[hash].getKey()!=key)
		   {
		   hash=(hash+1)%100;
		   }
	   if(list[hash]==null)
	   {
		 
		   return null;
		   
	   }
		   else
		   {
			 
		  return  list[hash].getValue();
		   }

   }
   public static void main(String args[])
   {
	   HashTable table=new HashTable(10);
	   table.put(4, "Awesome");
	   table.put(5, "Awesome");
	   table.put(6, "Awesome");
	   table.put(7, "Awesome");
	   System.out.println(table.get(4));
	   System.out.println(table.get(5));
	   System.out.println(table.get(6));
	   System.out.println(table.get(7));
	   
   }
}
