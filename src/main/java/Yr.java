//有人类
public class Yr {
  String  name;
  int age;
  public  void  showJiage(){
      if (age<=10){
          System.out.println("年龄小免费");
      }else if (age<=60){
          System.out.println("门票全费100");
      }else {
          System.out.println("门票50");
      }
      }
  }

