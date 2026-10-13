class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();

        for (int i = 100; i <= 998; i += 2) {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;

            int[] count = new int[10];

            for (int d : digits) {
                count[d]++;
            }

            if (count[a] > 0) {
                count[a]--;

                if (count[b] > 0) {
                    count[b]--;

                    if (count[c] > 0) {
                        list.add(i);
                    }
                }
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}