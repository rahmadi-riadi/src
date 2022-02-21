package konversi_suhu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("PROGRAM KONVERSI SUHU AIR");
        System.out.println("input Data :");
        System.out.print("Suhu dalam Celcius :");

        double suhu_awal;
        Scanner input = new Scanner(System.in);
        suhu_awal = input.nextDouble();

        boolean cek = true;
        while (cek) {
            System.out.println("Opsi");
            System.out.println("1. lihat data konversi");
            System.out.println("2. edit data konversi");
            System.out.println("3. exit");
            System.out.println("pilih :");

            String pilih;
            pilih = input.next();

            switch (pilih) {
                case "1":
                    Konversi Konversi = new Konversi(suhu_awal);

                    System.out.println("suhu dalam celcius : "+ suhu_awal + "°C");
                    System.out.println("dalam farenheit\t: "+ Konversi.F()+"°F");
                    System.out.println("dalam reamur\t: "+Konversi.R()+"°R");
                    System.out.println("dalam kelvin\t: "+Konversi.K()+"°K");

                    if (suhu_awal<=0){
                        System.out.println("Kondisi air beku");
                    }else if(suhu_awal>=100){
                        System.out.println("Kondisi air mendidih");
                    }else{
                        System.out.println("Kondisi air Normal");
                    }

                    break;
                case "2":
                    System.out.println("input Data :");
                    System.out.print("Suhu dalam Celcius :");
                    suhu_awal = input.nextDouble();
                    break;
                case "3":
                    cek = false;
                    break;

                default:
                    System.out.println("opsi tidak benar, mohon masukkan opsi dengan benar");
            }
        }


    }
}
