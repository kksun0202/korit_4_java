package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
    /*
        UserEntity 클래스의 인스턴스 user1을 생성하시고,
        username에 1
        password 9876
        email a@test.com
        name에 여러분 이름을 입력한 뒤에
        toString()을 이용해 콘솔에 출력하시오.
     */
        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setPassword(9876);
        user1.setEmail("a@test.com");
        user1.setName("김일");
        System.out.println(user1);

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUsername(2);
        user2.setPassword(9876);
        user2.setEmail("b@best.com");
        user2.setName("김이");
        System.out.println(user2);
    }
}
