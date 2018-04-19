import java.io.File;


public class BatchFileDemo {
	
	public static void main(String[] args) {
		// BatchFileDemo batchFileDemo = new BatchFileDemo();	
		try {
		    String fileLocation = "D:\\dev\\training\\assignments\\continous learning\\java";
		    File[] listOfFiles = new File(fileLocation).listFiles();
			// String filename = null;
		// System.out.println(fileList);
		    for (int i = 0; i < listOfFiles.length; i++) {	
               if (listOfFiles[i].getName().toLowerCase().endsWith("java")) {
			       
				   String filenameWithEx = listOfFiles[i].getName();
				   System.out.println(filenameWithEx);
				   int index = filenameWithEx.indexOf(".");
				   // int length = filenameWithEx.length();
				   String fileNameWithoutEx = filenameWithEx.substring(0, index);
				   System.out.println(index);
				   System.out.println(fileNameWithoutEx);
				   Runtime runTime = Runtime.getRuntime();
				   if(!(fileNameWithoutEx == "BatchFileDemo")) {
					  runTime.exec("cmd /c start cmd.exe /K \"javac " + filenameWithEx + "&& java " + fileNameWithoutEx + "\"");
				   }
               }	 
	        }  
		 } catch(Exception e) {
			 System.out.println(e);
		 }
	
	}
}