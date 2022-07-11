/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kawahedu;

/**
 *
 * @author AM
 */
public class test_soal1 {

    public static void main(String[] args) {
        test_soal1 fizzBuzz = new test_soal1();
        fizzBuzz.FizzBuzz();
    }

    public void FizzBuzz() {
        int[] data = new int[]{1, 2, 4, 3, 10, 11, 20, 5, 100, 200};
        for (int i = 0; i < data.length; i++) {
            //System.out.println("I : "+data[i]);
            switch (data[i]) {
                //Jika angka yang keluar adalah angka 5 maka output yang di hasilkan adalah "Fizz"
                case 5:
                    System.out.println("Fizz");
                    break;
                //Jika angka yang keluar adalah angka 11 maka output yang di hasilkan adalah "Buzz"
                case 11:
                    System.out.println("Buzz");
                    break;
                //Jika angka yang keluar adalah 5 dan 11 maka output yang di hasilkan adalah "FizzBuzz"
                //Karena kondisinya ambigu hanya ada satu data yang di cek jadi masuk ke kondisi lain
                default:
                    System.out.println("FizzBuzz");
                    break;
            }
        }
    }
}
