public class ProjectClassTest{
    public static void main (String[] args){
        ProjectClass projOne = new ProjectClass();
        ProjectClass projTwo = new ProjectClass();
        projOne.setName("Proj One");
        projOne.setDesc("Proj One desc");
        projTwo.setName("Proj Two");
        projTwo.setDesc("Proj Two desc");
        System.out.println(projOne.getName());
        System.out.println(projOne.getDesc());
        System.out.println(projTwo.getName());
        System.out.println(projTwo.getDesc());
        System.out.println(projOne.elevatorPitch());
        System.out.println(projTwo.elevatorPitch());
    }
}