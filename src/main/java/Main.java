public class Main {

    public static void main(String[] args) {

        Student student01 = new Student();
        student01.setName("Alexander Dobrowski");
        student01.setAge(22);
        student01.setHairColor("pink");

        System.out.println(student01.getName());
        System.out.println(student01.getAge());
        System.out.println(student01.getHairColor());
    }

    static class Student {
        String hairColor;
        int age;
        String name;

        String getName() {
            return name;
        }

        public String getHairColor() {
            return hairColor;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.name = name;
        }

        public void setHairColor(String hairColor) {
            this.hairColor = hairColor;
        }
    }

}
