public class Array {
    public static void main(String[] args) {

        int[] myArr = {98, 2, 8, 65, 37};

        int index = 0;
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }


        String[] strArr = new String[4];
        strArr[0] = "My String";

        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);
    }
}






