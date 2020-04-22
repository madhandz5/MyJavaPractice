package com.kh.view;

import java.util.Scanner;

import com.kh.model.BreakSample;
import com.kh.model.ContinueSample;
import com.kh.model.DoWhileSample;
import com.kh.model.ForSample;
import com.kh.model.IfSample;
import com.kh.model.NonStaticMethodSample;
import com.kh.model.PrimitiveTypeSample;
import com.kh.model.StaticMethodSample;
import com.kh.model.SwitchSample;
import com.kh.model.VariableSample;
import com.kh.model.WhileSample;

public class Menu {

	static Scanner sc = new Scanner(System.in);

	public static void mainMenu() {
		boolean cont = true;
		do {
			System.out.println("***** ���α׷��� �⺻ ��� �׽�Ʈ ���α׷� *****");
			System.out.println("1. ���� �׽�Ʈ");
			System.out.println("2. �⺻ �ڷ��� �׽�Ʈ");
			System.out.println("3. if�� �׽�Ʈ");
			System.out.println("4. switch�� �׽�Ʈ");
			System.out.println("5. for�� �׽�Ʈ");
			System.out.println("6. while�� �׽�Ʈ");
			System.out.println("7. do~while�� �׽�Ʈ");
			System.out.println("8. break�� �׽�Ʈ");
			System.out.println("9. continue�� �׽�Ʈ");
			System.out.println("10. static �޼ҵ� ��� �׽�Ʈ");
			System.out.println("11. non-static �޼ҵ� ��� �׽�Ʈ");
			System.out.println("12. ���α׷� ����");
			System.out.println("===================");
			System.out.println("�޴� ��ȣ �Է� : ");
			int input = sc.nextInt();
			sc.nextLine();

			switch (input) {
			case 1:
				subVarMenu();
				break;
			case 2:
				subPTypeMenu();
				break;
			case 3:
				subIfMenu();
				break;
			case 4:
				subSwitchMenu();
				break;
			case 5:
				subForMenu();
				break;
			case 6:
				subWhileMenu();
				break;
			case 7:
				subDoWhileMenu();
				break;
			case 8:
				subBreakMenu();
				break;
			case 9:
				subContinueMenu();
				break;
			case 10:
				subStaticMethodMenu();
				break;
			case 11:
				subNonStaticMethodMenu();
				break;
			case 12:
				System.out.println("������ �����Ͻðڽ��ϱ�? (�� : y / �ƴϿ� : n)");
				char exit = sc.next().charAt(0);
				sc.nextLine();
				if (exit == 'y' || exit == 'Y') {
					System.out.println("���α׷� ����");
					cont = false;
					System.exit(0);
				} else if (exit == 'n' || exit == 'N') {
					System.out.println("�޴��� ���ư��ϴ�.");
				} else {
					System.out.println("�߸� �Է��߽��ϴ�. �޴��� ���ư��ϴ�.");
				}
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);

	}

	public static void subVarMenu() {
		VariableSample vs = new VariableSample();
		boolean cont = true;
		do {
			System.out.println("1. �� �Ż����� ������ ��� ����ϱ�");
			System.out.println("2. ��������� Ű����� �Է¹޾� ����ϱ�");
			System.out.println("3. �⺻ �ڷ��� ������ �ʱⰪ Ȯ���ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.println("==============================");
			System.out.println("�޴� ���� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				vs.myProfile();
				break;
			case 2:
				vs.empInformation();
				break;
			case 3:
				vs.defaultValue();
				break;
			case 4:
				System.out.println("���θ޴��� ���ư��ϴ�.");
				cont = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);

	}

	public static void subPTypeMenu() {
		PrimitiveTypeSample pts = new PrimitiveTypeSample();
		boolean cont = true;
		do {
			System.out.println("1. �⺻�ڷ��� �޸� �Ҵ�ũ�� Ȯ���ϱ�");
			System.out.println("2. �⺻�ڷ��� ���� �ּҰ�, �ִ밪 ����ϱ�");
			System.out.println("3. �⺻�ڷ��� ��Ʈ ���� Ȯ���ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.println("==============================");
			System.out.println("�޴� ���� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				pts.typeSize();
				break;
			case 2:
				pts.minMaxValue();
				break;
			case 3:
				pts.bitSize();
				break;
			case 4:
				System.out.println("���θ޴��� ���ư��ϴ�.");
				cont = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);

	}

	public static void subIfMenu() {
		IfSample is = new IfSample();
		boolean cont = true;
		do {
			System.out.println("1. �� ���� ������ �Է¹޾�, �� ���� ū �� ����ϱ�");
			System.out.println("2. �� ���� ������ �Է¹޾�, �� ���� ���� �� ����ϱ�");
			System.out.println("3. �� ���� ������ �Է¹޾�, �� ���� ���� ū ���� ���� ���� �� ����ϱ�");
			System.out.println("4. �� ���� ������ �Է¹޾�, ¦������ Ȧ������ ����ϱ�");
			System.out.println("5. ��,��,�� �� ������ ������ �Է¹޾�, �հ�/���հ� Ȯ���ϱ�");
			System.out.println("6. ������ �Է¹޾�, ���� Ȯ���ϱ�");
			System.out.println("7. �� ���� ������ �Է¹޾�, ������� 0���� �������� Ȯ���ϱ�");
			System.out.println("8. ���� �ϳ��� �Է¹޾�, ���� �빮������ �ҹ�������, ���ڹ������� ��Ÿ�������� Ȯ���ϱ�");
			System.out.println("9. ���� �޴��� ����");
			System.out.println("==============================");
			System.out.println("�޴� ���� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				is.maxNumber();
				break;
			case 2:
				is.minNumber();
				break;
			case 3:
				is.threeMaxMin();
				break;
			case 4:
				is.checkEven();
				break;
			case 5:
				is.isPassFail();
				break;
			case 6:
				is.scoreGrade();
				break;
			case 7:
				is.checkPlusMinusZero();
				break;
			case 8:
				is.whatCharacter();
				break;
			case 9:
				System.out.println("���θ޴��� ���ư��ϴ�.");
				cont = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);
	}

	public static void subSwitchMenu() {
		SwitchSample ss = new SwitchSample();
		boolean cont = true;
		do {
			System.out.println("1. �� ���� ������ �� ���� ���깮�ڸ� �Է¹޾� ����� ��� Ȯ���ϱ�");
			System.out.println("2. �����̸��� ���ڿ��� �Է¹޾�, �� ������ ���� ����ϱ�");
			System.out.println("3. ���� �޴��� ����");
			System.out.println("==============================");
			System.out.println("�޴� ���� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				ss.calculator();
				break;
			case 2:
				ss.fruitPrice();
				break;
			case 3:
				System.out.println("���θ޴��� ���ư��ϴ�.");
				cont = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);
	}

	public static void subForMenu() {
		ForSample fs = new ForSample();
		boolean cont = true;
		do {
			System.out.println("1. 1~10���� �������� �հ� ���ϱ�");
			System.out.println("2. 1~100������ ¦������ �հ� ���ϱ�");
			System.out.println("3. ���� �ϳ� �Է¹޾�, �� ���� ������ ����ϱ�");
			System.out.println("4. �� ���� ������ �Է¹޾�, �� ���� ���� ������ ū �������� �հ� ���ϱ�");
			System.out.println("5. �ټ��� ĭ�� �Է¹޾�, �Էµ� �ټ�/ĭ����ŭ ��ǥ ���� ����ϱ�");
			System.out.println("6. 7�ٿ� 7ĭ�� ��ǥ ���� ����ϵ�, �� �ٿ� �� ��ȣ�� ���� ĭ�� ���� ����ϱ�");
			System.out.println("7. �� ���� �Է¹޾�, �ﰢ�� ������� ��ǥ ���� ����ϱ�(��� : �����ﰢ��, ���� : ���ﰢ��)");
			System.out.println("8. ������ 2�ܺ��� 9�ܱ��� ����ϱ�");
			System.out.println("9. ���� �޴��� ����");
			System.out.println("==============================");
			System.out.println("�޴� ���� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				fs.sum1To10();
				break;
			case 2:
				fs.sumEven1To100();
				break;
			case 3:
				fs.oneGugudan();
				break;
			case 4:
				fs.sumMinToMax();
				break;
			case 5:
				fs.printStar();
				break;
			case 6:
				fs.printNumberStar();
				break;
			case 7:
				fs.printTriangleStar();
				break;
			case 8:
				fs.guguDan();
				break;
			case 9:
				System.out.println("���θ޴��� ���ư��ϴ�.");
				cont = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);
	}

	public static void subWhileMenu() {
		WhileSample ws = new WhileSample();
		boolean cont = true;
		do {
			System.out.println("1. ���� �ϳ� �Է¹޾�, �� ������ �����ڵ� ��¹ݺ�('0' �ԷµǸ� �ݺ� ����");
			System.out.println("2. 1~100���� �������� �հ� ����ϱ� (while������ �ۼ�)");
			System.out.println("3. 1~100������ ������ ������ �߻�����, ���� �˾� ���߱�");
			System.out.println("4. ���ڿ��� �Է¹޾�, ���� ���� �˾Ƴ��� ����ϱ�");
			System.out.println("5. ���ڿ����� ���� �ϳ��� �Է¹޾�, ���ڿ��� ���ڰ� �� �� �ִ��� Ȯ���ϱ�");
			System.out.println("6. ���� �޴��� ����");
			System.out.println("==============================");
			System.out.println("�޴� ���� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				ws.printUniCode();
				break;
			case 2:
				ws.sum1To100();
				break;
			case 3:
				ws.numberGame();
				break;
			case 4:
				ws.countCharacter();
				break;
			case 5:
				ws.countInChar();
				break;
			case 6:
				System.out.println("���θ޴��� ���ư��ϴ�.");
				cont = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);
	}

	public static void subDoWhileMenu() {
		DoWhileSample dws = new DoWhileSample();
		boolean cont = true;
		do {
			System.out.println("1. ���ڿ��� �Է¹޾�, ���� ���̿� '-' �����־� ����ϱ�");
			System.out.println("2. ����ŷ �޴� �ֹ� �׽�Ʈ");
			System.out.println("3. ���ڿ� �Է¹޾�, \"��� ���� �����ڴ�\" \"������ �ƴϴ�.\"����ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.println("==============================");
			System.out.println("�޴� ���� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				dws.addDashToken();
				break;
			case 2:
				dws.burgerKingMenu();
				break;
			case 3:
				dws.isStringAlphabet();
				break;
			case 4:
				System.out.println("���θ޴��� ���ư��ϴ�.");
				cont = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);
	}

	public static void subBreakMenu() {
		BreakSample bs = new BreakSample();
		boolean cont = true;
		do {
			System.out.println("1. 1~100���� �������� �հ� ����ϱ� (break�� ���)");
			System.out.println("2. ������ 1��~9�ܱ��� ����ϵ�, *5 ��꿡�� �ݺ��� ������(break �̸� ���)");
			System.out.println("3. ���� �޴��� ����");
			System.out.println("==============================");
			System.out.println("�޴� ���� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				bs.sumBreak();
				break;
			case 2:
				bs.guguDanBreak();
				break;
			case 3:
				System.out.println("���θ޴��� ���ư��ϴ�.");
				cont = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);
	}

	public static void subContinueMenu() {
		ContinueSample cs = new ContinueSample();
		boolean cont = true;
		do {
			System.out.println("1. 1~100������ ���� �� 3�� ����� �� �������� �հ� ����ϱ�");
			System.out.println("2. 3�� 5���� �࿭�� ����ϵ�, 1�� 3������ 1�� 5������ �����ϰ� ����ϱ�");
			System.out.println("3. ���� �޴��� ����");
			System.out.println("==============================");
			System.out.println("�޴� ���� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				cs.sumJumpThree();
				break;
			case 2:
				cs.rowColJump();
				break;
			case 3:
				System.out.println("���θ޴��� ���ư��ϴ�.");
				cont = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);
	}

	public static void subStaticMethodMenu() {
		StaticMethodSample sms = new StaticMethodSample();
		boolean cont = true;
		do {
			System.out.println("1. MathŬ������ ������ ���ϴ� �޼ҵ� : 1~45������ ������ ���� ���");
			System.out.println("2. MathŬ������ �Ǽ����� ���� ���밪 ���ϴ� �޼ҵ� : -12.77 ���밪 ����ϱ�");
			System.out.println("3. Math Ŭ������ �� ������ ū�� ���ϴ� �޼ҵ� : 120,54�� ū �� ����ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.println("==============================");
			System.out.println("�޴� ���� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				sms.testMathRandom();
				break;
			case 2:
				sms.testMathAbs();
				break;
			case 3:
				sms.testMathMax();
				break;
			case 4:
				System.out.println("���θ޴��� ���ư��ϴ�.");
				cont = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);
	}

	public static void subNonStaticMethodMenu() {
		NonStaticMethodSample nms = new NonStaticMethodSample();
		boolean cont = true;
		do {
			System.out.println("1. Scanner Ŭ���� ��� : �ڷ��� �������� �� �Է¹޾� ����ϱ�");
			System.out.println("2. Date Ŭ���� ��� : ���� ��¥, ���� �ð� ���� ����ϱ�");
			System.out.println("3. Random Ŭ���� ��� : ������ �Ǽ��� ���� ���� ����ϱ�");
			System.out.println("4. ���� �޴��� ����");
			System.out.println("==============================");
			System.out.println("�޴� ���� : ");
			int input = sc.nextInt();
			sc.nextLine();
			switch (input) {
			case 1:
				nms.testScanner();
				break;
			case 2:
				nms.testDate();
				break;
			case 3:
				nms.testRandom();
				break;
			case 4:
				System.out.println("���θ޴��� ���ư��ϴ�.");
				cont = false;
				break;
			default:
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
				break;
			}
		} while (cont);
	}
}
