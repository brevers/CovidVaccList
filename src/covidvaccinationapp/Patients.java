
package covidvaccinationapp;

import java.util.logging.Logger;

/**
 * @08/03/2021
 * @author Tamara
 */
public class Patients {
    private int idTf;
    private String nameTf;
    private String lastNameTf;
    private int ageTf; 
    private boolean medicalConditionsTk;

    public Patients (int idTf, String nameTf, String lastNameTf, int ageTf, boolean medicalConditionsTk){
        this.idTf = idTf;
        this.nameTf = nameTf;
        this.lastNameTf = lastNameTf;
        this.ageTf = ageTf; 
        this.medicalConditionsTk = medicalConditionsTk;
    }


    public int getIdTf() {
        return idTf;
    }

    public void setIdTf(int idTf) {
        this.idTf = idTf;
    }

    public String getNameTf() {
        return nameTf;
    }

    public void setNameTf(String nameTf) {
        this.nameTf = nameTf;
    }

    public String getLastNameTf() {
        return lastNameTf;
    }

    public void setLastNameTf(String lastNameTf) {
        this.lastNameTf = lastNameTf;
    }

    public int getAgeTf() {
        return ageTf;
    }

    public void setAgeTf(int ageTf) {
        this.ageTf = ageTf;
    }

    public boolean isMedicalConditionsTk() {
        return medicalConditionsTk;
    }

    public void setMedicalConditionsTk(boolean medicalConditionsTk) {
        this.medicalConditionsTk = medicalConditionsTk;
    }
    //-------------------------------------------------------------------------- Aviod Patients Duplication----------------------------
    
    
    
    //MODIFY EQUALS TO MAKE IT WORK WITH MY OBJECT 
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Patients){
            Patients p = (Patients)obj;
            
            if(this.idTf== p.idTf){ //comparing if two Patients have the same ID
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
   

    @Override
    public String toString() {
        if(isMedicalConditionsTk()){
            return " ID: " + getIdTf()+ "\nName: " + getNameTf()+ "\nSurname: " + getLastNameTf() + "\nAge: "+ getAgeTf()+"\nMedical Conditions: Yes" + "\n---------------->";
        }else{
            return " ID: " + getIdTf()+ "\nName: " + getNameTf()+ "\nSurname: " + getLastNameTf() + "\nAge: "+ getAgeTf()+"\nMedical Conditions: No" + "\n---------------->";
        }
    }
    
    
    
    
}