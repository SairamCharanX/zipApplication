import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class FileList{
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\2069904\\OneDrive - Cognizant\\Desktop\\zipApplication\\files\\");

        String[] files = file.list();
        List<String> fileList= new ArrayList<String>();

        System.out.println("List of files in the directory:");
        for(String x:files){
            
            System.out.println(x);
            fileList.add(x);

        }

        System.out.println("Elements of the ArrayList:");

        for(String y:fileList){
            System.out.println(y);
        }

    }
}