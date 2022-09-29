
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPExample {

    public static void main(String[] args) {
        String file = "C:\\Users\\Sairam Charan\\Desktop\\zipProgram\\dummy.txt";
        String gzipFile = "C:\\Users\\Sairam Charan\\Desktop\\zipProgram\\dummy.txt.gz";
        
        compressGzipFile(file, gzipFile);
        System.out.println("GZIP Build Successful");
               
    }

   
    public static void compressGzipFile(String file, String gzipFile) {

        //try and catch is uses here to handle IOException

        try {
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(gzipFile);

            //GZIPOutputStream gzipOS = new GZIPOutputStream(new FileOutputStream(gzipFile));
            GZIPOutputStream gzipOS = new GZIPOutputStream(fos);

            byte[] buffer = new byte[1024]; 


            int x;
            while((x=fis.read(buffer)) != -1){
                gzipOS.write(buffer, 0, x);
            }
            
            gzipOS.close();
            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

}