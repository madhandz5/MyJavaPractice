package com.kh.model.vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.kh.compareator.AscTitle;
import com.kh.compareator.DescArtist;
import com.kh.compareator.DescTitle;
import com.kh.controller.MusicController;

public class MusicView {

	Scanner scanner = new Scanner(System.in);
	MusicController mc = new MusicController();

	public MusicView() {

	}

	// ���θ޴�
	public void mainMenu() {

		// ******* ���θ޴� *******
		// 1. �� �߰� addList()
		// 2. �� ��ü ��ȸ selectList()
		// 3. �����Ͽ� ��ȸ sortMenu()
		// 4. Ư�� �� �˻� searchMusic()
		// 5. Ư�� �� ���� removeMusic()
		// 6. Ư�� �� ���� updateMusic()
		// 0. ���� "���α׷� ����" ��� �� main���� ����
		// ���� ȭ�� �ݺ� ���� ó��
		while (true) {
			System.out.println("****** ���θ޴� ******");
			System.out.println("1. �� �߰�");
			System.out.println("2. �� ��ü ��ȸ");
			System.out.println("3. �����Ͽ� ��ȸ");
			System.out.println("4. Ư�� �� �˻�");
			System.out.println("5. Ư�� �� ����");
			System.out.println("6. Ư�� �� ����");
			System.out.println("0. ����");
			System.out.println("===================");
			System.out.println("���ϴ� �޴��� �����ϼ��� : ");
			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1:
				addList();
				break;
			case 2:
				selectList();
				break;
			case 3:
				sortMenu();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				updateMusic();
				break;
			case 0:
				System.out.println("���α׷� ����");
				break;
			}
		}

	}

	// ���Ŀ� ����޴�
	public void sortMenu() {

		// ���Ŀ� �޴�
		// 1. ������ �� �������� ����
		// 2. ��� �� �������� ����
		// 3. ������ �� �������� ����
		// 4. ��� �� �������� ����
		// �޴� ��ȣ ���� menu ������ ���� �Է¹���.
		// ascDesc(menu) �޼ҵ� ����

		System.out.println("1. ������ �� �������� ����");
		System.out.println("2. ��� �� �������� ����");
		System.out.println("3. ������ �� �������� ����");
		System.out.println("4. ��� �� �������� ����");
		System.out.println("================");
		System.out.println("���ϴ� �޴��� �����ϼ��� : ");
		int menu = scanner.nextInt();
		scanner.nextLine();

		switch (menu) {
		case 1:
			ascDesc(1);
			break;
		case 2:
			ascDesc(2);
			break;
		case 3:
			ascDesc(3);
			break;
		case 4:
			ascDesc(4);
			break;
		}
	}

	// �� �߰�
	public void addList() {

		// ������ �Է��ϼ��� : artist �Է¹���
		// ����� �Է����ּ��� : title �Է¹���
		// �Է¹��� aritist�� title�� ���� Music ��ü ���� (music)
		// MusicController�� addList �޼ҵ�� music �� ����

		System.out.println("������ �Է��ϼ��� : ");
		String inputArtist = scanner.nextLine();
		System.out.println("����� �Է��� �ּ��� : ");
		String inputTitle = scanner.nextLine();

		Music music = new Music(inputArtist, inputTitle);
		mc.addList(music);
	}

	// ��ü ��ȸ
	public void selectList() {

		// MusicController�� selectList() �޼ҵ� ȣ���Ͽ� ArrayList<Music> ���޹���
		// ���� ���� list�� ������� ���� ��� ���ǽĿ� list�� isEmpty() ���
		// for���� �̿��Ͽ� list ��ü ��� -> ��¹��� list�� get(index) ���
		// ������� ��� ������� �������� �ʽ��ϴ�.�� ���

		if (mc.selectList().isEmpty()) {
			System.out.println("����� �������� �ʽ��ϴ�.");
		} else {
			for (int i = 0; i < mc.selectList().size(); i++) {
				System.out.println(mc.selectList().get(i));
			}
		}
	}

	// ���� ��ȸ
	public void ascDesc(int num) {

		// ���ǹ��� ���� ���޹��� num ����
		// 1�� ��� Collections.sort(sortList);
		// 2�� ��� Collections.sort(sortList, new AscTitle());
		// 3�� ��� Collections.sort(sortList, new DescArtist());
		// 4�� ��� Collections.sort(sortList, new DescTitle());
		// for���� ���� sortList ���
		ArrayList<Music> sortList = new ArrayList<Music>();

		sortList.addAll(mc.selectList());

		switch (num) {
		case 1:
			Collections.sort(sortList);
			break;
		case 2:
			Collections.sort(sortList, new AscTitle());
			break;
		case 3:
			Collections.sort(sortList, new DescArtist());
			break;
		case 4:
			Collections.sort(sortList, new DescTitle());
			break;
		}
		for (Music music : sortList) {
			System.out.println(music);
		}
	}

	// �� �˻�
	public void searchMusic() {
		// �˻��� ���� ������ �Է��Ͻÿ� : >> �Է� ����(title)
		// MusicController�� searchMusic �޼ҵ�� ����
		// �˻� ��� �� ���� ���� (Music��ü)
		// ���� ���� ���� ������ >> ���˻��� ���� �����ϴ�.�� ���
		// ��ȯ ���� ������ >> ���޹��� �� ���

		System.out.println("�˻��� ���� ������ �Է��Ͻÿ� : ");
		String searchTitle = scanner.nextLine();
		if (mc.searchMusic(searchTitle) != null) {
			System.out.println(mc.searchMusic(searchTitle));
		} else {
			System.out.println("�˻��� ���� �����ϴ�.");
		}

	}

	// �� ����
	public void removeMusic() {

		// ������ ���� ������ �Է��Ͻÿ� : >> �Է� ����(title)
		// MusicController�� removeMusic �޼ҵ�� ���� �˻� ��� �� ���� ����(result)
		// result�� 0���� ũ�� >> ������������ �����Ͽ����ϴ�.�� ���
		// �ƴҰ�� >> �������� ���� ã�� ���߽��ϴ�.�� ���

		System.out.println("������ ���� ������ �Է��Ͻÿ� : ");
		String removeTitle = scanner.nextLine();
		if (mc.removeMusic(removeTitle) > 0) {
			System.out.println("���������� ���� �Ͽ����ϴ�.");
		} else {
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}

	}

	// �� ����
	public void updateMusic() {

		// ������ ���� ������ �Է��Ͻÿ� : >> �Է� ����(title)
		// ������ ������ : >> �Է� ����(updateArtist)
		// ������ ����� : >> �Է� ����(updateTitle)
		// updateArtist, updateTitle�� ������ Music��ü ����(updateMusic)

		// MusicController�� updateMusic �޼ҵ�� title, updateMusic ����
		// �˻� ��� �� ���� ����(result)
		// result�� 0���� ũ�� >> ������������ �����Ǿ����ϴ�.�� ���
		// �ƴϸ� >> �������� ���� ã�� ���߽��ϴ�.�� ���

		System.out.println("������ ���� ������ �Է��Ͻÿ� : ");
		String title = scanner.nextLine();
		System.out.println("������ �������� �Է��Ͻÿ� : ");
		String updateArtist = scanner.nextLine();
		System.out.println("������ ������� �Է��Ͻÿ� : ");
		String updateTitle = scanner.nextLine();

		if (mc.updateMusic(title, new Music(updateArtist, updateTitle)) > 0) {
			System.out.println("���������� �����Ǿ����ϴ�.");
		} else {
			System.out.println("������ ���� ã�� ���߽��ϴ�.");
		}

	}
}
