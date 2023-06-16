/**  2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
 public static int sum2d(String[][] arr) {
 int sum = 0;
 for (int i = 0; i < arr.length; i++) {
 for (int j = 0; j < 5; j++) {
 int val = Integer.parseInt(arr[i][j]);
 sum += val;
 }
 }
 return sum;
 }
 */

public class HomeWork1_2 {
    public static void main(String[] args) {

        String[][] stringArr = new String[][]{null




        };
        sum2d(stringArr);
        System.out.println(sum2d(stringArr));
    }
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

}
// for (int j = 0; j < 5; j++)  - ArrayIndexOutOfBoundsException, если в любой строке элементов меньше 5.
// NumberFormatException, если любой из элементов нельзя спарсить в int.
// NullPointerException, если в массиве null