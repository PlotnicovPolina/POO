package com;
import java.util.*;

public class Patient extends Person {
    String id;
    Integer age;
    Date accepted;
    ArrayList<String> sickness= new ArrayList<>();
    ArrayList<String> prescriptions= new ArrayList<>();
    ArrayList<String> allergies= new ArrayList<>();
    ArrayList<String> specialReqs= new ArrayList<>();
    ArrayList<OperationsStaff> operationsStaff= new ArrayList<>();
}
