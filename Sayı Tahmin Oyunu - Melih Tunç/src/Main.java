import java.util.Random;
import java.util.Scanner;


public class Main
{

    public static void main(String[] args)
    {
        Random randomNesnesi=new Random();

        int upperBound=11;

        int randomSayi=randomNesnesi.nextInt(upperBound);

        System.out.println("Cihaz tarafında 0-10 değer aralığında rastgele bir sayı tanımlanmıştır");



        Scanner input=new Scanner(System.in);

        int kullaniciTahmini;

        System.out.println("Lutfen 0-10 arasi sayı giriniz!");

        kullaniciTahmini=input.nextInt();

        System.out.println("Girdiginiz sayiyi cihazın rastgele seçtiği deper ile karsilastiriyoruz!");


        boolean kiyaslamayaDevam=true;

        do
        {
            if(kullaniciTahmini < 0 || kullaniciTahmini > 10 )
            {
                System.out.println(" kural dışı bir değer girildiği için sistem sonlandırılmıştır ");
                break;
            }
            
            else if(kullaniciTahmini==randomSayi)
            {
                System.out.println("Tebrikler,  girdiğiniz değer ile cihazın rastgele seçtiği değer aynı , kazandınız! ");
                kiyaslamayaDevam=false;
            }
            else if (kullaniciTahmini < randomSayi)
            {
                System.out.println("Daha büyük bir sayı giriniz: ");
                kullaniciTahmini = input.nextInt();
            }
            else
            {
                System.out.println("Daha küçük bir sayı giriniz: ");
                kullaniciTahmini = input.nextInt();
            }
        }
        while(kiyaslamayaDevam);


    }


}

