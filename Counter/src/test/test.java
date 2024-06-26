package test;

import model.CounterModel;
import view.CounterView;

public class test {
	public static void main(String[] args) {
		CounterModel ct1=new CounterModel();
		ct1.increment();
		ct1.increment();
		ct1.increment();
		System.out.println(ct1.getValue());
		ct1.decrement();
		ct1.decrement();
		System.out.println(ct1.getValue());
		CounterView ctView=new CounterView(); 
	}
}
