package com.driver;

public class Main
{
    
   static class Product{
     public int product(int x, int y, int z)
    {
      return 0;
    }
    public int product(int x, int y)
    {
      return 0;
    }
    public int product(double x, double y)
    {
      return 0;
    }
    
  }

	public static void main(String[] args) {
		Product p=new Product();
    p.product(1,0);
    p.product(1,0,0);
    p.product(1.08,1.09);
	}
}

  
  
}
