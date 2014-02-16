U10216014_HW11.2
================
The homework hava six classes.

All class's data field:                                
Preson: name, address, phone number, email address.    
Student: class status                                  
Employee: office, salary, date hired                   
Faculty: office hour, rank
Staff: title

The relation is      Person              
                        |                
                   -----------           
                   |         |           
                Student   Employee       
                            |     
                        -----------          
                        |         | 
                      Faculty    Staff 
                      
Another class  MyDate is based on the Ex 10.14.
In this homework, it need to provide a time for employee hired day.
So, I create a object that invoke the class's no-arg constructor.
The constructor can print a current time.
