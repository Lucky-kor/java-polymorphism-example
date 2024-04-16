package polymorphism_example.instanceof_example.v2;

public class InstanceOfDemo {
    public static void main(String[] args) {
        // 각 클래스의 인스턴스를 생성합니다.
        Animal genericAnimal = new Animal(); // 'Animal' 타입의 일반 동물 인스턴스
        Animal dog = new Dog(); // 'Dog' 인스턴스를 'Animal' 타입으로 참조
        Animal cat = new Cat(); // 'Cat' 인스턴스를 'Animal' 타입으로 참조
        Bird parrot = new Parrot(); // 'Parrot' 인스턴스를 'Bird' 타입으로 참조

        // instanceof를 사용하여 객체의 실제 타입을 확인합니다.
        System.out.println("genericAnimal is an Animal: " + (genericAnimal instanceof Animal)); // true - genericAnimal은 Animal의 인스턴스입니다.
        System.out.println("dog is an Animal: " + (dog instanceof Animal)); // true - dog는 Animal 클래스의 인스턴스입니다.
        System.out.println("dog is a Dog: " + (dog instanceof Dog)); // true - dog는 Dog 클래스의 인스턴스입니다.
        System.out.println("dog is a Cat: " + (dog instanceof Cat)); // false - dog는 Cat 클래스의 인스턴스가 아닙니다.
        System.out.println("parrot is a Bird: " + (parrot instanceof Bird)); // true - parrot는 Bird 클래스의 인스턴스입니다.
        System.out.println("parrot is an Animal: " + (parrot instanceof Animal)); // true - parrot는 Animal 클래스의 인스턴스입니다 (Bird가 Animal을 상속받기 때문).

        // 객체 캐스팅 시도 후 instanceof를 사용하여 타입이 맞는지 검증합니다.
        if (cat instanceof Cat) {
            Cat realCat = (Cat) cat; // cat 객체를 Cat 타입으로 안전하게 캐스팅합니다.
            System.out.println("cat was successfully cast to Cat!");
        }

        // 잘못된 캐스팅을 시도하는 예제입니다.
        if (cat instanceof Dog) {
            Dog wrongCast = (Dog) cat; // 컴파일은 되지만, 실행 시 ClassCastException이 발생할 수 있습니다. instanceof를 사용하여 이를 예방합니다.
        } else {
            System.out.println("cat cannot be cast to Dog!"); // cat는 Dog 타입이 아니기 때문에 캐스팅할 수 없습니다.
        }

        // null 참조에 대한 instanceof 체크
        Animal nullAnimal = null; // null 참조 변수
        System.out.println("nullAnimal is an Animal: " + (nullAnimal instanceof Animal)); // false - null은 어떤 타입의 인스턴스도 아닙니다.
    }
}

// 기본 Animal 클래스
class Animal {};

// Animal 클래스를 상속받는 Dog 클래스
class Dog extends Animal {};

// Animal 클래스를 상속받는 Cat 클래스
class Cat extends Animal {};

// Animal 클래스를 상속받는 Bird 클래스
class Bird extends Animal {};

// Bird 클래스를 상속받는 Parrot 클래스
class Parrot extends Bird {};

