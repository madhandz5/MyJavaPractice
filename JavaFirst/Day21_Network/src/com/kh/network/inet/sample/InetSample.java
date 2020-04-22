package com.kh.network.inet.sample;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetSample {

	// * 1. 네트워크 : 통신회선으로 여러 대의 컴퓨터를 연결 한 것.
	// * - 1) 노드 : 네트워크에 연결된 모든 종류의 장치를 노드라고 한다.
	// * 2. IP : 네트워크 상에서 컴퓨터를 식별하는 번호, 노드 중에서 IP주소가 할당된 노드를 호스트(host) 라고 부른다.
	// * 3. port : 네트워크를 통해 데이터를 주고 받는 프로세스를 식별하기 위해 프로세스가 할당 받는 고유한 값을 의미한다.
	// * - 1) 웹은 80번 포트를 주로 사용한다. 포트는 총 0~65535 사이의 숫자로 사용할 수 있다.
	// * - 2) 0~1023 까지의 포트는 일반적인 서버 소프트웨어에서 이미 쓰고 있다.
	// * 4. 소켓 : 프로세스가 네트워크를 통해서 데이터를 주고 받기 위해 열어야 하는 것.
	// * 5. 서버 - 소켓 - 포트 - IP - 네트워크 - IP - 포트 - 소켓 - 클라이언트 프로세스
	// * 6. 통신규약 ( 프로토콜 )
	// * - 1) TCP
	// * - 연결기반으로 연결 후 통신하는 방식
	// * - 신뢰성 있는 데이터 전송
	// * - ByteStream으로 데이터 경계를 구분하지 않음.
	// * - 데이터 전송 순서가 보장됨
	// * - 속도보다 안정성이 중요한 경우 사용
	// * - 2) UDP
	// * - 비연결 기반이며 연결없이 통신
	// * - 신뢰성이 없는 데이터 전송
	// * - 데이터 경계를 구분함 (DataGram)
	// * - 데이타 전송 순사가 보장되지 않음
	// * - 안정성보다 속도가 중요한 경우 사용

	// InetAddress : IP 주소를 다루기 위해 자바에서 제공하는 클래스

	public void ipSample() {

		try {
			InetAddress localIp = InetAddress.getLocalHost();
			System.out.println("내 IP : " + localIp.getHostAddress());
			System.out.println("내 PC 명 : " + localIp.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
