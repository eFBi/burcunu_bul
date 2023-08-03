import java.util.Scanner;


public class ornek2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Koç Burcu : 21 Mart - 20 Nisan
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        //Aslan Burcu : 23 Temmuz - 22 Ağustos
        //Başak Burcu : 23 Ağustos - 22 Eylül
        //Terazi Burcu : 23 Eylül - 22 Ekim
        //Akrep Burcu : 23 Ekim - 21 Kasım
        //Yay Burcu : 22 Kasım - 21 Aralık
        //Oğlak Burcu : 22 Aralık - 21 Ocak
        //Kova Burcu : 22 Ocak - 19 Şubat
        //Balık Burcu : 20 Şubat - 20 Mart

        int month,day;
        System.out.print("Kaçıncı ayda doğdunuğuzu giriniz: ");
        month=input.nextInt();

        System.out.print("Ayın kaçına doğduğunuzu giriniz: ");
        day = input.nextInt();



        switch (month){
            case(1):
                if(day<22){
                    System.out.println("Oğlak Burcuna sahipsiniz.");
                }else{
                    System.out.println("Kova burcuna sahipsiniz.");
                }
                break;
            case(2):
                if (day<20){
                    System.out.println("Kova burcuna sahipsiniz.");
                }else{
                    System.out.println("Balık burcuna sahipsiniz.");
                }
                break;
            case(3):
                if(day<21){
                    System.out.println("Balık burcuna sahipsiniz.");
                }else{
                    System.out.println("Koç burcuna sahipsiniz.");
                }
                break;
            case(4):
                if(day<21){
                    System.out.println("Koç burcuna sahipsiniz.");
                }else {
                    System.out.println("Boğa burcuna sahipsiniz.");
                }
                break;
            case(5):
                if(day<22){
                    System.out.println("Boğa burcuna sahipsiniz.");
                }else {
                    System.out.println("İkizler burcuna sahipsiniz.");
                }
                break;
            case(6):
                if(day<23){
                    System.out.println("İkizler burcuna sahipsiniz.");
                }else {
                    System.out.println("Yengeç burcuna sahipsiniz.");
                }
                break;
            case(7):
                if (day<23){
                    System.out.println("Yengeç burcuna sahipsiniz.");
                }else {
                    System.out.println("Aslan burcuna sahipsiniz.");
                }
                break;
            case(8):
                if(day<23){
                    System.out.println("Aslan burcuna sahipsiniz.");
                }else {
                    System.out.println("Başak burcuna sahipsiniz.");
                }
                break;
            case(9):
                if(day<23){
                    System.out.println("Başak burcuna sahipsiniz.");
                }else {
                    System.out.println("Terazi burcuna sahipsiniz.");
                }
                break;
            case(10):
                if(day<23){
                    System.out.println("Terazi burcuna sahipsiniz.");
                }else{
                    System.out.println("Akrep burcuna sahipsiniz.");
                }
                break;
            case(11):
                if(day<22){
                    System.out.println("Akrep burcuna sahipsiniz.");
                }else {
                    System.out.println("Yay burcuna sahipsiniz.");
                }
                break;
            case(12):
                if(day<22){
                    System.out.println("Yay burcuna sahipsiniz.");
                }else{
                    System.out.println("Oğlak burcuna sahipsiniz.");
                }
                break;
            default:
                break;





        }
    }
}
