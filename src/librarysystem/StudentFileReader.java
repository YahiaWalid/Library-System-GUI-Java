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
public class StudentFileReader {
    
    
    private Scanner x;
    public static ArrayList <Student> StudentList= new ArrayList <> ();
    final File f = new File("Students.txt");
    
    private void openStudentsFile(){
        
        try{
            
            x= new Scanner(f);
            
        }
        catch(FileNotFoundException e){
            
            System.out.println("'Students.txt' was not found in the project's folder !");
            
        }
        catch(Exception e){
            System.out.println("An error has occured while trying to open the file !");
        }
        
    }
    
    
    private void scanFile(){
        
        int i =1;
       while(x.hasNextLine()){
           
           Student s = new Student();
           String line=x.nextLine();
           
           //each member in the txt file is seperated by a comma
           StringTokenizer str = new StringTokenizer(line,",");
           
              s.setId(i);
              s.setName(str.nextToken());                    
              s.setPassword(str.nextToken());
              s.setEmail(str.nextToken());
              s.setAddress(str.nextToken());
              s.setCity(str.nextToken());
              s.setContactNumber(str.nextToken());
                       
           
       
            StudentList.add(s);
            i++;
       }
    }
    
   
   
    private void closeFile(){
        
        x.close();
    }
    
     public void readStudents(){
        openStudentsFile();
        scanFile();
        closeFile();
    }
    
}

