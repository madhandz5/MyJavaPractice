package com.kh;


import java.util.Scanner;

public class HomeWork {

	Scanner scanner = new Scanner(System.in);

	public void calculator() {

		// * ���� 1
		// * 1. ���� �� ���� ���깮�� �ϳ��� Ű����� �Է¹���
		// * 2. �� �������� int ������ ����
		// * 3. ���깮�ڴ� char ������ ����
		// * 4. switch �� ���
		// * - ���깮�ڰ� '+' �̸�, �� ������ �� ���
		// * - ���깮�ڰ� '-' �̸�, �� ������ �� ���
		// * - ���깮�ڰ� 'x' �Ǵ� 'X'�̸�, �� ������ ��
		// * - ���깮�ڰ� '/'�̸�, �� ������ ������ ��
		// * --- ��, ������ ��(�ι��� ����) �� 0 �̸� "0���� ���� �� �����ϴ�." ��µǰ� �ϰ�, ����� 0 ó���� �� ��� ó�� ��
		// * 5. ��� ���

		System.out.println("ù�� ° ������ �Է��ϼ��� : ");
		int numA = scanner.nextInt();
		System.out.println("�ι� ° ������ �Է��ϼ��� : ");
		int numB = scanner.nextInt();
		scanner.nextLine();
		System.out.println("�����ڸ� �Է��ϼ���( + , -,  x, / ) : ");
		char ch = scanner.next().charAt(0);
		int result = 0;
		switch (ch) {
		case '+':
			result = numA + numB;
			break;
		case '-':
			result = numA - numB;
			break;
		case 'x':
		case 'X':
			result = numA * numB;
			break;
		case '/':
			if (numB != 0) {
				result = numA / numB;
			} else {
				System.out.println("0���� ���� �� �����ϴ�.");
				result = 0;
			}
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
		System.out.println("" + numA + ch + numB + "=" + result);
	}

	public void totalCalculator() {

		// * ���� 2.
		// * 1. Ű����� �� ���� ������ �Է¹���
		// * 2. �� ������ �� ���� ���� ���۰�����, ū ���� ���ᰪ���� �����
		// * 3. ���� ������ ū ������ ������ �հ踦 ����
		// * - for �� ���
		// * 4. �հ� ��� ó��

		System.out.println("ù�� ° ������ �Է��ϼ��� : ");
		int numA = scanner.nextInt();
		System.out.println("�ι� ° ������ �Է��ϼ��� : ");
		int numB = scanner.nextInt();
		int res = 0;

		if (numA > numB) {
			for (int i = numB; i < numA + 1; i++) {
				res += i;
			}
			System.out.println("" + numB + "���� " + numA + "������ ���� " + res + "�Դϴ�.");
		} else if (numB > numA) {
			for (int i = numA; i < numB + 1; i++) {
				res += i;
			}
			System.out.println("" + numA + "���� " + numB + "������ ���� " + res + "�Դϴ�.");
		} else {
			res = numA;
			System.out.println("" + numA + "���� " + numB + "������ ���� " + res + "�Դϴ�.");
		}
	}

	public void profile() {

		// * ���� 3.
		// * 1. �Ż��������� �ڷ����� ���� ������ ����ϰ� ������ ��ϵ� ���� ��� Ȯ����.
		// * - �ܼ�â�� ������ �Ż������� ��µǰ� ��
		// * �̸� / ���� / ���� / ����

		String name = "��â��";
		int age = 35;
		String gender = "����";
		String personality = "Ȱ������";

		System.out.println("�̸� : " + name + "\n���� : " + age + "\n���� : " + gender + "\n���� : " + personality);
	}

	public void sungjuk() {

		// * ���� 4.
		// * 1. ���� �����ϰ�, Ű����� �Է¹��� ������ ������ ����ϰ� �������� ȭ�鿡 ��� Ȯ����
		// * - �л��̸� (String)
		// * - �г� (int)
		// * - �� (int)
		// * - ��ȣ (int)
		// * - ���� (M/F)(char) // ���ڿ��� �Է¹��� �� , ���� �ϳ� �и��ؾ� ��
		// * - ���� (int)
		// * - ���� (char)
		// * - ������ 90�� �̻��̸� ������ A�� ó��
		// * - ������ 80�� �̻� 90�� �̸� B�� ó��
		// * - ������ 70�� �̻� 80�� �̸� C�� ó��
		// * - ������ 60�� �̻� 70�� �̸� D�� ó��
		// * - ������ 60 �̸� F ó��
		// * ��� �� > 3�г� 2�� 25�� ���л� ȫ�浿�� ������ 95.5�̰�, A ���� �Դϴ�.
		// ��� double�� ����ȯ �϶�� ������?
		// ** ���л� / ���л��� ���� ������ ���� ����ؼ� ���� �����ڷ� ó����

		System.out.println("�л� �̸��� �Է��ϼ��� : ");
		String name = scanner.nextLine();
		System.out.println("�г��� �Է��ϼ��� : ");
		int year = scanner.nextInt();
		System.out.println("���� �Է��ϼ��� : ");
		int classNum = scanner.nextInt();
		System.out.println("��ȣ�� �Է��ϼ��� : ");
		int num = scanner.nextInt();
		System.out.println("������ �Է��ϼ��� (M/F) : ");
		char gender = scanner.next().charAt(0);
		System.out.println("������ �Է��ϼ��� : ");
		int score = scanner.nextInt();
		char grade = 'A';

		String stringGender = gender == 'm' ? "���л�" : gender == 'M' ? "���л�" : gender == 'f' ? "���л�" : "���л�";

		if (score > 89) {
			grade = 'A';
		} else if (score > 79) {
			grade = 'B';
		} else if (score > 69) {
			grade = 'C';
		} else if (score > 59) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println(year + "�г� " + classNum + "�� " + num + "�� " + stringGender + " " + name + "�� ������ "
				+ (double) score + "�� �̰�, " + grade + " ���� �Դϴ�.");
	}

	public void printStarNumber() {

		// * ���� 5.
		// * ������ �ϳ� �Է¹޾�, �� ���� ����� ���� �Էµ� ���� �� ���� �����Ͽ� ������ ���� ��µǰ� ��
		// * -- 1
		// * -- *2
		// * -- **3
		// * -- ***4
		// * -- ****5
		// * - ����� �ƴ� �� , "����� �ƴմϴ�" ���
		// * - if ���� ���� for �� ���

		System.out.println("����� ������ �Է��� �ּ��� : ");
		int num = scanner.nextInt();

		if (num >= 0) {
			for (int i = 1; i < num + 1; i++) {
				for (int j = 1; j < i + 1; j++) {
					if (i == j) {
						System.out.print(i);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("����� �ƴմϴ�.");
		}
	}

	public void sumRandomNumber() {

		// * ���� 6.
		// * 1. 1 ~ 100 ������ ���� �� ������ ������ �ϳ� �߻����� 1���� �߻��� ���������� �հ踦 ���Ͽ� �����
		// * - Math.random() API ���

		int randomNum = (int) (Math.random() * 100) + 1;
		int sum = 0;

		for (int i = 1; i < randomNum + 1; i++) {
			sum += i;
		}
		System.out.println("1���� �ڵ����� ������ " + randomNum + "������ ���� " + sum + " �Դϴ�.");
	}

	public void shutNumber() {

		// * ���� 7.
		// * 1. �� ���� �ֻ����� ����� �� �� �ִ� ��� ����� �� ��(random)
		// * 2. �� �ֻ��� ���� ���� �Էµ� ���� ���� ��� "������ϴ�." ���
		// * 3. �Է� ���� �ٸ��� "Ʋ�Ƚ��ϴ�." �����
		// * 4. ���� ���� ��� �� ����Ͻðڽ��ϱ�? (y/n) ���
		// * 5. "��� �Ͻðڽ��ϱ�?(y/n):" ���� 'n'�Ǵ� 'N' �Է� �� �ݺ� ���� ��
		// * - do ~ while ������ �ݺ��ǰ� ��

		boolean cont = true;

		do {
			if (!cont) {
				System.out.println("����Ͻðڽ��ϱ�? (Y/N) : ");
				char go = scanner.next().charAt(0);
				if (go == 'y' || go == 'Y') {
					cont = true;
				} else if (go == 'n' || go == 'N') {
					break;
				} else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
					cont = false;
				}
			}
			if (cont) {
				System.out.println("=====�ֻ��� 2���� ���� ���纸����=====");
				int dice1 = (int) (Math.random() * 6) + 1;
				int dice2 = (int) (Math.random() * 6) + 1;
				int quiz = dice1 + dice2;
				int input = scanner.nextInt();

				if (input > 1 && input < 13)

					if (input == quiz) {
						System.out.println("=====.��.��.��.��.��.=====");
						cont = false;
					} else {
						System.out.println("=====.Ʋ.��.��.��.��.=====");
						System.out.println(
								"1�� �ֻ��� : [" + dice1 + "] \n2�� �ֻ��� : [" + dice2 + "] \n�� �ֻ����� ���� [" + quiz + "]�Դϴ�.");
						System.out.println("=======================");
						cont = false;
					}
				else {
					System.out.println("=====.Ʋ.��.��.��.��.=====");
					System.out.println("��Ʈ)�ֻ��� 2���� ���� 2 ~ 12 �Դϴ�.");
					System.out.println("=======================");
					cont = false;
				}
			}
		} while (!cont);
		System.out.println("======.��.��.��.��.======");
	}
}
