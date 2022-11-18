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


public class BookFileWriter {

    
    
    public void addOneBook(Book b){
    
    try{
    FileWriter   fw = new FileWriter("Books.txt",true);
    PrintWriter  pw = new PrintWriter(fw);
    pw.print(b.getCallNo()+","+b.getName()+","+b.getAuthor()+","+b.getPublisher()+","+b.getQuantity()+"\n");
    fw.close();
    pw.close();
    
    }
    catch(IOException i){
            System.out.println("Error in writing in the 'Books.txt' file !");
}
    catch(Exception e){
            System.out.println("Error in writing in the 'Books.txt' file !");
    }
  
   
    
    
    
}
    
    
     public void rewriteBooks(){
        
        
    //  File f= new File("Books.txt");
    //  f.delete();
         
         
    try{
    FileWriter   fw = new FileWriter("Books.txt",false);
    PrintWriter  pw = new PrintWriter(fw);
    for(int i=0;i<BookFileReader.BookList.size();i++){
        
         pw.print(BookFileReader.BookList.get(i).getCallNo()+","+BookFileReader.BookList.get(i).getName()+","+BookFileReader.BookList.get(i).getAuthor()+","+BookFileReader.BookList.get(i).getPublisher()+","+BookFileReader.BookList.get(i).getQuantity()+"\n");
        
    }
   
    fw.close();
    pw.close();
    
    }
    catch(IOException i){
            System.out.println("Error in writing in the 'Books.txt' file !");
}
    catch(Exception e){
            System.out.println("Error in writing in the 'Books.txt' file !");
    }
  
   
    
        
    }
    
    
    
}