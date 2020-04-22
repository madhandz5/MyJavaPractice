package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import model.service.QRCodeMaker;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblNewLabel = new JLabel("QRCode Maker");
	private final Action action = new SwingAction();
	private JTextArea Title;
	private JTextArea URL;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("QR Code Maker");
		setForeground(Color.DARK_GRAY);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\user2\\Desktop\\\uC544\uC774\uCF58.jpg"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 416);
		contentPane = new JPanel();
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(12, 10, 169, 62);
		contentPane.add(lblNewLabel);

		Title = new JTextArea();
		Title.setBounds(12, 103, 267, 264);
		contentPane.add(Title);

		JLabel lblTitle = new JLabel("Title");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblTitle.setBounds(107, 66, 83, 27);
		contentPane.add(lblTitle);

		JLabel lblUrl = new JLabel("URL");
		lblUrl.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblUrl.setBounds(413, 66, 69, 27);
		contentPane.add(lblUrl);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.setAction(action);
		btnNewButton.setBounds(230, 54, 109, 39);
		contentPane.add(btnNewButton);

		URL = new JTextArea();
		URL.setBounds(296, 103, 267, 264);
		contentPane.add(URL);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Click");
			putValue(SHORT_DESCRIPTION, "Click to Generate");
		}

		public void actionPerformed(ActionEvent e) {
			String titles = Title.getText();
			String[] titleArr = titles.split("[\r\n]");
			for (int i = 0; i < titleArr.length; i++) {
				System.out.println(titleArr[i]);
			}

			String urls = URL.getText();
			String[] urlArr = urls.split("[\r\n]");
			for (int i = 0; i < urlArr.length; i++) {
				System.out.println(urlArr[i]);
			}

			QRCodeMaker qMaker = new QRCodeMaker();
			qMaker.qrMaker(urlArr, titleArr);
			JOptionPane.showMessageDialog(null, "작업완료되었습니다.");
			// 프로그램창 가운데 띄우기
			// 작업 완료 후 자동종료하기
			System.exit(0);
		}
	}
}
