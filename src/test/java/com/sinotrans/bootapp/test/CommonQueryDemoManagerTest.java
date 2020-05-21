package com.sinotrans.bootapp.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.oms.MyAppStandard;
import com.sinotrans.oms.test.service.CommonQueryDemoManager;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyAppStandard.class)
public class CommonQueryDemoManagerTest {

	@Autowired
	private CommonQueryDemoManager commonQueryDemo;

	@Test
	public void testTestQueryModel() {
		QueryData qd = commonQueryDemo.testQueryModel();
		assertEquals(3, qd.getDataList().size());
		assertEquals(4, qd.getPagingInfo().getTotalRows());
	}

	@Test
	public void testTestModelQuerySqlCond() {
		QueryData qd = commonQueryDemo.testModelQuerySqlCond();
		assertEquals(2, qd.getDataList().size());
		assertEquals(3, qd.getPagingInfo().getTotalRows());
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> result = (List<Map<String, Object>>) qd.getDataList();
		for (Map<String, Object> row : result) {
			System.out.println("ID" + row.get("fjurId"));
			System.out.println("名字" + row.get("fjurRealname"));
			System.out.println("状态" + row.get("fjurStatus"));
		}
	}

	@Test
	public void testTestModelQueryFilterCond() {
		QueryData qd = commonQueryDemo.testModelQueryFilterCond();
		assertEquals(3, qd.getDataList().size());
		assertEquals(4, qd.getPagingInfo().getTotalRows());
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> result = (List<Map<String, Object>>) qd.getDataList();
		for (Map<String, Object> row : result) {
			System.out.println("ID:" + row.get("fjurId"));
			System.out.println("名字:" + row.get("fjurRealname"));
			System.out.println("状态:" + row.get("fjurStatus"));
		}
	}

	@Test
	public void testTestTablesQuerySqlCond() {
		QueryData qd = commonQueryDemo.testTablesQuerySqlCond();
		assertEquals(2, qd.getDataList().size());
		assertEquals(3, qd.getPagingInfo().getTotalRows());
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> result = (List<Map<String, Object>>) qd.getDataList();
		for (Map<String, Object> row : result) {
			System.out.println("ID" + row.get("id"));
			System.out.println("名字" + row.get("workLevel"));
			System.out.println("状态" + row.get("typename"));
		}
	}

	@Test
	public void testTestTablesQueryFilterCond() {
		QueryData qd = commonQueryDemo.testTablesQueryFilterCond();
		assertEquals(2, qd.getDataList().size());
		assertEquals(6, qd.getPagingInfo().getTotalRows());
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> result = (List<Map<String, Object>>) qd.getDataList();
		for (Map<String, Object> row : result) {
			System.out.println("ID:" + row.get("id"));
			System.out.println("名字:" + row.get("workLevel"));
			System.out.println("状态:" + row.get("typename"));
		}
	}

	@Test
	public void testTestFieldCodeTypesModel() {
		QueryData qd = commonQueryDemo.testFieldCodeTypesModel();
		assertEquals(3, qd.getDataList().size());
		Map<String, Map<Object, String>> scv = qd.getSelectCodeValues();
		assertEquals(3, scv.get("WORKLEVELS").size());
		assertEquals("紧急", scv.get("WORKLEVELS").get("1"));
		assertEquals("高级", scv.get("WORKLEVELS").get("2"));
		assertEquals("中级", scv.get("WORKLEVELS").get("3"));
	}

	@Test
	public void testTestFieldCodeTypesForENModel() {
		QueryData qd = commonQueryDemo.testFieldCodeTypesForENModel();
		assertEquals(3, qd.getDataList().size());
		Map<String, Map<Object, String>> scv = qd.getSelectCodeValues();
		assertEquals(3, scv.get("WORKLEVELS").size());
		assertEquals("URGENT", scv.get("WORKLEVELS").get("1"));
		assertEquals("ADVANCED", scv.get("WORKLEVELS").get("2"));
		assertEquals("MEDIUM", scv.get("WORKLEVELS").get("3"));
	}

}
