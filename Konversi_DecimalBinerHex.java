package AOK;
import java.util.Scanner;

/**
 * @reference https://www.javatpoint.com
 * @author Faqih Abyan Al Ghifari - 235150200111029
 */
public class Konversi_DecimalBinerHex {

    public static void main(String[] args) {
        System.out.print("""
                         1. Konversi Desimal ke Biner
                         2. Konversi Biner ke Desimal
                         3. Konversi Desimal ke Hexadesimal
                         4. Konversi Hexadesimal ke Desimal
                         5. Konversi Biner ke Hexadesimal
                         6. Konversi Hexadesimal ke Biner
                         
                         Pilihan anda : """);
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        System.out.println("====================================");
        switch (pilihan) {
            case 1: {       //DESIMAL KE BINER
                System.out.print("Masukkan bilangan desimal : ");
                int desimal = input.nextInt();
                int sisa;
                String biner = "";
                String stringSisa;
                while (desimal != 0) {
                    sisa = desimal % 2;
                    stringSisa = String.valueOf(sisa);
                    biner = stringSisa + biner;
                    desimal /= 2;
                }
                System.out.println("Bilangan dalam biner : "+biner);
                break;
            }
            case 2: {       //BINER KE DESIMAL
                System.out.print("Masukkan bilangan biner : ");
                String biner = input.next();
                int desimal = Integer.parseInt(biner, 2);
                System.out.println("Bilangan dalam desimal : "+desimal);
                break;
            }
            case 3: {       //DESIMAL KE HEXA
                System.out.print("Masukkan bilangan desimal : ");
                int desimal = input.nextInt();
                String heksadesimal = Integer.toHexString(desimal).toUpperCase();
                System.out.println("Bilangan dalam heksadesimal : " + heksadesimal);
                break;
            }
            case 4: {       //HEXA KE DESIMAL
                System.out.print("Masukkan bilangan heksadesimal : ");
                input.nextLine();
                String heksadesimal = input.nextLine();

                int hasilDesimal = 0;
                int panjang = heksadesimal.length();

                for (int i = 0; i < panjang; i++) {
                    char digit = heksadesimal.charAt(i);
                    int bobot = 0;

                    if (Character.isDigit(digit)) {
                        bobot = Character.getNumericValue(digit);
                    } else {
                        digit = Character.toUpperCase(digit);
                        bobot = 10 + (digit - 'A');
                    }

                    int posisi = panjang - 1 - i;
                    hasilDesimal += bobot * Math.pow(16, posisi);
                }

                System.out.println("Bilangan dalam desimal : " + hasilDesimal);
                break;
            }
            case 5: {       //BINER KE HEXA
                System.out.print("Masukkan bilangan biner : ");
                input.nextLine();
                String biner = input.nextLine();

                int desimal = Integer.parseInt(biner, 2);
                String heksadesimal = Integer.toHexString(desimal).toUpperCase();

                System.out.println("Bilangan dalam heksadesimal : " + heksadesimal);
                break;
            }
            case 6: {       //HEXA KE BINER
                System.out.print("Masukkan bilangan heksadesimal: ");
                input.nextLine();
                String heksadesimal = input.nextLine();

                int desimal = Integer.parseInt(heksadesimal, 16);
                String biner = Integer.toBinaryString(desimal);

                System.out.println("Bilangan dalam biner: " + biner);
                break;
            }
            default:{
                System.out.println("Tidak ada di pilihan");
            }
        }
    }
}
