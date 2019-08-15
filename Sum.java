public class Sum {
    public int arraySum(int sum[]) {
        int total = 0;
        for (int i = 0; i < sum.length; i++) {
            total = total + sum[i];
        }
        return total;
    }

    public void forEach() {
        int arr1[] = { 1, 2, 3, 4, 5, 6 };
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    public int max(int b[]) {
        int max = b[0];
        for (int i = 1; i < b.length; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        return max;
    }

    // 给一个数大于5050 从100开始递减 最后减到不能再减 最后返回
    public int Decrement(int num) {
        for (int i = 100; num >= i && i > 0; i--) {
            num = num - i;
        }
        return num;
    }

    // 给一个三位数 反转 然后在返回
    public int reversal(int num) {
        int i = num / 100;
        int j = num % 100 / 10;
        int x = num % 10;
        return x * 100 + j * 10 + i;
    }

    // 100-1000之间找出个，十，白三位数的三次方的和 等这个三位数的本身
    public void find() {
        int a, b, c;
        for (int i = 100; i < 1000; i++) {
            a = i / 100;
            b = i % 100 / 10;
            c = i % 10;

            if (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3) == i) {
                System.out.println(i);
            }
        }
    }
    public void exchange(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        Sum sum = new Sum();
        // int total = sum.arraySum(arr);
        // System.out.println(total);
        // sum.forEach();
        // int a = sum.Decrement(5050);
        // System.out.println(a);
        // int b = sum.reversal(789);
        // System.out.println(b);
        sum.find();
    }
}