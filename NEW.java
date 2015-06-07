import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class NEW {

public static void main(String[] args)  {
try {
	String[][] S = new String [100][19];
	double score[]=new double [100];
File excel1 = new File ("D:\\US_Padhai\\3.xls");
File excel2 = new File ("D:\\US_Padhai\\4.xls");
FileInputStream fis1 = new FileInputStream(excel1);
FileInputStream fis2 = new FileInputStream(excel2);
ArrayList<String> list = new ArrayList<String>();
ArrayList<String> list1 = new ArrayList<String>();
ArrayList<String> list2 = new ArrayList<String>();
ArrayList<String> list3 = new ArrayList<String>();
ArrayList<String> list4 = new ArrayList<String>();
ArrayList<String> list5 = new ArrayList<String>();
ArrayList<String> list6 = new ArrayList<String>();
JaroWinkler j=new JaroWinkler();
HSSFWorkbook hssfWork = new HSSFWorkbook(fis1);
HSSFSheet sheet1 = hssfWork.getSheetAt(0);

HSSFWorkbook hssfWork2 = new HSSFWorkbook(fis2);

Iterator<Row> rowItr = sheet1.rowIterator();



HSSFRow row = (HSSFRow) rowItr.next();
System.out.println("ROW:-->");
Iterator<Cell> cellItr = row.cellIterator();

while ( cellItr.hasNext() ) 
{ 
 HSSFCell cell = (HSSFCell) cellItr.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list.add(cell.toString());
} 
  //  System.out.println("The arraylist contains the following elements: "+ list);


HSSFSheet sheet2 = hssfWork2.getSheetAt(0);
Iterator<Row> rowItr2 = sheet2.rowIterator();
while ( rowItr2.hasNext() ) 
{ 
HSSFRow row2 = (HSSFRow) rowItr2.next();


Iterator<Cell> cellItr2 = row2.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr2.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list1.add(cell.toString());
} 
System.out.println("CELL:-->"+list1);
for(int i=0;i<list1.size();i++)
{
 	  double c=j.compare(list.get(0), list1.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][0]="1";
 	  }
 	  else
 	  {
 		  S[i][0]="0";
 	  }
}

//for 2nd parameter
HSSFSheet sheet3 = hssfWork2.getSheetAt(1);
Iterator<Row> rowItr3 = sheet3.rowIterator();
while ( rowItr3.hasNext() ) 
{ 
HSSFRow row3 = (HSSFRow) rowItr3.next();


Iterator<Cell> cellItr3 = row3.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr3.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list2.add(cell.toString());
} 
for(int i=0;i<list2.size();i++)
{
 	  double c=j.compare(list.get(1), list2.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][1]="1";
 	  }
 	  else
 	  {
 		  S[i][1]="0";
 	  }
}
//System.out.println("Row2"+list2);
//2nd parameter
//3rd parameter
HSSFSheet sheet4 = hssfWork2.getSheetAt(2);
Iterator<Row> rowItr4 = sheet4.rowIterator();
while ( rowItr4.hasNext() ) 
{ 
HSSFRow row4 = (HSSFRow) rowItr4.next();


Iterator<Cell> cellItr3 = row4.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr3.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list3.add(cell.toString());
} 
for(int i=0;i<list3.size();i++)
{
 	  double c=j.compare(list.get(2), list3.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][2]="1";
 	  }
 	  else
 	  {
 		  S[i][2]="0";
 	  }
}
//System.out.println("list2"+list2);
//3rd parameter
//System.out.println("List2"+list1);
//4th Parameter
HSSFSheet sheet5 = hssfWork2.getSheetAt(3);
Iterator<Row> rowItr5 = sheet5.rowIterator();
while ( rowItr5.hasNext() ) 
{ 
HSSFRow row5 = (HSSFRow) rowItr5.next();


Iterator<Cell> cellItr4 = row5.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr4.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list4.add(cell.toString());
} 
for(int i=0;i<list4.size();i++)
{
 	  double c=j.compare(list.get(3), list4.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][3]="1";
 	  }
 	  else
 	  {
 		  S[i][3]="0";
 	  }
}

//4th Parameter
//5th Parameter
HSSFSheet sheet6 = hssfWork2.getSheetAt(4);
Iterator<Row> rowItr6 = sheet6.rowIterator();
while ( rowItr6.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr6.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list5.add(cell.toString());
} 
for(int i=0;i<list5.size();i++)
{
 	  double c=j.compare(list.get(4), list5.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][4]="1";
 	  }
 	  else
 	  {
 		  S[i][4]="0";
 	  }
}

//5th Parameter
//6th Parameter
HSSFSheet sheet7 = hssfWork2.getSheetAt(4);
Iterator<Row> rowItr7 = sheet7.rowIterator();
while ( rowItr7.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr7.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list6.add(cell.toString());
} 
for(int i=0;i<list5.size();i++)
{
 	  double c=j.compare(list.get(5), list6.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][5]="1";
 	  }
 	  else
 	  {
 		  S[i][5]="0";
 	  }
}

//6th Parameter

for (int i=0;i<8;i++){
	for (int k=0;k<6;k++){
		
		System.out.print(""+S[i][k]);
		if(S[i][k]=="1"){
			score[i]=score[i]+0.166;
		}
		
		
	}
	
	System.out.println(""+score[i]);
 }




} 
catch (Exception e) 
{
   e.printStackTrace();
}

}
}