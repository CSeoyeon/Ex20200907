package Ex20200907;

import MyInterface.*;
/**
 * ?��로그?���? ?��?��1 기말고사 ?��?�� 
 *
 * @author (2019315027 최서?��)
 * @version (2020.09.07)
 */
public class Application
{
    public static void main(String[] args){
        /*** (1) ***/
        Employee[] list = {
            new Professor("?��길동", 20, 16),
            new Professor("?��?��?��", 19, 10),
            new Professor("강감�?", 31, 16),
            new Staff("�??��?��", 50),
            new Staff("?���??��", 27)
        };
        
        /*** (2) ***/
        double totalPay = 0.0; 
        
        /*** (3) ***/
        for( Employee em : list){
            ((CanSpeak) em).say();//객체?�� ?��보�?? 출력
            totalPay += em.pay();//급여?�� 총합?�� 계산
        }
        
        /*** (4) ***/
        System.out.println("급여총합 = " + totalPay);
    }
}
