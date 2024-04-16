package polymorphism_example.polymorphism_example.v1;

public class FriendTestV2 {

    public static void main(String[] args) {
        Friend friend = new Friend(); // 객체 타입과 참조 변수 타입의 일치 -> 가능
        BoyFriend boyfriend = new BoyFriend();
        Friend girlfriend = new GirlFriend(); // 객체 타입과 참조 변수 타입의 불일치 -> 가능
        //  GirlFriend friend1 = new Friend(); -> 하위클래스 타입으로 상위클래스 객체 참조 -> 불가능

        friend.friendInfo();
        boyfriend.friendInfo();
        girlfriend.friendInfo();
    }
}
