import java.util.Objects;

public class App {

  public static final String article =
      "An adorable pug won best in show at the 92nd annual National Dog Show on Thursday.\n"
          + "\n"
          + "Vito the pug appeared to be full of glee the moment he was named the winner and as he was led in front of the other contestants to receive the honor, per NBC. It was the first time in approximately two decades a pug won best in show at the event.\n"
          + "\n"
          + "He is the number one pug in all show systems and the number two toy dog in America, the outlet said on Thursday.\n"
          + "\n"
          + "“He claimed best of breed at this year’s Westminster Dog Show in New York City and best of breed at the AKC National Show last year,” the report said.\n"
          + "\n"
          + "During an interview following the win, Vito’s handler said he was special because “he’s got a beautiful head and expression” adding he is a “compact dog” who was “very smug” over his accomplishment.\n"
          + "\n"
          + "An image shows Vito standing next to a huge trophy:\n"
          + "\n"
          + "\n"
          + "The two-and-a-half-year-old dog from Chapel Hill, North Carolina, now has 25 best-in-shows.\n"
          + "\n"
          + "According to NPR:\n"
          + "\n"
          + "Vito beat out six other finalists for best in show at the annual canine event, hosted by the Kennel Club of Philadelphia and broadcast by NBC on Thanksgiving Day, including a clumber spaniel named Houston from the sporting group, The Zit, an Ibizan hound from the hound group, a Berger Picard named Rupert from the herding group, a giant schnauzer named Monty from the working group, and JJ, a Lhasa apso from the non-sporting group. Verde, a rust and black colored Welsh terrier from the terrier group captured the second place prize, known as Reserve Best in Show.\n"
          + "\n"
          + "The American Kennel Club’s (AKC) website describes the pug as charming, loving, and mischievous.\n"
          + "\n"
          + "“The Pug, often called the Pug Dog, is an ancient breed that can be traced back some 2,000 years. The emperors of ancient China had a preference for flat-faced toy dogs’ the Pekingese, Shih Tzu, and Pug were all developed as refined pets of the emperor, his family, and members of the imperial court,” the site reads.\n"
          + "\n"
          + "“Like many breeds favored by Far Eastern potentates of the ancient world, Pugs were a closely held treasure that outsiders could acquire only as a gift,” it stated.";

  public static void main(String[] args) {

    // STEP 1. 원문가져오기 (API 사용하여 문서를 가져오지는 않고, 복사하는 것으로 대체)
    String result = solution(article);
    System.out.println("result = " + result);
  }

  public static String solution(String s) {
    if (Objects.isNull(s)) return null;

    // STEP 2. 띄어쓰기로 단어 분류 (* 줄바꿈은 아래에서 별도로 처리)
    String separator = " ";
    String[] words = s.split(separator);
    StringBuilder result = new StringBuilder();

    String target1 = "The";
    String replacement1 = "This";
    String target2 = "the";
    String replacement2 = "this";

    for (int i = 0; i < words.length; i++) {
      String word = words[i];

      if (Objects.equals(word, target1)) {
        word = replacement1;

      } else if (Objects.equals(word, target2)) {
        word = replacement2;

      } else {
        // 띄어쓰기로 분류된 글자 내에 "줄바꿈"이 포함된 경우
        if (word.contains(target1)) {
          word = word.replace(target1, replacement1);

        } else if (word.contains(target2)) {
          word = word.replace(target2, replacement2);
        }
      }
      boolean isLast = i == words.length - 1;
      result.append(word);
      if (!isLast) result.append(separator);
    }

    return result.toString();
  } // solution()
} // App
