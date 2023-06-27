package 섹션5.배열과컬렉션프레임워크;

public class EmptyCommandLineArgumentExam {
    public static void main(String[] args){
        System.out.println(args.length);
    }
}

// String[] args = new String[0];
// main(args);

// javac EmptyCommandLineArgumentExam.java
// java EmptyCommandLineArgumentExam a b c d hello // 5개의 문자열 배열
// java -javaagent:어떤설정 EmptyCommandLineArgumentExam a b c d hello