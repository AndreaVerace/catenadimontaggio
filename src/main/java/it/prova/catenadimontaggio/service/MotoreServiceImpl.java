package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service
public class MotoreServiceImpl implements MotoreService {

	@Override
	public void aggiuntaMotore() {
		System.out.println("Motore aggiunto correttamente....");
	}

}
