/**
 * 10.Write a program to generate ClassNotFoundException
 */
package p1;
/* Java ClassNotFoundException occurs when the application tries to load
a class but Classloader is not able to find it in the classpath.*/
public class ClassNotFound
{

	public static void main(String[] args)
	{
		 try {
	            Class.forName("com.exceptions.jala");
	            ClassLoader.getSystemClassLoader().loadClass("com.exceptions.jala");

	        } catch (ClassNotFoundException e) {
	            /* printStackTrace() prints the throwable Exception object as well as with other Information
	            like the line number where Exception occurs and class name where the exception occurred.*/
	            e.printStackTrace();
	        }
	}

}
