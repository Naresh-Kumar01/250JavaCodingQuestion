package May_27_2025;

public class UserInputExample {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name");
        String name= sc.nextLine();
        System.out.println("please enter the age");
        int age=sc.nextInt();
        System.out.println("hello," +name+"!you are "+age+"you old");
        sc.close();
    }
  
}
