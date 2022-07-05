/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver;

import java.io.*;
import java.net.*;

public class clint {
    
  public static void main(String[] arrg){
      try{
Socket connection =new Socket("localhost",28);
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 BufferedReader in= new BufferedReader(new InputStreamReader(connection.getInputStream()));
 PrintWriter out=new PrintWriter(connection.getOutputStream(),true);
 String msg,resp;
 System.out.println("when  you want to close the connection type  stop");
 do{
  System.out.println("client message:");
  msg=br.readLine();
  out.println(msg);
  if(msg.equals("stop"))
      break;
  resp = in.readLine();
  System.out.println("Server message : " +resp);
  
       
 }
 while(true);
   connection.close();
              br.close();
              in.close();
              out.close();
 
}catch(Exception e)
{
  
}
  
  }
    

}
