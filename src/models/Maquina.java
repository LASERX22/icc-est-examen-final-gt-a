package models;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Maquina {
    private String nombre;
    private String ip;
    private List<Integer> codigos;
    private int subred;
    private int riesgo;

    public Maquina(String nombre, String ip, List<Integer> codigos) {
        this.nombre = nombre;
        this.ip = ip;
        this.codigos = codigos;
        this.subred = calcularSubred();
        this.riesgo = calcularRiesgo();
    }
    

    private int calcularSubred(){
        String[] newIp=ip.split("\\.");
        String subred=newIp[3];

        return Integer.parseInt(subred);
    }

    private int calcularRiesgo(){
        Set<Character> unicos=new TreeSet<>();
        int validos=0;
        for (int index = 0; index < nombre.length(); index++) {
            unicos.add(nombre.charAt(index));
        }

        for (int numero : codigos) {
            if(numero%3==0){
                validos+=numero;
            }
        }
        int riesgo=validos*unicos.size();
        return riesgo;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getIp() {
        return ip;
    }


    public void setIp(String ip) {
        this.ip = ip;
    }


    public List<Integer> getCodigos() {
        return codigos;
    }


    public void setCodigos(List<Integer> codigos) {
        this.codigos = codigos;
    }


    public int getSubred() {
        return subred;
    }


    public void setSubred(int subred) {
        this.subred = subred;
    }


    public int getRiesgo() {
        return riesgo;
    }


    public void setRiesgo(int riesgo) {
        this.riesgo = riesgo;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+", IP: "+ip+", Codigos: "+codigos;
    }


    
}
