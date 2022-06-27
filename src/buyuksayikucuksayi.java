import java.util.Scanner;

public class buyuksayikucuksayi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kaç tane sayı gireceksiniz :");
        int adet = input.nextInt();;
        int enbuyuk = 0;
        int enkucuk = 0;

        for (int i = 0;i<adet;i++){

            System.out.println("Sayı giriniz :");
            int sayı= input.nextInt();

            if (sayı>enbuyuk){
                enbuyuk=sayı;


            }
            else if ((sayı<enkucuk) || (enkucuk==0)){
                enkucuk=sayı;

            }
            System.out.println("En büyük sayı :" + enbuyuk);
            System.out.println("En küçük sayı :" + enkucuk);





        }


    }
}

