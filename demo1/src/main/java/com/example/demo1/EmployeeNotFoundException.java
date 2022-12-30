package com.example.demo1;

//package payroll;

@SuppressWarnings("serial")
class EmployeeNotFoundException extends RuntimeException {

  EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}
