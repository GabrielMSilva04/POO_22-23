package aula09.ex1;

import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;

import aula07.ex02.Date;
import aula07.ex02.DateYMD;
import aula07.ex02.DateND;
 
public class ALDemo2 { 
 
  public static void main(String[] args) { 
    Set<Date> c4 = new TreeSet<>();
		c4.add(new DateYMD(1985, 7, 11));
    c4.add(new DateND(2086, 7, 18));
    c4.add(new DateYMD(1985, 8, 11));
    c4.add(new DateND(2085, 8, 11));
    c4.add(new DateYMD(1985, 7, 10));
		
		Iterator<Date> j = c4.iterator();
        
		while (j.hasNext()) {
            System.out.println(j.next());
        }	
  } 
}