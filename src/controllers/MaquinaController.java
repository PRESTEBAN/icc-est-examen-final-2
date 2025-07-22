package controllers;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import models.Maquina;

public class MaquinaController {

    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral) {
        Stack<Maquina> maquinasUm = new Stack<>();

        for (Maquina maquina : maquinas) {
            String[] sr = maquina.getIp().split("\\.");

            for (String subredes : sr) {
                if (Integer.parseInt(subredes) > umbral) {
                    maquinasUm.push(maquina);
                }
            }

        }

        return maquinasUm;
    }

    public Set<Maquina> ordenarPorSubred(Stack<Maquina> pila){
         return null;
    }

    public Map<Integer, Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquinas) {
        return null;
    }

    public Stack<Maquina> explotarGrupo(Map<Integer, Queue<Maquina>> mapa) {
        return null;
    }
}