package ru.itsjava.Train;

public class Train {
    public static void main(String[] args) {
        // Create array with persons:
        // {Men: [0] - Michael, [1] - Ivan, [2] - Matthew, [3] - Archibald,
        // Women: [4] - Sandra, [5] - Emanuele, [6] - Ann, [7] - Ashley}
        Person[] peopleArray = getExamplePeopleArray();

        printPeopleArray(peopleArray);

        // Men matching
        matchPersons(peopleArray[0], peopleArray[2]); // match Michael and Matthew
        matchPersons(peopleArray[1], peopleArray[3]); // match Ivan and Archibald
        matchPersons(peopleArray[0], peopleArray[1]); // match Michael and Ivan

        // Women matching
        matchPersons(peopleArray[6], peopleArray[7]); // match Ann and Ashley
        matchPersons(peopleArray[5], peopleArray[6]); // match Emanuele and Ann
        matchPersons(peopleArray[4], peopleArray[6]); // match Sandra and Ann

        // Man and woman matching
        matchPersons(peopleArray[1], peopleArray[7]); // match Ivan and Ashley

    }

    public static void printPeopleArray(Person[] peopleArray){
        for (int i = 0; i < peopleArray.length; i++){
            System.out.println("#" + i + ": " + peopleArray[i].toString() + "\n");
        }
    }

    public static Person[] getExamplePeopleArray(){

        Man man1 = new Man("Michael", 28, 179, 87.5, 1100, null);
        Man man2 = new Man("Ivan", 34, 182.5, 100.4, 2500, null);
        Man man3 = new Man("Matthew", 33, 183, 92, 1350, null);
        Man man4 = new Man("Archibald", 32, 184.5, 99, 250, null);

        Woman woman1 = new Woman("Sandra", 65, 155, 80.5,
                Woman.HAIR_COLOR_BLOND, Woman.EYES_COLOR_BROWN, 3, null);
        Woman woman2 = new Woman("Emanuele", 25, 177, 64,
                Woman.HAIR_COLOR_BLOND, Woman.EYES_COLOR_BLUE, 10, null);
        Woman woman3 = new Woman("Ann", 28, 175, 59,
                Woman.HAIR_COLOR_BLOND, Woman.EYES_COLOR_BLUE, 8, null);
        Woman woman4 = new Woman("Ashley", 29, 173, 62,
                Woman.HAIR_COLOR_BLOND, Woman.EYES_COLOR_BLUE, 6, null);

        // Ivan is married to Emanuele
        man2.setWife(woman2);
        woman2.setHusband(man2);

        return new Person[]{man1, man2, man3, man4, woman1, woman2, woman3, woman4};
    }

    public static void matchPersons(Person personOne, Person personTwo){
        System.out.println(personOne.getName() + " and " + personTwo.getName() +
                " equal = " + personOne.equals(personTwo) +
                "; hashCodes (" + personOne.hashCode() + ":" + personTwo.hashCode() + ")");
    }

}
