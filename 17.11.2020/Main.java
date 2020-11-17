import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Main{
    public static void main(String[] args) {
        /*File file = new File("C://java/test2.txt");
        file.delete();
    */


        try {
            FileWriter writer = new FileWriter("C://java/test.txt",true);
            String text = "Hello JAVA";
            writer.write(text);
            writer.append("\nTEST");
            writer.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }



        try {
            FileReader reader = new FileReader("C://java/ip.txt");
            int c;
            String proxy = ""; // ip:port
            while ((c=reader.read()) != -1){
                if( c != 9)
                    proxy = proxy + (char) c;
                else
                    proxy += ":";
            }
            System.out.println(proxy);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //checkProxy();
    }
    static void checkProxy(){
        try {
            URLConnection connection = new URL("https://vozhzhaev.ru/test.php").openConnection();
            InputStream is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            char[] buffer = new char[256];
            int c;


            StringBuilder stringBuilder = new StringBuilder();

            while ((c = reader.read(buffer)) != -1){
                stringBuilder.append(buffer,0,c);
            }
            reader.close();
            System.out.println(stringBuilder);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
