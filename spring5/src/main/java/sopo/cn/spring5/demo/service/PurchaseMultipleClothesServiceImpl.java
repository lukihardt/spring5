package sopo.cn.spring5.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseMultipleClothesServiceImpl implements PurchaseMultipleClothesService {
	
	@Autowired
	private PurchaseService purchaseService;
	
	@Transactional
	@Override
	public void purchaseMultipleClothesService(Integer uid, Integer[] cids, Integer[] counts) {
		// TODO Auto-generated method stub
		for (int i = 0; i < cids.length; i++) {
			purchaseService.purchaseClothe( uid, cids[i], counts[i]);
		}
	}

}
