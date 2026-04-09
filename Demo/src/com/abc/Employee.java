package com.abc;

public class Employee {
    private int id;
    private String name;
    private String role;
    private double salary;

    private static final String[] ALLOWED_ROLES = {"developer", "tester", "manager", "hr", "admin"};

    public Employee() {
    }

    public Employee(int id, String name, String role, double salary) {
        setId(id);
        setName(name);
        setRole(role);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    /**
     * id must be between 0 and 1000 inclusive
     */
    public void setId(int id) {
        if (id < 0 || id > 1000) {
            throw new IllegalArgumentException("id must be between 0 and 1000 (inclusive)");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    /**
     * name must contain only alphabets and spaces
     */
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("name cannot be null or empty");
        }
        String trimmed = name.trim();
        if (!trimmed.matches("^[A-Za-z ]+$")) {
            throw new IllegalArgumentException("name must contain only letters and spaces");
        }
        this.name = trimmed;
    }

    public String getRole() {
        return role;
    }

    /**
     * role must be one of developer,tester,manager,hr,admin (case-insensitive)
     */
    public void setRole(String role) {
        if (role == null || role.trim().isEmpty()) {
            throw new IllegalArgumentException("role cannot be null or empty");
        }
        String r = role.trim().toLowerCase();
        boolean allowed = false;
        for (String ar : ALLOWED_ROLES) {
            if (ar.equals(r)) {
                allowed = true;
                break;
            }
        }
        if (!allowed) {
            throw new IllegalArgumentException("role must be one of: developer, tester, manager, hr, admin");
        }
        this.role = r;
    }

    public double getSalary() {
        return salary;
    }

    /**
     * salary must be > 10000 and < 110000
     */
    public void setSalary(double salary) {
        if (salary <= 10000 || salary >= 110000) {
            throw new IllegalArgumentException("salary must be > 10000 and < 110000");
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }

}