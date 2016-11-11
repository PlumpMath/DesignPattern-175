package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Accountant {

	 private List<Invoice> invoices = new ArrayList<Invoice>();
	 
	 public void addInvoices(List<Invoice> invoices) {
	  this.invoices.addAll(invoices);
	 }
	 
	 public void addInvoice(Invoice invoice1){
	  invoices.add(invoice1);
	 }


	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void findMinimumInvoice(){
		Invoice invoice = null;
//		invoice = invoices.min();
//		invoice = ArrayList.min(invoices);
		invoice = Collections.min(invoices);
//		invoice = Arrays.min(invoices);
	}

}

class Invoice implements Comparable {

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
