package polymorphism_example.polymorphism_example.v2;

class Americano extends Coffee {
    public Americano() {
        super(4000); // 상위 클래스 Coffee의 생성자를 호출
    }

    public String toString() {return "아메리카노";}; //Object클래스 toString()메서드 오버라이딩
};