package ru.vasili.se.home.joob;


public class Worker {

    private String fullName, position, email;
    private long phone;
    private int salary;
    private byte age;

    public Worker(String fullName, String position, String email, long phone, int salary, byte age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    void getFullInfo() {
        System.out.println("fullName: " + fullName + " | position: " + position
                + " | email: " + email + " | phone: " + phone + " | salary: " + salary + " | age: "
                + age);
    }

    int getAge() {
        return age;
    }
}

class HW5 {
    public static void main(String[] args) {
        Worker [] employees = new Worker[5];
        employees[0] = new Worker("Пуркин Иван Андреивич",
                "Top manager", "ivanovii@mail.me", 123456789,150000, (byte) 45);
        employees[1] = new Worker("Petrov Petr Petrovich", "manager",
                "petrovpp@mail.me", 987654321,50000, (byte) 30);
        employees[2] = new Worker("Sidorov Sidor Sidorovich",
                "manager", "sidorovss@mail.me", 54321987,35000, (byte) 25);
        employees[3] = new Worker("Pupkin Vasilii Ivanovich",
                "manager", "pupkinvi@mail.me", 45678901,650000, (byte) 41);
        employees[4] = new Worker("Semenov Semen Semenovich",
                "manager", "semenovss@mail.me", 321654987,300000, (byte) 23);

        for (Worker e : employees) if (e.getAge() > 40) e.getFullInfo();
    }
}