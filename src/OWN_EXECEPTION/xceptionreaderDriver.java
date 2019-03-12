package OWN_EXECEPTION;

import java.util.Scanner;
public class xceptionreaderDriver{
  public static void main(String[]args){
    xceptionreader muhai=new xceptionreader();
    try{
      muhai.myMethod();
    }catch(myException e){
      System.out.println(e);
    }
  }
}