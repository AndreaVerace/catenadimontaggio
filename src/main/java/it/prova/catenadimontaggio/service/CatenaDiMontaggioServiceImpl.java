package it.prova.catenadimontaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.dao.SlotCatenaDiMontaggioDAO;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Service
public class CatenaDiMontaggioServiceImpl implements CatenaDiMontaggioService {

	@Autowired
	private CarrozzeriaService carrozzeriaService;
	@Autowired
	private ImpiantoElettricoService impiantoElettricoService;
	@Autowired
	private MotoreService motoreService;
	@Autowired
	private TelaioService telaioService;
	@Autowired
	private SlotCatenaDiMontaggioDAO slotCatenaDiMontaggioDAO;
	
	public void montaggioAuto(SlotCatenaDiMontaggio slot) {
		for(Automobile auto : slot.getAutomobili()) {
			System.out.println("Inizio montaggio auto......: " + auto);
			carrozzeriaService.aggiuntaCarrozzeria();
			impiantoElettricoService.aggiuntaImpiantoElettrico();
			motoreService.aggiuntaMotore();
			telaioService.aggiuntaTelaio();
			System.out.println("Fine montaggio auto......: " + auto);
		}
	}
	
	@Override
	public SlotCatenaDiMontaggio caricaSlot(Long id) {
		return slotCatenaDiMontaggioDAO.get(id);
	}

	@Override
	public void aggiungiAutomobileASlotCatenaDiMontaggio(Automobile automobile, SlotCatenaDiMontaggio slot) {
		slotCatenaDiMontaggioDAO.addAutomobileToSlotCatenaDiMontaggio(automobile, slot);
		
	}

	public CarrozzeriaService getCarrozzeriaService() {
		return carrozzeriaService;
	}

	public void setCarrozzeriaService(CarrozzeriaService carrozzeriaService) {
		this.carrozzeriaService = carrozzeriaService;
	}

	public ImpiantoElettricoService getImpiantoElettricoService() {
		return impiantoElettricoService;
	}

	public void setImpiantoElettricoService(ImpiantoElettricoService impiantoElettricoService) {
		this.impiantoElettricoService = impiantoElettricoService;
	}

	public MotoreService getMotoreService() {
		return motoreService;
	}

	public void setMotoreService(MotoreService motoreService) {
		this.motoreService = motoreService;
	}

	public TelaioService getTelaioService() {
		return telaioService;
	}

	public void setTelaioService(TelaioService telaioService) {
		this.telaioService = telaioService;
	}

	public SlotCatenaDiMontaggioDAO getSlotCatenaDiMontaggioDAO() {
		return slotCatenaDiMontaggioDAO;
	}

	public void setSlotCatenaDiMontaggio(SlotCatenaDiMontaggioDAO slotCatenaDiMontaggioDAO) {
		this.slotCatenaDiMontaggioDAO = slotCatenaDiMontaggioDAO;
	}

	
	
	
	
}
