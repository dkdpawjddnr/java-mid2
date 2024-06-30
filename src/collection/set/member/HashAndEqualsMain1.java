package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        //id가 같으면 같은 회원이라고 생각하고 있는 상태
        //중복 등록
        MemberNoHashNoEquals m1 = new MemberNoHashNoEquals("A");
        MemberNoHashNoEquals m2 = new MemberNoHashNoEquals("A");
        System.out.println("m1.hashCode() = " + m1.hashCode()); //참조값 출력
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 실패
        MemberNoHashNoEquals searchValue = new MemberNoHashNoEquals("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
