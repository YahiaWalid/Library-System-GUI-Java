/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.io.*;
import java.util.*;
/**
 *
 * @author Yahia
 * 
 */
public class BookFileReader {
    
    
    private Scanner x;
    public static ArrayList <Book> BookList= new ArrayList <> ();
    final File f = new File("Books.txt");
    
    private void openBooksFile(){
        
        try{
            
            x= new Scanner(f);
            
            
        }
        catch(FileNotFoundException e){
            
            System.out.println("'Books.txt' was not found in the project's folder !");
            
        }
        catch(Exception e){
            System.out.println("An error has occured while trying to open the file ! ");
        }
        
    }
    
    
    private void scanFile(){
        
        int i=1;
        
       while(x.hasNextLine()){
           
           Book b = new Book();
           String line=x.nextLine();
           
           //each member in the txt file is seperated by a comma
            StringTokenizer str = new StringTokenizer(line,",");
           
              b.setId(i);
              b.setCallNo(str.nextToken());                    
              b.setName(str.nextToken());          
              b.setAuthor(str.nextToken());                
              b.setPublisher(str.nextToken());         
              b.setQuantity(Integer.parseInt(str.nextToken()));
           
           
        
           
            BookList.add(b);
        i++;
       }
    }
    
   
   
    private void closeFile(){
        
        x.close();
    }
    
     public void readBooks(){
        openBooksFile();
        scanFile();
        closeFile();
    }
    
}
