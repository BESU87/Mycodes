public class WorkerMain {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");
        System.out.println(tim);
        System.out.println("Age =" + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee Jack = new SalariedEmployee("jack", "11/12/1990", "02/02/2021", 35000);
        System.out.println(Jack);
        System.out.println("Jack's Paycheck = $" + Jack.collectPay());
        Jack.retire();
        System.out.println("Jack's Pension check = $ " + Jack.collectPay());

    }
}
