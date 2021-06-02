package covidvaccinationapp;

import java.util.ArrayList;

/**
 * @08/03/2021
 * @author Tamara
 */
public class PQVaccination implements VacciInterface {

    ArrayList<PatientsPriority> PPQ; //list creation

    public PQVaccination() {
        PPQ = new ArrayList<>(); //list assignation
    }

    //ENQUEUE ELEMENTS WITH PRIORITY
    @Override
    public void enqueue(Patients p) {
        int key = this.generatePriority(p);

        PatientsPriority e = new PatientsPriority(key, p);
        int index = findPosition(key);

        if (index == size()) {
            PPQ.add(e);

        } else {
            PPQ.add(index, e);
        }
    }

    //FIND ITEM POSITION- used to add in the correct place on the list
    private int findPosition(int newkey) {
        //initialize variables
        boolean itemfound = false;
        PatientsPriority item;
        int position = 0;

        //add in the queue in the fist position
        while (position < PPQ.size() && !itemfound) {
            item = PPQ.get(position);

            //add in the queue in the correct position checking other items on the list    
            if (item.getKey() > newkey) {
                position = position + 1;
            } else {
                itemfound = true;
            }

        }
        return position;
    }

    //RETURNS SIZE LIST
    @Override
    public int size() {
        return PPQ.size();
    }

    //EMPTY LIST
    @Override
    public boolean isEmpty() {
        return PPQ.isEmpty();
    }

    public PatientsPriority getWithoutDequeue() {
        if (PPQ.size() > 0) {
            return PPQ.get(0);
        } else {
            return null;
        }
    }

    //REMOVE FIRST ITEM IN THE LIST
    @Override
    public Object dequeue() {
        return PPQ.remove(0);
    }

    //REMOVE ITEMS BY AGE GROUP   //MODIFICAR
    public ArrayList<Patients> dequeueGroup() {
        ArrayList<Patients> PatList = new ArrayList<>();
        PatientsPriority first = this.getWithoutDequeue();

        if (first == null) {
            return PatList;
        }

        int elementQuantity = PPQ.size();
        for (int i = 0; i < elementQuantity; i++) {
            PatientsPriority priority = this.getWithoutDequeue();

            if (priority == null) {
                break;
            }

            if (priority.getKey() != first.getKey()) {
                break;
            }

            PatientsPriority element = (PatientsPriority) this.dequeue();
            PatList.add(element.getInfo());
        }

        return PatList;
    }

    //PRINT ALL THE PATIENTS IN THE LIST
    @Override
    public String printPQueue() {
        //initialize variables
        String printall = "";
        PatientsPriority inf;

        for (int i = 0; i < PPQ.size(); i++) {
            inf = PPQ.get(i);
            printall = printall.concat(inf.printInfoPatient() + "Priority = " + inf.getKey() + "\n");
        }
        return printall;
    }

    public int generatePriority(Patients patient) {
        //Patients patient = patientPrior.getInfo();
        int age = patient.getAgeTf();
        int keyPriority = 0;

        if (age >= 90) {
            keyPriority = 10;
        } else if (age >= 80) {
            keyPriority = 9;
        } else if (age >= 70) {
            keyPriority = 8;
        } else if (age >= 65 && age <= 69) {
            keyPriority = 7;
        } else if (age >= 18 && age <= 64 && patient.isMedicalConditionsTk()) {
            keyPriority = 6;
        } else if (age >= 55 && age <= 64) {
            keyPriority = 5;
        } else if (age >= 45 && age <= 54) {
            keyPriority = 4;
        } else if (age >= 30 && age <= 44) {
            keyPriority = 3;
        } else if (age >= 18 && age <= 29) {
            keyPriority = 2;
        } else {
            keyPriority = 1;
        }

        return keyPriority;
    }

}
