
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author lolade94
 */
import java.util.*;
public class AddressBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input= new Scanner(System.in);
        
      ContactList contacts= new ContactList();
       
      String first="";
      String last ="";
      String number="";
      String email="";
      int n=0;
     
    

        
  System.out.println("Address Contact List: ");
  System.out.println("----------------------");
  System.out.println("Option 1: Add contact: ");
  System.out.println("Option 2: Delete contact: ");
  System.out.println("Option 3: Search contact: ");
  System.out.println("Option 4: Retrieve All Contacts: ");
  System.out.println("Option 5: Retrieve Alphabetize Contact List: ");
  System.out.println("Option 6: Retrieve Descending Contact List: ");
  System.out.println("Option 7: Contact Size: ");
  
  
     try{  
        System.out.println("Enter option :");
        n=input.nextInt();
        }
    catch(InputMismatchException e){
       
        System.out.println("Wrong Input! Input must be an integer ");
        
    }
      



   boolean found=false;      
        
    while(n>0 && n<8)
        
    {
        
        switch (n)
        {
        case 1:
            System.out.println("Contact First Name: ");
            first = input.next();
            System.out.println("Last Name: ");
            last = input.next();
            System.out.println("Phone Number: ");
            number=input.next();
            System.out.println("Email Address: ");
            email=input.next();
            contacts.add(first, last, number, email );
            break;
        case 2:
            System.out.println("Contact First Name: ");
            first = input.next();
            System.out.println("Last Name: ");
            last = input.next();
            contacts.delete(first,last);
            break;
        case 3:
            System.out.println("Contact First: ");
            first = input.next();
            System.out.println("Last Name: ");
            last = input.next();
            found=contacts.search(first, last);
            System.out.println("Item found: " + found);          
            break;
        case 4:
            contacts.print();
            break;
        case 5:
            contacts.ascend();
            contacts.print();
            break;
        case 6:
            contacts.descend();
            contacts.print();
        case 7:
            System.out.println("You have " + contacts.length() + "contacts");
            break;
        default:
          break;
        } 
        

    
        System.out.println("Enter option :");
        n=input.nextInt();
    
    }
    
    
       
    }
    
        

         
         
    
         
    
          
         
       
    
  }

