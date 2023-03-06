/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sjgar
 */
public class Modelo {
    private Map<Character, Integer> mapSal;
    private Map<Character, String> mapExp;

    public Modelo() {
        this.mapExp = new HashMap<>();
        mapExp.put('|',"Operador lógico");
        mapExp.put('&',"Operador lógico");
        mapExp.put('!',"Operador lógico");
        mapExp.put('<',"Operador lógico");
        mapExp.put('>',"Operador lógico");
        mapExp.put('=',"Operador lógico");
        mapExp.put('(', "Separador lógico");
        mapExp.put(')', "Separador lógico");
        this.mapSal = new HashMap<>();
    }

    public Map<Character, Integer> getMapSal() {
        return mapSal;
    }

    public Map<Character, String> getMapExp() {
        return mapExp;
    }
    
    public String calcularCant (String operacion){
        int i = 0;
        Object[] keys = mapExp.keySet().toArray();
        for(char ch : operacion.toUpperCase().toCharArray()){
            if(Arrays.asList(keys).contains(ch) || "ABCDEFGHIJKMNOPQRSTUVWXYZ".contains(String.valueOf(ch))){
                if(!mapSal.containsKey(ch)){
                    mapSal.put(ch, 1);
                }
                else{
                    mapSal.put(ch, mapSal.get(ch)+1);
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for (char key : mapSal.keySet()) {
            str.append(key);
            str.append("=");
            str.append(mapSal.get(key));
            str.append("\n");
        }
        return str.toString();
    }
    
}
