/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import org.w3c.dom.css.Counter;

/**
 *
 * @author Yahia
 */
public class Book extends Person{
    
    private int        id;
    private String     callNo;
    private String     author;
    private String     publisher;
    private int        quantity;
    private static int counter=0 ;

    public static int getCounter() {
        return counter;
    }
    
    public int getId() {
        return id;
    }
    public String getCallNo() {
        return callNo;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCallNo(String callNo) {
        this.callNo = callNo;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    public Book() {
        counter++;
    }

    public Book(int id ,String Name , String callNo, String author, String publisher, int quantity) {
        super(Name);
        this.id=id;
        this.callNo = callNo;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        counter++;
    }

    public Book(int id, String callNo, String author, String publisher) {
        this.id = id;
        this.callNo = callNo;
        this.author = author;
        this.publisher = publisher;
        counter++;
    }

    public Book(int id, String callNo, String author, String publisher, String Name) {
        super(Name);
        this.id = id;
        this.callNo = callNo;
        this.author = author;
        this.publisher = publisher;
        this.quantity=quantity;
        counter++;
    }
    
    public void incQuantity(int quantity){
        
        this.quantity+=quantity;
    }
   
   public void decQuantity(int quantity){
       
       this.quantity-=quantity;
   } 
    
}
