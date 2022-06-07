package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

@Component
public class SlotCatenaDiMontaggioDAOImpl implements SlotCatenaDiMontaggioDAO {

	@Override
	public SlotCatenaDiMontaggio get(Long id) {
		for(SlotCatenaDiMontaggio slot : DbMock.SLOT_LIST) {
			if(slot.getId() == id)
				return slot;
		}
		return null;
	}

	@Override
	public void addAutomobileToSlotCatenaDiMontaggio(Automobile automobile, SlotCatenaDiMontaggio slot) {
		automobile.setSlotCatenaDiMontaggio(slot);
		for(SlotCatenaDiMontaggio slotItem : DbMock.SLOT_LIST) {
			if(slotItem.getId() == slot.getId())
			slot.addToAutomobili(automobile);
		}
		
	}

}
