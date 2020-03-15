public class Controls{

   private String text;
   private int colorBackground;
   private int colorText;

   public Controls(String t, int c1, int c2){
      text = t;
      colorBackground = c1;
      colorText = c2;
   }

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

   public String checkColorMatch(){
      String res = "";
      if (colorBackground == colorText)
         res = "Don sac";
      else {
         int smaller = Math.min(colorBackground, colorText);
         int larger = Math.max(colorBackground, colorText);
      
         if (smaller + 1 == larger)
            res = "Tuong dong";
         else if (smaller + 6 == larger)
            res = "Truc tiep ";
         else
            res = "Khong phu hop voi bat ki quy tac phoi mau nao";
      }
   
      return res;
   
   
   }
   
   
/*public String checkTypeMatch (Control c){
{*/

}