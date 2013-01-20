package org.uva.sea.ql.util;

import java.util.HashMap;

import org.uva.sea.ql.ast.Expr;
import org.uva.sea.ql.ast.Ident;

public class Stack implements Cloneable {

	private HashMap<Ident, Expr> map;
	
	public Stack(){
		this.map = new HashMap<Ident, Expr>();
	}
	
	
	public Stack(HashMap<Ident, Expr> map){
		this.map = map;
	}
	
	
	public void add(Ident key, Expr value){
		map.put(key, value);
	}
	

	public boolean contains(Ident key){
		return map.containsKey(key);
	}
	
	
	public boolean hasType(Ident key, Class<?> type){
		return type.isInstance(map.get(key));
	}
	
	
	public Expr getValue(Ident key){
		return map.get(key);
	}
	
	
	//@SuppressWarnings("unchecked")
	public Stack clone(){
		//note that a shallow copy of the stack suffices, as variables used are immutable
		//i.e. once a variable has been added to the stack it may no longer be changed.
		return new Stack((HashMap<Ident, Expr>)map.clone());
	}
}
