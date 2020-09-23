package com.regis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Inicio {

	public static void main(String[] args) {
		
		List vetor1 = Arrays.asList(1,2,3,3,4,5,5,6,7,8,9,1,2,4,7);
		
		// Pega apegar os valores distintos e insere no objeto "set"
		Set set = new TreeSet<>(vetor1);
		
		// Adicona o conteúdo do objeto "set" no vetor2
		List vetor2 = new ArrayList<>();
		vetor2.addAll(set);

		System.out.println(vetor1);
		System.out.println(vetor2);

	}

}
