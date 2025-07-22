package controllers;

import com.sun.source.tree.Tree;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Maquina;

public class MaquinaController {
    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral){
        Stack<Maquina> filtro=new Stack<>();
        for (Maquina maquina : maquinas) {
            if(maquina.getSubred()<umbral){
                filtro.add(maquina);
            }
        }
        return filtro;
    }

    public TreeSet<Maquina> ordenarPorSubred(Stack<Maquina> pila){
        TreeSet<Maquina> maquinasOrde=new TreeSet<>(pila);
        return maquinasOrde;
    }

    public TreeMap<Integer, Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquinas){

    }

    public Stack<Maquina> explotarGrupo(Map<Integer, Queue<Maquina>> mapa){

    }
}
