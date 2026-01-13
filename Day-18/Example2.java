class Customer {
    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary < 0");
        } else {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

class Example2 {
    public static void main(String[] args) {
        Customer c1 = new Customer(); // FIXED
        c1.setName("Supun");
        c1.setSalary(-50000);
        System.out.println(c1.getName() + " : " + c1.getSalary());
    }
}
