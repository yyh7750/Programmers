package 신규아이디추천;

class Solution {
	public String solution(String new_id) {

		String answer;

		// 1�ܰ�
		String step1 = new_id.toLowerCase();

		// 2�ܰ�
		char[] step1_arr = step1.toCharArray();
		StringBuilder step2 = new StringBuilder();
		for (char c : step1_arr) {
			if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
				step2.append(c);
			}
		}

		// 3�ܰ�
		String step3 = step2.toString().replace("..", ".");
		while (step3.contains("..")) {
			step3 = step3.replace("..", ".");
		}

		// 4�ܰ�
		String step4 = step3;
		if (step4.length() > 0) {
			if (step4.charAt(0) == '.') {
				step4 = step4.substring(1, step4.length());
			}
		}
		if (step4.length() > 0) {
			if (step4.charAt(step4.length() - 1) == '.') {
				step4 = step4.substring(0, step4.length() - 1);
			}
		}

		// 5�ܰ�
		String step5 = step4;
		if (step5.equals("")) {
			step5 = "a";
		}

		// 6�ܰ�
		String step6 = step5;
		if (step6.length() >= 16) {
			step6 = step6.substring(0, 15);

			if (step6.charAt(step6.length() - 1) == '.') {
				step6 = step6.substring(0, step6.length() - 1);
			}
		}

		// 7�ܰ�
		StringBuilder step7 = new StringBuilder(step6);
		if (step7.length() <= 2) {
			char last = step7.charAt(step7.length() - 1);

			while (step7.length() < 3) {
				step7.append(last);
			}
		}

		answer = String.valueOf(step7);
		return answer;
	}

		/*   ���� Ǯ�� - ȿ���� Ż��
		String answer = "";

		String str = new_id.toLowerCase(); // 1�� �빮�� -> �ҹ���

		LinkedList<Character> lstr = new LinkedList<Character>(); // ��ȯ�� ���� �ֱ� ���� LinkedList
		LinkedList<Character> nlstr = new LinkedList<Character>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); // LinkedList�� ���� �ֱ� ���� �޾ƿ� ���̵� char�� ��ȯ

			// 2. �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� �߰��ϰ� ������ ����
			if ('a' <= c && 'z' >= c) {
				lstr.offer(c);
			} else if ('0' <= c && '9' >= c) {
				lstr.offer(c);
			} else if (c == '-' || c == '_' || c == '.') {
				lstr.offer(c);
			}
		}

		// 3. ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ
		if (!lstr.isEmpty()) {
			char c1 = lstr.poll();
			nlstr.offer(c1);

			while (!lstr.isEmpty()) {
				char c2 = lstr.poll();
				if (c2 == '.' && c2 == c1) {
					continue;
				} else {
					nlstr.offer(c2);
				}
				c1 = c2;
			}
		}
		
		// 4. ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� ����
		if (nlstr.size() >= 1) {
			if (nlstr.getFirst() == '.') {
				nlstr.removeFirst();
			} else if (nlstr.getLast() == '.') {
				nlstr.removeLast();
			}
		}

		// 5. �� ���ڿ��̶��, new_id�� "a"�� ����
		if (nlstr.size() == 0) {
			nlstr.add('a');
		}

		// 6. ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� ����, ���� ���� �� ��ħǥ(.)�� ���� ��ġ�Ѵٸ�
		// ���� ��ġ�� ��ħǥ(.) ���ڸ� ����
		if (nlstr.size() >= 16) {
			while (nlstr.size() != 15) {
				nlstr.removeLast();
			}
			if (nlstr.getLast() == '.') {
				nlstr.removeLast();
			}
		}

		// 7. ���̰� 2�� ���϶��, ������ ���ڸ� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���δ�
		if (nlstr.size() <= 2) {
			while (nlstr.size() != 3) {
				nlstr.addLast(nlstr.getLast());
			}
		}

		StringBuilder sb = new StringBuilder(); // �ϳ��ϳ� �������� �ִ� ���ڿ��� �ϳ��� ���ڿ��� �����ֱ� ���� ��Ʈ������
		while (!nlstr.isEmpty()) {
			sb.append(nlstr.poll());
		}

		answer = sb.toString();
		
		return answer;
		*/
}