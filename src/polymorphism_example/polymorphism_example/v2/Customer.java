package polymorphism_example.polymorphism_example.v2;

class Customer {
    int money = 50000;

    void buyCoffee(Coffee coffee) {
        if (money < coffee.price) { // 물건 가격보다 돈이 없는 경우
            System.out.println("잔액이 부족합니다.");
            return;
        }
        money = money - coffee.price; // 가진 돈 - 커피 가격
        System.out.println(coffee + "를 구입했습니다.");
    }
}

