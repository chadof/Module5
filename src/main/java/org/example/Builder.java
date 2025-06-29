package org.example;

class Employee {

    private String name;
    private String company;
    private boolean hasCar;
    private boolean hasBike;

    private Employee(Builder employeeBuilder) {
        name = employeeBuilder.name;
        company = employeeBuilder.company;
        hasCar = employeeBuilder.hasCar;
        hasBike = employeeBuilder.hasBike;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public boolean isHasBike() {
        return hasBike;
    }

    public static class Builder{
        private String name;
        private String company;
        private boolean hasCar;
        private boolean hasBike;

        public Builder(String name, String company) {
            this.name = name;
            this.company = company;
        }

        public Builder setHasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public Builder setHasBike(boolean hasBike) {
            this.hasBike = hasBike;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}

class Main3 {
    public static void main(String[] args) {
        Employee employee = new Employee.Builder("Виктор", "Aston")
                .setHasBike(false)
                .setHasBike(true)
                .build();
    }
}
