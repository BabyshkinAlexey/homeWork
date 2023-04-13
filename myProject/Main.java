import human.Human;
import familyTree.FamilyTree;


public class Main 
{
    public static void main(String[] args) 
    {
        FamilyTree tree = new FamilyTree();

        tree.add(new Human("Селиванова Малика", "Женщина", "10.11.1980"));
        tree.add(new Human("Максимов Тимур", "Мужчина", "20.12.1969"));
        tree.add(new Human("Казакова Лея", "Женщина", "13.06.1981"));

        
        tree.add(new Human("Наумова Марианна", "Женщина", "01.02.1977"));
        tree.add(new Human("Наумов Герман", "Мужчина", "10.05.1979"));

        tree.add(new Human("Наумова  Полина", "Женщина", "21.07.2001", tree.getByName("Наумов Герман"), tree.getByName("Наумова Марианна")));
        tree.add(new Human("Наумов  Матвей", "Мужчина", "09.04.2000", tree.getByName("Наумов Герман"), tree.getByName("Наумова Марианна")));


        System.out.println(tree.getData());
    }
}
