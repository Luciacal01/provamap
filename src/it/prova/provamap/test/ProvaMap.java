package it.prova.provamap.test;

import java.util.HashMap;
import java.util.Map;

public class ProvaMap {
	public static void main(String[] args) {
		Map<Integer, String> classifica = new HashMap<Integer, String>();
		classifica.put(3, "Milan");
		classifica.put(1, "Inter");
		classifica.put(4, "Napoli");
		classifica.put(2, "Roma");

		for (Integer key : classifica.keySet()) {
			System.out.println(classifica.get(key));
		}

		System.out.println("verifica esistenza chiave: " + classifica.containsKey(3));

		classifica.replace(1, "Inter", "Lazio");

		for (Integer key : classifica.keySet()) {
			System.out.println(classifica.get(key));
		}
	}
}
