package sprint2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SymbolTable {

		
	private HashMap<String, FunctionRepresentation> listFunctions;
	
	private HashMap<String, Integer> listSymbol;
	
	private int counterFunction = 0;
	private int counterSymbol = 0;

	public SymbolTable(){
		listFunctions=new HashMap<>();
		listSymbol=new HashMap<>();
	}
	
	public void addFunction(String name,int nbInput,int nbOutput) throws DoubleFunctionException{
		
		if(!listFunctions.containsKey(name)){
			listFunctions.put(name, new FunctionRepresentation("f"+counterFunction,nbInput,nbOutput));
			counterFunction++;
		}
		else{
			throw new DoubleFunctionException(name);
		}
	}

	public String addSymbol(String name) throws DoubleFunctionException{
		if(!listSymbol.containsKey(name)){
			listSymbol.put(name, counterSymbol);
			counterSymbol++;
			return "s" + (counterSymbol-1);
		}
		else{
			return "s"+listSymbol.get(name);
		}
	}
	
	public FunctionRepresentation getFunction(String name) {
		return listFunctions.get(name);
	}
	
	public boolean hasFunction(String name){
		return listFunctions.containsKey(name);
	}
	
	public String toString(){
				
		String result="";
		
		result+="Table des symboles : \n";
		for (Entry<String, Integer> entry : listSymbol.entrySet()){
			result+=entry+"\n";
		}
		
		for (Entry<String, FunctionRepresentation> entry : listFunctions.entrySet())
		{
			result+=entry.toString();
		}
		
		result+=printCodeGo();
		
		return result;
	}
	
	public String printCodeGo(){
		
		String result = "package main\n";
		
		result+="\ntype Node struct {\nLeft  Tree \nRight Tree \n}\ntype Tree = Node*\n";
		
		
		result+="\nfunc main(){ \n}\n";
		
		for (Entry<String, FunctionRepresentation> entry : listFunctions.entrySet())
		{
			result+=entry.getValue().printCodeGo();
		}
		
		return result;
	}
	
}