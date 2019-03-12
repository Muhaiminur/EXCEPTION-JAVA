package OWN_EXECEPTION;

import java.util.Scanner;
public class xceptionreader{
  public void myMethod() throws myException{
    Scanner abir=new Scanner(System.in);
    int n=abir.nextInt();
    System.out.println("enter your name fixing please?");
    int m=abir.nextInt();
    if(m==n){
      System.out.println("Yes you are right");
    }else{
      throw new myException();
    }
  }
}