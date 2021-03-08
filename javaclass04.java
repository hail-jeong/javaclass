class Main {
  public static void main(String[] args) {



    int score = 75;
    char grade = (score >= 90) ? '가' :(score>= 80) ? '나' : ( (score >= 70) ? '다' : '라');
    System.out.println(score + "점은 " + grade + "등급입니다.");
  }
}
