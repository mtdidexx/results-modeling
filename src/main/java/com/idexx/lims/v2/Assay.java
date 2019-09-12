package com.idexx.lims.v2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Assay {
    private String code;
    private List<Group> groups = new ArrayList<>();

    public Assay(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public Group addGroup(String groupKey) {
        Group group = new Group(groupKey);
        groups.add(group);
        return group;
    }

    public Optional<Group> getGroup(String groupKey) {
        for (Group g: groups) {
            if (g.getCode().equalsIgnoreCase(groupKey)) {
                return Optional.of(g);
            }
        }
        return Optional.empty();
    }
}
