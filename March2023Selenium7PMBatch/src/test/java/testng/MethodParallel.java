package testng;

import org.testng.annotations.Test;

public class MethodParallel 
{
	
  @Test
  public void test1() 
  {
	  System.out.println("test1 : "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("test2: "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test3() 
  {
	  System.out.println("test3: "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test4() 
  {
	  System.out.println("test4: "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test5() 
  {
	  System.out.println("test5: "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test6() 
  {
	  System.out.println("test6: "+ Thread.currentThread().getId());
  }
  
  @Test
  public void test7() 
  {
	  System.out.println("test7: "+ Thread.currentThread().getId());
  }
  
}
