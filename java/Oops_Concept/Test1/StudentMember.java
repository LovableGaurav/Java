package Test1;

class Member {
    private String memberId;
    private String name;

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }
}


public class StudentMember extends Member {
    private int borrowLimit = 5;

    public StudentMember(String memberId, String name) {
        super(memberId, name);
    }
}