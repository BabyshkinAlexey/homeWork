package human;

import java.util.ArrayList;
import java.util.List;
//import javax.xml.crypto.Data;
//import java.io.*;

public class Human
{
    private String name;
    private String gender;
    private String dateBirth;
    private Human father;
    private Human mother;
    private List<Human> children;

    public Human (String name, String gender, String dateBirth , Human father, Human mother)
    {
        this.name = name;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.father = father;
        this.mother = mother;
        children = new ArrayList<>();
    }

    public Human (String name, String gender, String dateBirth)
    {
        this(name, gender, null, null, null);
    }

    public boolean addChilde(Human child) 
    { 
        if (!children.contains(child))
        { 
            children.add(child); 
            return true;
        }
        return false;
    }

    public String getName()         { return name;      }
    public String getGender()       { return gender;    }
    public String getDateBirth()      { return dateBirth; }
    public Human getFather()        { return father;    }
    public Human getMother()        { return mother;    }
    public List<Human> getChildren(){ return children;  }

    //public void setName(String name)                { this.name = name; }
    //public void setGender(String gender)            { this.gender = gender; }
    public void setDateBirth(String dateBirth)        { this.dateBirth = dateBirth; }
    public void setFatherr(Human father) { this.father = father; }
    public void setMother(Human mother) { this.mother = mother; }

    public String getData()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Имя, Фамилия: ");         sb.append(name);            sb.append("; ");
        sb.append("Пол: ");                  sb.append(gender);          sb.append("; ");
        sb.append("Дата рождения: ");        sb.append(dateBirth);       sb.append("; ");
        sb.append("Отец : ");                sb.append(getFatherInfo());   sb.append("; ");
        sb.append("Мать : ");                sb.append(getMotherInfo());   sb.append("; ");
        sb.append("Дети : ");    sb.append(getChildrenInfo()); sb.append(". ");
        return sb.toString();
    }

    public String getFatherInfo() 
    {
        String result = "";
        if (father != null) {result += father.getName();}
        else result += "Неизвестен ";
        return result;
    }

    public String getMotherInfo() 
    {
        String res = "";
        if (mother != null){res += mother.getName();}
        else res += "Неизвестна ";
        return res;
    }

    public String getChildrenInfo()
    {
        StringBuilder res = new StringBuilder();
        if (children.size() != 0)
        {
            res.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++) 
            {
                res.append(", ");
                res.append(children.get(i).getName());
            }
        }
        else res.append("Отсутсвуют");
        return res.toString();
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (!(obj instanceof Human)) return false;
        Human human = (Human) obj;
        return human.getName().equals(getName());
    }
}