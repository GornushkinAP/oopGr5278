package domain.classes;

import java.util.Iterator;
import java.util.List;

public class GroupsIterator implements Iterator<StudentGroup>{
    
    private int count;
    private List<StudentGroup> groups;

    

    public GroupsIterator(List<StudentGroup> groups) {
        this.groups = groups;
    }

    @Override
    public boolean hasNext() {
        return count < groups.size();
    }

    @Override
    public StudentGroup next() {
        int index = count;
        count++;
        return groups.get(index);
    }

    
}
