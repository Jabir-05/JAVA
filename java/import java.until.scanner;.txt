import java.until.scanner;
public class Calculator{
public static void main (String [] args ){
scanner scanner=new scanner (sysrem.in);
double num1,num2, result;
char operator;
System.out.println("Enter first number");
num1=scanner.nextDouble();
System.out.println("Enter operator (+,-,*,/)");
opertor=sacnner.next().charAt(0);
System.out.println("Enter second number");
num2=scanner.nextDoubble();
switch(operator){
case '+':
result=num1+num2;
System.out.println("Result:"+result):
break;
case '-;:
result= num1 -num2;
Systm.out.println("Result"+result);
break;	
case '*':
result=num1*num1;
System.out.println("Result"+result);
break;
case '/':
if(num2 !=0){
result=num1/num2;
System.out.println("Result"=result);
}
esle{
System.out.println("cannot be divible by zero");
}break;
default:
System.out.println("Invalid opreator");
}
scanner.close0();
}
}