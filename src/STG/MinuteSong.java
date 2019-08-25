package STG;

import java.util.HashSet;
import java.util.Set;



public class MinuteSong {

	public static void main(String[] args) {

		int data[] = { 60, 60, 20, 40, 80, 10 ,30,30};//1(60)+1(60)+1(20+40)+0(80+10)+1(30+30)
		System.out.println(pairs(data));
	}

	public static int pairs(int[] arr) {

		Set<String> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) % 60 == 0) {
					if (!set.contains(Integer.toString(arr[j]).concat(Integer.toString(arr[i]))))
						set.add(Integer.toString(arr[i]).concat(Integer.toString(arr[j])));
				}
			}
		}
		return set.size();

	}

}
