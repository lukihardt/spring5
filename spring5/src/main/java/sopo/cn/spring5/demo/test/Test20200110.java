package sopo.cn.spring5.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.AbstractXmlApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import sopo.cn.spring5.demo.service.PurchaseMultipleClothesService;
import sopo.cn.spring5.demo.service.PurchaseService;

public class Test20200110 {
	@Transactional
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PurchaseService purchaseService = context.getBean(PurchaseService.class);
		purchaseService.purchaseClothe( 1, 1, 1);
		context.close();
	}

	@Test
	public void testPurchaseMultipleClothesService() {
		AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PurchaseMultipleClothesService purchaseMultipleClothesService = context.getBean(PurchaseMultipleClothesService.class);
		purchaseMultipleClothesService.purchaseMultipleClothesService( 1, new Integer[] { 1, 2}, new Integer[] { 1, 1});
		context.close();
	}
}
