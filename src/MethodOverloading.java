public class MethodOverloading
{
static double add(int a ,double b ) {
    return a + b;

}
    static double add ( double a , int b){
        return a+b;

    }
    static double substraction(int a, double b){
    return a-b;

}
 static double substaction (double a, int b){
    return a-b;
 }
 public static void main(String[] args){
    System.out.println( " add (int, double)= " + add (15 , 25.6));
    System.out.println(" add (double,int)="+ add (25.6 , 15));
    System.out.println("substraction(int, double) = " + substraction ( 200, 345.55 ));
    System.out.println(" substraction (double,int) = " + substraction ( 345, 200));
 }






}
