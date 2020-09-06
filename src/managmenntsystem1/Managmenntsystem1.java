/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managmenntsystem1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author mubeen arshad
 */
public class Managmenntsystem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
          String loc="C:\\school\\students\\";
          String loc1="C:\\school\\teachers\\";
        boolean n=true;
        
      
        
        Scanner input=new Scanner (System.in);
     
        while(n){
            System.out.print("wellcome to school managment system"+"\n"+
             "for student log in :press 1"+"\n"+
               "for teacher log in :press 2"+"\n"+
                    "for admin log in :press 3"+"\n"+"for exit,press 4"+"\n"
                  );
            int user1 =input.nextInt();
            switch(user1){
                case 1:
                     System.out.print(
                             "for new registeration :press 1"+"\n"+
                            "for sign in  :press 2"+"\n"
                            );
                     int user2 =input.nextInt();
                    switch(user2){
                        case 1:
                            login(loc);
                            break;
                        case 2:
                            registereduser(loc);
                            break;
                            
                            
                    }        
                    break;
                   
                case 2:
                    System.out.println("enter your name sir please");
                    String name=input.next();
                    String names=loc1+name+".txt";
                    File file=new File(names);
                    if(file.exists()){
                         System.out.println("wellcome to teachers login"+"\n"+
                             "for entering or changing  marks:press 1"+"\n"+
                                 "for deletion press 2"+"\n"+
                             "for exiting :press 3"+"\n");
                    int user4=input.nextInt();
                    
                    switch(user4){
                        case 1:
                            System.out.println("wellcome to teachers login"+"\n"+
                             "for entering or changing quiz marks:press 1"+"\n"+"for exit :press 2");
                            int user5=input.nextInt();
                            switch(user5){
                                case 1:
                                    
                                       quiz(loc);
                                     
                                     
                                    
                                    
                            }
                            break;
                        case 2:
                            delete(loc);
                            break;
                        case 3:
                            System.exit(0);
                            
                        
                    }
                        
                    }
                    
                    
                   
                   
                    break;
                case 3:
                     System.out.println("wellcome to admin login"+"\n"+
                             "for checking fee press 1"+"\n"+
                             "for fee entering press 2"+"\n"+"lessing fee press 3"+"\n"+
                             "4 for adding teachers");
                     int user3=input.nextInt();
                     switch(user3){
                         case 1:
                             checkingfee(loc);
                             break;
                         case 2:
                             feesentering(loc);
                             break;
                         case 3:
                             feeconcession(loc);
                             break;
                         case 4:
                             addteachers(loc1);
                             break;
        
                   
                     }
                     break;
                    
                    
                case 4:
                    System.exit(0);
                    
                default:
                    System.out.print("wrong entry"+"\n");
                    break;
                
                    
                }
        }
    }
            
      
        public static void login(String loc) throws IOException{
            System.out.print("enter your user name"+"\n");
            Scanner input=new Scanner(System.in);
                            String s1=input.next();
                            String s2=loc.concat(s1);
                            s2=s2+".txt";
                             System.out.print(s2);
                            
                            File file=new File(s2);
                            if(file.createNewFile()){
                                System.out.print("created"+"\n");
                                
                             String passfile=loc+"passfile"+s1+".txt";
                            
                            File passfilee=new File(passfile);
                          
                           
                            
                            
                            
                             System.out.print("enter your password"+"\n");
                             
                             int password=input.nextInt();
                             
                             PrintWriter output=new PrintWriter(passfilee);
                             
                             output.print(password);
                              output.close();
                             
                             
                            String marksfile=loc+"quizfile";
                            marksfile=marksfile+s1+".txt";
                            File markfile=new File(marksfile);
                            if(markfile.createNewFile()){
                             System.out.print("quiz file creted"+"\n");
                            }
                            
                            }
                            else{
                                System.out.print("EXIST ALREADYY"+"\n");
                                
                            }
                            String feesfile=loc+"feesfile"+s1+".txt";
                            File feefile=new File(feesfile);
                            if(feefile.createNewFile()){
                                System.out.print("fee file created"+"\n");
                            }
                            PrintWriter output=new PrintWriter(feesfile);
                            int fee=0;
                            output.print(fee);
                            output.close();
                            
                            
                            
                            
             
                                
                            
                            
        }
        public static void registereduser(String loc) throws FileNotFoundException{
            System.out.print("enter your user name"+"\n");
            Scanner input=new Scanner(System.in);
                            String existinguser=input.next();
                            String existingguser=existinguser;
                            existinguser=loc+existinguser+".txt";
                            File existfile=new File(existinguser);
                            if(existfile.exists()){
                                 System.out.print("enter your pass"+"\n");
                                 int existpass=input.nextInt();
                                 String existspassfile=loc+"passfile"+existingguser+".txt";
                                 File existpassfile=new File(existspassfile);
                                 Scanner inputs =new Scanner(existpassfile);
                                 while(inputs.hasNext()){
                                     int sss=inputs.nextInt();
                                     System.out.println(sss);
                                     
                                     if(sss==existpass){
                                     System.out.print("correct pass");
                                     System.out.print("press 1 for checking result"+"\n"
                                             +"press 2 for checking fee"+"\n"
                                             +"press 3 for exiting"+"\n");
                                     
                                     int user3=input.nextInt();
                                     
                                     
                                     switch(user3){
                                         case 1:
                                             System.out.print("press 1 for checking quiz"+"\n"
                                             +"\n"
                                             );
                                             int user5=input.nextInt();
                                             switch(user5){
                                                 case 1:
                                                      String emarks=loc+"quizfile"+existingguser+".txt";
                                                       FileReader emark=new FileReader(emarks);
                                                       Scanner input1=new Scanner(emark);
                                                       int i=0;
                                                      while(input1.hasNextInt()){
                                                          
                                                             String marks=input1.next();
                                                             System.out.println("for quiz "+i+"\t"+marks+"\t");
                                                             i+=1;
                                                            } 
                                                           input1.close();
                                                           break;
                                               
                                                     
                                                     
                                                           }
                                             
                                             
                                            
                                             
                                             
                                             break;
                                         case 2:
                                             checkingfee(loc);
                                             break;
                                             
                                         case 3:
                                             System.exit(0);
                                         
                                     }
                                 }
                                 }
                                     
                                 } 
                            
                            
        }
        public static void feesentering(String loc) throws FileNotFoundException{
            Scanner input=new Scanner(System.in);
            System.out.println("entr the user name"+"\n");
            String user =input.next();
            String s1=loc+"feesfile"+user+".txt";
            File file=new File(s1);
            if(file.exists()){
                Scanner inputs=new Scanner(file);
               int existingfee=inputs.nextInt();
               PrintWriter output=new PrintWriter(file);
               System.out.println("how much fee u wanna enter"+"\n");
               int newfee=input.nextInt();
               int actualfee=newfee+existingfee;
              System.out.println("neww fee is"+actualfee+"\n");
              output.print(actualfee);
              inputs.close();
              output.close();
                
            }
            else{
                System.out.println("incorrect user name"+"\n");
                
            }
 
        }
        public static void feeconcession( String loc) throws FileNotFoundException{
            Scanner input=new Scanner(System.in);
            System.out.println("entr the user name"+"\n");
            String user =input.next();
            String s1=loc+"feesfile"+user+".txt";
            File file=new File(s1);
            if(file.exists()){
                Scanner inputs=new Scanner(file);
                int existingfee=inputs.nextInt();
                PrintWriter output=new PrintWriter(file);
                System.out.println("how much fee u wanna less"+"\n");
                int newfee=input.nextInt();
                 if(newfee<existingfee){
                       int actualfee=existingfee-newfee;
                       System.out.println("neww fee is"+actualfee+"\n");
                      output.print(actualfee);
                      output.close();
                
                 }
                 else{
                      System.out.println("the entered fee is greater than existing"+"\n");
                     
                 }
            
                
            }
            else{
                System.out.println("incorrect user name"+"\n");
                
            }
            
        }
        public static void checkingfee(String loc) throws FileNotFoundException{
             Scanner input=new Scanner(System.in);
            System.out.println("entr the user name"+"\n");
            String user =input.next();
            String s1=loc+"feesfile"+user+".txt";
            File file=new File(s1);
             if(file.exists()){
                Scanner inputs=new Scanner(file);
                int ss=inputs.nextInt();
                System.out.println("fee is "+ss+"\n");
                inputs.close();
             }
             else{
                 System.out.println("no user name found"+"\n");
             }
    
    
    
        // TODO code application logic here
           }
           public static void addteachers( String loc1) throws IOException{
               Scanner input=new Scanner(System.in);
               String user=input.next();
               String name=loc1+user+".txt";
               File file=new File(name);
               if(file.createNewFile()){
                   System.out.print("created");
               }

               }
           public static void quiz(String loc) throws FileNotFoundException, IOException{
               
               Scanner in=new  Scanner(System.in);
               System.out.println("entr user name");
               String user=in.next();
               loc=loc+"quizfile"+user+".txt";
               
               int []x=new int[4];
               File file=new File(loc);
               FileReader filee=new FileReader(file);
               BufferedReader input=new BufferedReader(filee);
               
               
               
               String s=input.readLine();
               int i=0;
               while(s!=null){
                   s=s.trim();
                   if(s.length()==0){
                       continue;
                   }
                   x[i]=Integer.parseInt(s);
                   
                   i+=1;
                   s=input.readLine();
            
               }
               
               input.close();
            
               
                   
                   
               boolean value=true;       
               while(value){
                   System.out.println("entr the quiz number");
                   
                   int quizn=in.nextInt();
                   System.out.println("entr the numbers in quiz");
                   int quiznn=in.nextInt();
                   x[quizn]=quiznn;
                   System.out.println("if u dont wanna add more:press 1");
                   int more=in.nextInt();
                   
                   if(more==1){
                       value=false;
                   }
                   
               }
               
               
               
               
               
               
               
               FileWriter file1=new FileWriter(loc);
               PrintWriter out=new PrintWriter(file1);
               for(int j=0;j<x.length;j++){
                   out.println(x[j]);
               }
               out.close();
                   
                   
           
           
            
               
           }
           public static void delete(String loc) throws FileNotFoundException{
               Scanner input=new Scanner(System.in);
               String user=input.next();
               loc=loc+"quizfile"+user+".txt";
               File file=new File(loc);
               Scanner in=new Scanner(file);
               int x[]=new int[4];
               int i=0;
               while(in.hasNext()){
                   x[i]=in.nextInt();
                   System.out.println("chalgaya"+x[i]);
                   i+=1;
                   
               }
               System.out.println("which quiz u wanna dell ");
               int del=input.nextInt();
               x[del]=0;
               
               PrintWriter pw=new PrintWriter(file);
               for(int j=0;j<x.length;j++){
                   pw.println(x[j]);
               }
               pw.close();
               
           }
}


               
           
           
    