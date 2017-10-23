package com.thinkinginjava.generics;

interface Payable<T> {
}

class Employee implements Payable<Employee> {
}

//class Hourly extends Employee implements Payable<Hourly> {}
