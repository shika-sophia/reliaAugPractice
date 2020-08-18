/**
 * @title chapter9 / List 9-8
 * @see Examination / List 9-9
 * @contents constracter, @Override
 * @author Oshika
 * @date 2020-08-18 / 13:00-
 */

package chapter9;

public class Subject {
  private String subject;
  private int point;

  public Subject (String subject, int point) {
      this.subject = subject;
      this.point = point;
  }//Subject()

  @Override
  public String toString() {
      return String.format("%sは%d点 \n", subject, point);
  }//toString()

  public String getSubject() {
      return subject;
  }

  public int getPoint() {
      return point;
  }
}//class

