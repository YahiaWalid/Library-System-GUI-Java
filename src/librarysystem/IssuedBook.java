/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

/**
 *
 *    @author Yahia
 * 
 **/

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class IssuedBook /*extends Student*/ {
    
    
    private int id;
    private String bookCallNo;
    private int studentId;
    private String studentName;
    private String  StudentContactNumber; 
    private Date issueDate = new Date();
//    private String bookName;
//    private String author;
//    private String publisher;

//    public String getBookName() {
//        return bookName;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setBookName(String bookName) {
//        this.bookName = bookName;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//      public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
    
    
    
    
    
    

    public Date getIssueDate() {
        return issueDate;
    }

    
    
    public int getId() {
        return id;
    }

    public String getBookCallNo() {
        return bookCallNo;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentContactNumber() {
        return StudentContactNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBookCallNo(String bookCallNo) {
        this.bookCallNo = bookCallNo;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentContactNumber(String StudentContactNumber) {
        this.StudentContactNumber = StudentContactNumber;
    }

        public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
    
    
    public IssuedBook(int id, String bookCallNo, int studentId, String studentName, String StudentContactNumber, Date issueDate) {
        this.id = id;
        this.bookCallNo = bookCallNo;
        this.studentId = studentId;
        this.studentName = studentName;
        this.StudentContactNumber = StudentContactNumber;
        this.issueDate=issueDate;
        
    }

//    public IssuedBook(int id, String bookCallNo, int studentId, String studentName, String StudentContactNumber, String bookName, String author, String publisher) {
//        this.id = id;
//        this.bookCallNo = bookCallNo;
//        this.studentId = studentId;
//        this.studentName = studentName;
//        this.StudentContactNumber = StudentContactNumber;
//        this.bookName = bookName;
//        this.author = author;
//        this.publisher = publisher;
//    }

    public IssuedBook() {
    }

  
    
    
    
}
