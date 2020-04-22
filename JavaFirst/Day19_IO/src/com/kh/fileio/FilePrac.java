package com.kh.fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilePrac {

	// * 1. ����� : �ܺ��ڿ� (Ű����, ����, �����ͺ��̽� ����, ��Ʈ��ũ�� �ٸ� PC���)
	// * - �ڹ� ���α׷� Ȥ�� �޸𸮷� �����͸� �о���ų�(�Է�), �ݴ�� �ܺ� �ڿ����� ���⸦ �ϴ� ��(���)

	// * 2. Stream : �����͸� ������ϱ����� ���� ���
	// * - Stream�� �⺻������ �� �����̴�.
	// * - ���� �� �����Ͱ� ���� ���´�(FIFO)
	// * - �ݵ�� close()�޼��带 ȣ�� �� ��θ� �ݾ� ��� �Ѵ�.

	// * 3. Stream�� ����
	// * - �з� :
	// * - ����Ʈ ��Ʈ��, ���� ��Ʈ��
	// * - ��� ��Ʈ��, ���� ��Ʈ��

	// * - 1) ��� ��Ʈ��
	// * - � ���� �����͸� ����� �� �� �����ִ� ��Ʈ�� Ŭ����
	// * - FileInputStream / FileOutputStream
	// * - > ���� ����� ��Ʈ��
	// * - ByteArrayInputStream / ByteArrayOutputStream
	// * - > ����Ʈ�迭 ����� ��Ʈ��
	// * - PipedInputStream / PipedOutputStream
	// * - > �����尣 ������ �ְ� ���� �� ����ϴ� ��Ʈ��
	// * - StringBufferInputStream / StringBufferOutputStream
	// * - > ���ڿ��� ����Ʈ�� �о���̰�, ���� ��Ʈ���� �����Ѵ�.

	// * - 2) ���� ��Ʈ��
	// * - ��� ��Ʈ���� ������ �����ϴ� Ŭ����(�ӵ�, ����߰�, ��ȯ�۾� ���)
	// * - ���� ��Ʈ���� ��ӹ޾Ƽ� ���ͽ�Ʈ���̶�� �θ��⵵ �Ѵ�.
	// * - 1) BufferedInputStream / BufferedOutputStream
	// * - > ���ۿ� �����͸� ��� �Ѳ����� �۾��� �Ͽ� ���༺���� �������ش�.
	// * - 2) ObjectInputStream / ObjectOutputStream
	// * - > ��ü�� ���� �Ǵ� ��Ʈ��ũ�� ����� �� �� �ֵ��� �����ش�. �� , �ݵ�� ����ȭ ó���� �ؾ��Ѵ�.
	// * - 3) DataInputStream / DataOutputStream
	// * - > �⺻ �ڷ����� �����͸� �а� ���Ⱑ �����ϵ��� ����� �����Ѵ�.
	// * - 4) InputStreamReader / OutputStreamWriter
	// * - > �ҽ� ��Ʈ���� ����Ʈ ��� ��Ʈ��������, �����Ͱ� �����ϰ�� ���ڴ���(2byte)�� ������� �ϰԲ� ���ش�.

	public void fMethod() {

		// * - �ڹٿ��� Ư�� ��ȣ�� ó���ϴ� ���
		// * - \ �� ���ָ� �ȴ�.
		// * - ������
		// * - \t : ��
		// * - \n(�ƽ�Ű�ڵ�10) : �ٹٲ�
		// * - \r(�ƽ�Ű�ڵ�13) : �ٹٲ� ver2 :���� ���� ó������ Ŀ���� �̵�

		// System.out.println("\"������ ������ ��������\"");

		// * - ���, ���� ������ �ִ� �޼���
		// * - 1) createNewFile()
		// * -> File��ü�� ������ �Ű������� ���� ��ο� ���ϸ��� ����� ������ ����� �ش�.
		// * - 2) mkdirs
		// * -> File��ü�� ������ �谳������ ���� ����� ������ ����� �ش�.
		// * - mkdir

		// * - �۾��ϴ� �ڹ� ������Ʈ�� ���� ����(��θ� �ۼ����� ����)
		File f = new File("test.txt");
		try {
			f.createNewFile();

			// * - ������ �����ϴ� ��ο� ���� �����ϱ�.
			// f = new File("AAA\\BBB\\ccc");

			// f.createNewFile();

			// * - ��ο� ���� ������ֱ�
			// * - mkdir (�߰������ ������ �������� ������ ������ ������ �ʴ´�.
			// * - mkdirs (�߰������ ������ �ѹ��� �������ش�.)

			// f.mkdirs();
			// f = new File("AAA\\BBB\\ccc\\test.txt");
			// f.createNewFile();

			// * - ./ ������ġ
			// * - ������ġ
			// * - ../ �θ���ġ

			// * - �ش� ������ ������ �����ϴ���
			f = new File("AAA\\BBB\\ccc\\");
			System.out.println(f.exists());
			if (!f.exists()) {
				f.mkdirs();
			}
			String fileName = "AGB.txt";
			String fileRes = f.getPath() + "\\" + fileName;
			f = new File(fileRes);
			f.createNewFile();

			// * - �� �� �޼���
			System.out.println("���ϸ� : " + f.getName());
			System.out.println("���� ��� ��� : " + f.getPath());
			System.out.println("���� ���� ��� : " + f.getAbsolutePath());
			System.out.println("���� ���� : " + f.getParent());

		} catch (IOException e) {
			System.out.println("IOException�� �߻��Ͽ����ϴ�.");
		}
	}

	public void fInOut() {

		File file = new File("test.txt");
		try {
			file.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		OutputStream oStream = null;
		InputStream iStream = null;
		// * 1)OutputStream : ��½�Ʈ��, �ڹ� ���α׷� ---> ������ ������
		try {
			oStream = new FileOutputStream("test.txt");
			String str = "���̿� �ʹ� ����.";
			oStream.write(str.getBytes());

			iStream = new FileInputStream("test.txt");
			int check = 0;
			// System.out.println(check);
			System.out.print((char) check);
			while ((check = iStream.read()) != -1) {
				System.out.print((char) check);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oStream.close();
				iStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
