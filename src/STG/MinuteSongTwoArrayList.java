package STG;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinuteSongTwoArrayList {

	public static void main(String[] args) {

   	//int data[] = { 60, 60, 20, 40, 80, 10 ,30,30};//1(60)+1(60)+1(20+40)+0(80+10)+1(30+30)

		ArrayList<Integer> data=new ArrayList<Integer>();
		data.add(60);
		data.add(60);
		data.add(20);
		data.add(40);
		data.add(80);
		data.add(10);
        data.add(30);
        data.add(30);
		System.out.println(pairs(data));
	}

	public static int pairs(List arr) {

		Set<String> set = new HashSet<>();
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {

			    int valI= (int) arr.get(i);
                int valJ= (int) arr.get(j);
				if ( (valI+valJ) % 60 == 0) {
					if (!set.contains(Integer.toString(valI).concat(Integer.toString(valJ))))
						set.add(Integer.toString(valI).concat(Integer.toString(valJ)));
				}
			}
		}
		return set.size();

	}

}
