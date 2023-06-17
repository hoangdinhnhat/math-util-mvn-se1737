/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hdn.mathutil.core;

/**
 *
 * @author Lenovo
 */
public class MathUtility{

    public static final double PI = 3.1415;

    //hàm tính n! = 1.2.3.4.5...n
    //thiết kế hàm này như sau:
    //0! = 1! = 1
    //ko có giai thừa cho số âm, -1!, -2! BỊ CHỬI, NÉM RA EXCEPTION
    //giai thừa tăng nhanh, 21! kiểu long bị tràn, chứa ko nổi
    //chỉ tinh giai thừa từ 0...20
    //>= 21! BỊ CHỬI, NÉM RA NGOẠI LỆ
    public static long getFactorial(Integer n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0...20, plz.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }

        if (n >= 2) {
            return getFactorial(n - 1) * n;
        }
        return 1;
    }

}
