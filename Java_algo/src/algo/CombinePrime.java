package algo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
들어온 문자 쪼개서 만들 수 있는 모든 수로 소수인지 아닌지 판정하여 갯수 세기
*/

class CombinePrime {

	public static void CombinePrime() {

		int answer = 0;

		// 문자로 쪼개기(종이조각 만들기)
		String number = "002";

		char[] parNum = new char[number.length()];

		for (int i = 0; i < parNum.length; i++) {
			parNum[i] = number.charAt(i);
		}

		// 만들 수 있는 모든 문자열을 재귀함수와 방문확인을 통해 만들기(문자 조합)
		ArrayList<String> maked = new ArrayList<String>();
		int[] visit;
		for (int i = 0; i < parNum.length; i++) {
			visit = new int[parNum.length];
			String s = "";

			rMakeNumber(maked, parNum, visit, i, s);
		}

		// 만든 문자를 Int 형식으로 변경, 만들면서 앞의 0의 제거, 이후 List->Set->List을 이용해 중복 숫자 제거

		System.out.println(maked.toString());

		ArrayList<Integer> pre_in = new ArrayList<Integer>();
		for (int i = 0; i < maked.size(); i++) {
			pre_in.add(Integer.parseInt(maked.get(i)));
		}
		Set<Integer> tmp2 = new HashSet<Integer>(pre_in);
		ArrayList<Integer> in_fin = new ArrayList<Integer>(tmp2);

		System.out.println(in_fin.toString());

		// 각 항목에 대하여 소수 판정

		for (int i = 0; i < in_fin.size(); i++) {
			int test = in_fin.get(i);
			int cnt = 0;
			if (test == 0 || test == 1) {
				continue;
				// 0이나 1인경우 소수가 될 수 없으므로 넘김
			}
			for (int j = 1; j < test ; j++) {
				if (test % j == 0) {
					cnt++;
				}
			}

			if (cnt == 1) {
				System.out.println(test+"는 소수입니다.");
				answer++;
			}
		}
		System.out.println("해당 문자 조합으로 만들 수 있는 소수의 수는 "+answer+" 입니다.");
    }

	static void rMakeNumber(ArrayList<String> maked, char[] parNum, int[] visit, int index, String s) {

		String now = s + parNum[index];
		// 지금까지 방문한 문자들을 조합한 문자열

		maked.add(now);
		visit[index] = 1;

		// 리스트에 입력하고 방문표시

		for (int i = 0; i < parNum.length; i++) {
			if (visit[i] != 1) {
				rMakeNumber(maked, parNum, visit, i, now);
				visit[i] = 0;
			}
		}
		// 만약 문자 목록중에 방문하지 않은 곳이 있다면 하나씩 방문
	}

}
