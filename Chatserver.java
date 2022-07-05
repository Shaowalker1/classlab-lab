
package chatserver;
import java.io.*;
import java.net.*;



public class Chatserver {


    public static void main(String[] args) {
      try{
      ServerSocket server = new  ServerSocket (28);
      System.out.println("Leastining......");
      Socket connection = server.accept();
      System.out.println("connection created !!!");
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedReader in= new BufferedReader(new InputStreamReader(connection.getInputStream()));
      PrintWriter out=new PrintWriter(connection.getOutputStream(),true);
      String send,recieve;
      do{
      recieve= in.readLine();
      System.out.println("Clients message:" + recieve);
      if(recieve.equals("stop"))
          break;
      System.out.println("Server Messaaage: ");
      send=br.readLine();
      out.println(send);
     
      }
      while(true);
               {
              connection.close();
              br.close();
              in.close();
              out.close();
              }
      }
      catch(Exception e){
       e.printStackTrace();
      }
    }
    
}
