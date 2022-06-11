import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
         System.out.print("Kac tane sayi gireceksiniz:");
         n = input.nextInt();

         int sayi;
         int maxNumber=1,minNumber=1;
         for (int i=1; i<=n;i++){
             System.out.print(i+". sayiyi girin:");
             sayi= input.nextInt();
             if(i==1){
                 maxNumber = sayi;
                 minNumber = sayi;

             }
             if (sayi>maxNumber){
                 maxNumber=sayi  ;
             }
             if (sayi<minNumber){
                 minNumber=sayi;
             }
         }
         System.out.println("En buyuk sayi:"+ maxNumber);
         System.out.println("En kucuk sayi:"+ minNumber);



    }
}
