/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Yahia
 * 
 */
public class IssuedBookFileReader {
    
    
    private Scanner x;
    public static ArrayList <IssuedBook> IssuedBookList= new ArrayList <> ();
    final File f = new File("IssuedBooks.txt");
    
    private void openBooksFile(){
        
        try{
            
            x= new Scanner(f);
            
        }
        catch(FileNotFoundException e){
            
            System.out.println("'IssuedBooks.txt' was not found in the project's folder !");
            
        }
        catch(Exception e){
            System.out.println("An error has occured while trying to open the file !");
        }
        
    }
    
    
    private void scanFile(){
        
        int i = 1 ;
        
        
       while(x.hasNextLine()){
           
           IssuedBook b = new IssuedBook();
           try{
           String line=x.nextLine();
           
           //each member in the txt file is seperated by a comma
           StringTokenizer str = new StringTokenizer(line,",");
           
              b.setId(i);
              b.setBookCallNo(str.nextToken());                    
              b.setStudentId(Integer.parseInt(str.nextToken()));
              b.setStudentName(str.nextToken());
              b.setStudentContactNumber(str.nextToken());      
              String date = str.nextToken();
                  
                  Date d = new SimpleDateFormat("dd/MM/yyyy").parse(date);
                   b.setIssueDate(d);
                    IssuedBookList.add(b);
                  }
                  catch(ParseException p){
                      
                      System.out.println("Issue date in the 'IssuedBooks.txt' file is written in wrong format !");
                      System.out.println("Please check the file and try again !");
                      
                  }
                  catch(Exception e){
                      System.out.println("An error occurred while reading the data from the 'IssuedBooks.txt' file !");
                      
                  }
                 
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
    
     
     
     
//     public static void main(String[] args) {
//         IssuedBookFileReader asd= new IssuedBookFileReader();
//         asd.readBooks();
//        for(int j=0;j<IssuedBookList.size();j++)
//             System.out.println(IssuedBookList.get(j).getStudentName());
//    }
     
     
     
     
     
     

