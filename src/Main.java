import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Horas");
//        String test = "Ini adalah test untuk membuat deklarasi";
//        System.out.println(test);
//        System.out.println("Belajar basic java step 1: " + test);

//        int a = 5;
//        int b = 4;
//        int kali = a*b;
//        int kurang = a-b;
//        double bagi = a/b;
//
//        System.out.println(a+b);
//        System.out.println(kali);
//        System.out.println(kurang);
//        System.out.println(bagi);

        //Operator logika
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//        System.out.println(!false);
//        System.out.println(!true);
//        System.out.println(true && !(true || false);

//        boolean makan = true;
//        boolean minum = false;
//
//        boolean aturan = makan || minum;
//        System.out.println(makan && minum);
//        System.out.println(aturan);

        //Lebih kecil - lebih besar
//        int a = 25;
//        int b = 30;
//
//        System.out.println(a >= b);


        //Coba logic
//        int saldo = 1100;
//        int tarik = 1050;
//
//        if (tarik > 1000 && tarik <= saldo) {
//            System.out.println("Saldo berhasil ditarik. Anda akan dikenai biaya administrasi sebesar 10%");
//        }else
//        if (tarik <= saldo) {
//            System.out.println("Saldo berhasil ditarik");
//        } else {
//            System.out.println("Apakah anda sudah gajian?");
//        }

        //Looping -- For or While

//        int cek = 1;
//        while (cek <= 10) {
//            System.out.println("Looping");
//
//            cek = cek + 1;
//        }

//        for (int i = 1; i<=10; i++) {
//            System.out.println("Looping" + i);
//        }

//           }
//}

        //Input using Scanner
import java.util.Scanner;


//Study case
        /*
        Buat kalkulator dinamis yg bisa nerima input
        int a
        int b
        char operator
        while
        lanjut y -- looping
        lanjut n -- keluar print Terima kasih
         */

class Biodata {
    String nama;
    String hobi;
    int umur;

    Biodata ( String nama, String hobi, int umur){
        this.nama = nama;
        this.hobi = hobi;
        this.umur = umur;
    }
    void menyapa (){
        System.out.println("Hallo nama saya" + nama);

    }

}



public class Main {
    public static void calc (int a, int b, String op) {
        if (op.equals("+")){
            System.out.print(a+b);
        }else if (op.equals("-")){
            System.out.print(a-b);
        }else if (op.equals(":")){
            System.out.print(a/b);
        }else if (op.equals("x")){
            System.out.print(a*b);
        }else if (op.equals("%")){
            System.out.print(a%b);
        }else {
            System.out.print("Invalid operation");
        }
    }
    public static void main(String[] args) {
        Biodata dataSaya = new Biodata("Diyah", "makan", 100);
        dataSaya.menyapa();
        System.out.println(dataSaya.hobi);





//        Scanner scanner = new Scanner(System.in);
//        Boolean kondisi = true;
//        while (kondisi) {
//            System.out.println("Value 1: ");
//            int a = Integer.parseInt(scanner.nextLine());
//            System.out.println("Value 2: ");
//            int b = Integer.parseInt(scanner.nextLine());
//            System.out.println("Operation: ");
//            String op = scanner.nextLine() ;
//            System.out.println("Result= ");
//
//            calc (a, b, op);
//
//            System.out.println("Continue? ");
//            String Q = scanner.nextLine();
//            if (Q.equals("y")) {
//                kondisi = true;
//            }else { kondisi = false;
//
//            }
//
//
//        }
//
//        scanner.close();
//
//
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Please enter your name: ");
////        String nama = scanner.nextLine();
////
////        System.out.println("Welcome," +nama+ "!");
////        if (nama.equals("diyah")){
////            System.out.println("Long time no see!");
////        } else {
////            System.out.println("Nice to meet you!");
////        }
////
////        scanner.close();
//

    }

}
