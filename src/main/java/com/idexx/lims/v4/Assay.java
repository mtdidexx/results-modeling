package com.idexx.lims.v4;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Assay {
    private String code;
    @NotNull
    private List<Group> groups = new ArrayList<>();

    public Assay(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @NotNull
    public List<Group> getGroups() {
        return groups;
    }

    @NotNull
    public Group addGroup(String groupKey) {
        Group group = new Group(groupKey);
        groups.add(group);
        return group;
    }

    public Optional<Group> getGroup(String groupKey) {
        for (Group g: groups) {
            if (g.getKey().equalsIgnoreCase(groupKey)) {
                return Optional.of(g);
            }
        }
        return Optional.empty();
    }
}
