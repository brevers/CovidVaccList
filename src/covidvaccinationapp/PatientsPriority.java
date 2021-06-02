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
public class PatientsPriority {
    private Patients info; //info from Patient
    private int key; //priority Patient
    
    
    public PatientsPriority(int priority, Patients inf){
        key = priority; //
        info = inf; 
    }

    
    public Patients getInfo() {
        return info;
    }
    
    public int getKey(){
        return key;
    }

    public void setInfo(Patients info) {
        this.info = info;
    }

    public void setKey(int key) {
        this.key = key;
    }
    
    public String printInfoPatient() {
        if(info.isMedicalConditionsTk()){
            return " ID: " + info.getIdTf()+ "\nName: " + info.getNameTf()+ "\nSurname: " + info.getLastNameTf() + "\nAge: "+ info.getAgeTf()+"\nMedical Conditions: Yes" + "\n---------------->";
        }else{
            return " ID: " + info.getIdTf()+ "\nName: " + info.getNameTf()+ "\nSurname: " + info.getLastNameTf() + "\nAge: "+ info.getAgeTf()+"\nMedical Conditions: No" + "\n---------------->";
        }
        
    }
}
