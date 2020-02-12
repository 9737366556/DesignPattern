package com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.service;

import com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.dto.IPhone;
import com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.dto.MI;
import com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.dto.MobileShope;
import com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.dto.Samsung;
import com.joker.DesignePattern.structuralDesignPatterns.facadeDesignPattern.dto.Vivo;

/**
 * Purpose : For implementation of interFace
 * 
 * 
 * @author Nikunj Balar
 *
 */
public class ShopeKeeperImpl implements ShopeKeeper {

	private MobileShope vivo;
	private MobileShope mi;
	private MobileShope iPhone;
	private MobileShope samsung;

	public ShopeKeeperImpl() {
		vivo = new Vivo();
		mi = new MI();
		iPhone = new IPhone();
		samsung = new Samsung();
	}

	// giving implementation base on type of mobile
	
	@Override
	public void saleVivo() {
		vivo.modelNo();
		vivo.price();
	}

	@Override
	public void saleMI() {
		mi.modelNo();
		mi.price();
	}

	@Override
	public void saleIPhone() {
		iPhone.modelNo();
		iPhone.price();
	}

	@Override
	public void saleSamsung() {
		samsung.modelNo();
		samsung.price();
	}
}
