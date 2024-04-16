package polymorphism_example.instanceof_example.v1;

public class InstanceOfExample {
    public static void main(String[] args) {
        // 'animal' 객체를 'Animal' 클래스의 인스턴스로 생성
        Animal animal = new Animal();
        System.out.println(animal instanceof Object); // true: 모든 클래스는 Object 클래스의 하위 클래스임
        System.out.println(animal instanceof Animal); // true: 'animal'은 'Animal'의 인스턴스임
        System.out.println(animal instanceof Bat); // false: 'animal'은 'Bat'의 인스턴스가 아님

        // 'cat' 객체를 'Cat' 클래스의 인스턴스로 생성하지만, 타입은 'Animal'로 선언
        Animal cat = new Cat();
        System.out.println(cat instanceof Object); // true: 'Cat' 클래스도 Object 클래스의 하위 클래스임
        System.out.println(cat instanceof Animal); // true: 'Cat'은 'Animal'의 하위 클래스이므로 'cat'도 'Animal'의 인스턴스임
        System.out.println(cat instanceof Cat); // true: 'cat'은 'Cat' 클래스의 인스턴스임
        System.out.println(cat instanceof Bat); // false: 'cat'은 'Bat'의 인스턴스가 아님, 비록 같은 상위 클래스를 공유하지만
    }
}

// 기본 Animal 클래스 정의
class Animal {};

// Animal 클래스를 상속받는 Bat 클래스
class Bat extends Animal {};

// Animal 클래스를 상속받는 Cat 클래스
class Cat extends Animal {};
