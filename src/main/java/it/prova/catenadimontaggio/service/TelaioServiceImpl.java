package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

@Service
public class TelaioServiceImpl implements TelaioService {

	@Override
	public void aggiuntaTelaio() {
		System.out.println("Telaio aggiunto correttamente....");
	}

}
