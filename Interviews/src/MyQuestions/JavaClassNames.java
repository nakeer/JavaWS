package MyQuestions;

import java.io.File;
import java.io.FilenameFilter;

//Find all the class names in a java package
//Ask for the name of the package - should be recursively searching the names of the Java classes

public class JavaClassNames {

	private static String folder="/Users/naveen.keerthy/okta/okta-core/server/mim/src/main/java/com/okta/mim";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		
		File[] fileList = getFileList(folder);

        for(File file : fileList) {
            System.out.println(file.getName());
        }
		
	}
	
	private static File[] getFileList(String dirPath) {
        File dir = new File(dirPath);   

        File[] fileList = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".json");
            }
        });
        return fileList;
    }

}
