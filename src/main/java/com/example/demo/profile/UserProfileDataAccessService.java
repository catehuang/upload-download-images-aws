package com.example.demo.profile;

import com.example.demo.datastore.FakeUserDataStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {
    private final FakeUserDataStore fakeUserDataStore;

    @Autowired
    public UserProfileDataAccessService(FakeUserDataStore fakeUserDataStore) {
        this.fakeUserDataStore = fakeUserDataStore;
    }

    List<UserProfile> getUserProfiles() {
        return fakeUserDataStore.getUserProfiles();
    }
}
