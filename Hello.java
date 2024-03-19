public class Hello {
    String hello;
    int age;

    public  Hello (String helloInput, int ageInput ) {
        hello = helloInput;
        age = ageInput;
    }

    void helloMethod () {
        System.out.println(hello + " 제 나이는 " + age + " 입니다.");
    }

    public  static  void main(String[] arg) {
        Hello test = new Hello("안녕하세요", 40);
        test.helloMethod();
    }
}




