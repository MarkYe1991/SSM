package testIO;

import java.io.*;

public class ObjectOutputStreamDemo {

   public static void main(String[] args) {

      String s = "Hello world!";
      int i = 897648764;
      try {

         // create a new file with an ObjectOutputStream
         FileOutputStream out = new FileOutputStream("C:/Users/mark.ye/Desktop/test.txt");
         ObjectOutputStream oout = new ObjectOutputStream(out);
         

         // write something in the file
         oout.writeObject(s);
         oout.writeObject(i);
         oout.writeObject(new TestIO());

         // close the stream
         oout.close();

         // create an ObjectInputStream for the file we created before
         ObjectInputStream ois =
                 new ObjectInputStream(new FileInputStream("C:/Users/mark.ye/Desktop/test.txt"));

         // read and print what we wrote before
         System.out.println("" + (String) ois.readObject());
         System.out.println("" + ois.readObject());


      } catch (Exception ex) {
         ex.printStackTrace();
      }

   }
}