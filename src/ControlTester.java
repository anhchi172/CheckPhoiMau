import java.util.*;
public class ControlTester{

   public static void main (String [] args){
      Scanner scan = new Scanner (System.in);
      System.out.print("Nhap so luong thanh phan: ");
      int numControls = scan.nextInt();
      ArrayList<Controls> al = new ArrayList<Controls>();

      for (int i = 1; i<=3; i++){
         System.out.println("Chon 1:nhap label \nChon 2: nhap button");
         int choice = checkInput(1,2);
         if (choice == 1){
            createNewControl(al);

            //System.out.println("Thank phan " + i +" theo nguyen tac mau " + l.checkColorMatch());
         }
         else if (choice == 2){
            System.out.println("Chon 1: Button image\nChon 2: Button text");
            int choiceButton = checkInput(1,2);
            if (choiceButton ==1){
               System.out.println("Skip");
               continue;
            }
            else if (choiceButton == 2){
               createNewControl(al);
               // System.out.println("Thank phan " + i +" theo nguyen tac mau " + b.checkColorMatch()+"\n");
            }
         }



      }

      if (al.get(0).checkDirectColorMatch())
         System.out.println("Thanh phan dau tien co mau text va background phu hop quy tac phoi mau bo tuc truc tiep");
      else
         System.out.println("Thanh phan dau tien co mau text va background khong phu hop quy tac phoi mau bo tuc truc tiep");


      for (int i = 1; i<al.size(); i++){
         System.out.println("Thanh phan " + (i+1) + " theo nguyen tac mau: " + al.get(i).checkColorMatch());


      }
   }
   private static void createNewControl(ArrayList<Controls> al){
      Scanner scan = new Scanner (System.in);

      System.out.print("Nhap text: ");
      String text = scan.nextLine();
      System.out.println("Chon mau bang so duoi day: \n 1.Red 2.Orange 3.Yellow 4.Spring Green \n 5.Green 6.Turquoise 7.Cyan 8.Ocean \n 9.Blue 10.Violet 11.Magenta 12. Raspberry");
      System.out.print("Chon mau nen: ");

      int color2 = checkInput(1,12);
      System.out.print("Chon mau text: ");
      int color3 = checkInput(1,12);
      Controls l = new Controls(text, color2, color3);
      al.add(l);
   }
   private static int checkInput(int a, int b){
      Scanner scan = new Scanner (System.in);
      int choice = scan.nextInt();

      while (choice<a || choice>b){
         System.out.println("Du lieu nhap khong phu hop voi yeu cau. Vui long nhap lai:");
         choice = scan.nextInt();
      }

      return choice;
   }
}