import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.ArrayUtil;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;


public class save {

public static void main(String[] args)  {
try {
	String[][] S = new String [4800][18];
	String[][] listfinal = new String [4700][18];
	double score[]=new double [4800];
	int count=0;
File excel1 = new File ("D:\\Experiment\\3.xls");
File excel2 = new File ("D:\\Experiment\\Testing_records_Fraud_patterns.xls");
File file =new File ("D:\\Experiment\\2.txt");
PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("D:\\Experiment\\AnamolousPatterns.txt", true)));
//BufferedWriter output = new BufferedWriter(new FileWriter(file));
FileInputStream fis1 = new FileInputStream(excel1);
FileInputStream fis2 = new FileInputStream(excel2);
ArrayList<String> list = new ArrayList<String>();
ArrayList<String> list1 = new ArrayList<String>();
ArrayList<String> list2 = new ArrayList<String>();
ArrayList<String> list3 = new ArrayList<String>();
ArrayList<String> list4 = new ArrayList<String>();
ArrayList<String> list5 = new ArrayList<String>();
ArrayList<String> list6 = new ArrayList<String>();
ArrayList<String> list7 = new ArrayList<String>();
ArrayList<String> list8 = new ArrayList<String>();
ArrayList<String> list9 = new ArrayList<String>();
ArrayList<String> list10 = new ArrayList<String>();
ArrayList<String> list11 = new ArrayList<String>();
ArrayList<String> list12 = new ArrayList<String>();
ArrayList<String> list13 = new ArrayList<String>();
ArrayList<String> list14 = new ArrayList<String>();
ArrayList<String> list15 = new ArrayList<String>();
ArrayList<String> list16 = new ArrayList<String>();
ArrayList<String> list17 = new ArrayList<String>();
ArrayList<String> list18 = new ArrayList<String>();
ArrayList<String> list19 = new ArrayList<String>();

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
System.out.println("CELL:-->"+list);
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
HSSFSheet sheet7 = hssfWork2.getSheetAt(5);
Iterator<Row> rowItr7 = sheet7.rowIterator();
while ( rowItr7.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr7.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list6.add(cell.toString());
} 
for(int i=0;i<list6.size();i++)
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
//7th Parameter
HSSFSheet sheet8 = hssfWork2.getSheetAt(6);
Iterator<Row> rowItr8 = sheet8.rowIterator();
while ( rowItr8.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr8.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list7.add(cell.toString());
} 
for(int i=0;i<list7.size();i++)
{
 	  double c=j.compare(list.get(6), list7.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][6]="1";
 	  }
 	  else
 	  {
 		  S[i][6]="0";
 	  }
}


//7th Parameter

//8th Parameter
HSSFSheet sheet9 = hssfWork2.getSheetAt(7);
Iterator<Row> rowItr9 = sheet9.rowIterator();
while ( rowItr9.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr9.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list8.add(cell.toString());
} 
for(int i=0;i<list5.size();i++)
{
 	  double c=j.compare(list.get(7), list8.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][7]="1";
 	  }
 	  else
 	  {
 		  S[i][7]="0";
 	  }
}

//8th Parameter
//9th Parameter
HSSFSheet sheet10 = hssfWork2.getSheetAt(8);
Iterator<Row> rowItr10 = sheet10.rowIterator();
while ( rowItr10.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr10.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list9.add(cell.toString());
} 
for(int i=0;i<list9.size();i++)
{
 	  double c=j.compare(list.get(8), list9.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][8]="1";
 	  }
 	  else
 	  {
 		  S[i][8]="0";
 	  }
}

//9th Parameter
//10th Parameter
HSSFSheet sheet11 = hssfWork2.getSheetAt(9);
Iterator<Row> rowItr11 = sheet11.rowIterator();
while ( rowItr11.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr11.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list10.add(cell.toString());
} 
for(int i=0;i<list5.size();i++)
{
 	  double c=j.compare(list.get(9), list10.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][9]="1";
 	  }
 	  else
 	  {
 		  S[i][9]="0";
 	  }
}

//10th Parameter
//11th Parameter
HSSFSheet sheet12 = hssfWork2.getSheetAt(10);
Iterator<Row> rowItr12 = sheet12.rowIterator();
while ( rowItr12.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr12.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list11.add(cell.toString());
} 
for(int i=0;i<list5.size();i++)
{
 	  double c=j.compare(list.get(10), list11.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][10]="1";
 	  }
 	  else
 	  {
 		  S[i][10]="0";
 	  }
}


//11th Parameter
//12th Parameter
HSSFSheet sheet13 = hssfWork2.getSheetAt(11);
Iterator<Row> rowItr13 = sheet13.rowIterator();
while ( rowItr13.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr13.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list12.add(cell.toString());
} 
for(int i=0;i<list5.size();i++)
{
 	  double c=j.compare(list.get(11), list12.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][11]="1";
 	  }
 	  else
 	  {
 		  S[i][11]="0";
 	  }
}

