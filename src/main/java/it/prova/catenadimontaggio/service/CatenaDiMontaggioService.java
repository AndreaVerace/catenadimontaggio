package it.prova.catenadimontaggio.service;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface CatenaDiMontaggioService {

public SlotCatenaDiMontaggio caricaSlot(Long id);
	
	public void aggiungiAutomobileASlotCatenaDiMontaggio(Automobile automobile,SlotCatenaDiMontaggio slot);
	
	public void montaggioAuto(SlotCatenaDiMontaggio slot);
}
