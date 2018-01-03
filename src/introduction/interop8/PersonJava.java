package introduction.interop8;

import org.jetbrains.annotations.NotNull;

public class PersonJava {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String sometimesNull(){
        return "hello ";
    }

    @NotNull
    public String neverNull(){
        return "hello";
    }
}
