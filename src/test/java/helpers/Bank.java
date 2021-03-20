package helpers;

public class Bank {
    public static String hip(double varkiGumar, int varkiJamket, double tokos) {
        double sum=0;
        double monthSum = varkiGumar/varkiJamket;
        double monthPercent = varkiGumar*tokos/100/12;
        for (int i = 0; i < varkiJamket; i++) {
            varkiGumar -= monthSum;
            monthPercent=varkiGumar*tokos/100/12;
            System.out.println(varkiGumar);
            System.out.println(sum+=monthPercent);
        }
        return "amsva mayr gumar: "+varkiGumar+", hertakan amsva tokos: "+monthPercent;
    }

    public static void main(String[] args) {
        String a = hip(28000, 180, 10.5);
        System.out.println(a);

    }
}
