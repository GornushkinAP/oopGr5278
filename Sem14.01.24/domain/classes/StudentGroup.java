package domain.classes;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {

    private List<Student> list;

    private int groupId;

    private String groupName;

    public StudentGroup(List<Student> list, int groupId, String groupName) {
        this.list = list;
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public int getId() {
        return groupId;
    }

    public void setId(int groupId) {
        this.groupId = groupId;
    }

    public List<Student> getGroup() {
        return list;
    }

    @Override
    public String toString() {
        return "StudentGroup: " + groupName + "\n" + " list: " + "\n" + list + "\n" + " groupId = " + groupId + " } "
                + "\n";
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(list);
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public int compareTo(StudentGroup o) {
        return Integer.compare(this.list.size(), o.list.size());
    }

}
