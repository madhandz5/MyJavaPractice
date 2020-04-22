package model.service;

import java.io.File;
import java.io.IOException;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class QRCodeMaker {

	public void qrMaker(String[] urls, String[] titles) {
		QRCodeWriter qw = new QRCodeWriter();

		try {

			for (int i = 0; i < urls.length; i++) {

				String urlRes = "C:\\QRTest\\";
				File addr = new File(urlRes);

				if (!addr.exists()) {
					addr.mkdirs();
				}

				BitMatrix bMatrix = qw.encode(urls[i], BarcodeFormat.QR_CODE, 300, 300);

				try {
					MatrixToImageWriter.writeToFile(bMatrix, "jpg", new File(urlRes + titles[i] + ".jpg"));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (WriterException e) {
			e.printStackTrace();
		}
	}
}
