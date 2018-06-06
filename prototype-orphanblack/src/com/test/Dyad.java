package com.test;

import java.util.ArrayList;
import java.util.List;

import com.model.HumanPrototype;
import com.model.Igor;
import com.model.OriginalLeda;

public class Dyad {
	public static void main(String[] args) {
		
		System.out.println("DYAD Institute");
		
		System.out.println("\nProject LEDA official report");
		
		List<HumanPrototype> projectLEDA = new ArrayList<HumanPrototype>();
		
		OriginalLeda original = new OriginalLeda();
		
		projectLEDA.add(original);
		
		HumanPrototype sarah  = original.clone();
		sarah.setName("Sarah Manning");
		sarah.setAka("Rebel");
		sarah.setTag("322D01");
		projectLEDA.add(sarah);
		
		HumanPrototype cosima = original.clone();
		cosima.setName("Cosima Niehaus");
		cosima.setAka("Scientist");
		cosima.setTag("324B21");
		projectLEDA.add(cosima);
		
		for (HumanPrototype humanPrototype : projectLEDA) {
			System.out.println(humanPrototype.info());
		}
		
		System.out.println("\nProject NICE TEACHER official report");
		
		List<HumanPrototype> projectNT = new ArrayList<HumanPrototype>();
		
		Igor igor = new Igor();
		
		projectNT.add(igor);
		
		HumanPrototype igor2 = igor.clone();
		igor2.setName("Igor Pereira Avila");
		igor2.setTag("123456");
		
		projectNT.add(igor2);
		
		HumanPrototype igor3 = igor.clone();
		igor3.setTag("654321");
		igor3.setAka("phd student");
		
		projectNT.add(igor3);
		
		for (HumanPrototype humanPrototype : projectNT) {
			System.out.println(humanPrototype.info());
		}
	}
}
