/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidvaccinationapp;

/**
 * @08/03/2021
 * @author Tamara
 */
public interface VacciInterface {
    public void enqueue(Patients elem);
    public Object dequeue();
    public int size();
    public boolean isEmpty();
    public String printPQueue();
}
