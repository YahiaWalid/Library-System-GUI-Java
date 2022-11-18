/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Yahia
 */
public class LibrarianFileAccessor {
    
    
    private Scanner x;
    public static ArrayList <Librarian> LibrariansList= new ArrayList <> ();
    final File f = new File("Librarians.txt");
    
    private void openLibrariansFile(){
        
        try{
            
            x = new Scanner(f);
            
            
        }
        catch(FileNotFoundException e){
            
            System.out.println("'Librarians.txt' was not found in the project's folder !");
            
        }
        catch(Exception e){
            System.out.println("An error has occured while trying to open the file ! ");
        }
        
    }
    
    
    
    private void scanFile(){
        
        int i=1;
        
       while(x.hasNextLine()){
           
           Librarian l = new Librarian();
           String line=x.nextLine();
           
            //each member in the txt file is seperated by a comma
            StringTokenizer str = new StringTokenizer(line,",");
           
              l.setId(i);
              l.setName(str.nextToken());
              l.setPassword(str.nextToken());
              l.setEmail(str.nextToken());
              l.setAddress(str.nextToken());
              l.setCity(str.nextToken());
              l.setContactNumber(str.nextToken());
              
              LibrariansList.add(l);
           
           
                   
        i++;
       }
    }
    
    
    private void closeFile(){
        
        x.close();
    }
    
    public void readLibrarians(){
        openLibrariansFile();
        scanFile();
        closeFile();
    }
    
    
    public void addOneLibrarian(Librarian l){
    
    try{
    FileWriter   fw = new FileWriter("Librarians.txt",true);
    PrintWriter  pw = new PrintWriter(fw);
   
    pw.print(l.getName()+","+l.getPassword()+","+l.getEmail()+","+l.getAddress()+","+l.getCity()+","+l.getContactNumber()+"\n");
    fw.close();
    pw.close();
    
    }
    catch(IOException i){
            System.out.println("Error in writing in the 'Librarians.txt' file in the project's folder !");
}
    catch(Exception e){
            System.out.println("Error in writing in the 'Librarians.txt' file !");
    }
  
       
}
    
    
    
     public void rewriteLibrarians(){
        
         
         
       //    File fl= new File("Librarians.txt");
       //   fl.delete();
         
        
    try{
    FileWriter   fw = new FileWriter("Librarians.txt",false);
    PrintWriter  pw = new PrintWriter(fw);
    for(int i=0;i<LibrariansList.size();i++){
        
         pw.println(LibrariansList.get(i).getName()+","+LibrariansList.get(i).getPassword()+","+LibrariansList.get(i).getEmail()+","+LibrariansList.get(i).getAddress()+","+LibrariansList.get(i).getCity()+","+LibrariansList.get(i).getContactNumber());
        
    }
   
    fw.close();
    pw.close();
    
    }
    catch(IOException i){
            System.out.println("Error in writing in the 'Librarians.txt' file !");
}
    catch(Exception e){
            System.out.println("Error in writing in the 'Librarians.txt' file !");
    }
  
   
    
        
    }
    
    
    
    
    
}
