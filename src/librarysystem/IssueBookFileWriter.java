/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

/**
 *
 * @author Yahia
 */


import java.io.*;
import java.util.*;
import java.text.*;

public class IssueBookFileWriter {

    
    
    public void addOneBook(IssuedBook b){ //appending
    
    try{
    FileWriter   fw = new FileWriter("IssuedBooks.txt",true);
    PrintWriter  pw = new PrintWriter(fw);
    
     Format f = new SimpleDateFormat("dd/MM/yyyy");
     String idate= f.format(b.getIssueDate());
    
    pw.print(b.getBookCallNo()+","+b.getStudentId()+","+b.getStudentName()+","+b.getStudentContactNumber()+","+idate+"\n");
    fw.close();
    pw.close();
    
    }
    catch(IOException i){
            System.out.println("Error in writing in the 'IssuedBooks.txt' file in the project's folder !");
}
    catch(Exception e){
            System.out.println("Error in writing or accsessing the 'IssuedBooks.txt' file in the project's folder !");
    }
  
   
    
    
    
}
    
    
     public void rewriteBooks(){
        
      //   File fl= new File("IssuedBooks.txt");
      //     fl.delete();
        
    try{
    FileWriter   fw = new FileWriter("IssuedBooks.txt",false);
    PrintWriter  pw = new PrintWriter(fw);
    for(int i=0;i<IssuedBookFileReader.IssuedBookList.size();i++){
        
       Format f = new SimpleDateFormat("dd/MM/yyyy");
       String idate= f.format(IssuedBookFileReader.IssuedBookList.get(i).getIssueDate());
        
       pw.print(IssuedBookFileReader.IssuedBookList.get(i).getBookCallNo()+
               ","+IssuedBookFileReader.IssuedBookList.get(i).getStudentId()+
               ","+IssuedBookFileReader.IssuedBookList.get(i).getStudentName()+
               ","+IssuedBookFileReader.IssuedBookList.get(i).getStudentContactNumber()+
               ","+  idate+"\n");
        
    }
   
   
    pw.close();
    
    }
    catch(IOException i){
            System.out.println("Error in writing in the 'IssuedBooks.txt' file !");
}
    catch(Exception e){
            System.out.println("Error in writing in the 'IssuedBooks.txt' file !");
    }
  
   
    
        
    }
    
    
    
}