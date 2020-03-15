public class Button extends Controls{
   private String text;
   private int colorBackground;
   private int colorText;

   public Button (String t, int c1, int c2){
     super(t, c1, c2);
   }
/*
  public int getColorBackground() {
      return colorBackground;
   }
   public int getColorText() {
      return colorText;
   }
   public void setColorBackground(int cB) {
      colorBackground = cB;
   }
   public void setColorText(int cT) {
      colorText = cT;
   }


   public boolean checkDirectColorMatch(){
      int smaller = Math.min(colorBackground, colorText);
      int larger = Math.max(colorBackground, colorText);
      if (smaller + 6 == larger)
         return true;
      else
         return false;
   }

   public String checkTypeColorMatch(){
      String res = "";
      if (colorBackground == colorText)
         res = "Don sac";
      else {
         int smaller = Math.min(colorBackground, colorText);
         int larger = Math.max(colorBackground, colorText);
      
         if (smaller + 1 == larger)
            res = "Tuong dong";
         else if (checkDirectColorMatch() == true)
            res = "Truc tiep";
         else
            res = "Ko phu hop voi bat ki quy tac phoi mau nao";
      }
   
      return res;
   
   
   }*/

}