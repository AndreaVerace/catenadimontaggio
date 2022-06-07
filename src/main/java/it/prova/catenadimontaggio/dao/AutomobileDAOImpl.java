package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Component
public class AutomobileDAOImpl implements AutomobileDAO {

	@Override
	public void insert(Automobile automobile) {
		for(SlotCatenaDiMontaggio slot : DbMock.SLOT_LIST) {
			if(slot.getId() == automobile.getSlotCatenaDiMontaggio().getId())
				slot.addToAutomobili(automobile);
		}
		
	}

}
