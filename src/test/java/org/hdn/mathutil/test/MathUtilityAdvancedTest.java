package org.hdn.mathutil.test;

import org.hdn.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilityAdvancedTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    // CHUẨN BỊ SẴN RIÊNG TEST DATA, LÁT HỒI FILL VÀO HÀM
    // DDT
    // hàm trả về mảng 2 chiều, kiểu WRAPPER CLASS/OBJECT
    // mảng chứa các cặp n -> expected, ví dụ 0! -> 1; 1! -> 1; ...
    public static Object[][] initTestRightArgumentData() {
        Object[][] testData =
                {
                        {0, 1},
                        {1, 1},
                        {2, 2},
                        {5, 120},
                        {6, 720}
                };
        return testData;
    }

    public static Object[] initTestExpectionArgumentData() {
        Object[] testData = {-1, -2, -3, 21, 22, 23};
        return testData;
    }

    @ParameterizedTest
    @MethodSource(value = "initTestRightArgumentData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        //Tham số hòa việc đưa test data vào hàm assertE()
        //biến đổi dữ liệu thành tham số cho tổng quát
        //PARAMETERIZED
        assertEquals(expected, MathUtility.getFactorial(n));
    }

    @ParameterizedTest
    @MethodSource(value = "initTestExpectionArgumentData")
    public void testFactorialGivenWrongArgumentReturnsException(int n) {
        //Tham số hòa việc đưa test data vào hàm assertE()
        //biến đổi dữ liệu thành tham số cho tổng quát
        //PARAMETERIZED
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(n));
    }

    /*TDD vs DDT
    TDD - Test Driven Development
    Kĩ thuật viết code chính đan xen, xen kẽ cùng với viết test case/ test script
    tức là quá trình viết code làm app ta viết luôn những đoạn code (dùng thư viện Unit Test như JUnit, TestNG, ...)
    dùng để test hàm ta vừa viết

    Viết code và viết code test cùng với nhau gọi là
    kĩ thuật lập trình hướng về kiểm thử - TDD

    DDT - Data Driven Testing
    là kĩ thuật bổ trợ/mở rộng thêm cho kĩ thuật TDD
    là kĩ thuật viết test code mà ta tách riêng những bộ data test
    ra 1 chỗ, câu lệnh so sánh ra 1 chỗ
    kết nối, map/fill test data vào hàm test thông qua các tham số
    {6, 720} -> fill vào 2 biến n, expected và lát hồi 2 biến này đc
    fill vào tiếp cái hàm assertEquals(expected, getF(n))

    Data đc tách riêng ra, biến thành tham số cho haàm kiểm thử
    kĩ thuật này được gọi là tách data hướng cho việc kiểm thử
    DDT
    Còn gọi 1 tên khác là PARAMETERIZE TESTING
    KĨ THUẬT KIỂM THỬ CODE MÀ HƯỚNG VỀ THAM SỐ HÓA CÁC DATA TEST
     */

}
