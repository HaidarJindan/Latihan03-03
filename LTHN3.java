import java.util.Scanner;

public class LTHN3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan1 = 4;
		System.out.println("4");
        System.out.println("2");
        int bilangan2 = 5;
        System.out.println("Hasil Penjumlahan :"  + (bilangan1 + bilangan2));
        System.out.println("Hasil Pengurangan :"+ (bilangan1-bilangan2));
        System.out.println("Hasil perkalian :" + bilangan1*bilangan2);
        System.out.println("Hasil pembagian :"+ bilangan1/bilangan2);
        System.out.println("Sisa :" + bilangan1%bilangan2 +"\n");
		
		System.out.println("1/2");
        double bilangan3 = 1.2 / 2.4;
        System.out.println("Hasil Penjumlahan :"  + (bilangan1+bilangan3));
        System.out.println("Hasil Pengurangan :"  + (bilangan1-bilangan3));
        System.out.println("Hasil Perkalian :"  + (bilangan1*bilangan3));
        System.out.println("Hasil Pembagian:"  + (bilangan1/bilangan3));
        System.out.println("Sisa : "+(bilangan1%bilangan3)+"\n");
		
		System.out.println("true	");
        boolean boo1 = true;
        System.out.println("false");
        boolean boo2 = false;
        System.out.println("Nilai Kebenaran 'AND' : "+ (boo1&&boo2));
        System.out.println("Nilai Kebenaran 'OR' : "+ (boo1||boo2));
        System.out.println("Nilai Kebenaran 'NOT Boolean 1' : " + (!boo1));
        System.out.println("Nilai Kebenaran 'NOT Boolean 2' : " + (!boo2));
        System.out.println("NIlai Kebenaran 'XOR' : " + (boo1|boo2));
  
    }
}