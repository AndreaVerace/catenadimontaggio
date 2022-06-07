package it.prova.catenadimontaggio;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
import it.prova.catenadimontaggio.service.CatenaDiMontaggioService;
import it.prova.catenadimontaggio.service.ProvaSuStradaService;

@SpringBootApplication
public class CatenadimontaggioApplication implements CommandLineRunner  {

	@Autowired
	private CatenaDiMontaggioService catenaDiMontaggioService;
	
	@Autowired
	private ProvaSuStradaService provaSuStradaService;
	
	public static void main(String[] args) {
		SpringApplication.run(CatenadimontaggioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		SlotCatenaDiMontaggio slot = catenaDiMontaggioService.caricaSlot(1L);
		
		// aggiungo un 'automobile
		Automobile autoNuova = new Automobile(30L,"Ferrari","Telaio Ferrari",new SimpleDateFormat("yyyy-MM-dd").parse("2021-08-08"));
		
		//aggiungo l'auto allo slot 
		catenaDiMontaggioService.aggiungiAutomobileASlotCatenaDiMontaggio(autoNuova, slot);
		
		
		
		provaSuStradaService.provaStradale(slot);
		
	}

}
