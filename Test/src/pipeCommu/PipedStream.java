package pipeCommu;   
import java.io.*;  
public class PipedStream {  
    public static void main(String[] args) throws Exception{  
       Sender send=new Sender();  
       Reader read=new Reader();  
       PipedOutputStream out=send.getOut();  
       PipedInputStream in=read.getIn();  
       out.connect(in);//或者也可以用in.connect(out);  
       send.start();  
       read.start();  
   }    
}   