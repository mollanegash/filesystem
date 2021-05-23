package filesystem;
/**
 * 
 * @author mdray
 *interface:OAHash
 *Description:for  java does not allow multiple inheritance
 * so that it uses to interface.It has 5 abstract(unimplemented) methods.
 */

public interface FilesDirectoryOAHash {
	/**
	 * This is unimplemented method
	 * @param title: add(add data)
	 * @param year
	 */
//--------------------------------------------------------------------------------//
	void add(String title, int year);
	/**
	 * This is unimplemented method
	 * @param name:search(searching data)
	 * @param value
	 * @return
	 */
//--------------------------------------------------------------------------------------//
	boolean search(String name, int value);
	/**
	 * This is unimplemented method
	 * @param name:traceSearch(searching data)
	 * @param value
	 * @return
	 */
//-------------------------------------------------------------------------------------//
	boolean traceSearch(String name, int value);
	/**
	 * This is unimplemented method
	 * @param title:delete(delete data)
	 * @param year
	 * @return
	 */
//-----------------------------------------------------------------------------------//
	boolean delete(String title, int year);
	/**
	 * This is unimplemented method
	 * @param title:delete2(String title, int year)
	 * @param year
	 * @return
	 */
	//-------------------------------------------------------------------------------//

	boolean delete2(String title, int year);
	

	
	
	//----------------------------------------------------------------------------//

}