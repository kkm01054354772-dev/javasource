package lang;

public class StringEx5 {
    public static void main(String[] args) {
        // target이 src내에 몇번 나오는지 count

        System.out.println(count("123456ABC123ABC456AB", "AB")); // 3
        System.out.println(count("123456ABC123ABC456AB", "AC")); // 0
    }

    public static int count(String src, String target) {
        int cnt = 0;
        int pos = 0;
        while ((pos = src.indexOf(target, pos)) != -1) {
            pos = pos + target.length();
            cnt++;
        }

        return cnt;

        // src.indexOf(target) // 6
        // src.indexOf(target,src.indexOf(target)+target.length()); // 12

    }
}
