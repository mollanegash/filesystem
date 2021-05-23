package filesystem;
/**
 * 
 * @author mdray
 *Class:FileSystem
 *Description: All the things needed to support FileSystem. FileSystem is a class that
 does class like things. It has methods, and data, and another class, etc. 
 */

public class FileDirectory {

	String name;
	int year;
	FileDirectory next;
	FileDirectory prev;
	
	
	public FileDirectory(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public FileDirectory getNext() {
		return next;
	}
	public void setNext(FileDirectory next) {
		this.next = next;
	}
	public FileDirectory getPrev() {
		return prev;
	}
	public void setPrev(FileDirectory prev) {
		this.prev = prev;
	}
	

}