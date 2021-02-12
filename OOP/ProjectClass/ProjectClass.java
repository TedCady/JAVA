public class ProjectClass{
    private String name;
    private String desc;
    public ProjectClass(){
        this("Name", "Desc");
    }

    public ProjectClass(String name){
        this.name = name;
    }

    public ProjectClass(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public String elevatorPitch(){
        return this.name + ":" + this.desc;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDesc (String desc){
        this.desc = desc;
    }

    public String getName(){
        return this.name;
    }

    public String getDesc(){
        return this.desc;
    }
}