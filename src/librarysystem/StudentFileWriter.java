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


public class StudentFileWriter {

    
    
    public void addOneStudent(Student s){
    
    try{
    FileWriter   fw = new FileWriter("Students.txt",true);
    PrintWriter  pw = new PrintWriter(fw);
    pw.print(s.getName()+","+s.getPassword()+","+s.getEmail()+","+s.getAddress()+","+s.getCity()+","+s.getContactNumber()+"\n");
    fw.close();
    pw.close();
    
    }
    catch(IOException i){
            System.out.println("Error in writing in the 'Students.txt' file !");
}
    catch(Exception e){
            System.out.println("Error in writing in the 'Students.txt' file !");
    }
  
   
    
    
    
}
    
    
     public void rewriteStudents(){
        
          //  File fl= new File("Students.txt");
         //   fl.delete();
         
         
    try{
    FileWriter   fw = new FileWriter("Students.txt",false);
    PrintWriter  pw = new PrintWriter(fw);
    for(int i=0;i<StudentFileReader.StudentList.size();i++){
        
         pw.print(StudentFileReader.StudentList.get(i).getName()+","+StudentFileReader.StudentList.get(i).getPassword()+","+StudentFileReader.StudentList.get(i).getEmail()+","+StudentFileReader.StudentList.get(i).getAddress()+","+StudentFileReader.StudentList.get(i).getCity()+","+StudentFileReader.StudentList.get(i).getContactNumber()+"\n");
        
    }
   
    fw.close();
    pw.close();
    
    }
    catch(IOException i){
            System.out.println("Error in writing in the 'Students.txt' file !");
}
    catch(Exception e){
            System.out.println("Error in writing in the 'Students.txt' file !");
    }
  
   
    
        
    }
    
    
    
}
