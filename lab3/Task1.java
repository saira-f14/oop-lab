import java.util.Scanner;
public class Task1{
public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the any prime number range from : ");
int num1 = scanner.nextInt();
System.out.println("Enter the any range to: ");
int num2 = scanner.nextInt();
for(int i = num1; i<num2;i++){
boolean isPrime = true;
for(int j = 2; j<i ;j++){

if(i%j==0){
isPrime = false;
break;
}
}
if(isPrime)
System.out.println(i);

}
}
}

