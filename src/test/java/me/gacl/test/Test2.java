package me.gacl.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import me.gacl.domain.Order;
import me.gacl.util.MyBatisUtil;

public class Test2 {
	
	@Test
	public void testGetOrderById(){
		SqlSession sqlSession = MyBatisUtil.getSession(true);
		String statement = "me.gacl.mapping.orderMapper.getOrderById";
		Order order = sqlSession.selectOne(statement, 1);
		sqlSession.close();
		System.out.println(order);
	}
	
	@Test
	public void testSelectOrder(){
		SqlSession sqlSession = MyBatisUtil.getSession(true);
		String statement = "me.gacl.mapping.orderMapper.selectOrder";
		Order order = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println(order);
	}
	
	@Test
	public void testSelectOrderResultMap(){
		SqlSession sqlSession = MyBatisUtil.getSession(true);
		String statement = "me.gacl.mapping.orderMapper.selectOrderResultMap";
		Order order = sqlSession.selectOne(statement,1);
		sqlSession.close();
		System.out.println(order);
	}
}
