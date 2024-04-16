package polymorphism_example.polymorphism_example.v2;

public class PolymorphismEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano());
        customer.buyCoffee(new CaffeLatte());

        System.out.println("현재 잔액은 " + customer.money + "원 입니다.");
    }
}


// 출력값
//아메리카노를 구입했습니다.
//카페라떼를 구입했습니다.
//현재 잔액은 41000원 입니다.