package math;

public class Q168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            int a0 = (columnNumber - 1) % 26 + 1;
            sb.append((char) (a0 - 1 + 'A'));
            columnNumber = (columnNumber - a0) / 26;
        }
        return sb.reverse().toString();

    }

    public static void main(String[] args) {
        Q168 q168 = new Q168();
        String res = q168.convertToTitle(701);
        System.out.println(res);
    }
}
