package models;

import java.util.List;

public class Maquina {
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;

    public Maquina(String nombre, String ip, List<Integer> codigos){
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
    }

   
    public String getNombre(){
        return nombre;
    }

    public String getIp(){
        return ip;
    }

    public List<Integer> getCodigos(){
        return codigos;
    }

    public int getSubred(){
        return subred;
    }

    public int getriesgo(){
        return riesgo;
    }

    public String setNombre(String nombre){
        return nombre;
    }

    public String setIp(String ip){
        return ip;
    }

    public List<Integer> setCodigos(List<Integer> codigos){
        return codigos;
    }

    public int setSubred(int subred){
        return subred;
    }

     public int setRiesgo(int subred){
        return subred;
    }

    public int calcularSubred(String ip){
        String[] subred =  ip.split("\\.");
        String sub = "";

        for (String subredString : subred) {
             sub = subredString;
        }

      return  Integer.parseInt(sub);
    }

    public int calcularRiesgo(List<Integer> codigos, String nombre){
        int cont = 0;
        for (Integer num : codigos) {
                if(num%5==0){
                    cont += num;
                }
        }

        String[] caracteres = nombre.split(" ");

        int cont2 = 0;
        for (String string : caracteres) {
            cont2++;
        }
        
        return cont * cont2;
    }

    @Override
    public String toString() {  
        return "Nombre: " + nombre + " ip: " + ip + "\n";
    }




}
