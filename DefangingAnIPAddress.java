import java.util.List;

class Solution {
    public static String defangIPaddr(String address) {

        String defangedString=address.replace(".","[.]");
        return defangedString;

    }
}


public class DefangingAnIPAddress {

    public static void main(String[] args) {


        String ipAddr = "1.2.3.4";

        String result = Solution.defangIPaddr(ipAddr);
        System.out.println(String.valueOf(result));


    }



}
