package it.prova.catenadimontaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Service
public class ProvaSuStradaServiceImpl implements ProvaSuStradaService {

	@Autowired
	private CatenaDiMontaggioService catenaDiMontaggioService;

	@Override
	public void provaStradale(SlotCatenaDiMontaggio slot) {
		catenaDiMontaggioService.montaggioAuto(slot);
		
		System.out.println("Inizio prova stradale.........");
	}
	
	
	
}
