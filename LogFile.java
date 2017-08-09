
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
class Top10{
    ArrayList<String> ip = new ArrayList<String>();
    ArrayList<Integer> fq = new ArrayList<Integer>();
}
public class LogFile {

    public static void main(String[] args) {

        // The name of the file to open.
        String fileName = "C:\\Users\\Shraban Karmakar\\Documents\\NetBeansProjects\\CaualReading\\src\\nice.txt";
        String fileName1 = "C:\\Users\\Shraban Karmakar\\Documents\\NetBeansProjects\\CaualReading\\src\\ip.txt ";
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader
                    = new FileReader(fileName);

            FileWriter fileWriter
                    = new FileWriter(fileName1);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader
                    = new BufferedReader(fileReader);

            BufferedWriter bufferedWriter
                    = new BufferedWriter(fileWriter);
            String[] st;
            ArrayList<Integer> al = new ArrayList<Integer>();
            ArrayList<Integer> al1 = new ArrayList<Integer>();
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);
                st = line.split(" ");
                //System.out.println(st[0]);
                if(st[8].equals("404")){
                    count++;
                    al.add(Integer.parseInt(st[8]));
                }
                else
                    al1.add(Integer.parseInt(st[8]));

            }
            //Collections.sort(al);
            //int size = al.size();
            int totalRequest = al.size()+al1.size();
            int totalFaliure = al.size();
            int totalSuccess = totalRequest - count;
            System.out.println("Total Request"+totalRequest+"\nSuccessful Request: "+totalSuccess);
            System.out.println("% of Successful Request = "+(double)(totalSuccess * 100)/totalRequest);
            
            //int[] a = new int[size];
            /*Set<String> unique = new HashSet<String>(al);
            int c = 0;
            for (String key : unique) {
                System.out.println(key + ": " + Collections.frequency(al, key));
                a[c++] = Collections.frequency(al, key);
            */
            /*Arrays.sort(a);
            for(int i = a.length-1; i>=a.length-11; i--)
                System.out.print(a[i]+" ");*/
            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '"
                    + fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                    + fileName + "'");
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }
}
