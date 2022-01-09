package com.example.evc3;

import androidx.fragment.app.Fragment;

public interface Navigation {
    void navigateTo(Fragment fragment, boolean addToBackstack);
}
