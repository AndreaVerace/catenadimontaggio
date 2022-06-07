package it.prova.catenadimontaggio.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class DbMock {

	public static final List<SlotCatenaDiMontaggio> SLOT_LIST = new ArrayList<SlotCatenaDiMontaggio>();
	
	static {
		try {
			
		
			SlotCatenaDiMontaggio slotUno = new SlotCatenaDiMontaggio(1L,"Slot Uno s.p.a.","Italia");
			Automobile autoDiSlotUno = new Automobile(10L,"Ford","Telaio Ford",new SimpleDateFormat("yyyy-MM-dd").parse("2020-08-08"),slotUno);
			slotUno.getAutomobili().add(autoDiSlotUno);
			
			SlotCatenaDiMontaggio slotDue = new SlotCatenaDiMontaggio(1L,"Slot Due s.r.l.","Germania");
			Automobile autoDiSlotDue = new Automobile(20L,"Volkswagen","Telaio Volkswagen",new SimpleDateFormat("yyyy-MM-dd").parse("2021-08-08"),slotUno);
			slotDue.getAutomobili().add(autoDiSlotDue);
			
			
			SLOT_LIST.add(slotUno);
			SLOT_LIST.add(slotDue);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
}
