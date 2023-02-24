package ExceptionHandling1.com;
import java.io.PrintWriter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.FileNotFoundException;
		public class ExceptionHandling1 {
			private static final Logger LOG = LogManager.getLogger(ExceptionHandling1.class);
			public static  void main(String[] args) {
				
				  try { int arr[]= new int [5]; 
				  arr[10]=100;
				  }catch(Exception e) {
					 LOG.fatal(e.getMessage());
       }
					 

				/*
				 * PrintWriter pw; try { pw=new PrintWriter("jstt.txt");
				 * 
				 * }catch(FileNotFoundException e) { //System.out.println(e.getMessage());
				 * System.out.println("saved"); }
				 * LOG.fatal("file has saved sucessfully in my local disc");
				 */
				
			}}