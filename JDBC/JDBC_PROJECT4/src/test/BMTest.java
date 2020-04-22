package test;

import java.sql.Connection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bm.exception.BMException;
import bm.model.dao.MemberDao;
import common.JdbcTemplate;

public class BMTest {

	public BMTest() {
	};

	// @Before : 테스트가 실행되기전에 수행되어야 하는 메서드용 어노테이션
	// @Test : 테스트를 담당하는 메서드용 어노테이션
	// @After : 테스트가 끝난 뒤 후속처리를 담당하는 메서드용 어노테이션
	Connection con = null;

	@Before
	public void beforeTest() {
		System.out.println("테스트 시작");
		con = JdbcTemplate.getInstance().getConnection();

	}

	@Test
	public void testMethod() {
		try {
			// 테스트 통과 조건
			// assertNotNull(a);
			// 객체 A가 Null이 아님을 확인한다.
			// assertArrayEquals(a,b);
			// 배열 A와 B가 일치함을 확인한다.
			// assertTrue(a)
			// 조건 a가 참인가를 확인한다.
			// assertEquals(a,b)
			// 객체 a와 b가 일치함을 확인한다.

			// Member m = new Member();
			// Member m2 = (Member) new MemberDao().logIn(con, "madhandz5", "dhckddud");
			//
			// assertEquals(m, new MemberDao().logIn(con, "madhandz5", "dhckddud"));

			if (new MemberDao().logIn(JdbcTemplate.getInstance().getConnection(), "madhandz5", "dhckddud") != null) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
		} catch (BMException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testMethod2() {
		System.out.println("두번째 테스트 입니다.");
	}

	@After
	public void afterTest() {
		JdbcTemplate.getInstance().rollback(con);
		JdbcTemplate.getInstance().close(con);
		System.out.println("테스트 종료");
	}

}
