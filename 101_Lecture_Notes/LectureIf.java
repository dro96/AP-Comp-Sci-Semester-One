import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int word, x, y, z; 
        System.out.println("Steven is becoming a word");
        System.out.println("How does his story begin");
        System.out.println("1. Steven dicovers a hidden book in mr pooles back drawer stating the word, word");
        System.out.println("2. He finds an enchanted quill, writing his name into word");
        System.out.println("3. Steven touches a magic dictionary, turning him into a book that can only say yuh wordd");
        word = sc.nextInt();
        sc.nextLine();
        if(word == 1){
            System.out.println("He reads the book saying word, how should he proceed");
            System.out.println("1. he eats it");
            System.out.println("2. he went to a witches hut and ate it there");
            System.out.println("3. he eats is, but with slighty more passion than with option one");
            x = sc.nextInt();
            sc.nextLine();
            if(x == 1){
                System.out.println("He eats it and becomes a word");
            }
            if(x == 2){
                System.out.println("The witch cast a spell on him, making him into a walking word, that only knows how to say word");
            }
            if(x == 3){
                System.out.println("He eats it slighty more passionately and becomes a word");
            }
        }
        if(word == 2){
            System.out.println("He writes down his name, and immidiatly feels a little more special than usual, how should he proceed");
            System.out.println("1. he writes it down again");
            System.out.println("2. he ate the quill");
            System.out.println("3. he has a ritual");
            x = sc.nextInt();
            sc.nextLine();
            if(x == 1){
                System.out.println("He writes it down and becomes a word");
            }
            if(x == 2){
                System.out.println("he eats it, end of story hes chilling");
            }
            if(x == 3){
                System.out.println("He eats it slighty more passionately and becomes a word");
            }
        }


    }
	
}