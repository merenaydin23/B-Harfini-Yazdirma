public class Main {
    public static void main(String[] args) {
      String[][]dizi=new String [7][4];
        for (int i=0;i< dizi.length;i++){
            for (int k=0;k<dizi[i].length;k++){
            if (i==0^i==3^i==6){
                dizi[i][k]="*";
            }
            else if (k==0^k==3) {
                dizi[i][k]="*";
            }
             else{
                 dizi[i][k]=" ";
            }
            }
        }
        for (int i=0;i< dizi.length;i++){
            for (int k=0;k<dizi[i].length;k++){
                if (k==3){
                System.out.print(dizi[i][k]);
                System.out.println();
            }
         else if (k!=3){
             System.out.print(dizi[i][k]+" ");
                }

    }
}}}
