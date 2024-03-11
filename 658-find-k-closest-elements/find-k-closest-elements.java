class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
         for (int num : arr) {
            res.add(num);
        }
        Collections.sort(res, (a, b) -> {
            if (Math.abs(a - x) != Math.abs(b - x)) {
                return Math.abs(a - x) - Math.abs(b - x);
            } else {
                return a - b;
            }
        });
        res = res.subList(0, k);
        Collections.sort(res);
        return res;
    }
}