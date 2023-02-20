/*
 * Structure of a java class
 * 
 * package statement
 * import statement
 * class declaration
 * variables
 * constructors
 * methods
 * 
 * Comments may occur everywhere in the code,
 * above, beneath and at the side of the code.
 * 
 */


package basics; // the package we reside in right now

import arrays.loops.ArrayEx; // imports a class from a different package.


/*
 *  This is the 'main' class of this file
 *  With this i mean there can be only 1 class in a file that can be made public.
 *  therefor if you want to to do anything within this file, from a different file/class.
 *  you have to go through this class.
 */
public class BasicsEx 
{
	String initializeME;
	
	// Initializer block
	// can be made static.
	{
		// We can initialize stuff here.
		initializeME = "I am initialized";
	}
	
	
	// Constructor has the same name as the class.
	// but does not define a return type.
	// ALWAYS calls super()
	public BasicsEx()	// Because we define a constructor ourself, the Default non-parameter constructor does not exist.
	{
		super(); // we always call super implicit, but now we do it explicit.
		
		CommentExamples(); // we can call other methods from here as well.
	}
	
	
	
	
	DataTypesEx ex = new DataTypesEx(); // We can create objects of the classes in the same package, without importing them.
	
	private void CommentExamples()
	{
		String withMultiComment = /* */ "This is Valid";
		String withMultiCommentOnSeperateLine = /* this is 
										also valid */ "This is multiline comment Valid";
		String withSingleComment = //
									"Again Valid";
		
		System.out.println(withMultiComment);
		System.out.println(withMultiCommentOnSeperateLine);
		System.out.println(withSingleComment);
		
		
		// You cannot make this span multiple lines, because the Multiline Comment is part of the string.
		// However, if you use (+) and new double quotes ("") on different lines you can go around this.
		/*
		 * String thisIsWrong = "this /* 
		 * 						is /* wrong ";
		 * 
		 * 
		 */
//			String thisIsCorrect = "this /*"
//				+ "is */ correct";
//		 	System.out.println(thisIsCorrect);
		 
		String partOfTheString = "/* They are not part of the string */ ";
		System.out.println(partOfTheString);
		
		
	}
	
	
	public void MethodName()
	{
		
	}
	
	
}



