package ru.neoflex.practice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calc_results")
public class Calc {
    private int id;
    private int a;
    private int b;
    private int res;
    private String operation;

    public Calc() {

    }

    public Calc (int a, int b, int res, String operation){
        this.a = a;
        this.b = b;
        this.res = res;
        this.operation = operation;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name="a", nullable = false)
    public Integer get_a(){
        return a;
    }
    public void set_a(int a){
        this.a=a;
    }

    @Column(name="b", nullable = false)
    public Integer get_b(){
        return b;
    }
    public void set_b(int b){
        this.b=b;
    }

    @Column(name="res", nullable = false)
    public Integer get_res(){
        return res;
    }
    public void set_res(int res){
        this.res=res;
    }

    @Column(name="operation", nullable = false)
    public String get_operation(){
        return operation;
    }
    public void set_operation(String operation){
        this.operation=operation;
    }
}
