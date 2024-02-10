package test;

import org.testng.annotations.Test;

import utilities.BaseClass;

public class NewTest extends BaseClass {
  @Test
  public void f() {
	  System.out.println("this is test");
  }
  
  @Test
  public void f1() {
	  System.out.println("this is test1");
  }
  
  @Test
  public void f2() {
	  System.out.println("this is test2");
  }
}
