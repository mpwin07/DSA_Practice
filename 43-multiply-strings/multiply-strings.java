class Solution {
    public String multiply(String num1, String num2) {

        int n = num1.length();
        int m = num2.length();

        int[] arr = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {

                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                int mul = a * b;

                int sum = mul + arr[i + j + 1];

                arr[i + j + 1] = sum % 10;
                arr[i + j] += sum / 10;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (result.length() == 0 && arr[i] == 0) {
                continue;
            }

            result.append(arr[i]);
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}