package Ex20200907;

import MyInterface.*;
/**
 * ?λ‘κ·Έ?λ°? ??©1 κΈ°λ§κ³ μ¬ ?°?΅ 
 *
 * @author (2019315027 μ΅μ?°)
 * @version (2020.09.07)
 */
public class Application
{
    public static void main(String[] args){
        /*** (1) ***/
        Employee[] list = {
            new Professor("?κΈΈλ", 20, 16),
            new Professor("?΄?? ", 19, 10),
            new Professor("κ°κ°μ°?", 31, 16),
            new Staff("κΉ?? ? ", 50),
            new Staff("? κ΄??", 27)
        };
        
        /*** (2) ***/
        double totalPay = 0.0; 
        
        /*** (3) ***/
        for( Employee em : list){
            ((CanSpeak) em).say();//κ°μ²΄? ? λ³΄λ?? μΆλ ₯
            totalPay += em.pay();//κΈμ¬? μ΄ν©? κ³μ°
        }
        
        /*** (4) ***/
        System.out.println("κΈμ¬μ΄ν© = " + totalPay);
    }
}
