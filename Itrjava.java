package com.san.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.san.Bean.TrialBean;

public class Itrjava {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		ArrayList<TrialBean> a1 = new ArrayList<TrialBean>();
		ArrayList<TrialBean> b1 = new ArrayList<TrialBean>();
		ArrayList<TrialBean> mainList = new ArrayList<TrialBean>();
		
		TrialBean t1 = new TrialBean("00983_KYC_1_76.pdf","20 jan");
		TrialBean t3 = new TrialBean("74748_KYC_3_76.pdf","21 jan");
		TrialBean t4 = new TrialBean("74748_KYC_1_76.pdf","21 jan");
		TrialBean t5 = new TrialBean("74748_KYC_2_76.pdf","21 jan");
		
		a1.add(t1);
		a1.add(t3);
		System.out.println(a1.size());
		
		b1.add(t4);
		b1.add(t5);
		System.out.println(b1.size());
		
		a1.addAll(b1);
		System.out.println(a1.size());
		System.out.println(a1);
		
		Map<String, TrialBean> m = new ConcurrentHashMap<>();
		
		for(TrialBean b : a1) {
			
			String ar[]  = b.getFileName().split("_");
			System.out.println("-----"+ar.length);
			String s1 = ar[1];
			if(ar.length < 2) {
				if(m.get(s1) != null) {
					if(m.containsValue(m)) {
						System.out.println("~~~~~~");
					}
				}else {
					m.put(b.getFileName(), b);
					System.out.println("added");
				}
			}
		}
		ArrayList a1al = new ArrayList(m.values());
		System.out.println(a1al);
		


	}

}
