import java.util.*;
public class ControlTester{
   public static void main (String [] args){
      Scanner scan = new Scanner (System.in);
      System.out.print("Nhap so luong thanh phan: ");
      int numControls = scan.nextInt();
      ArrayList<Controls> al = new ArrayList<Controls>();
      
      for (int i = 1; i<=3; i++){
         System.out.println("Chon 1:nhap label \nChon 2: nhap button");
         int choice = scan.nextInt();
         if (choice == 1){
            System.out.print("Nhap text: ");
            String text = scan.next();
            System.out.println("Chon mau bang so duoi day: \n 1.Red 2.Orange 3.Yellow 4.Spring Green \n 5.Green 6.Turquoise 7.Cyan 8.Ocean \n 9.Blue 10.Violet 11.Magenta 12. Raspberry");
            System.out.print("Chon mau nen: ");
            int color2 = scan.nextInt();
            System.out.print("Chon mau text: ");
            int color3 = scan.nextInt();
            Label l = new Label(text, color2, color3);
            al.add(l);
            //System.out.println("Thank phan " + i +" theo nguyen tac mau " + l.checkColorMatch());
         }
         else if (choice == 2){
            System.out.println("Chon 1: Button image\nChon 2: Button text");
            int choiceButton = scan.nextInt();
            
            if (choiceButton ==1){
               System.out.println("Skip");
               continue;
            }
            else if (choiceButton == 2){
               System.out.print("Nhap text: ");
               String text = scan.next();
               System.out.println("Chon mau bang so duoi day: \n 1.Red  2.Orange 3.Yellow 4.Spring Green \n 5.Green 6.Turquoise 7.Cyan 8.Ocean \n 9.Blue 10.Violet 11.Magenta 12. Raspberry\n");
             
               System.out.print("Chon mau nen: ");
               int color2 = scan.nextInt();
               System.out.print("Chon mau text: ");
               int color3 = scan.nextInt();
               Button b = new Button(text, color2, color3);
               al.add(b);
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
}