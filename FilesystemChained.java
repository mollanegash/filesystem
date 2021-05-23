package filesystem;

/**
 * class: FilesystemChained:implements interface:FilesDirectoryOAHash
 * 
 * Description: All the things needed to support FilesystemChained:
 * FilesystemChained is a class that implements the FilesDirectoryOAHash. does class
 * like things. It has methods, data, and another class, etc.
 */

public class FilesystemChained implements FilesDirectoryOAHash {
	private static final int TABLE_SIZE = 31;
	/**
	 * table[]:Each component of the array is a head reference for a linked list.
	 **/
	private FileDirectory[] table = new FileDirectory[TABLE_SIZE];

	/**
	 * hash(find space for the data)
	 * 
	 * @param data:input:none;
	 *            output:data to be hashed
	 * @return returns hashed hashing data is successful.
	 */

	private int hash(int data) {
		return data % table.length;
	}

	/**
	 * add(add data to the list) Input : data to be added Output: None Returns true
	 * if insert is successful,false otherwise
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see project1.OAHash#add(java.lang.String, int)
	 */
	@Override
	public void add(String name, int size) {
		if (search(name, size) == true) {
			return;
		} else {
			int loc = hash(size);

			FileDirectory newAddFile = new FileDirectory(name, size);

			if (table[loc] == null) {
				table[loc] = newAddFile;
			} else {
				newAddFile.setNext(table[loc]);
				table[loc].setPrev(newAddFile);
				table[loc] = newAddFile;
			}
		}

	}

	/**
	 * search(search data from the list) input:none output:data to be searched.
	 * returns true if searching is successful, false otherwise.
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see project1.OAHash#search(java.lang.String, int)
	 */
	@Override
	public boolean search(String name, int value) {
		if (intSearch(name, value) == null) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * @param name:
	 *            intSearch(search data from the list)
	 * @param value:input:none;
	 *            output: data to be searched.
	 * @return: returns the data if search is successful, null otherwise.
	 */

	private FileDirectory intSearch(String name, int value) {
		int loc = hash(value);
		/** the head of the chain **/
		FileDirectory bk = table[loc];

		while (bk != null) {
			if (bk.getName().equals(name)) {
				return bk;
			} else {
				// System.out.println("searched result:");
				
				bk = bk.getNext();
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see project1.OAHash#traceSearch(java.lang.String, int)
	 */
	@Override
	public boolean traceSearch(String name, int value) {
		if (intSearch(name, value) == null) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * delete(delete data from the list) input:none output:data to be deleted.
	 * Returns true if deleted is successful, false otherwise.
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see project1.OAHash#delete(java.lang.String, int)
	 */
	@Override
	public boolean delete(String title, int year) {
		if (delete2(title, year) == false) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * delete2(delete data from the list) input:none output:data to be deleted.
	 * Returns true if deleted is successful, false otherwise.
	 * 
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see project1.OAHash#delete2(java.lang.String, int)
	 */
	@Override
	public boolean delete2(String name, int year) {
		int loc = hash(year);
		FileDirectory bk = table[loc];

		while (bk != null) {
			if (bk.getName().equals(name)) {
				System.out.println(name);

				if (bk.getPrev() == null) {
					table[loc] = null;
				} else if (bk.getNext() == null) {
					bk.getPrev().setNext(null);
				} else {
					bk.getPrev().setNext(bk.getNext());
					bk.getNext().setPrev(bk.getPrev());
				}
				return true;
			} else {
				System.out.println(bk.getName());
				bk = bk.getNext();
			}
		}
		return false;

	}

	/**
	 * toString() input:none output:data in the form of string returns String data
	 * if list is not null, null otherwise
	 * 
	 */
	
	
	

	public String toString() {
		String rtn = "";
		for (int i = 0; i < table.length; i++) {
			rtn += "table[" + i + "] = ";
			if (table[i] == null) {
				rtn += "<Empty>\n";
			} else {
				FileDirectory bk = table[i];
				rtn += "< ";
				while (bk != null) {
					rtn += bk.getName() + ", ";
					bk = bk.getNext();
				}
				rtn += ">\n";
			}
		}
		return rtn;
	}
}
