//package com.keicode.java.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import javax.imageio.metadata;

public class StreamTest6 {

  public static void main(String[] args) {
    try {
      byte[] b = new byte[4096];
      int readByte = 0, totalByte = 0;
      
      // From test.jpg
      DataInputStream dataInStream = 
        new DataInputStream(
          new BufferedInputStream(
            new FileInputStream("C:\\Users\\IBM_ADMIN\\Pictures\\all\\images.jpg")));
      // To copy.jpg
      DataOutputStream dataOutStream = 
        new DataOutputStream(
          new BufferedOutputStream(
            new FileOutputStream("C:\\Users\\IBM_ADMIN\\Pictures\\all\\images_copy.jpg")));

      while(-1 != (readByte = dataInStream.read(b))){
        dataOutStream.write(b, 0, readByte);
        totalByte += readByte;
        System.out.println("Read: " + readByte + " Total: " + totalByte);
      }
      
      dataInStream.close();
      dataOutStream.close();
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  
}