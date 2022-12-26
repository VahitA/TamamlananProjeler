import java.util.Random;
import java.util.Scanner;

public class tasKagitMakasOyunu {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tas Kagit Makas");

        int oyuncuPuan = 0;
        int compPuan = 0;

        while (true) {

            System.out.println("1-3 arasi bir tam sayi giriniz " +
                    "\n 1-Tas, 2-Kagit, 3-Makas");

            int oyuncuSecim = scan.nextInt();
            Random rnd = new Random();
            int compSecimi = rnd.nextInt(3) + 1;

            int puan = oyuncuSecim * 10 + compSecimi;

            //System.out.println(puan);

            if (puan == 11 || puan == 22 || puan == 33) {
                System.out.println("***************" + "\nSenin secimin: " + oyuncuSecim +
                        "\nComp secimi:" + compSecimi +
                        "\nBerabere, tekrar deneyiniz");

            } else if (puan == 12 || puan == 23 || puan == 31) {
                oyuncuPuan++;
                System.out.println("***************" + "\nSenin secimin: " + oyuncuSecim +
                        "\nComp secimi:" + compSecimi + "\nKazandin, \nSenin puanin: " + oyuncuPuan +
                        "\nComp puan: " + compPuan);


            } else if (puan == 21 || puan == 32 || puan == 13) {
                compPuan++;
                System.out.println("***************" + "\nSenin secimin: " + oyuncuSecim +
                        "\nComp secimi:" + compSecimi + "\nKaybettin, \nSenin puanin: " + oyuncuPuan +
                        "\nComp puan: " + compPuan);


            } else {
                System.out.println("***************" + "\nSenin secimin: " + oyuncuSecim +
                        "\nComp secimi:" + compSecimi + "\nHatali giris, tekrar deneyiniz!");


            }
            if (oyuncuPuan == 3) {
                System.out.println(("=============" + "\nOyun bitti. Kazandin, \nSenin puanin: " + oyuncuPuan +
                        "\nComp puan: " + compPuan));
                break;

            } else if (compPuan == 3) {
                System.out.println(("=============" + "\nOyun bitti. Kaybettin, \nSenin puanin: " + oyuncuPuan +
                        "\nComp puan: " + compPuan));
                break;
            }

        }
    }

}
