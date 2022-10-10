package task2;

public class author {
    static public class Author {
        private String name, email;
        private char gender;
        public Author (String name, String email, char gender) {
            this.email = email;
            this.name = name;
            this.gender = gender;
        }
        public String getName() {
            return this.name;
        }
        public String getEmail() {
            return this.email;
        }
        public char getGender() {
            return this.gender;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String toString() {
            return "Author: {\n\tname: "+this.name+",\n\temail: "+this.email+",\n\tgender: "+this.gender+"\n}";
        }
    }

    static public void main() {
        Author TestAuthor = new Author("Ivan", "megaVanya@mega.kryt", 'm');
        System.out.println(TestAuthor.getEmail() + "\n" + TestAuthor.getName() + "\n" + TestAuthor.getGender());
        TestAuthor.setEmail("noviyIvan@ya.ru");
        System.out.println(TestAuthor.toString());
    }
}
