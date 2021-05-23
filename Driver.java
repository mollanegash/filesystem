package filesystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Library Book Hashing
 
 * Author: Molla Negash 
 * Date: 03/23/19 Class: MET CS575
 * Description: This program is a hash table/separate chain implementation of a different
 * abstract methods like add, search and delete methods of hashing this problem. It has
 * 31 table size.
 **/

/**
 * class: Driver: Description: All the things needed to support driver. Driver
 * is a class that does class like things. It has methods, and data, and another
 * class, etc. It lets the main method to start program execution.
 **/
public class Driver {
	/**
	 * main program:excution start here
	 * 
	 * @param args
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException {
		
		

	    
		Driver me = new Driver();
		me.doIt();
		
		File outFile = new File("C:\\Users\\mdray\\Desktop\\writeToFile.txt");
		FileWriter fWriter = new FileWriter(outFile);
		PrintWriter pWriter = new PrintWriter(fWriter);
		pWriter.println(me);
		pWriter.close();

	}

	public void doIt() {
		FilesDirectoryOAHash table = new FilesystemChained();
		System.out.println("Added Data:");
		long starttime = System.currentTimeMillis();
		table.add("A Space Odyssey (Space Odyssey, #1)", 2001);
		table.add("New Revelations of the Americas Before Columbus ", 1491);
		table.add("The Year That Rocked the World", 1968);
		table.add("The Year of Magna Carta", 1215);
		table.add("The Year of the Six Presidents", 1920);
		table.add("In Search of the World Before the Great War", 1913);
		table.add("The Civil War Awakening", 1861);
		table.add("The Year the World Began", 1492);
		table.add("The Month That Saved America", 1865);
		table.add("The Easter Rising", 1916);
		table.add("The Year Civilization Collapsed", 1177);
		table.add("The Year Everything Changed", 1959);
		table.add("A Novel of the Jazz Age", 1929);
		table.add("A New Look at Thanksgiving", 1621);
		table.add("The First Modern Revolution", 1688);
		table.add("A Global History", 1688);

		System.out.println(table);

		long endtime = System.currentTimeMillis();
		long dif = endtime - starttime;

		System.out.println("Time Complexity To Add Data:" + " " + dif);
		System.out.println("Deleted Data:");
		long starttimetode = System.currentTimeMillis();
		table.delete("The Civil War Awakening", 1861);
		table.delete("The Year That Rocked the World", 1968);
		table.delete("The Year Everything Changed", 1959);
		table.delete("The Year of the Six Presidents", 1920);
		System.out.println(table);
		long endtimetodel = System.currentTimeMillis();
		long diferdeltetime = endtimetodel - starttimetode;
		System.out.println("Time Complexity To Delete Data:" + " " + diferdeltetime);

		System.out.println("Added Data:");
		table.add("The Most Revolutionary Year in Music", 1965);
		table.add("The World in Revolt", 1956);
		table.add("Lincoln: A Photobiography. Clarion Books, 1987.", 1987);
		table.add("A Novel of the Jazz Age", 1929);
		System.out.println(table);
		System.out.println("Searched Result:");
		long startTimeToSearchData = System.currentTimeMillis();

		System.out.println(table.search("The Most Revolutionary Year in Music", 1965));
		System.out.println(table.search("Introduction to algorithm", 2009));
		System.out.println(table.search("Book Hashing", 2019));
		System.out.println(table.search("The Year of the Six Presidents", 1920));
		System.out.println(table.search("Lincoln: A Photobiography. Clarion Books, 1987.", 1987));
		System.out.println(table.search("A Novel of the Jazz Age", 1929));
		long endTimeToSearchData = System.currentTimeMillis();
		long diferTimeToSearchData = endTimeToSearchData - startTimeToSearchData;
		System.out.println("Time Complexity To Get Data:" + " " + diferTimeToSearchData);
		
		

	}

}
