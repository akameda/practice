//package com.drew.imaging;

import java.io.File;

import java.io.BufferedInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.metadata.*;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;

import org.w3c.dom.NodeList;

import com.drew.*;
import com.drew.imaging.*;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.imaging.jpeg.JpegSegmentReader;
import com.drew.lang.*;
import com.drew.metadata.*;

public class ExifRead {

    public static void main(String[] args) throws ImageProcessingException, IOException 
    {
      File jpegFile = new File("C:\\Users\\IBM_ADMIN\\Pictures\\all\\IMG_2431.jpg");
      Metadata metadata = ImageMetadataReader.readMetadata(jpegFile);
      for (Directory directory : metadata.getDirectories()) {
          for (Tag tag : directory.getTags()) {
              System.out.println(tag);
          }
      }
    }
}