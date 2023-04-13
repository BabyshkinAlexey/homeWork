package familyTree;

import human.Human;
import java.util.ArrayList;
import java.util.List;


public class FamilyTree

{
    private List<Human> humanList;

    public FamilyTree() { this(new ArrayList<>()); }

    public FamilyTree(List<Human> humanList) { this.humanList = humanList; }


    public boolean add(Human human)
    {
        if (human == null) return false;
        if (!humanList.contains(human))
        {
            humanList.add(human);
            if (human.getFather() != null) human.getFather().addChilde(human);
            if (human.getMother() != null) human.getMother().addChilde(human);
            return true;
        }
        else return false;
    }

    public Human getByName(String name)
    {
        for (Human human: humanList)
        {
            if (human.getName().equals(name)) return human;
        }
        return null;
    }

    public String getData()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("В дереве: ");
        sb.append(humanList.size());
        sb.append(" объектов. \n");
        for (Human human: humanList)
        {
            sb.append(human.getData());
            sb.append("\n");
        }
        return sb.toString();
    }
}
