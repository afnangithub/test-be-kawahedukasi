package kawahedu;

import java.util.ArrayList;
import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author AM
 */
public class test_soal2 {

    public static void main(String[] args) {
        test_soal2 cekTypeData = new test_soal2();
        cekTypeData.CekTypeData();
    }

    public void CekTypeData() {
        //object[] data = new object[][1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1];
        //List<Object> data = new List<Object>;
        List<Object> data = new ArrayList<>();
        data.add(1);
        data.add("ka");
        data.add(67);
        data.add("wah");
        data.add("1772");
        data.add("edukasi");
        data.add(7);
        data.add(98);
        data.add(-1);
        String typeInteger = "java.lang.Integer";
        String typeString = "java.lang.String";
        int i=-1;
        try {
            for (i = 0; i <= data.size(); i++) {
                String typeName = data.get(i).getClass().getTypeName();
                if (typeName.equals(typeInteger)) {
                    System.out.println("index ke " + i + " adalah integer dengan data " + data.get(i));
                } else if (typeName.equals(typeString)) {
                    System.out.println("index ke " + i + " adalah string dengan data " + data.get(i));
                }
            }
        } catch (Exception e) {
            System.out.println("index ke " + i + " Tidak bisa di validasi sistem");
        }

    }
}
