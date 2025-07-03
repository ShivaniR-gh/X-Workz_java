class Calculator{
public static void main(String[] args){

add(10,20);
add(57,28);
sub(50,25);
sub(20,10);
mul(10,2);
mul(5,10);
div(51,10);
div(10,2);
mod(51,10);
mod(127,10);
}
 public static void add(int num1,int num2){
 int total=num1+num2;
 System.out.println("The addition of two given numbers are       :"+total);
 }
 public static void sub(int num1,int num2){
 int total=num1-num2;
 System.out.println("The substraction of two given numbers are   :"+total);
 }
 public static void mul(int num1,int num2){
 int total=num1*num2;
 System.out.println("The multiplication of two given numbers are :"+total);
 }
 public static void div(int num1,int num2){
 int total=num1/num2;
 System.out.println("The division of two given numbers are       :"+total);
 }
 public static void mod(int num1,int num2){
 int total=num1%num2;
 System.out.println("The modulas of two given numbers are        :"+total);
 }
}