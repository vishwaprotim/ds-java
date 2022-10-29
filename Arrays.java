public class Arrays {
    public static void main(String[] args) {
        String arr[] = new String[4];
        arr[0] = "A";
        arr[1] = "B";
        arr[2] = "D";
        arr[3] = "E";
        arr = insert(arr, "C", 2);
        printArr(arr);
        String d = delete(arr, 1);
        System.out.println(d);
        printArr(arr);
    }

    public static String[] insert(String[] arr, String entry, int pos) {
        int size = arr.length;
        String[] op = new String[size + 1];
        for (int i = 0; i < size + 1; i++) {
            if (i < pos)
                op[i] = arr[i];
            else if (i == pos)
                op[i] = entry;
            else
                op[i] = arr[i - 1];
        }
        return op;
    }

    public static String delete(String[] arr, int index) {
        String op = arr[index];
        int len = arr.length;
        for (int i = index+1; i < len; i++)
            arr[i - 1] = arr[i];
        arr[len - 1] = "*";
        return op;
    }

    public static void printArr(String[] arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
