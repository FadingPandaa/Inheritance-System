👨‍💻Author: Keabetswe Masole

Software Used: Apache NetBeans IDE 22

---------------
📚 PROJECT STRUCTURE

The project is organized within the 'testcenter' package:

* Person.java: The base class containing shared attributes 
  (name, address, phone, email).
* Student.java: Extends Person; includes enrollment status 
  (Freshman, Sophomore, etc.).
* Employee.java: Extends Person; adds office, salary, and 
  hiring date details.
* Faculty.java: Extends Employee; adds office hours and 
  academic rank.
* Staff.java: Extends Employee; adds specific job titles.
* DateHired.java: A custom helper class to manage and 
  format employment dates.
* TestCenter.java: The driver class containing the main 
  method to instantiate and test the hierarchy.

------------------
⚙️ FEATURES

* Multilevel Inheritance: Showcases how specific roles 
  (Faculty/Staff) inherit from broader categories (Employee/Person).
* Polymorphism: Utilizes overridden 'toString' methods to 
  dynamically identify class types at runtime.
* Constants: Uses 'public static final' integers in the 
  Student class to standardize academic year statuses.
* Composition: Integrates the 'DateHired' object within the 
  Employee class to manage complex data types.

-------------------
▶️ HOW TO RUN

1. Compile all source files:
   javac testcenter/*.java

2. Run the main driver:
   java testcenter.TestCenter

3. The console will display a list of created personas 
   identified by their specific class type and name.

-------------------------
⚠️ Limitations

- Lack of data persistence
- Deep class hierarchy complexity
- Limited encapsulation & logic
- Static object creation
- String-Based formatting
