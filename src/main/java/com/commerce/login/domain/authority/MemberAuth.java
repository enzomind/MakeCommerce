package com.commerce.login.domain.authority;

import java.util.HashMap;
import java.util.Map;

public enum MemberAuth { //리프레시 토큰을 mysql로 관리하기 위해 엔티티 생성
    ROLE_USER("ROLE_USER"),
    ROLE_ADMIN("ROLE_ADMIN"),

    ;

    private final String abbreviation;

    private static final Map<String, MemberAuth> lookup = new HashMap<>();

    static {
        for(MemberAuth auth : MemberAuth.values()) {
            lookup.put(auth.abbreviation,auth);
        }
    }

    MemberAuth(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public static MemberAuth get(String abbreviation) {
        return lookup.get(abbreviation);
    }

    public static boolean containsKey(String abbreviation) {
        return lookup.containsKey(abbreviation);
    }
}
