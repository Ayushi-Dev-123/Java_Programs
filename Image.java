import java.io.File;
import java.io.FileInputStream;
class Image
{
    public static void main(String[] args)
    {
        try{
           File f = new File("D:\\test_file\\image.jpeg");
           if(f.exists()){
               long l = f.length();
               float sec = (1024*1024)/256; //image size in kb 
               System.out.println("Time taken in image uploading = " + sec);
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}