package addressbook.model;

import java.util.Objects;

public class GroupData {
    private final String name;
    private final String head;
    private final String footer;

    public GroupData(String name, String head, String footer) { //constructor that initializes an object by values)
        this.name = name;
        this.head = head;
        this.footer = footer;
    }

    public String getName() {
        return name;
    } //methods that return attributes

    public String getHead() {
        return head;
    }

    public String getFooter() {
        return footer;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return Objects.equals(name, groupData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
