import java.util.Scanner;

//实现景区功能
public class Test {
    public static void main(String[] args) {
        String jx="";
        Scanner input=new Scanner(System.in);
        do {
            Yr yr=new Yr();
            System.out.println("请输入姓名");
            yr.name=input.next();
            System.out.println("请输入年龄");
            yr.age=input.nextInt();
            yr.showJiage();
            System.out.println("是否继续(Y/N)");
             jx=input.next();
        }while (jx.equals("y"));
    }

}
