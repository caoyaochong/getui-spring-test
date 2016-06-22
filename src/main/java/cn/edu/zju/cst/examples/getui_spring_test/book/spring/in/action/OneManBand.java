package cn.edu.zju.cst.examples.getui_spring_test.book.spring.in.action;

import java.util.Collection;

public class OneManBand implements Performer {
	private Collection<Instrument> instruments;
	
	private OneManBand() {
	}

	@Override
	public void perform() {
		for(Instrument instrument : instruments) {
			instrument.play();
		}
		int b = 1/ 0;
		
	}

	public Collection<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
	
}
