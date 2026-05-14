package ch2.Ex14_객체지향;

public class Ex14_2_VendingMachineMain {
    public static void main(String[] args) {

        Ex14_1_VendingMachine vm = new Ex14_1_VendingMachine();
        String menu1 = vm.pushButton(1);
        System.out.println(menu1);

        System.out.println("///////////////////////////////////////////////////");

        Ex14_1_VendingMachine vm2 = new Ex14_1_VendingMachine();
        vm2.setTmp("헬로 월드");
        System.out.println(vm2);
        System.out.println(vm2.getTmp());
        System.out.println(vm2.toString());
    }
}
