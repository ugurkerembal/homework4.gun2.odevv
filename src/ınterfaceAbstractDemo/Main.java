package ýnterfaceAbstractDemo;

import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdepter;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager= new NeroCustomerManager();
		customerManager.save(new Customer(1,"Uður Kerem","Bal",LocalDate.of(1999, 04, 30),"123456"));
		
		BaseCustomerManager customerManager2=new StarbucksCustomerManager(new MernisServiceAdepter());
		customerManager2.save(new Customer(1,"Beyza","Bal",LocalDate.of(1995, 11, 23),"123456"));

	}

}
