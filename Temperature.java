import java.util.Scanner;
public class Temperature{
  public static void main(String[] args) {
    double temp1Centigrade, temp2Centigrade, temp1Fahren, temp2Fahren;
    Scanner userinput = new Scanner(System.in);
    System.out.println("Enter a temperature value in Centigrade: ");
    temp1Centigrade = userinput.nextDouble();
    System.out.println("Enter another temperature value in Centigrade: ");
    temp2Centigrade = userinput.nextDouble();
    userinput.close();
    temp1Fahren = (1.8* temp1Centigrade) + 32;
    temp2Fahren = (1.8* temp2Centigrade) + 32;
    System.out.println("The first temperature value entered in Fahrenheit is "+ temp1Fahren);
    System.out.println("The second temperature value entered in Fahrenheit is "+ temp2Fahren);
  }
}
