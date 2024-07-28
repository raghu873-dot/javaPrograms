package com.net.Triple;

public final class Member {
    private String principalIdNo;
    private String memberType;

    // Constructor
    public Member(String principalIdNo, String memberType) {
        this.principalIdNo = principalIdNo;
        this.memberType = memberType;
    }

    // Getters
    public String getPrincipalIdNo() {
        return principalIdNo;
    }

    public String getMemberType() {
        return memberType;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Member{" +
                "principalIdNo='" + principalIdNo + '\'' +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}

