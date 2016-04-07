/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;


import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *
 * @author lolade94
 * @param <T>
 */
public  class ContactList {


   //create a linked list of Contact object type (Look at contact inner class) 
    LinkedList<Contact> contact = new LinkedList<Contact>();



    
  //Define a contact  using a inner class
  
    public class Contact  implements Comparable<Contact> {
                           //Comparable interace with <Contact> datatype
        
        //all the variables include in a address book
        private String fname;
        private String lname;
        private String phone;
        private String email;
        //define contact object 
        Contact(String first, String last, String num, String emailA){
            
            fname= first;
            lname=last;
            phone=num;
            email=emailA;
            
        }

       
        
        
        @Override
        public String toString(){
            
            return fname + " " + lname + " " + phone + " " + email;
        
    }
        public  String getFirst(){
            
            return fname;
            
        
    }
        public String getLast(){
         
            return lname;
        
        }
       
        public String getPhone(){
            
            return phone;
        }
        
        public String getEmail(){
            
            return email;
        }

        //Collection sort need a compare to create an ascending or decending list 
        // take one variable you want sort by last name or number for example
        @Override
        public int compareTo(Contact t) {
          //i'm sorting by another contact last name
          String last= t.getLast();
          
      if(this.lname.compareToIgnoreCase(last)>0)
          return 1;
      else if(this.lname.compareToIgnoreCase(last)<0)
          return -1;
        else
           return 0;
      
       
        
    }
    }
    
    

    public void add(String first, String last, String num, String em){
        
        contact.add(new Contact(first, last, num, em));
    }
    
    public boolean search(String first, String last){
        
        boolean found=false;
        //traverse list
        for(int i=0;i<contact.size(); i++){
            //see if each index of list == to both parameters
            if( contact.get(i).getFirst().equals(first)) {
                if (contact.get(i).getLast().equals(last)) {
                    found= true;
                }
            }
    
        }
        return found;
    }
    
    
    public void ascend(){
        //collections.sort linked list but you must implement a compareto method to work
        //takes parameter with contact
        Collections.sort(contact);
    }
    
    public void descend(){
        //collections.sort linked list but you must implement a compareto method to work
        //takes parameter with contact
        Collections.sort(contact, Collections.reverseOrder());
    }
    
    
    public void delete(String first, String last){
        
        for(int i=0;i<contact.size();i++){
            if(contact.get(i).getFirst().equals(first)&& contact.get(i).getLast().equals(last))
                contact.remove(i);
            
        }
        
    }
 

 



       
     
 
    public boolean isEmptyList() {
       
        return contact.isEmpty();
    
    }

    
  
  
    public int length() {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    return contact.size();
    }

 

    public void print(){
        
        for(int i=0; i<contact.size(); i++)
        {
            System.out.println(contact.get(i));
        }
    }
    

    
}
