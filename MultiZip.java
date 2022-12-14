import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
 
public class MultiZip {
     
    public static void main(String[] args) {
         
        // String zipFile = "C:\\Users\\2069904\\OneDrive - Cognizant\\Desktop\\zipApplication\\dummyFiles.zip";
         
        // String[] srcFiles = { "C:\\Users\\2069904\\OneDrive - Cognizant\\Desktop\\zipApplication\\dummyFile01.txt", "C:\\Users\\2069904\\OneDrive - Cognizant\\Desktop\\zipApplication\\dummyFile02.txt", "C:\\Users\\2069904\\OneDrive - Cognizant\\Desktop\\zipApplication\\dummyFile03.txt"};

        
         
        try {
             
            // create byte buffer
            byte[] buffer = new byte[1024];
 
            FileOutputStream fos = new FileOutputStream(zipFile);
 
            ZipOutputStream zos = new ZipOutputStream(fos);
             
            for (int i=0; i < srcFiles.length; i++) {
                 
                File srcFile = new File(srcFiles[i]);
 
                FileInputStream fis = new FileInputStream(srcFile);
 
                // begin writing a new ZIP entry, positions the stream to the start of the entry data
                zos.putNextEntry(new ZipEntry(srcFile.getName()));
                 
                int length;
 
                while ((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);
                }
 
                zos.closeEntry();
 
                // close the InputStream
                fis.close();
                 
            }
 
            // close the ZipOutputStream
            zos.close();

            System.out.println("Zip file has been generated.");
             
        }
        catch (IOException ioe) {
            System.out.println("Error creating zip file: " + ioe);
        }
         
    }
 
}
