 import java.util.Scanner;
public class Task3{
public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
int[][] arr ={
              {12,13,14,15,16,},
              {11, 110, 121, 17},
              {17,18,100,21}};
int sum = 0;
for(int i = 0 ;i<3 ; i++){
for(int j = 0 ; j<4; j++){
 System.out.print(arr[i][j] + " ");
}System.out.println();
}
 System.out.println();
for(int i = 0 ;i<3 ; i++){
for(int j = 0 ; j<4; j++){
if (arr[i][j]%2==0){
 arr[i][j] = arr[i][j] / 2;
sum = sum + arr[i][j];

}
 System.out.print(arr[i][j] + " ");
}System.out.println();
}
System.out.println();

for(int i = 0 ;i<3 ; i++){
for(int j = 0 ; j<4; j++){
 if (arr[i][j] % 2 !=0){
  System.out.print(arr[i][j] + " ");
}
}System.out.println();
}
System.out.println(sum);
}
}