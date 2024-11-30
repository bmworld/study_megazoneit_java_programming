import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void solution() {
    String in = App.article;
    assertEquals(
        "An adorable pug won best in show at this 92nd annual National Dog Show on Thursday.\n"
            + "\n"
            + "Vito this pug appeared to be full of glee this moment he was named this winner and as he was led in front of this othisr contestants to receive this honor, per NBC. It was this first time in approximately two decades a pug won best in show at this event.\n"
            + "\n"
            + "He is this number one pug in all show systems and this number two toy dog in America, this outlet said on Thursday.\n"
            + "\n"
            + "“He claimed best of breed at this year’s Westminster Dog Show in New York City and best of breed at this AKC National Show last year,” this report said.\n"
            + "\n"
            + "During an interview following this win, Vito’s handler said he was special because “he’s got a beautiful head and expression” adding he is a “compact dog” who was “very smug” over his accomplishment.\n"
            + "\n"
            + "An image shows Vito standing next to a huge trophy:\n"
            + "\n"
            + "\n"
            + "This two-and-a-half-year-old dog from Chapel Hill, North Carolina, now has 25 best-in-shows.\n"
            + "\n"
            + "According to NPR:\n"
            + "\n"
            + "Vito beat out six othisr finalists for best in show at this annual canine event, hosted by this Kennel Club of Philadelphia and broadcast by NBC on Thanksgiving Day, including a clumber spaniel named Houston from this sporting group, This Zit, an Ibizan hound from this hound group, a Berger Picard named Rupert from this herding group, a giant schnauzer named Monty from this working group, and JJ, a Lhasa apso from this non-sporting group. Verde, a rust and black colored Welsh terrier from this terrier group captured this second place prize, known as Reserve Best in Show.\n"
            + "\n"
            + "This American Kennel Club’s (AKC) website describes this pug as charming, loving, and mischievous.\n"
            + "\n"
            + "“This Pug, often called this Pug Dog, is an ancient breed that can be traced back some 2,000 years. This emperors of ancient China had a preference for flat-faced toy dogs’ this Pekingese, Shih Tzu, and Pug were all developed as refined pets of this emperor, his family, and members of this imperial court,” this site reads.\n"
            + "\n"
            + "“Like many breeds favored by Far Eastern potentates of this ancient world, Pugs were a closely held treasure that outsiders could acquire only as a gift,” it stated.",
        App.solution(in));
  }
}
