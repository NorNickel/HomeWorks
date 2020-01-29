package ru.itsjava.Train;

public class Train {
    public static void main(String[] args) {
        Person[] peopleArray = getExamplePeopleArray();
        printPeopleArray(peopleArray);
        matchPersons(peopleArray);
    }

    public static void printPeopleArray(Person[] peopleArray){
        for (int i = 0; i < peopleArray.length; i++){
            System.out.println("#" + i + ": " + peopleArray[i].toString() + "\n");
        }
    }

    public static Person[] getExamplePeopleArray(){
        // return array with persons:
        // Men: [0] - Michael; [1] - Ivan; [2] - Matthew; [3] - Archibald
        // Women: [4] - Sandra; [5] - Emanuele; [6] - Ann; [7] - Ashley

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

    public static void matchPersons(Person[] peopleArray){
        System.out.println("Men matching:\n");

        System.out.println("Michael and Matthew equal = " + peopleArray[0].equals(peopleArray[2]) +
                "; hashCodes (" + peopleArray[0].hashCode() + ":" + peopleArray[2].hashCode() + ")");

        System.out.println("Ivan and Archibald equal = " + peopleArray[1].equals(peopleArray[3]) +
                "; hashCodes (" + peopleArray[1].hashCode() + ":" + peopleArray[3].hashCode() + ")");

        System.out.println("Michael and Ivan equal = " + peopleArray[0].equals(peopleArray[1]) +
                "; hashCodes (" + peopleArray[0].hashCode() + ":" + peopleArray[1].hashCode() + ")");;

        System.out.println("Women matching:\n");

        System.out.println("\nAnn and Ashley equal = " + peopleArray[6].equals(peopleArray[7]) +
                "; hashCodes (" + peopleArray[6].hashCode() + ":" + peopleArray[7].hashCode() + ")");

        System.out.println("Emanuele and Ann equal = " + peopleArray[5].equals(peopleArray[6]) +
                "; hashCodes (" + peopleArray[5].hashCode() + ":" + peopleArray[6].hashCode() + ")");

        System.out.println("Sandra and Ann equal = " + peopleArray[4].equals(peopleArray[6]) +
                "; hashCodes (" + peopleArray[4].hashCode() + ":" + peopleArray[6].hashCode() + ")");;

    }
}
