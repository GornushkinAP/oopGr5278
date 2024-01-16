package domain.classes;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>{

    private int streamId;

    private List<StudentGroup> groups;


    public StudentStream(int streamId, List<StudentGroup> groups) {
        this.streamId = streamId;
        this.groups = groups;
    }


    public int getStreamId() {
        return streamId;
    }

    public void setStreamId(int streamId) {
        this.streamId = streamId;
    }



    public List<StudentGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }


    @Override
    public String toString() {
       return "Groups { " + " Groups = " + groups + " Stream Id = " + streamId + " }" + "\n";
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new  GroupsIterator(groups);
    }
    
}
