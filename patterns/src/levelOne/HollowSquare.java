package levelOne;

public class HollowSquare {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++) {

            StringBuilder line = new StringBuilder();
            //here why stringbuilder
            //buil each column in the current row
            for(int col = 0; col < n; col++) {
                if (row == 0 || row == 4 || col == 0 || col == 4) {
                    line.append("*");
                } else {
                    line.append(" ");
                }
            }
            System.out.println(line.toString());
            //here why line.tostring

        }
    }
}
