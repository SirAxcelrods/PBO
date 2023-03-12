/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author NANANG TRI HANDOYO
 */
 public class Cat {
    private String name;
    private int weight;
    private int age;
    private String color;
    private String ras;
    
    
    public void setName(String newName){
        name = newName;
    }
    public void setWeight(int newWeight){
        weight = newWeight;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setRas(String ras){
        this.ras = ras;
    }   
    
    
    
     public String getName() {
        return this.name;
    }
    public int getWeight() {
        return this.weight;
    }
    public int getAge() {
        return this.age;
    } 
    public String getColor() {
        return this.color;
    }
    public String getRas() {
        return this.ras;
    }

}