//12th Parameter
//13th Parameter
HSSFSheet sheet14 = hssfWork2.getSheetAt(12);
Iterator<Row> rowItr14 = sheet14.rowIterator();
while ( rowItr14.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr14.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list13.add(cell.toString());
} 
for(int i=0;i<list5.size();i++)
{
 	  double c=j.compare(list.get(12), list13.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][12]="1";
 	  }
 	  else
 	  {
 		  S[i][12]="0";
 	  }
}

//13th Parameter
//14th Parameter
HSSFSheet sheet15 = hssfWork2.getSheetAt(13);
Iterator<Row> rowItr15 = sheet15.rowIterator();
while ( rowItr15.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr15.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list14.add(cell.toString());
} 
for(int i=0;i<list5.size();i++)
{
 	  double c=j.compare(list.get(13), list14.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][13]="1";
 	  }
 	  else
 	  {
 		  S[i][13]="0";
 	  }
}

//14th Parameter
//15th Parameter
HSSFSheet sheet16 = hssfWork2.getSheetAt(14);
Iterator<Row> rowItr16 = sheet16.rowIterator();
while ( rowItr16.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr16.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list15.add(cell.toString());
} 
for(int i=0;i<list15.size();i++)
{
 	  double c=j.compare(list.get(14), list15.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][14]="1";
 	  }
 	  else
 	  {
 		  S[i][14]="0";
 	  }
}

//15th Parameter
//16th Parameter
HSSFSheet sheet17 = hssfWork2.getSheetAt(15);
Iterator<Row> rowItr17 = sheet17.rowIterator();
while ( rowItr17.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr17.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list16.add(cell.toString());
} 
for(int i=0;i<list16.size();i++)
{
 	  double c=j.compare(list.get(15), list16.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][15]="1";
 	  }
 	  else
 	  {
 		  S[i][15]="0";
 	  }
}

//16th Parameter
//17th Parameter
HSSFSheet sheet18 = hssfWork2.getSheetAt(16);
Iterator<Row> rowItr18 = sheet18.rowIterator();
while ( rowItr18.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr18.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list17.add(cell.toString());
} 
for(int i=0;i<list5.size();i++)
{
 	  double c=j.compare(list.get(16), list17.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][16]="1";
 	  }
 	  else
 	  {
 		  S[i][16]="0";
 	  }
}

//17th Parameter
//18th Parameter
HSSFSheet sheet19 = hssfWork2.getSheetAt(17);
Iterator<Row> rowItr19 = sheet19.rowIterator();
while ( rowItr19.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr19.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list18.add(cell.toString());
} 
for(int i=0;i<list18.size();i++)
{
 	  double c=j.compare(list.get(17), list18.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][17]="1";
 	  }
 	  else
 	  {
 		  S[i][17]="0";
 	  }
}

//18th Parameter
//19th Parameter
/*HSSFSheet sheet20 = hssfWork2.getSheetAt(18);
Iterator<Row> rowItr20 = sheet20.rowIterator();
while ( rowItr20.hasNext() ) 
{ 
HSSFRow row6 = (HSSFRow) rowItr20.next();


Iterator<Cell> cellItr5 = row6.cellIterator();


 HSSFCell cell = (HSSFCell) cellItr5.next();
        //System.out.println("CELL:-->"+cell.toString());
       
        list19.add(cell.toString());
} 
for(int i=0;i<list5.size();i++)
{
 	  double c=j.compare(list.get(18), list19.get(i));
 	  if (c>0.8)
 	  {
 		  S[i][18]="1";
 	  }
 	  else
 	  {
 		  S[i][18]="0";
 	  }
}
*/
//19th Parameter
for (int i=0;i<3757;i++){
	for (int k=0;k<18;k++){
		     if(S[i][k]=="1"){
			score[i]=score[i]+1;
		}
		}
	
	//System.out.println(""+score[i]);
 }

for (int i=0;i<3757;i++){
	if (score[i]>9){
	for (int k=0;k<18;k++){
   		listfinal[count][k]=S[i][k];
}
count++;
System.out.println(""+i);
}
}

System.out.println("Total count"+count);
for(int i=0;i<count;i++)
{
	for (int k=0;k<18;k++){
System.out.print(""+listfinal[i][k]);
out.write(listfinal[i][k]);

	}//for k
	System.out.println("");
	out.write(" ");
	}//for count
out.write("NextList");
//For Fraud Pattern List
out.close();
} 
catch (Exception e) 
{
   e.printStackTrace();
}

}
}