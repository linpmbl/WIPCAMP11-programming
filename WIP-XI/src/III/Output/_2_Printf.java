/*
 * WIP XI Computer Programing 
 */

package III.Output;

/**
 *
 * @author sittiwatlcp
 */
public class _2_Printf {
    public static void main(String[] args) {
        String firstName = "Matcha";
        String lastName = "Latte";
        String nickName = "Wipcream";
        double ownWallet = 246.123456789;
        double friendWallet = 174852369.123515253469778;
        
        System.out.printf("สวัสดี เราชื่อ %s %s (%s) เรามีเงิน %f บาท และเพิ่อนเรามีเงิน %.14f บาท \n", firstName, lastName, nickName, ownWallet, friendWallet);
    }
}
