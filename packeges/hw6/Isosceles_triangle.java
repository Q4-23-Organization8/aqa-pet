package hw6;

public class Isosceles_triangle {
    public static void main(String[] args) {
     int a = 5;
     int b = 20;
     int c = 5;
     String result = "Трикутник рівнобедренний";

     if (a == b && a + b > c && a != c)
         System.out.println(result);
        else if (a == c && a + c > b && a != b)
         System.out.println(result);
      else if (b == c && b + c > a && c != a)
            System.out.println(result);
      else if (a == b  && b == c)
         System.out.println("Трикутник рівносторонній");
     else
         System.out.println("Трикутника з такими сторонами не існує");

    }
}
