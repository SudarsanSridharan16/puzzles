package largest.subset.sum;

public class LargestSubsetSum {

	static long[] maxSubsetSum(int[] k) {
		long[] result = new long[k.length];
		for (int c = 0; c <= k.length-1; c++) {
			int sum = 0;
			for (int i = 1; i <= k[c]/2; i++) {
				if (k[c] % i == 0) {
					sum=sum+i;
				}
			}
			sum+=k[c];
			result[c] = sum;
		}
		return result;
	}

	public static void main(String[] args) {
		int[] k = { 2, 4 };
		long[] ans = maxSubsetSum(k);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}
