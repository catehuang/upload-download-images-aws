package com.example.demo.datastore;

import com.example.demo.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        //USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "janetjones", null));
        //USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "antoniojunior", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("72585341-0984-46ce-905a-35b40cd4d7d8"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("f7645d04-cd1b-4a83-bee8-cb102aff5429"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
