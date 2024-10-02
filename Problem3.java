
public class Problem3
{
  public static void main(String[] args)
  {
    double num1 = 67.3425;
    System.out.println(num1*10 % 10);
    int dec1 = (int) (num1*10 % 10);
    int dec2 = (int) (num1*10*10 % 10);
    int dec3 = (int) (num1*10*10*10 % 10);
    System.out.println( dec1 + " " + dec2 + " " + dec3);
    //System.out.println(num1/10 % 10);
    //System.out.println(num1/10/10 % 10);
    //System.out.println("Answer: " + numx + " + " + numy + " = " + add);
  }
}
